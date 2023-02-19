package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {
    @Composable
    fun ComposeArticleImage(imageText: String,  modifier: Modifier = Modifier) {
        val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null
        )
    }

    @Composable
    fun articleTitle(composetitle: String, modifier: Modifier = Modifier) {
        Text(
            text = composetitle,
            fontSize = 24.sp
        )

    }

    @Composable
    fun firstp(firstp: String, modifier: Modifier = Modifier) {
        Text(
            text = firstp
        )
    }

    @Composable
    fun secondp(secondp: String, modifier: Modifier = Modifier) {
        Text(
            text = secondp
        )
    }

    @Composable
    fun imageText(imageText: String, modifier: Modifier = Modifier) {
        Text(
            text = imageText
        )
    }

    @Preview(showBackground = false)
    @Composable
    fun ComposeArticleImagePreview() {
        ComposeArticleImage(imageText = "   ")
    }


    @Preview(showBackground = true)
    @Composable
    fun articleTitlePreview() {
        articleTitle("Jetpack Compose Tutorial", modifier = Modifier.padding(16.dp))
    }

    @Preview(showBackground = true)
    @Composable
    fun firstpPreview() {
        firstp(
            "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on android with less code, powerful tools, and intuitive Kotlin APIs.",
            modifier = Modifier.padding(16.dp)
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun secondpPreview() {
        secondp("In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            modifier = Modifier.padding(16.dp))
    }

}
