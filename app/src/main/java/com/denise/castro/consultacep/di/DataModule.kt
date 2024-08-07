package com.denise.castro.consultacep.di

import com.denise.castro.consultacep.data.api.ServiceApi
import com.denise.castro.consultacep.network.ServiceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun providesServiceApi(
        serviceProvides: ServiceProvider
    ): ServiceApi {
        return serviceProvides.createService(ServiceApi::class.java)
    }
}