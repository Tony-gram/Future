package com.example.future.ui.theme.screens.taxi

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.future.navigation.HOME_URL
import com.example.future.navigation.LIKED_URL
import com.example.future.navigation.NOTIFICATION_URL

@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color(0xff0FB06A)


    ) {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home, "", tint = Color.White)
        },
            label = { Text(text = "Home", color = Color.White) },
            selected = (selectedIndex.value == 0),
            onClick = {

                navController.navigate(HOME_URL) {
                    popUpTo(HOME_URL) { inclusive = true }
                }

            }
        )

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite, "", tint = Color.White)
        },
            label = { Text(text = "Favorite", color = Color.White) },
            selected = (selectedIndex.value == 1),
            onClick = {
                navController.navigate(LIKED_URL) {
                    popUpTo(HOME_URL) { inclusive = true }
                }


            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Notifications, "", tint = Color.White)
        },
            label = {
                Text(
                    text = "Find",
                    color = Color.White
                )
            },
            selected = (selectedIndex.value == 2),
            onClick = {

                navController.navigate(NOTIFICATION_URL) {
                    popUpTo(HOME_URL) { inclusive = true }
                }

            }
        )


    }
}
