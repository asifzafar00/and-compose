package com.example.navi.ui.activity.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import com.example.navi.R
import com.example.navi.obj.ObjectCompanions
import com.example.navi.ui.activity.fragment.data.BenefitsTitle
import com.example.navi.ui.activity.fragment.data.BenefitsTitleHomeContent
import com.example.navi.ui.activity.fragment.data.benefitsTHomeContent
import com.example.navi.ui.activity.fragment.util.setUpOfToolBar
import com.google.accompanist.systemuicontroller.rememberSystemUiController


class BenefitsFragment : Fragment() {

    private var str1: String? = null
    private val TAG = "BenefitsFragment"


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
                    color = MaterialTheme.colorScheme.onPrimary
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        val systemUiController = rememberSystemUiController()
                        SideEffect {
                            systemUiController.setStatusBarColor(
                                color = Color.Black,
                                darkIcons = false
                            )
                        }
                        MyUI()
                    }
                }
            }

        }
    }

    @Composable
    private fun MyUI() {

        setUpOfToolBar(activity =  requireActivity())

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen._20dp)))

        BenefitsTitleHomeContent()

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen._20dp)))

        benefitsTHomeContent()


    }
}

