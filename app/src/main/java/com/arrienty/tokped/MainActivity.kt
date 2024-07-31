package com.arrienty.tokped

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arrienty.tokped.layout.TopBar
import com.arrienty.tokped.layout.TopMenu
import com.arrienty.tokped.model.dummyListMenu
import com.arrienty.tokped.ui.theme.TokpedTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TokpedTheme {
                Surface(Modifier.fillMaxSize()) {
                    TokpedApp()
                }
            }
        }
    }
}

@Composable
fun TokpedApp(modifier: Modifier = Modifier) {
    Column (modifier.verticalScroll(rememberScrollState())) {
        TopBars()
        TopMenus()
    }
}

@Composable
fun TopMenus(modifier: Modifier = Modifier) {
    LazyRow(modifier.padding(4.dp)) {
        items(dummyListMenu){
            TopMenu(listTopMenu = it)
        }
    }
}


@Composable
fun TopBars(modifier: Modifier = Modifier) {
    TopBar()
}

@Preview (showBackground = true)
@Composable
private fun TopBarPrev() {
    TokpedTheme {
        TokpedApp()
    }
}