package com.example.navi.utils

import android.app.Activity
import android.util.Log
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.window.layout.WindowMetricsCalculator

private val TAG = "ActivityExe"

fun Activity.setFullScreen() {
    WindowCompat.setDecorFitsSystemWindows(window, false)
    window.statusBarColor = ContextCompat.getColor(this, android.R.color.transparent)
}

fun Activity.logScreenSize() {
    val windowMetrics = WindowMetricsCalculator.getOrCreate().computeCurrentWindowMetrics(this)
    val height = windowMetrics.bounds.height()
    val width = windowMetrics.bounds.width()
    Log.e(TAG, "logScreenSize: height=" + height + "- width=" + width)
}
