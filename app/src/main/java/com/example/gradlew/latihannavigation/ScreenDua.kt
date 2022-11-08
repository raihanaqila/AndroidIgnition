package com.example.gradlew.latihannavigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenDua(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color(0xffeb8334),
                contentColor = Color.White
            )
        ) {5
            Text(text = "Hallo Mahasiswa")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ScreenDuePreview() {
    ScreenDua(rememberNavController())
}