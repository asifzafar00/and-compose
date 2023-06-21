package com.example.navi.ui.activity.fragment.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.navi.R

@Composable
fun BenefitsImage(obj: Benefits) {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .size(80.dp),
        ) {
        Image(
            painter = painterResource(id = obj.benefitsTitleImageId,),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.Center)
                .background(colorResource(id = R.color.purple_100))
                .clip(RoundedCornerShape(36.dp))
                .size(70.dp),
            contentScale = ContentScale.Crop,
        )
        IconButton(
            onClick = {},
            modifier = Modifier
                .clip(CircleShape)
                .align(Alignment.TopEnd)
        ) {

        }
    }
}