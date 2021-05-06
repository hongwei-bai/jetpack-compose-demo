package com.hongwei.jetpack_compose_demo.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SectionHeader(title: String) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(MaterialTheme.colors.primary)
            .fillMaxWidth()
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.h6,
            color = MaterialTheme.colors.onPrimary,
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 4.dp)
        )
    }
}