package com.example.gradlew.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gradlew.R

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val warnaPutih = 0xffffffff
        val warnaHitam = 0xff000000
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
                ) {

                Image(
                    painter = painterResource(id = R.drawable._195),
                    contentDescription = "Gambar"
                )
                Surface(
                    color = Color.Yellow,
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Toyota Supra (MK.4)",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp,16.dp,16.dp,4.dp),
                        color = Color(warnaHitam)
                    )
                }

                Surface(
                    color = Color.Blue,
                    modifier = Modifier.fillMaxWidth()
                )
                {
                    Text(
                        textAlign = TextAlign.Center,
                        text = "Need for Speed (2015)",
                        color = Color(warnaPutih),
                        modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 4.dp)
                    )
                }
            }
        }
    }
}