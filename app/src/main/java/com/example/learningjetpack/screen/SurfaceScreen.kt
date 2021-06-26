package com.example.learningjetpack.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SurfaceScreen(modifier: Modifier = Modifier) {

    Box(modifier = modifier.fillMaxSize()) {
        MySurface(modifier = modifier.align(Alignment.Center))
    }
}

@Composable
fun MySurface(modifier: Modifier) {
    Surface(
        modifier = modifier.size(100.dp), // 1
        color = Color.LightGray, // 2
        contentColor = MaterialTheme.colors.primary,
        elevation = 1.dp, // 3
        border = BorderStroke(1.dp, Color.Black) // 4
    ) {
        MyColumn() // 5
    }
}
