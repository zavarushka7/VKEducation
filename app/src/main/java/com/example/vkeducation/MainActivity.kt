package com.example.vkeducation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import com.example.vkeducation.ui.theme.VKEducationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VKEducationTheme {

                MainActivityScreen()

            }
        }
    }
}

@Composable
fun MainActivityScreen() {
    Column{
        Row(){
            Image(
                painter = painterResource( R.drawable.img),
                contentDescription = null,
            )
            Text(
                ""
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VKEducationTheme {
        MainActivityScreen()
    }
}