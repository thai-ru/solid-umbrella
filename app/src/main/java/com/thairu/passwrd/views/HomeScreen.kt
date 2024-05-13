package com.thairu.passwrd.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.thairu.passwrd.R
import com.thairu.passwrd.ui.theme.PassWrdTheme
import com.thairu.passwrd.views.helpers.AlignYourBodyRow
import com.thairu.passwrd.views.helpers.FavoriteCollectionGrid
import com.thairu.passwrd.views.helpers.HomeSection
import com.thairu.passwrd.views.helpers.SearchBar

@Composable
fun HomeScreen (
    modifier: Modifier = Modifier
){
    Column(
        modifier
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(Modifier.height(16.dp))
        SearchBar(
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        HomeSection(title = R.string.align_your_body) {
            AlignYourBodyRow(
//                modifier = Modifier.padding(vertical = 12.dp)
            )
        }

        HomeSection(title = R.string.favorite_collections) {
            FavoriteCollectionGrid()
        }
        Spacer(modifier = Modifier.height(16.dp))

    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE, heightDp = 180)
@Composable
fun ScreenContentPreview() {
    PassWrdTheme {
        HomeScreen()
    }
}