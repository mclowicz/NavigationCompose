package com.example.navigationcompose.presentation.common.drawer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import com.example.navigationcompose.data.model.NavItem
import com.example.navigationcompose.navigation.Screen

val DrawerNavItems = listOf(
    NavItem(
        label = Screen.Home.title,
        icon = Icons.Filled.Home,
        route = Screen.Home.route
    ),
    NavItem(
        label = Screen.Profile.title,
        icon = Icons.Filled.Person,
        route = Screen.Profile.route
    ),
    NavItem(
        label = Screen.Settings.title,
        icon = Icons.Filled.Settings,
        route = Screen.Settings.route
    ),
    NavItem(
        label = Screen.Help.title,
        icon = Icons.Filled.Call,
        route = Screen.Help.route
    )
)