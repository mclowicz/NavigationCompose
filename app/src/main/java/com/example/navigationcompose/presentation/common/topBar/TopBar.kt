package com.example.navigationcompose.presentation.common

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import com.example.navigationcompose.presentation.common.topBar.TopBarNavItems

@Composable
fun TopBar(
    title: String = String(),
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
            TopBarNavItems.forEach { navItem ->
                IconButton(onClick = {
                    navController?.navigate(navItem.route) {
                        navController.graph.startDestinationId
                        launchSingleTop = true
                    }
                }) {
                    Icon(navItem.icon, contentDescription = navItem.label)
                }
            }
        },
        navigationIcon = {
            IconButton(onClick = { onHamburgerButtonClicked() }) {
                Icon(hamburgerIcon, contentDescription = String())
            }
        },
        backgroundColor = MaterialTheme.colors.primaryVariant
    )
}