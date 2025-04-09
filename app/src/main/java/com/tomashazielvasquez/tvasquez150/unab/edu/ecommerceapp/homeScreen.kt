package com.tomashazielvasquez.tvasquez150.unab.edu.ecommerceapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.tomashazielvasquez.tvasquez150.unab.edu.ecommerceapp.ui.theme.EcommerceAppTheme

@Composable
fun HomeScreen() {
    Scaffold { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Text("home screen", fontSize = 50.sp)
        }
    }

}

@Preview
@Composable
fun homeScreenPreview() {
    EcommerceAppTheme {
        HomeScreen()
    }
}