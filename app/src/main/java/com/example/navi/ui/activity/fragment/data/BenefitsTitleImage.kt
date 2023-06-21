package com.example.navi.ui.activity.fragment.data


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
 fun benefitsTitleImage(obj: BenefitsTitle) {
    Image(
        painter = painterResource(id = obj.benefitsTitleImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(20.dp)
            .size(40.dp)
            .clip(RoundedCornerShape(corner = CornerSize(30.dp)))
    )
}