package com.example.quadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrants.ui.theme.QuadrantTheme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}

@Composable
fun QuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.first_title),
                //description = stringResource(R.string.first_description),
                imageRes = R.drawable.australia,
                backgroundColor = Color(0xFFEADDFF),
                imageWidth = 200, // Specify width of the image
                imageHeight = 100,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.second_title),
                //description = stringResource(R.string.second_description),
                imageRes = R.drawable.belgian,
                backgroundColor = Color(0xFFD0BCFF),
                imageWidth = 200, // Specify width of the image
                imageHeight = 100,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.third_title),
                //description = stringResource(R.string.third_description),
                imageRes = R.drawable.brazil,
                backgroundColor = Color(0xFFB69DF8),
                imageWidth = 200, // Specify width of the image
                imageHeight = 100,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.fourth_title),
                //description = stringResource(R.string.fourth_description),
                imageRes = R.drawable.croatia,
                backgroundColor = Color(0xFFF6EDFF),
                imageWidth = 200, // Specify width of the image
                imageHeight = 100,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
   // description: String,
    imageRes: Int, // Resource ID of the image
    backgroundColor: Color,
    imageWidth: Int, // Width of the image in pixels
    imageHeight: Int, // Height of the image in pixels
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imageRes),
            contentDescription = null,
            modifier = Modifier
                .height(imageHeight.dp) // Set height of the image
                .width(imageWidth.dp), // Set width of the image
            contentScale = ContentScale.Crop, // Adjust the scaling of the image
            alignment = Alignment.Center // Center the image within the column
        )
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )

    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantAppPreview() {
    QuadrantTheme {
        QuadrantApp()
    }
}