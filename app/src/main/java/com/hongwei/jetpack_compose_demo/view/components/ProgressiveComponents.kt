package com.hongwei.jetpack_compose_demo.view.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProgressiveComponents() {
    val state = remember { mutableStateOf(0.8f) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = "LinearProgressIndicator")
        Spacer(modifier = Modifier.size(5.dp))
        LinearProgressIndicator(progress = state.value)
    }
    Spacer(modifier = Modifier.size(5.dp))
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = "CircularProgressIndicator")
        Spacer(modifier = Modifier.size(5.dp))
        CircularProgressIndicator(progress = state.value)
    }
    Spacer(modifier = Modifier.size(5.dp))
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Slider")
        Spacer(modifier = Modifier.size(5.dp))
        Slider(value = state.value, onValueChange = { state.value = it })
    }
}