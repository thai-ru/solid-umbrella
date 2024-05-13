package com.thairu.passwrd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.thairu.passwrd.ui.theme.PassWrdTheme
import com.thairu.passwrd.views.MyAppPortrait

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PassWrdTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.inverseOnSurface
                ) {
                    MyAppPortrait()
                }
            }
        }
    }
}
