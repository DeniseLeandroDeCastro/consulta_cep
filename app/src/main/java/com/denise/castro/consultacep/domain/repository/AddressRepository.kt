package com.denise.castro.consultacep.domain.repository

import com.denise.castro.consultacep.data.model.AddressResponse

interface AddressRepository {

    suspend fun getAddress(cep: String): AddressResponse
}