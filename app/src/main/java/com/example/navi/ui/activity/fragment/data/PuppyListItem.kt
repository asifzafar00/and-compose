package com.example.navi.ui.activity.fragment.data

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun titleBenefitsListItem(obj: BenefitsTitle) {
    Column(
        modifier = Modifier
            .wrapContentWidth()
    )
    {
        Card( modifier = Modifier.padding(start = 20.dp, end = 10.dp).fillMaxWidth(),
            elevation = 4.dp,
            backgroundColor = Color.White,
            shape = RoundedCornerShape(corner = CornerSize(66.dp))
        ) {
            Column {
                benefitsTitleImage(obj)
            }
        }
        Column(
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
                .padding(start = 14.dp),
        ) {
            Text(
                text = LocalContext.current.getString(obj.title), style = typography.subtitle1
            )
        }
    }


}