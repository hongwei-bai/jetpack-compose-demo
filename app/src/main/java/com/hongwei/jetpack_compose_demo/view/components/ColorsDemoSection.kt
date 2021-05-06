package com.hongwei.jetpack_compose_demo.view.share

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ColorsDemoSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "primary",
            color = MaterialTheme.colors.onPrimary,
            modifier = Modifier.background(MaterialTheme.colors.primary)
        )
        Text(
            text = "secondary",
            color = MaterialTheme.colors.onSecondary,
            modifier = Modifier.background(MaterialTheme.colors.secondary)
        )
        Text(
            text = "background",
            color = MaterialTheme.colors.onBackground,
            modifier = Modifier.background(MaterialTheme.colors.background)
        )
        Text(
            text = "surface",
            color = MaterialTheme.colors.onSurface,
            modifier = Modifier.background(MaterialTheme.colors.surface)
        )
        Text(
            text = "error",
            color = MaterialTheme.colors.onError,
            modifier = Modifier.background(MaterialTheme.colors.error)
        )
    }
}