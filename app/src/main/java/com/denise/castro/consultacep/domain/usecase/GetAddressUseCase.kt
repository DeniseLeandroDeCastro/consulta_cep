package com.denise.castro.consultacep.domain.usecase

import com.denise.castro.consultacep.data.mapper.toDomain
import com.denise.castro.consultacep.domain.model.Address
import com.denise.castro.consultacep.domain.repository.AddressRepository
import javax.inject.Inject

class GetAddressUseCase @Inject constructor(
    private val repository: AddressRepository
){

    suspend operator fun invoke(cep: String): Address {
        return repository.getAddress(cep).toDomain()
    }
}