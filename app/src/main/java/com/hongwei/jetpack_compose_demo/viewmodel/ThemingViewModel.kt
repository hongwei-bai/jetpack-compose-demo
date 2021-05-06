package com.hongwei.jetpack_compose_demo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.hongwei.jetpack_compose_demo.datasource.room.ThemeEntity
import com.hongwei.jetpack_compose_demo.repository.ThemingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ThemingViewModel @Inject constructor(
    private val themingRepository: ThemingRepository
) : ViewModel() {
    val teamTheme: LiveData<ThemeEntity> =
        themingRepository.getTheme().asLiveData(viewModelScope.coroutineContext)

    fun switchTheme(id: Int) = viewModelScope.launch {
        themingRepository.switchTheme(id)
    }
}