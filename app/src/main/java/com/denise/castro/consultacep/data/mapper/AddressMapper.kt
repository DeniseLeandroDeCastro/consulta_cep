package com.denise.castro.consultacep.data.mapper

import com.denise.castro.consultacep.data.model.AddressResponse
import com.denise.castro.consultacep.domain.model.Address

fun AddressResponse.toDomain(): Address {
    return Address(
        cep = cep,
        logradouro = logradouro,
        complemento = complemento,
        bairro = bairro,
        localidade = localidade,
        uf = uf
    )
}