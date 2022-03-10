package com.example.navigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.navigation.SetupNavGraph
import com.example.navigationcompose.presentation.common.BottomNavBar
import com.example.navigationcompose.presentation.common.Drawer
import com.example.navigationcompose.ui.theme.NavigationComposeTheme
import kotlinx.coroutines.launch

@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationComposeTheme() {
                AppMainScreen()
            }
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun AppMainScreen() {
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    Surface(
        color = MaterialTheme.colors.background,
    ) {
        Scaffold(
            bottomBar = {
                AnimatedVisibility(
                    visible = drawerState.isClosed,
                    enter = expandVertically(),
                    exit = shrinkVertically()) {
                    BottomNavBar(navController = navController)
                }
            }
        ) {
            val scope = rememberCoroutineScope()
            val openDrawer = {
                scope.launch {
                    drawerState.open()
                }
            }
            ModalDrawer(
                drawerState = drawerState,
                gesturesEnabled = drawerState.isOpen,
                drawerContent = {
                    Drawer(
                        onDestinationClicked = { route ->
                            scope.launch {
                                drawerState.close()
                            }
                            navController.navigate(route) {
                                navController.graph.startDestinationId
                                launchSingleTop = true
                            }
                        },
                        navHostController = navController
                    )
                }
            ) {
                SetupNavGraph(
                    navHostController = navController,
                    openDrawer = { openDrawer() }
                )
            }
        }
    }
}