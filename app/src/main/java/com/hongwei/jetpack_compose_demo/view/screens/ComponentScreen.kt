package com.hongwei.jetpack_compose_demo.view.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Snackbar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hongwei.jetpack_compose_demo.view.components.MultipleChoiceComponents
import com.hongwei.jetpack_compose_demo.view.components.ProgressiveComponents
import com.hongwei.jetpack_compose_demo.view.components.TextAndButtons
import com.hongwei.jetpack_compose_demo.view.share.ColorsDemoSection

@Composable
fun ComponentScreen() {
    Column(
        Modifier
            .fillMaxWidth()
            .verticalScroll(ScrollState(0))
    ) {
        SectionHeader("Components")
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(10.dp, 0.dp)
        ) {
            TextAndButtons()
            Spacer(modifier = Modifier.size(5.dp))
            MultipleChoiceComponents()
            Spacer(modifier = Modifier.size(5.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "Divider")
                Spacer(modifier = Modifier.size(5.dp))
                Divider()
            }
            Spacer(modifier = Modifier.size(5.dp))
            ProgressiveComponents()
            Spacer(modifier = Modifier.size(5.dp))
            val snackbarVisibleState = remember { mutableStateOf(true) }
            if (snackbarVisibleState.value) {
                Snackbar(
                    action = {
                        Button(onClick = { snackbarVisibleState.value = false }) {
                            Text("Dismiss")
                        }
                    }
                ) {
                    Text(text = "SnackBar")
                }
            }
        }
        Spacer(modifier = Modifier.size(5.dp))
        SectionHeader("Colors")
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(10.dp, 0.dp)
        ) { ColorsDemoSection() }
    }
}