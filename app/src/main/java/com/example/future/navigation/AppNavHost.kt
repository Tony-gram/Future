package com.example.easyt.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.future.navigation.DASH_URL
import com.example.future.navigation.FORM_URL
import com.example.future.navigation.HOME_URL
import com.example.future.navigation.HOTEL_URL
import com.example.future.navigation.LIKED_URL
import com.example.future.navigation.LOG_URL
import com.example.future.navigation.NOTIFICATION_URL
import com.example.future.navigation.PROFILE_URL
import com.example.future.navigation.SECOND_SCREEN_URL
import com.example.future.navigation.SIGN_URL
import com.example.future.ui.theme.screens.dashscreen.DashScreen
import com.example.future.ui.theme.screens.form.ReservationScreen
import com.example.future.ui.theme.screens.home.HomeScreen
import com.example.future.ui.theme.screens.hotel.HotelScreen
import com.example.future.ui.theme.screens.liked.LikedScreen
import com.example.future.ui.theme.screens.login.LoginScreen
import com.example.future.ui.theme.screens.notification.NotificationScreen
import com.example.future.ui.theme.screens.profile.ProfileScreen
import com.example.future.ui.theme.screens.second.SecondScreen
import com.example.future.ui.theme.screens.signup.SignupScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = HOME_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOG_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGN_URL){
            SignupScreen(navController = navController)
        }
        composable(HOTEL_URL){
            HotelScreen(navController = navController)
        }
        composable(PROFILE_URL){
            ProfileScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(FORM_URL){
            ReservationScreen(navController = navController)
        }
        composable(DASH_URL){
            DashScreen(navController = navController)
        }
        composable(SECOND_SCREEN_URL){
            SecondScreen(navController = navController)
        }
        composable(LIKED_URL){
            LikedScreen(navController = navController)
        }
        composable(NOTIFICATION_URL){
            NotificationScreen(navController = navController)
        }
    }
}