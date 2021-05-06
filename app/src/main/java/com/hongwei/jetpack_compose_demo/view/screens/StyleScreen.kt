package com.hongwei.jetpack_compose_demo.view.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.hongwei.jetpack_compose_demo.view.share.ColorsDemoSection

@Composable
fun StyleScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(ScrollState(0))
    ) {
        SectionHeader("Typography")
        Text(
            text = "h1",
            style = MaterialTheme.typography.h1
        )
        Text(
            text = "h2",
            style = MaterialTheme.typography.h2
        )
        Text(
            text = "h3",
            style = MaterialTheme.typography.h3
        )
        Text(
            text = "h4",
            style = MaterialTheme.typography.h4
        )
        Text(
            text = "h5",
            style = MaterialTheme.typography.h5
        )
        Text(
            text = "h6",
            style = MaterialTheme.typography.h6
        )
        Text(
            text = "subtitle1",
            style = MaterialTheme.typography.subtitle1
        )
        Text(
            text = "subtitle2",
            style = MaterialTheme.typography.subtitle2
        )
        Text(
            text = "body1",
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "body2",
            style = MaterialTheme.typography.body2
        )
        Text(
            text = "caption",
            style = MaterialTheme.typography.caption
        )
        Text(
            text = "button",
            style = MaterialTheme.typography.button
        )
        Text(
            text = "overline",
            style = MaterialTheme.typography.overline
        )
        Spacer(modifier = Modifier.size(5.dp))
        SectionHeader("Colors")
        ColorsDemoSection()
    }
}