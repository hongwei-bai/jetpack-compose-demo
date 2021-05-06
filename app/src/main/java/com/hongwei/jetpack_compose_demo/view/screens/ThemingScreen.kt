package com.hongwei.jetpack_compose_demo.view.screens

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltNavGraphViewModel
import com.hongwei.jetpack_compose_demo.view.components.Banner
import com.hongwei.jetpack_compose_demo.viewmodel.ThemingViewModel

@Composable
fun ThemingScreen() {
    val viewModel = hiltNavGraphViewModel<ThemingViewModel>()
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .verticalScroll(ScrollState(0))
    ) {
        Banner(url = viewModel.teamTheme.observeAsState().value?.bannerUrl)
        Spacer(modifier = Modifier.size(15.dp))
        ThemeOption(0, "Default MaterialTheme", viewModel)
        ThemeOption(1, "Customised Theme 1", viewModel)
        ThemeOption(2, "Customised Theme 2", viewModel)
        ThemeOption(3, "Customised Theme 3", viewModel)
    }
}

@Composable
fun ThemeOption(id: Int, name: String, viewModel: ThemingViewModel) {
    Spacer(modifier = Modifier.size(15.dp))
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                viewModel.switchTheme(id)
            }
            .padding(20.dp)
            .border(20.dp, Color.Transparent)
    ) {
        RadioButton(
            selected = viewModel.teamTheme.observeAsState().value?.themeId ?: -1 == id,
            onClick = {
                viewModel.switchTheme(id)
            })
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = name)
    }
}