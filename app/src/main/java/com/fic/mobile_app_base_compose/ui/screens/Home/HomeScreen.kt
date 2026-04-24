package com.fic.mobile_app_base_compose.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    var haRespondido by remember { mutableStateOf(false) }

    val sithRed = Color(0xFFB71C1CL)
    val sentinelYellow = Color(0xFFFFD600L)
    val senateWhite = Color(0xFFF5F5F5L)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "I AM THE SENATE",
            color = senateWhite,
            fontSize = 42.sp,
            fontWeight = FontWeight.ExtraBold,
            lineHeight = 48.sp
        )

        Spacer(modifier = Modifier.height(50.dp))


        Button(
            onClick = { haRespondido = true },
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(60.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = sithRed,
                contentColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(8.dp)
        ) {
            Text(
                text = "Respuesta",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }


        if (haRespondido) {
            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "NOT YET.",
                color = sentinelYellow,
                fontSize = 50.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 2.sp
            )
        }
    }
}