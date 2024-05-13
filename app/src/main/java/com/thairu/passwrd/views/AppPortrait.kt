package com.thairu.passwrd.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.thairu.passwrd.ui.theme.PassWrdTheme
import com.thairu.passwrd.views.helpers.PassWrdBottomNavigation

@Composable
@Preview
fun MyAppPortrait() {
    PassWrdTheme {
        Scaffold(
            bottomBar = { PassWrdBottomNavigation()}
        ) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}