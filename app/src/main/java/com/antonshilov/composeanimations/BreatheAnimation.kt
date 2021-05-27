package com.antonshilov.composeanimations

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun FlowerPreview() {
    Surface(color = Color.Black) {

        Column {
            Flower(
                numberOfCircles = 5,
                circleDiameter = 80.dp,
                color = Color.Cyan.copy(alpha = 0.6f)
            )
        }
    }
}

@Composable
fun Flower(
    numberOfCircles: Int,
    circleDiameter: Dp,
    color: Color
) {
    FlowerRendering(
        numberOfCircles = numberOfCircles,
        circleDiameter = circleDiameter,
        rotation = 0f,
        scale = 1f,
        offset = circleDiameter / 2,
        transformOrigin = TransformOrigin(0f, 0.5f),
        color = color
    ) { }
}

@Composable
private fun FlowerRendering(
    numberOfCircles: Int,
    circleDiameter: Dp,
    rotation: Float,
    scale: Float,
    offset: Dp,
    transformOrigin: TransformOrigin,
    color: Color,
    onClick: () -> Unit,
) {
    val absoluteCircleAngle: Float = 360f / numberOfCircles
    Box(
        Modifier
            .clickable(onClick = onClick)
            .size(circleDiameter * 2)
            .graphicsLayer(
                rotationZ = rotation,
                scaleX = scale,
                scaleY = scale
            )
            .graphicsLayer(rotationZ = -60f, rotationY = 180f)
            .offset(x = offset),
        contentAlignment = Alignment.Center
    ) {
        for (i in 0..numberOfCircles) {
            Box(
                modifier = Modifier
                    .graphicsLayer(
                        rotationZ = absoluteCircleAngle * i,
                        transformOrigin = transformOrigin
                    )
                    .size(circleDiameter)
                    .background(color, CircleShape)
            )
        }

    }
}
