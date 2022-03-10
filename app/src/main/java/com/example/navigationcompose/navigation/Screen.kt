package com.example.navigationcompose.navigation

sealed class Screen(val title: String, val route: String) {
    object Home : Screen("Home", "home_screen")
    object Profile : Screen("Profile", "profile_screen")
    object Settings : Screen("Settings", "settings_screen")
    object Help : Screen("Help", "help_screen")
    object Cart : Screen("Cart", "cart_screen")
    object Map : Screen("Map", "map_screen")
    object Send : Screen("Send", "send_screen")
    object Share : Screen("Share", "share_screen")
}