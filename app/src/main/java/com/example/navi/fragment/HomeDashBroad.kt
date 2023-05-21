package com.example.navi.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navi.R
import com.example.navi.commonObject.ObjectCompanions
import com.example.navi.databinding.FragmentHomeBinding

class HomeDashBroad : Fragment() {
    private var binding: FragmentHomeBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.benefitsButton?.visibility = View.VISIBLE //this hide/show recyclerview visibility

        binding?.benefitsButton?.setOnClickListener {
            val bundle = bundleOf(ObjectCompanions.KEY to "Love you Gazal")
            findNavController().navigate(R.id.action_homeFragment_to_storeFragment, bundle)
        }

       /*
        binding?.button2?.setOnClickListener {
            val bundle = bundleOf(
                ObjectCompanions.KEY to "800008800"
            )
            findNavController().navigate(R.id.action_homeFragment_to_insuranceFragment, bundle)
        }*/
    }

}