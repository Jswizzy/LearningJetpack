package com.example.learningjetpack.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.learningjetpack.Screens

val buttons = mapOf(
    "Text" to Screens.TextScreen,
    "TextField" to Screens.TextFieldScreen,
    "Buttons" to Screens.ButtonsScreen,
    "Progress" to Screens.ProgressScreen,
    "AlertDialog" to Screens.AlertDialogScreen,
    "Rows" to Screens.RowScreen,
    "Column" to Screens.ColumnScreen,
    "Box" to Screens.BoxScreen,
    "Surface" to Screens.SurfaceScreen,
)

@Composable
fun NavigationScreen(navController: NavHostController) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            buttons.forEach { (title, screen) ->
                NavigationButton(title) {
                    navController.navigate(screen.name)
                }
            }
        }
    }
}

@Composable
fun NavigationButton(text: String, onNavigate: () -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp),
        shape = RoundedCornerShape(4.dp),
        onClick = {
            onNavigate()
        }
    ) {
        Text(text = text)
    }
}
