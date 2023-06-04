package com.example.navi.ui.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navi.R
import com.example.navi.databinding.HomefragmentBinding
import com.example.navi.obj.ObjectCompanions

class HomeFragment : Fragment() {

    private var binding: HomefragmentBinding? = null
    private  val TAGVALUE = "Hi Dev's start learning Compose "


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = HomefragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.lineButton?.setOnClickListener {
            val bundle = bundleOf(ObjectCompanions.KEY to TAGVALUE)
            findNavController().navigate(R.id.action_homeFragment2_to_linesInCompose3, bundle)
        }

        binding?.IconButton?.setOnClickListener {
            val bundle = bundleOf(ObjectCompanions.KEY to  TAGVALUE)
            findNavController().navigate(R.id.action_homeFragment2_to_iconButtonComposeFragment, bundle)
        }
        binding?.BoxButton?.setOnClickListener {
            val bundle = bundleOf(ObjectCompanions.KEY to TAGVALUE)
            findNavController().navigate(R.id.action_homeFragment2_to_bozFragment, bundle)
        }

    }
}