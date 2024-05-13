package com.thairu.passwrd.views

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.thairu.passwrd.ui.theme.PassWrdTheme
import com.thairu.passwrd.views.helpers.BottomNavigationRail

@Composable
@Preview
fun AppLandScape() {
    PassWrdTheme {
        Surface (color = MaterialTheme.colorScheme.background){
            Row {
                BottomNavigationRail()
                HomeScreen()
            }
        }
    }
}