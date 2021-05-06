package com.hongwei.jetpack_compose_demo.view.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.google.accompanist.coil.rememberCoilPainter
import com.google.accompanist.imageloading.ImageLoadState
import com.hongwei.jetpack_compose_demo.view.share.LoadingDots

@Composable
fun Banner(url: String?) {
    val painter = rememberCoilPainter(
        request = url,
        fadeIn = true
    )

    when (painter.loadState) {
        is ImageLoadState.Success -> Image(
            painter = painter,
            contentScale = ContentScale.Crop,
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomStart = 6.dp, bottomEnd = 6.dp))
                .shadow(10.dp)
        )
        ImageLoadState.Loading -> LoadingDots()
        else -> LoadingDots()
    }
}