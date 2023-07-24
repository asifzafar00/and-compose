package com.example.navi.ui.activity.fragment.util

import androidx.lifecycle.ViewModel

class MainViewModel(val initialValue:Int):ViewModel() {
    var count:Int=initialValue

    fun increment(){
        count++
    }


}