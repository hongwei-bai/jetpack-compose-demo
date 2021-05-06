package com.hongwei.jetpack_compose_demo.view.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AboutScreen() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .padding(40.dp, 25.dp)
            .verticalScroll(ScrollState(0))
    ) {
        Text(
            text = "About this demo",
            style = MaterialTheme.typography.h4
        )
        Spacer(modifier = Modifier.size(25.dp))
        Text(
            text = "Author: Hongwei Bai",
            style = MaterialTheme.typography.body2
        )
        Text(
            text = "Email: hongwei-bai84@gmail.com",
            style = MaterialTheme.typography.body2
        )
        Text(
            text = "Github: https://github.com/hongwei-bai",
            style = MaterialTheme.typography.body2
        )
    }
}