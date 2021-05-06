package com.hongwei.jetpack_compose_demo.view.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(val route: String, val label: String, val icon: ImageVector) {
    object ThemingScreens : Screens("theming", "Theming", Icons.Outlined.Palette)
    object StyleScreens : Screens("style", "Style", Icons.Outlined.FontDownload)
    object ComponentScreens : Screens("component", "Component", Icons.Outlined.BubbleChart)
    object AboutScreens : Screens("about", "About", Icons.Outlined.Help)
}