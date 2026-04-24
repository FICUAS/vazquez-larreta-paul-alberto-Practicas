package com.fic.mobile_app_base_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fic.mobile_app_base_compose.ui.screens.home.HomeScreen
import com.fic.mobile_app_base_compose.ui.theme.MobileappbasecomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MobileappbasecomposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    HomeScreen()

                }
            }
        }
    }
}

