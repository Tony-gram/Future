package com.example.future.ui.theme.screens.liked

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.future.ui.theme.FutureTheme
import com.example.future.ui.theme.screens.login.LoginScreen

@Composable
fun LikedScreen(navController: NavHostController) {

}

@Composable
@Preview(showBackground = true)
fun LikedScreenPreview() {
    FutureTheme {
        LikedScreen(navController = rememberNavController())
    }
}