package com.hongwei.jetpack_compose_demo.view

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.compose.rememberNavController
import com.hongwei.jetpack_compose_demo.view.navigation.NavComposeApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val rootNavController = rememberNavController()
            val mainNavController = rememberNavController()
            NavComposeApp(
                rootNavController,
                mainNavController
            )
        }
    }
}