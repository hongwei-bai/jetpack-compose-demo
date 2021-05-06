package com.hongwei.jetpack_compose_demo.di.module

import android.content.Context
import androidx.room.Room
import com.hongwei.jetpack_compose_demo.datasource.room.ThemeDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    @Provides
    fun provideThemeDao(database: DemoDatabase): ThemeDao {
        return database.themeDao()
    }

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): DemoDatabase {
        return Room.databaseBuilder(
            appContext,
            DemoDatabase::class.java,
            "demo_database"
        ).build()
    }
}


