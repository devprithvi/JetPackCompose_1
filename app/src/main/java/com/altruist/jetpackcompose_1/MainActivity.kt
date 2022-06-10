package com.altruist.jetpackcompose_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.altruist.jetpackcompose_1.ui.theme.JetPackCompose_1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier
//                    .fillMaxSize(0.5f)
                    .width(200.dp)
                    .height(200.dp)
                    .background(Color.Green),
                Arrangement.SpaceAround,
                Alignment.CenterVertically) {
                Text("Hello")
                Text(text = "Name!")
                Text(text = "World!")
            }
        }
    }
}
