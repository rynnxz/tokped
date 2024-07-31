package com.arrienty.tokped.layout

import android.webkit.WebSettings.TextSize
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arrienty.tokped.ui.theme.TokpedTheme

@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Column (Modifier.padding(14.dp)) {
        Row (Modifier
            .width(IntrinsicSize.Max),
            verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)){
            OutlinedTextField(
                modifier = modifier.widthIn(min = 220.dp),
                value = "",
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Search,
                        contentDescription = ""
                    )
                },
                onValueChange = {},
                placeholder = { Text(text = "Search here") })

            Icon(imageVector = Icons.Outlined.Email, contentDescription = null, modifier = modifier.size(24.dp))
            Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = null, modifier = modifier.size(24.dp))
            Icon(imageVector = Icons.Outlined.Notifications, contentDescription = null, modifier = modifier.size(24.dp))
            Icon(imageVector = Icons.Outlined.Menu, contentDescription = null ,modifier = modifier.size(24.dp))
        }
        Row (Modifier.padding(top = 8.dp), horizontalArrangement = Arrangement.spacedBy(4.dp)){
            Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = null, Modifier.size(20.dp))
            Text(text = "Dikirim ke Rumah", fontSize = 12.sp)
            Text(text = "Akbar Riansyah",fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Icon(imageVector = Icons.Outlined.KeyboardArrowDown, contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TopBarPrev() {
    TokpedTheme {
        TopBar()
    }
}