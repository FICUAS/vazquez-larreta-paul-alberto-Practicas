package com.fic.mobile_app_base_compose.ui.screens.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fic.mobile_app_base_compose.R

@Composable
fun HomeScreen() {
    var haRespondido by remember { mutableStateOf(false) }

    val sithRed = Color(0xFFB71C1C)
    val sentinelYellow = Color(0xFFFFD600)
    val senateWhite = Color(0xFFF5F5F5)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.padding_large)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.senate_title),
            color = senateWhite,
            fontSize = dimensionResource(id = R.dimen.font_title).value.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_title_motto)))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(id = R.string.sith_motto),
                color = Color.Gray,
                fontSize = dimensionResource(id = R.dimen.font_motto).value.sp,
                fontWeight = FontWeight.Light,
                letterSpacing = 4.sp
            )
        }

        Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_motto_btn)))

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
                text = stringResource(id = R.string.btn_response),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }

        if (haRespondido) {
            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacer_response)))

            Text(
                text = stringResource(id = R.string.not_yet),
                color = sentinelYellow,
                fontSize = dimensionResource(id = R.dimen.font_response).value.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 2.sp
            )
        }
    }
}