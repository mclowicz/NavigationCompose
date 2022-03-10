package com.example.navigationcompose.presentation.common.bottomNavBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Share
import com.example.navigationcompose.data.model.NavItem
import com.example.navigationcompose.navigation.Screen

val BottomNavItems = listOf(
    NavItem(
        label = Screen.Map.title,
        icon = Icons.Filled.Place,
        route = Screen.Map.route
    ),
    NavItem(
        label = Screen.Send.title,
        icon = Icons.Filled.Send,
        route = Screen.Send.route
    ),
    NavItem(
        label = Screen.Share.title,
        icon = Icons.Filled.Share,
        route = Screen.Share.route
    )
)