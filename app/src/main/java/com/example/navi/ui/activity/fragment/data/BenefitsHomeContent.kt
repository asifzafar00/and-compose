package com.example.navi.ui.activity.fragment.data

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp

@Composable
fun benefitsTHomeContent() {
    val objects = remember { DataProvider.benefitsList }

    LazyColumn(
        contentPadding = PaddingValues(top = 4.dp, start = 4.dp)
    ) {
        items(count = objects.size) { index ->
            benefitsListItem(obj = objects[index])
        }

    }


}