package com.rangelalejandro.playerdnd.data.repository

interface DiceRepository {
   fun roll(numSides:Int): Int
}