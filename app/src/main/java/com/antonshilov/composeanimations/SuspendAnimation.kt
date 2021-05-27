package com.antonshilov.composeanimations

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

@Preview
@Composable
fun SuspendAnimation() {

    Box(
        Modifier
            .fillMaxSize()
            .background(Color(0xffb99aff))
    ) {
        Text("Tap anywhere", Modifier.align(Alignment.Center))
        Box(
            Modifier
                .size(40.dp)
                .background(Color(0xff3c1361), CircleShape)
        )
    }
}


































//@Preview
//@Composable
//fun SuspendAnimation() {
//
//    val animatedOffset = remember { Animatable(Offset(0f, 0f), Offset.VectorConverter) }
//
//    Box(
//        Modifier
//            .fillMaxSize()
//            .background(Color(0xffb99aff))
//            .pointerInput(Unit) {
//                coroutineScope {
//                    while (true) {
//                        val offset = awaitPointerEventScope {
//                            awaitFirstDown().position
//                        }
//                        // Launch a new coroutine for animation so the touch detection thread is not
//                        // blocked.
//                        launch {
//                            // Animates to the pressed position, with the given animation spec.
//                            animatedOffset.animateTo(
//                                offset,
//                                animationSpec = spring(stiffness = Spring.StiffnessVeryLow)
//                            )
//                        }
//                    }
//                }
//            }
//    ) {
//        Text("Tap anywhere", Modifier.align(Alignment.Center))
//        Box(
//            Modifier
//                .offset {
//                    IntOffset(
//                        animatedOffset.value.x.roundToInt(),
//                        animatedOffset.value.y.roundToInt()
//                    )
//                }
//                .size(40.dp)
//                .background(Color(0xff3c1361), CircleShape)
//        )
//    }
//}
