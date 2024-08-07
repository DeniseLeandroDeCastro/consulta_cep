package com.denise.castro.consultacep.di

import com.denise.castro.consultacep.network.ServiceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun providesServiceProvider() = ServiceProvider
}