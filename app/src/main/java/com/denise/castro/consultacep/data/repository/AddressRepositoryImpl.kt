package com.denise.castro.consultacep.data.repository

import com.denise.castro.consultacep.data.api.ServiceApi
import com.denise.castro.consultacep.data.model.AddressResponse
import com.denise.castro.consultacep.domain.repository.AddressRepository
import javax.inject.Inject

class AddressRepositoryImpl @Inject constructor(
    private val serviceApi: ServiceApi
): AddressRepository {

    override suspend fun getAddress(cep: String): AddressResponse {
        return serviceApi.getAddress(cep)
    }
}