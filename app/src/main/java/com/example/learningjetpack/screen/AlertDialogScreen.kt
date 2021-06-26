package com.example.learningjetpack.screen

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.example.learningjetpack.R
import com.example.learningjetpack.Screens

@Composable
fun AlertDialogScreen(navHostController: NavHostController) {
    MyAlertDialog(navHostController)
}

@Composable
fun MyAlertDialog(navHostController: NavHostController) {
    val shouldShowDialog = remember { mutableStateOf(true) }

    if (shouldShowDialog.value) {
        AlertDialog(
            onDismissRequest = {
                shouldShowDialog.value = false
                navHostController.navigate(Screens.NavigationScreen.name)
            },
            title = { Text(text = stringResource(R.string.alert_text)) },
            text = { Text(text = stringResource(R.string.alert_title)) },
            confirmButton = {
                Button(
                    onClick = {
                        shouldShowDialog.value = false
                        navHostController.navigate(Screens.NavigationScreen.name)
                    }
                ) {
                    Text(text = stringResource(R.string.confirm))
                }
            }
        )
    }
}
