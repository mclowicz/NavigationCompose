package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationcompose.presentation.screens.cart.Cart
import com.example.navigationcompose.presentation.screens.Help
import com.example.navigationcompose.presentation.screens.settings.Settings
import com.example.navigationcompose.presentation.screens.home.Home
import com.example.navigationcompose.presentation.screens.profile.Profile

@Composable
fun SetupNavGraph(
    navHostController: NavHostController,
    openDrawer: () -> Unit
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    )
    {
        composable(Screen.Home.route) {
            Home(
                navController = navHostController,
                openDrawer = { openDrawer() }
            )
        }
        composable(Screen.Profile.route) {
            Profile(
                navController = navHostController,
                openDrawer = { openDrawer() }
            )
        }
        composable(Screen.Settings.route) {
            Settings(navController = navHostController)
        }
        composable(Screen.Help.route) {
            Help(navController = navHostController)
        }
        composable(Screen.Cart.route) {
            Cart(navController = navHostController)
        }
    }
}