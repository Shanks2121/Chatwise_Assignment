package com.shanks.chatwiseassignment.data.remote

import com.shanks.chatwiseassignment.data.remote.dto.ProductsDto
import retrofit2.http.GET

interface ProductsApi {
    @GET("products")
    suspend fun getProducts():ProductsDto
}