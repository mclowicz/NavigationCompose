package com.example.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationcompose.presentation.screens.cart.Cart
import com.example.navigationcompose.presentation.screens.Help
import com.example.navigationcompose.presentation.screens.settings.Settings
import com.example.navigationcompose.presentation.screens.home.Home
import com.example.navigationcompose.presentation.screens.maps.Maps
import com.example.navigationcompose.presentation.screens.profile.Profile
import com.example.navigationcompose.presentation.screens.send.Send
import com.example.navigationcompose.presentation.screens.share.Share

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
            Home(navController = navHostController, openDrawer = { openDrawer() })
        }
        composable(Screen.Profile.route) {
            Profile(navController = navHostController, openDrawer = { openDrawer() })
        }
        composable(Screen.Settings.route) {
            Settings(navController = navHostController, openDrawer = { openDrawer() })
        }
        composable(Screen.Help.route) {
            Help(navController = navHostController, openDrawer = { openDrawer() })
        }
        composable(Screen.Cart.route) {
            Cart(navController = navHostController)
        }
        composable(Screen.Map.route) {
            Maps(navController = navHostController, openDrawer = { openDrawer() })
        }
        composable(Screen.Send.route) {
            Send(navController = navHostController, openDrawer = { openDrawer() })
        }
        composable(Screen.Share.route) {
            Share(navController = navHostController, openDrawer = { openDrawer() })
        }
    }
}