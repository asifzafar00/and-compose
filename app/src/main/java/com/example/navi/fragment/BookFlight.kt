package com.example.navi.fragment


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import com.example.navi.R
import com.example.navi.commonObject.ObjectCompanions

class BookFlight : Fragment() {
    private val TAG = "StoreFragment"
    var str1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            str1 = it.getString(ObjectCompanions.KEY)
        }
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
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        MyUI2()
                    }
                }


            }
        }
    }

    @Composable
    fun sayName() {
        SelectionContainer {
            Text(
                modifier = Modifier.verticalScroll(state = rememberScrollState()),
                text = stringResource(id = R.string.semicolon_space),

                color = Color.Red,
                fontSize = 29.sp,
                style = TextStyle(
                    textDecoration = TextDecoration.combine(
                        decorations = listOf(
                            TextDecoration.LineThrough,
                            TextDecoration.Underline
                        )
                    )
                ),
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold,
                lineHeight = 24.sp,
                letterSpacing = 8.sp,
                fontFamily = FontFamily.Cursive,


                )
        }
    }

    @Composable
    private fun MyUI2() {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_notifications_24),
                tint = Color.Black,
                contentDescription = null
            )
            str1?.let {
                Text(
                    modifier = Modifier.padding(start = 6.dp),
                    text = it
                )
            }
        }
    }

    @OptIn(ExperimentalTextApi::class)
    @Composable
    private fun MyUI() {
        SelectionContainer {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {
                // text 1
                str1?.let {
                    Text(
                        text = it,
                        fontSize = 18.sp,
                        color = Color.Red

                    )
                }
                Spacer(modifier = Modifier.height(height = 36.dp))

                // text 2
                Text(
                    text = "SemicolonSpace",
                    fontSize = 22.sp,
                    style = TextStyle(
                        shadow = Shadow(
                            color = Color.Green,
                            offset = Offset(x = 5f, y = 10f),
                            blurRadius = 2f
                        )
                    )
                )
                // text 2
                Spacer(modifier = Modifier.height(height = 36.dp))

                DisableSelection {
                    Text(
                        text = "I am not single! My laptop and I are happily married and we have two kids called mouse and pendrive.",
                        fontSize = 18.sp,
                        style = TextStyle(
                            brush = Brush.linearGradient(
                                colors = listOf(
                                    Color(0xFF7b4397), Color(0xFFdc2430)
                                )
                            )
                        )
                    )

                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(TAG, "onViewCreated: value----" + str1)
    }
}