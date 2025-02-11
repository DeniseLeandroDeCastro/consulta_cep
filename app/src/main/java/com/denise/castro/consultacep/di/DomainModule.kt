package com.denise.castro.consultacep.di

import com.denise.castro.consultacep.data.repository.AddressRepositoryImpl
import com.denise.castro.consultacep.domain.repository.AddressRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindsAddressRepositoryImpl(
        addressRepositoryImpl: AddressRepositoryImpl
    ): AddressRepository
}