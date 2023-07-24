package com.example.navi.ui.activity.fragment.util

import android.util.Log
import androidx.lifecycle.*

class Observer : DefaultLifecycleObserver {

    private val TAG = "Observer"

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.e(TAG, "onCreate")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.e(TAG, "onResume")
    }

}