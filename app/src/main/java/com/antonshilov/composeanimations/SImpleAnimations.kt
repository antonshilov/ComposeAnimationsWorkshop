package com.antonshilov.composeanimations

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@ExperimentalAnimationApi
@Preview(showSystemUi = true)
@Composable
fun SimpleAnimations() {

    Column {
        ColorAnimation()
        SizeAnimation()
        PaddingAnimation()
        ContentSize()
        VisibilityAnimation()
    }
}

val colors = listOf(Color.Red, Color.Magenta, Color.Black, Color.Blue, Color.Yellow, Color.Cyan)

@Preview
@Composable
fun ColorAnimation() {

}

@Preview
@Composable
fun SizeAnimation() {

}

@Preview
@Composable
fun PaddingAnimation() {

}

@Preview
@Composable
fun ContentSize() {

}

@ExperimentalAnimationApi
@Preview
@Composable
fun VisibilityAnimation() {

}

