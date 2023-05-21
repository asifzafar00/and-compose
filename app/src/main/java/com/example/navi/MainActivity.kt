package com.example.navi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navi.utils.logScreenSize
import com.example.navi.utils.setFullScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFullScreen()
        logScreenSize()
    }
}