package com.example.navigationcompose.presentation.common

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import com.example.navigationcompose.navigation.Screen

@Composable
fun TopBar(
    title: String = "",
    hamburgerIcon: ImageVector,
    onHamburgerButtonClicked: () -> Unit,
    navController: NavController? = null
) {
    TopAppBar(
        title = {
            Text(
                text = title
            )
        },
        actions = {
            IconButton(onClick = {
                navController?.navigate(Screen.Cart.route) {
                    navController.graph.startDestinationId
                    launchSingleTop = true
                }
            } ) {
                Icon(Icons.Filled.ShoppingCart, contentDescription = "")
            }
        },
        navigationIcon = {
            IconButton(onClick = { onHamburgerButtonClicked() } ) {
                Icon(hamburgerIcon, contentDescription = "")
            }
        },
        backgroundColor = MaterialTheme.colors.primaryVariant
    )
}