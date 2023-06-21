package com.example.navi.ui.activity.fragment.data

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

@Composable
fun BenefitsTitleHomeContent() {
    val objects = remember { DataProvider.benefitsTitleList }

    LazyRow(
            contentPadding = PaddingValues(top = 4.dp, start = 4.dp)
        ) {
            items(count = objects.size) { index ->
                titleBenefitsListItem(obj = objects[index])
            }

        }


}