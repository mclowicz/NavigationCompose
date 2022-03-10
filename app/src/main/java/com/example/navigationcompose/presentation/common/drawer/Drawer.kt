package com.example.navigationcompose.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navigationcompose.R
import com.example.navigationcompose.presentation.common.drawer.DrawerNavItems

@Composable
fun Drawer(
    onDestinationClicked: (route: String) -> Unit,
    navHostController: NavHostController
) {
    Column {
        Image(
            modifier = Modifier.padding(start = 24.dp, top = 42.dp, bottom = 24.dp),
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = "App icon"
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(color = Color.LightGray)
        )
        DrawerNavItems.forEach { navItem ->
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .clickable {
                        onDestinationClicked(navItem.route)
                    }
            ) {
                Column() {
                    Icon(
                        imageVector = navItem.icon,
                        contentDescription = navItem.label,
                        tint = if (navItem.route == navHostController.currentDestination?.route) {
                            MaterialTheme.colors.primary
                        } else {
                            Color.Gray
                        }
                    )
                }
                Column() {
                    Text(
                        text = navItem.label,
                        color = if (navItem.route == navHostController.currentDestination?.route) {
                            MaterialTheme.colors.primary
                        } else {
                            Color.Gray
                        },
                        style = if (navItem.route == navHostController.currentDestination?.route) {
                            MaterialTheme.typography.h6
                        } else {
                            MaterialTheme.typography.subtitle1
                        },
                        modifier = Modifier
                            .padding(start = 24.dp)
                    )
                    if (navItem.label == "Profile") {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 24.dp, start = 16.dp, end = 16.dp)
                                .height(1.dp)
                                .background(color = Color.LightGray)
                        )
                    }
                }
            }
        }
    }
}