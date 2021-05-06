package com.hongwei.jetpack_compose_demo.view.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.hilt.navigation.compose.hiltNavGraphViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hongwei.jetpack_compose_demo.view.navigation.BottomNavBar
import com.hongwei.jetpack_compose_demo.view.theme.DemoTheme
import com.hongwei.jetpack_compose_demo.viewmodel.ThemingViewModel


@Composable
fun MainScreen(
    navController: NavHostController,
) {
    val viewModel = hiltNavGraphViewModel<ThemingViewModel>()
    DemoTheme(viewModel.theme.observeAsState().value) {
        Scaffold(
            bottomBar = { BottomNavBar(navController) }
        ) {
            MainNavCompose(navController)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MainNavCompose(
    navController: NavHostController
) {
    NavHost(navController, startDestination = "theming") {
        composable("theming") {
            ThemingScreen()
        }
        composable("style") {
            StyleScreen()
        }
        composable("component") {
            ComponentScreen()
        }
        composable("about") {
            AboutScreen()
        }
    }
}