package com.example.navi.ui.activity.fragment.util

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer:LifecycleObserver {

    private  val TAG = "Observer"
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun ObserverOnCreate(){
        Log.e(TAG, "ObserverOnCreate: " )
    }
}