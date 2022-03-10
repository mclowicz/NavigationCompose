package com.example.navigationcompose.presentation.common.topBar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.example.navigationcompose.data.model.NavItem
import com.example.navigationcompose.navigation.Screen

val TopBarNavItems = listOf(
    NavItem(
        label = Screen.Cart.title,
        icon = Icons.Filled.ShoppingCart,
        route = Screen.Cart.route
    )
)