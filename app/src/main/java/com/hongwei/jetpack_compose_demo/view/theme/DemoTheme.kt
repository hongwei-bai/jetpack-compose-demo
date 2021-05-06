package com.hongwei.jetpack_compose_demo.view.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.hongwei.jetpack_compose_demo.datasource.room.ThemeEntity

@Composable
fun DemoTheme(
    theme: ThemeEntity?,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    theme?.let {
        if (theme.themeId > 0) {
            val typography = if (theme.themeId == 1) {
                DemoTypographyCraftyGirls
            } else {
                DemoTypographyPlay
            }
            MaterialTheme(
                typography = typography,
                colors = lightColors(
                    primary = Color(theme.colorPrimary),
                    primaryVariant = Color(theme.colorPrimary),
                    onPrimary = Color(theme.colorOnPrimary),
                    secondary = Color(theme.colorSecondary),
                    secondaryVariant = Color(theme.colorSecondary),
                    onSecondary = Color(theme.colorOnSecondary),
                    background = Color(theme.colorBackground),
                    onBackground = Color(theme.colorOnBackground)
                ),
                content = content
            )
        } else {
            MaterialTheme(content = content)
        }
    } ?: MaterialTheme(content = content)
}