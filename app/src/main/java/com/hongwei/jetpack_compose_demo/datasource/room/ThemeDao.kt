package com.hongwei.jetpack_compose_demo.datasource.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hongwei.jetpack_compose_demo.constant.Constants.THEMING_API_VERSION
import kotlinx.coroutines.flow.Flow

@Dao
interface ThemeDao {
    @Query("SELECT * FROM theme WHERE apiVersion=$THEMING_API_VERSION")
    fun getTheme(): Flow<ThemeEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun save(teamThemeEntity: ThemeEntity)

    @Query("DELETE FROM theme")
    suspend fun clear()
}