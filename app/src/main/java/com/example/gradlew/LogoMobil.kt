package com.example.gradlew

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


// Tugas Aplikasi Mobile Computing
// Tanggal: 25 Oktober 2022
// Nama: Raihan Aqila Thahir (191344024)



class LogoMobil : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showLogoMobil()
        }
    }
}


fun getScreenWidth(): Int {
    return Resources.getSystem().displayMetrics.widthPixels
}

fun getScreenHeight(): Int {
    return Resources.getSystem().displayMetrics.heightPixels
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showLogoMobil() {
    val surfaceWidth = getScreenWidth() * 0.12681;
    val surfaceHeight = getScreenHeight() * 0.1905;
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Surface(
                color = Color(0xffDC052D),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable._195),
                        contentDescription = "Toyota Supra Mk.4",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(5.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Toyota Supra (Mk.4)",
                        fontSize = 13.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "BadFingaass!! [#001 Car]",
                        fontSize = 10.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xff004170),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable._058),
                        contentDescription = "Nissan Skyline GT-R BNR32",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(5.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Nissan Skyline GT-R (BNR32)",
                        fontSize = 13.sp,
                        color = Color.Yellow,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Off-White™",
                        fontSize = 10.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xfff7cf05),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable._2210),
                        contentDescription = "Mazda RX-7",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(5.dp, Color(0xff15702b), CircleShape)
                    )
                    Text(
                        text = "Mazda RX-7 (FD)",
                        fontSize = 13.sp,
                        color = Color(0xff15702b),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "CHR0M3",
                        fontSize = 10.sp,
                        color = Color.Red,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                color = Color(0xffecf3fd),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable._073),
                        contentDescription = "Corvette Z06",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(5.dp, Color.Black, CircleShape)
                    )
                    Text(
                        text = "Chevrolet Corvette ZO6 (C6)",
                        fontSize = 13.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        text = "[DRMWLKR_PRJCT]",
                        fontSize = 10.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xff3d3302),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable._084),
                        contentDescription = "Porsche 911 Classic",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(5.dp, Color.Yellow, CircleShape)
                    )
                    Text(
                        text = "Porsche 911 Carrera RSR (2.8)",
                        fontSize = 13.sp,
                        color = Color.Yellow,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "珍し 魚座",
                        fontSize = 10.sp,
                        color = Color.Yellow,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Surface(
                color = Color(0xffDA291C),
                modifier = Modifier.size(surfaceWidth.dp, surfaceHeight.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(

                        painter = painterResource(id = R.drawable.line_album_the_heatseeker__v1__nfs_heat_version__221031),
                        contentDescription = "Lamborghini Countach",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .border(5.dp, Color(0xffe68c8c), CircleShape)
                    )
                    Text(
                        text = "Lamborghini Countach (25th Anniversary)",
                        fontSize = 13.sp,
                        color = Color(0xffe68c8c),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "The HeatSeeker",
                        fontSize = 10.sp,
                        color = Color(0xffe68c8c),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}