package com.example.navi.ui.activity.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import com.example.navi.R
import com.example.navi.obj.ObjectCompanions

class BozFragment : Fragment() {
    private val TAG = "BoxFragment"
    private var str1: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            str1 = it.getString(ObjectCompanions.KEY)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(TAG, "bundle value : $str1")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyUIImageView()
                }
            }
        }

    }

    @Composable
    fun MyUIBox() {
        //  So, the Column arranges the views vertically and
        //  the Row arranges the views horizontally.


        Column {//Column places the items (children)
            // vertically on the screen.  Top to bottom
            Text("Hi, Android")
            Text("Hello, Jetpack Compose")
            Spacer(modifier = Modifier.fillMaxSize())
            Row {//Row places the items horizontally on the screen.
                // Right to Left
                Text("Hi, Android")
                Text("Hello, Jetpack Compose")
            }
        }

    }

    @Composable
    fun MyUIImageView() {
        Box{
            Image(
                painter = painterResource(id = R.drawable.lion_kids),
                contentDescription = "Lion and Kid"
            )
        }

        Text(
            text = "Lion and Kid",
            fontSize = 20.sp,
            color = Color.Black
        )
    }
}