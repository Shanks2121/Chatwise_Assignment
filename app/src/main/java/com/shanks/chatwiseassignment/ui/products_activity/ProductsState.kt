package com.shanks.chatwiseassignment.ui.products_activity

import com.shanks.chatwiseassignment.domain.model.Product

data class ProductsState(
    val isLoading: Boolean = false,
    val data: List<Product> = emptyList(),
    val error: String = ""
)
