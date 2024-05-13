package com.thairu.passwrd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thairu.passwrd.ui.theme.PassWrdTheme
import com.thairu.passwrd.views.helpers.AlignYourBodyRow
import com.thairu.passwrd.views.helpers.FavoriteCollectionCard
import com.thairu.passwrd.views.helpers.FavoriteCollectionGrid
import com.thairu.passwrd.views.helpers.SearchBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PassWrdTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.padding(8.dp),
                    color = MaterialTheme.colorScheme.inverseOnSurface
                ) {
                    Column {
                        SearchBar(
                            modifier = Modifier.padding(bottom = 8.dp)
                        )

                        AlignYourBodyRow(
                            modifier = Modifier.padding(vertical = 12.dp)
                        )

                        FavoriteCollectionGrid()
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PassWrdTheme {
        Greeting("Android")
    }
}