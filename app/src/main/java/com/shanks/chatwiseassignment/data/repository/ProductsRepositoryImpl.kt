package com.shanks.chatwiseassignment.data.repository

import com.shanks.chatwiseassignment.data.remote.ProductsApi
import com.shanks.chatwiseassignment.domain.repository.ProductsRepository
import com.shanks.chatwiseassignment.data.remote.dto.ProductsDto
import javax.inject.Inject


class ProductsRepositoryImpl @Inject constructor(
    val productsApi: ProductsApi
): ProductsRepository {
    override suspend fun getProductsDto(): ProductsDto {
        return productsApi.getProducts()
    }
}