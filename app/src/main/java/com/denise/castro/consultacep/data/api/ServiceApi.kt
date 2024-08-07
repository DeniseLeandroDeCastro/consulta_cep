package com.denise.castro.consultacep.data.api

import com.denise.castro.consultacep.data.model.AddressResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ServiceApi {

    @GET("{cep}/json/")
    suspend fun getAddress(
        @Path("cep") cep: String
    ): AddressResponse
}