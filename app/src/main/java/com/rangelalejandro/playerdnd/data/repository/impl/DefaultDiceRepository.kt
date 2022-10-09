package com.rangelalejandro.playerdnd.data.repository.impl

import com.rangelalejandro.playerdnd.data.repository.DiceRepository
import javax.inject.Inject

class DefaultDiceRepository @Inject constructor(): DiceRepository {
    override fun roll(numSides: Int): Int {
        return (1..numSides).random()
    }
}