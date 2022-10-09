package com.rangelalejandro.playerdnd.di

import com.rangelalejandro.playerdnd.data.repository.DiceRepository
import com.rangelalejandro.playerdnd.data.repository.impl.DefaultDiceRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class, ActivityComponent::class)
abstract class DiceModule {

    @Binds
    abstract fun bindAnalyticsService(
        diceRepository: DefaultDiceRepository
    ): DiceRepository
}