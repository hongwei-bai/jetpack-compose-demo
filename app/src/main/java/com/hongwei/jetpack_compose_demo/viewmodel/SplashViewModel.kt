package com.hongwei.jetpack_compose_demo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {
    val counter: MutableLiveData<Int> = MutableLiveData(3)

    fun countDown(onComplete: () -> Unit) {
        viewModelScope.launch {
            (3 downTo 0).forEach { i ->
                delay(300)
                viewModelScope.launch(Dispatchers.Main) {
                    counter.value = i
                }
            }
            viewModelScope.launch(Dispatchers.Main) {
                onComplete.invoke()
            }
        }
    }
}