package com.example.navi.ui.activity.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navi.databinding.InlinefragmentBinding
import com.example.navi.obj.ObjectCompanions

class LinesInCompose : Fragment() {
    private var binding: InlinefragmentBinding? = null

    private val TAG = "LinesInCompose"

    private var str1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            str1 = it.getString(ObjectCompanions.KEY)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = InlinefragmentBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(TAG, "bundle value : $str1")
        binding?.inLineText?.text = str1
    }
}