package com.example.navi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.navi.ui.activity.fragment.util.MainViewModel
import com.example.navi.ui.activity.fragment.util.MyViewModelFactory
import com.example.navi.ui.activity.fragment.util.Observer

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    lateinit var txtCounter: TextView
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCounter = findViewById(R.id.textView)
        mainViewModel =
            ViewModelProvider(this, MyViewModelFactory(1098)).get(MainViewModel::class.java)
        lifecycle.addObserver(observer = Observer())

        Log.e(TAG, "onCreate: Activity  ")
        setText()
    }

    fun increment(v: View) {
        mainViewModel.increment()
        setText()
    }

    fun setText() {
        txtCounter.text = mainViewModel.count.toString()
    }
}