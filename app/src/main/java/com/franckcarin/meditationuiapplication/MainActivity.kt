package com.franckcarin.meditationuiapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.franckcarin.meditationuiapplication.ui.HomeScreen
import com.franckcarin.meditationuiapplication.ui.theme.MeditationUIApplicationTheme

class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIApplicationTheme() {
                HomeScreen()

            }
        }
    }
}
