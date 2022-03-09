package com.example.navigationcompose.presentation.screens.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.navigationcompose.presentation.common.TopBar

@Composable
fun Settings(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            title = "Settings",
            hamburgerIcon = Icons.Filled.ArrowBack,
            onHamburgerButtonClicked = { navController.popBackStack() },
            navController = navController
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Settings Page content here.")
        }
    }
}