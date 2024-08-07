package com.shanks.chatwiseassignment.di

import com.shanks.chatwiseassignment.domain.repository.ProductsRepository
import com.shanks.chatwiseassignment.common.Constant
import com.shanks.chatwiseassignment.data.remote.ProductsApi
import com.shanks.chatwiseassignment.data.repository.ProductsRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideProductsApi(): ProductsApi {
        return Retrofit.Builder()
            .baseUrl(Constant.baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ProductsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideProductsRepository(api: ProductsApi): ProductsRepository {
        return ProductsRepositoryImpl(api)
    }

}