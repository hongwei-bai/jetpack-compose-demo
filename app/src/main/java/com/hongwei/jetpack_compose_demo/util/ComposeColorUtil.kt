package com.hongwei.jetpack_compose_demo.util

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb


internal fun Color.toLong(): Long = Integer.toHexString(toArgb()).toLongOrNull(16) ?: 0xFFFFFFFF