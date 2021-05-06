package com.hongwei.jetpack_compose_demo.view.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun TextAndButtons() {
    Text(text = "Text")
    Spacer(modifier = Modifier.size(5.dp))
    Row(verticalAlignment = Alignment.CenterVertically) {
        val textState = remember { mutableStateOf(TextFieldValue()) }
        Text(text = "TextField")
        Spacer(modifier = Modifier.size(5.dp))
        TextField(value = textState.value, onValueChange = { textState.value = it })
    }
    Spacer(modifier = Modifier.size(5.dp))
    Row {
        Button({ mockClick() }) {
            Text(text = "Button")
        }
        Spacer(modifier = Modifier.size(5.dp))
        Button(
            onClick = { mockClick() },
            enabled = false
        ) {
            Text(text = "Button disabled")
        }
    }
    Spacer(modifier = Modifier.size(5.dp))
    Card(modifier = Modifier.size(200.dp, 40.dp)) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = "Card")
        }
    }
    Spacer(modifier = Modifier.size(5.dp))
    FloatingActionButton(onClick = { mockClick() }) {
        Text(text = "Fab")
    }
}

private fun mockClick() {
    // No-Op
}