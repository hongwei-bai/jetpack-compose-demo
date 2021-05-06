package com.hongwei.jetpack_compose_demo.di.module

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hongwei.jetpack_compose_demo.datasource.room.ThemeDao
import com.hongwei.jetpack_compose_demo.datasource.room.ThemeEntity

@Database(entities = [ThemeEntity::class], version = 1)
abstract class DemoDatabase : RoomDatabase() {

    abstract fun themeDao(): ThemeDao
}