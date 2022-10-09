package com.rangelalejandro.playerdnd.ui.home

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf

data class HomeUIState(
    val value: Int = 0
)


class test {
    val value by mutableStateOf("0")
}


