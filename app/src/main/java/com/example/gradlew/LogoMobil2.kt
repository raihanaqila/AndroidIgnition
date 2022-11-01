package com.example.gradlew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


// Tugas Aplikasi Mobile Computing
// Tanggal: 25 Oktober 2022
// Nama: Raihan Aqila Thahir (191344024)


class LogoMobil2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showLogoMobil2()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun showLogoMobil2() {
    Column(Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = "Toyota Supra (Mk.4)",
                description = "BadFingaass!! [#001 Car]",
                backgroundColor = Color(0xFFe0091f),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Nissan Skyline GT-R (BNR32)",
                description = "Off-White™",
                backgroundColor = Color(0xff004170),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Mazda RX-7 (FD)",
                description = "CHR0M3",
                backgroundColor = Color(0xfff7cf05),
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = "Chevrolet Corvette ZO6 (C6)",
                description = "[DRMWLKR_PRJCT]",
                backgroundColor = Color(0xffecf3fd),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Porsche 911 Carrera RSR (2.8)",
                description = "珍し 魚座",
                backgroundColor = Color(0xff3d3302),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = "Lamborghini Countach (25th Anniversary)",
                description = "The HeatSeeker",
                backgroundColor = Color(0xffDA291C),
                modifier = Modifier.weight(1f)
            )
        }

    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        if (title == "Toyota Supra (Mk.4)")
        {
            Image(
                painter = painterResource(id = R.drawable._195),
                contentDescription = "Toyota Supra Mk.4",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(5.dp, Color.Black, CircleShape)
            )
            Text(
                text = title,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = description,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }

        if (title == "Nissan Skyline GT-R (BNR32)")
        {
            Image(
                painter = painterResource(id = R.drawable._058),
                contentDescription = "Nissan Skyline GT-R BNR32",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(5.dp, Color.Black, CircleShape)
            )
            Text(
                text = title,
                color = Color.Yellow,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = description,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }

        if (title == "Mazda RX-7 (FD)")
        {
            Image(
                painter = painterResource(id = R.drawable._2210),
                contentDescription = "Mazda RX-7",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(5.dp, Color(0xff15702b), CircleShape)
            )
            Text(
                text = title,
                color = Color(0xff15702b),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = description,
                color = Color(0xff800000),
                textAlign = TextAlign.Center
            )
        }

        if (title == "Chevrolet Corvette ZO6 (C6)")
        {
            Image(
                painter = painterResource(id = R.drawable._073),
                contentDescription = "Corvette Z06",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(5.dp, Color.Black, CircleShape)
            )
            Text(
                text = title,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = description,
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }

        if (title == "Porsche 911 Carrera RSR (2.8)")
        {
            Image(
                painter = painterResource(id = R.drawable._084),
                contentDescription = "Porsche 911 Classic",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(5.dp, Color.Yellow, CircleShape)
            )
            Text(
                text = title,
                color = Color.Yellow,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = description,
                color = Color.Yellow,
                textAlign = TextAlign.Center
            )
        }

        if (title == "Lamborghini Countach (25th Anniversary)")
        {
            Image(
                painter = painterResource(id = R.drawable.line_album_the_heatseeker__v1__nfs_heat_version__221031),
                contentDescription = "Lamborghini Countach",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(5.dp, Color(0xffe68c8c), CircleShape)
            )
            Text(
                text = title,
                color = Color(0xffe68c8c),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = description,
                color = Color(0xffe68c8c),
                textAlign = TextAlign.Center
            )
        }
    }
}