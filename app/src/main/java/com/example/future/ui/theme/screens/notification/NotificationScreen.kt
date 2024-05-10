package com.example.future.ui.theme.screens.notification

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.future.ui.theme.FutureTheme
import com.example.future.ui.theme.screens.second.SecondScreen

@Composable
fun NotificationScreen(navController: NavHostController) {

}

@Composable
@Preview(showBackground = true)
fun NotificationScreenPreview(){
    FutureTheme {
        NotificationScreen(navController = rememberNavController())
    }
}