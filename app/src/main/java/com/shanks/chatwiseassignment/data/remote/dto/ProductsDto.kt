package com.shanks.chatwiseassignment.data.remote.dto

import com.shanks.chatwiseassignment.data.remote.dto.Product

data class ProductsDto(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)