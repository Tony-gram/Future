package com.example.future.ui.theme.screens.profile

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.future.ui.theme.FutureTheme


@Composable
fun ProfileScreen(navController: NavHostController) {


}
@Composable
@Preview(showBackground = true)
fun ProfileScreenPreview() {
    FutureTheme {
        ProfileScreen(navController = rememberNavController())
    }
}