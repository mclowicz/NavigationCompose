package com.example.navigationcompose.presentation.common

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navigationcompose.R
import com.example.navigationcompose.navigation.Screen

private val screens = listOf(
    Screen.Home,
    Screen.Profile,
    Screen.Settings,
    Screen.Help
)

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
        screens.forEach { screen ->
            Spacer(
                modifier = Modifier
                    .height(24.dp)
            )
            Text(
                text = screen.title,
                style = if (screen.route == navHostController.currentDestination?.route) {
                    MaterialTheme.typography.h6
                } else {
                    MaterialTheme.typography.subtitle1
                },
                modifier = Modifier
                    .clickable {
                        onDestinationClicked(screen.route)
                    }
                    .padding(start = 24.dp)
            )
            Log.e("xxx", "current route: ${navHostController.currentDestination?.route}")
            if (screen.title == "Profile") {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, start = 24.dp, end = 24.dp)
                        .height(1.dp)
                        .background(color = Color.LightGray)
                )
            }
        }
    }
}