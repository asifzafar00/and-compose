package com.example.navi.ui.activity.fragment.util

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.fragment.app.FragmentActivity
import com.example.navi.R

@Composable
fun setUpOfToolBar(  activity: FragmentActivity){
    val zerodp = dimensionResource(R.dimen.empty_dp)

    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.benefits_string),
                color = colorResource(R.color.white),
                fontSize = 26.sp,
                modifier = Modifier
                    .padding(
                        start = dimensionResource(R.dimen._64dp),
                        end = zerodp,
                        top = zerodp,
                        bottom = zerodp
                    )
                    .fillMaxWidth()
            )

        },
        navigationIcon = {
            IconButton(onClick = {
                Toast.makeText(activity, R.string.on_back_pressed, Toast.LENGTH_SHORT)
                    .show()
                activity.onBackPressed()
            })
            {
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    contentDescription = stringResource(id = R.string.app_name),
                    tint = colorResource(R.color.white),
                    modifier = Modifier.size(dimensionResource(R.dimen._100dp))
                )
            }
        },
        modifier = Modifier.height(dimensionResource(R.dimen._80dp)),
        backgroundColor = colorResource(R.color.black),
        elevation = dimensionResource(R.dimen._100dp)
    )
 }