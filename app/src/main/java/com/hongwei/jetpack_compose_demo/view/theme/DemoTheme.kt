package com.hongwei.jetpack_compose_demo.view.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
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
                colors = if (darkTheme) {
                    darkColors(
                        primary = Color(theme.colorPrimary),
                        primaryVariant = Color(theme.colorPrimary),
                        onPrimary = Color(theme.colorOnPrimary),
                        secondary = Color(theme.colorSecondary),
                        secondaryVariant = Color(theme.colorSecondary),
                        onSecondary = Color(theme.colorOnSecondary),
                        background = Color(theme.colorBackgroundDark),
                        onBackground = Color(theme.colorOnBackgroundDark),
                        surface = Color(theme.colorBackgroundDark),
                        onSurface = Color(theme.colorOnBackgroundDark)
                    )
                } else {
                    lightColors(
                        primary = Color(theme.colorPrimary),
                        primaryVariant = Color(theme.colorPrimary),
                        onPrimary = Color(theme.colorOnPrimary),
                        secondary = Color(theme.colorSecondary),
                        secondaryVariant = Color(theme.colorSecondary),
                        onSecondary = Color(theme.colorOnSecondary),
                        background = Color(theme.colorBackground),
                        onBackground = Color(theme.colorOnBackground),
                        surface = Color(theme.colorBackground),
                        onSurface = Color(theme.colorOnBackground)
                    )
                },
                content = content
            )
        } else {
            MaterialThemeByDarkMode(darkTheme, content)
        }
    } ?: MaterialThemeByDarkMode(darkTheme, content)
}

@Composable
private fun MaterialThemeByDarkMode(darkTheme: Boolean, content: @Composable () -> Unit): Unit =
    if (darkTheme) {
        MaterialTheme(colors = darkColors(), content = content)
    } else {
        MaterialTheme(colors = lightColors(), content = content)
    }