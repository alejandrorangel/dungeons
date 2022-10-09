package com.rangelalejandro.playerdnd.ui.home

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.rangelalejandro.playerdnd.data.repository.DiceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val diceRepository: DiceRepository): ViewModel() {
    private var _uiState = MutableStateFlow(HomeUIState())
    val uiState: StateFlow<HomeUIState> = _uiState
    fun roll(){
        val num = diceRepository.roll(6)
        _uiState.update { it.copy(
            value =num
        ) }
        Log.d("dice-roll", num.toString())
    }
}