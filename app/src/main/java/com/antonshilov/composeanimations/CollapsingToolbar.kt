package com.antonshilov.composeanimations

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun CollapsingToolbar() {
    MaterialTheme {
        val toolbarHeight = 48.dp
        Box {
            LazyColumn(
                Modifier.fillMaxSize(),
                contentPadding = PaddingValues(top = toolbarHeight)
            ) {
                items(100) {
                    Text("Item $it", Modifier.padding(16.dp))
                }
            }
            TopAppBar(
                title = { Text("Toolbar") },
                navigationIcon = {
                    Icon(
                        painter = rememberVectorPainter(image = Icons.Default.ArrowBack),
                        contentDescription = ""
                    )
                },
                modifier = Modifier
                    .height(toolbarHeight)
            )
        }
    }
}
