package com.example.navigationcompose.presentation.screens.cart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.navigationcompose.R
import com.example.navigationcompose.navigation.Screen
import com.example.navigationcompose.presentation.common.TopBar

@Composable
fun Cart(
    navController: NavController
) {
    val title = Screen.Cart.title
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            title = title,
            hamburgerIcon = Icons.Filled.ArrowBack,
            onHamburgerButtonClicked = { navController.popBackStack() }
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = LocalContext.current.getString(R.string.page_content, title))
        }
    }
}