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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.example.navi.R

@Composable
fun benefitsListItem(obj: Benefits) {
    Card(
        modifier = Modifier.padding(start = 20.dp, end = 10.dp, top = 20.dp, bottom = 20.dp).fillMaxWidth(),
        elevation = 4.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))

    ) {
        Row {
            BenefitsImage(obj)
            Column(
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)) {

                Text( text = LocalContext.current.getString(obj.title), style = typography.h6)

                Spacer(modifier = Modifier.height(dimensionResource(R.dimen._5dp)))

                Text( text = LocalContext.current.getString(obj.description), style = typography.subtitle2)

            }
        }
    }


}