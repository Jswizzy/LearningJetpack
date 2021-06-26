package com.example.learningjetpack.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonsScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        MyButton()
        MyRadioGroup()
        MyFloatingActionButton()
    }
}

@Composable
fun MyButton() {
    Button(
        onClick = {},
        border = BorderStroke(1.dp, MaterialTheme.colors.primaryVariant),
    ) {
        Text(text = "Button")
    }
}

@Composable
fun MyRadioGroup() {
    val radioButtons = listOf(0, 1, 2)

    val selectedButton = remember { mutableStateOf(radioButtons.first()) }

    Column {
        radioButtons.forEach { index ->
            val isSelected = index == selectedButton.value

            RadioButton(
                selected = isSelected,
                onClick = { selectedButton.value = index }
            )
        }
    }
}

@Composable
fun MyFloatingActionButton() {
    FloatingActionButton(
        onClick = {},
        content = {
            Icon(Icons.Filled.Favorite, contentDescription = "Test FAB")
        }
    )
}
