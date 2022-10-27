package com.example.gradlew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource

class DaduActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent() {

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DiceApp() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        var diceValue by remember {
            mutableStateOf(1)
        }

        val image = when (diceValue) {
            1 -> R.drawable._195
            2 -> R.drawable._013
            3 -> R.drawable._033
            4 -> R.drawable._047
            5 -> R.drawable._061
            else -> {
                R.drawable._073
            }
        }
        Image(
            painter = painterResource(id = R.drawable._159),
            contentDescription = null
        )

        Spacer(
            modifier = Modifier.height(28.dp)
        )
        Button(
            onClick = {
                      diceValue = (1..6).random()
                      },
            content = {
                Text(text = "Roll")
            }
        )
    }
}