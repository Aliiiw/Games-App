package com.example.mygameapp.data.network

import com.example.mygameapp.utils.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object GameApiClient {

    @Singleton
    @Provides
    fun ProvideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun ProvideGameApi(retrofit: Retrofit): GameApiInterface {
        return retrofit.create(GameApiInterface::class.java)
    }

}