package com.arrienty.tokped.layout

import android.webkit.WebSettings.TextSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arrienty.tokped.R
import com.arrienty.tokped.model.ListCategory
import com.arrienty.tokped.ui.theme.TokpedTheme

@Composable
fun BannerTopCategory(modifier: Modifier = Modifier, listCategory: ListCategory) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = painterResource(id = listCategory.imgTopCategory),
            contentDescription = null,
            modifier.size(40.dp)
        )

        Text(text = stringResource(id = listCategory.txtTopCategory), fontSize = 12.sp)
    }
}


@Preview(showBackground = true)
@Composable
private fun BannerTopCategoryPrev() {
    TokpedTheme {
        BannerTopCategory(listCategory = ListCategory(R.drawable.cicil, R.string.txt_credit))
    }
}