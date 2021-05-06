package com.hongwei.jetpack_compose_demo.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltNavGraphViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.popUpTo
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieAnimationSpec
import com.airbnb.lottie.compose.LottieAnimationState
import com.hongwei.jetpack_compose_demo.R
import com.hongwei.jetpack_compose_demo.view.theme.SplashTheme
import com.hongwei.jetpack_compose_demo.viewmodel.SplashViewModel


@Composable
fun SplashScreen(
    navController: NavController
) {
    val viewModel = hiltNavGraphViewModel<SplashViewModel>()
    viewModel.countDown {
        navController.navigate("main") {
            popUpTo("splash") { inclusive = true }
            launchSingleTop = true
        }
    }
    val animationSpec = remember { LottieAnimationSpec.RawRes(R.raw.anim_splash) }
    val state = LottieAnimationState(
        isPlaying = true,
        repeatCount = Integer.MAX_VALUE,
        enableMergePaths = false
    )
    state.speed = 1.2f
    SplashTheme {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                LottieAnimation(
                    spec = animationSpec,
                    animationState = state
                )
                Spacer(modifier = Modifier.size(2.dp))
                Text(
                    text = "Splash~ ${viewModel.counter.observeAsState().value}",
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.primary
                )
            }
        }
    }
}