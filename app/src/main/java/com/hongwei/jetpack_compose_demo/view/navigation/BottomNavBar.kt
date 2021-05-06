package com.hongwei.jetpack_compose_demo.view.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.*

@Composable
fun BottomNavBar(navController: NavController) {
    BottomNavigation {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.arguments?.getString(KEY_ROUTE)
        val items = listOf(
            Screens.ThemingScreens,
            Screens.StyleScreens,
            Screens.ComponentScreens,
            Screens.AboutScreens
        )
        items.forEach {
            BottomNavigationItem(
                icon = { Icon(it.icon, "") },
                selected = currentRoute == it.route,
                label = { Text(text = it.label) },
                onClick = {
                    navController.popBackStack(
                        navController.graph.startDestination, false
                    )
                    if (currentRoute != it.route) {
                        navController.navigate(it.route)
                    }
                }
            )
        }
    }
}