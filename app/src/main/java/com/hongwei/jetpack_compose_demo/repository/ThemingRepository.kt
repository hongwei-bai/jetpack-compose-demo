package com.hongwei.jetpack_compose_demo.repository

import androidx.compose.ui.graphics.Color
import com.hongwei.jetpack_compose_demo.datasource.room.ThemeDao
import com.hongwei.jetpack_compose_demo.datasource.room.ThemeEntity
import com.hongwei.jetpack_compose_demo.util.toLong
import com.hongwei.jetpack_compose_demo.view.theme.Red700
import com.hongwei.jetpack_compose_demo.view.theme.Red800
import com.hongwei.jetpack_compose_demo.view.theme.Red900
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ThemingRepository @Inject constructor(
    private val themeDao: ThemeDao
) {
    fun getTheme(): Flow<ThemeEntity> = themeDao.getTheme()

    suspend fun switchTheme(id: Int) {
        val theme = when (id) {
            1 -> ThemeEntity(
                themeId = id,
                bannerUrl = "https://2.bp.blogspot.com/-LlXQ-eIAWy8/Uzc8ovA5DuI/AAAAAAAAAIs/u9-LIlhd-q4/s1600/IMG_0022.jpg",
                colorPrimary = Red700.toLong(),
                colorOnPrimary = Color.White.toLong(),
                colorSecondary = Red800.toLong(),
                colorOnSecondary = Color.White.toLong(),
                colorBackground = Color.White.toLong(),
                colorOnBackground = Red900.toLong(),
            )
            2 -> ThemeEntity(
                themeId = id,
                bannerUrl = "https://miro.medium.com/max/4800/1*doXBtK__GhkOuJxFIdNecQ.png",
                colorPrimary = 0xff04539c,
                colorOnPrimary = 0xffffffff,
                colorSecondary = 0xfffcb826,
                colorOnSecondary = 0xffffffff,
                colorBackground = 0xffffffff,
                colorOnBackground = 0xff04539c,
            )
            3 -> ThemeEntity(
                themeId = id,
                bannerUrl = "https://miro.medium.com/max/1200/1*0JT73QTXPrn98-mJwsUg5A.jpeg",
                colorPrimary = 0xff542583,
                colorOnPrimary = 0xffffffff,
                colorSecondary = 0xff542583,
                colorOnSecondary = 0xffffffff,
                colorBackground = 0xffffffff,
                colorOnBackground = 0xff542583,
            )
            else -> ThemeEntity(
                themeId = id,
                bannerUrl = "https://miro.medium.com/max/2625/1*bch1DkKC01nHA7IPOqamYg.png",
                colorPrimary = 0xffffffff,
                colorOnPrimary = 0xffffffff,
                colorSecondary = 0xffffffff,
                colorOnSecondary = 0xffffffff,
                colorBackground = 0xffffffff,
                colorOnBackground = 0xffffffff,
            )
        }
        themeDao.save(theme)
    }
}