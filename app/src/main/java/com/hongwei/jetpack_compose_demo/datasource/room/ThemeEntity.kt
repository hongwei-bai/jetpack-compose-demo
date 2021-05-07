package com.hongwei.jetpack_compose_demo.datasource.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.hongwei.jetpack_compose_demo.constant.Constants.THEMING_API_VERSION

@Entity(tableName = "theme")
data class ThemeEntity(
    @PrimaryKey
    @SerializedName("api_version")
    val apiVersion: Int = THEMING_API_VERSION,

    @SerializedName("theme_id")
    val themeId: Int = 0,
    @SerializedName("banner_url")
    val bannerUrl: String = "",

    @SerializedName("color_primary")
    val colorPrimary: Long = 0xFFFFFFFF,
    @SerializedName("color_on_primary")
    val colorOnPrimary: Long = 0xFFFFFFFF,

    @SerializedName("color_secondary")
    val colorSecondary: Long = 0xFFFFFFFF,
    @SerializedName("color_on_secondary")
    val colorOnSecondary: Long = 0xFFFFFFFF,

    @SerializedName("color_background")
    val colorBackground: Long = 0xFFFFFFFF,
    @SerializedName("color_on_background")
    val colorOnBackground: Long = 0xFFFFFFFF,

    @SerializedName("color_background_dark")
    val colorBackgroundDark: Long = 0xFFFFFFFF,
    @SerializedName("color_on_background_dark")
    val colorOnBackgroundDark: Long = 0xFFFFFFFF,
)

