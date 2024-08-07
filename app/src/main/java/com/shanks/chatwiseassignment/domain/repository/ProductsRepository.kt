package com.shanks.chatwiseassignment.domain.repository

import com.shanks.chatwiseassignment.data.remote.dto.ProductsDto


interface ProductsRepository {
    suspend fun getProductsDto(): ProductsDto
}