package com.hongwei.jetpack_compose_demo.view.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Checkbox
import androidx.compose.material.RadioButton
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MultipleChoiceComponents() {
    Row {
        val checkedState = remember { mutableStateOf(true) }
        Text(text = "Checkbox")
        Checkbox(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it })
        Spacer(modifier = Modifier.size(5.dp))
        Text(text = "Disabled")
        Checkbox(checked = true, onCheckedChange = null, enabled = false)
        Spacer(modifier = Modifier.size(5.dp))
        Text(text = "Disabled")
        Checkbox(checked = false, onCheckedChange = null, enabled = false)
    }
    Spacer(modifier = Modifier.size(5.dp))
    Row {
        val checkedState = remember { mutableStateOf(true) }
        Text(text = "Switch")
        Switch(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it })
        Spacer(modifier = Modifier.size(5.dp))
        Text(text = "Disabled")
        Switch(checked = true, onCheckedChange = null, enabled = false)
        Spacer(modifier = Modifier.size(5.dp))
        Text(text = "Disabled")
        Switch(checked = false, onCheckedChange = null, enabled = false)
    }
    Spacer(modifier = Modifier.size(5.dp))
    Row {
        val selected = remember { mutableStateOf(1) }
        Text(text = "RadioButton")
        Spacer(modifier = Modifier.size(5.dp))
        RadioButton(selected = selected.value == 1, onClick = { selected.value = 1 })
        Text(text = "Option 1")
        Spacer(modifier = Modifier.size(5.dp))
        RadioButton(selected = selected.value == 2, onClick = { selected.value = 2 })
        Text(text = "Option 2")
    }
    Row {
        Text(text = "Disabled RadioButton")
        RadioButton(selected = true, onClick = null, enabled = false)
        Spacer(modifier = Modifier.size(5.dp))
        RadioButton(selected = false, onClick = null, enabled = false)
    }
}