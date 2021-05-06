package com.hongwei.jetpack_compose_demo.view.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hongwei.jetpack_compose_demo.view.SplashScreen
import com.hongwei.jetpack_compose_demo.view.screens.MainScreen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NavComposeApp(
    rootNavController: NavHostController,
    mainNavController: NavHostController
) {
    NavHost(rootNavController, startDestination = "splash") {
        composable("splash") {
            SplashScreen(rootNavController)
        }
        composable("main") {
            MainScreen(mainNavController)
        }
    }
}