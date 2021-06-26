package com.example.learningjetpack

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.learningjetpack.screen.*

@Composable
fun App() {
    val navController = rememberNavController()

    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
        NavHost(navController = navController, startDestination = Screens.NavigationScreen.name) {
            composable(Screens.TextScreen.name) { TextScreen() }
            composable(Screens.NavigationScreen.name) { NavigationScreen(navController) }
            composable(Screens.TextFieldScreen.name) { TextFieldScreen() }
            composable(Screens.ButtonsScreen.name) { ButtonsScreen() }
            composable(Screens.ProgressScreen.name) { ProgressScreen() }
            composable(Screens.AlertDialogScreen.name) { AlertDialogScreen(navController) }
            composable(Screens.RowScreen.name) { RowScreen() }
            composable(Screens.ColumnScreen.name) { ColumnScreen() }
            composable(Screens.BoxScreen.name) { BoxScreen() }
            composable(Screens.SurfaceScreen.name) { SurfaceScreen() }
        }
    }
}

enum class Screens {
    TextScreen,
    NavigationScreen,
    TextFieldScreen,
    ButtonsScreen,
    ProgressScreen,
    AlertDialogScreen,
    RowScreen,
    ColumnScreen,
    BoxScreen,
    SurfaceScreen,
}
