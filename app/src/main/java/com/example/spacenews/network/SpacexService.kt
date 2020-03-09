package com.example.spacenews.network


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SpacexService {

    private val BASE_URL = "https://api.spacexdata.com"

    val getSpacexService = RetrofitInstanceHolder.INSTANCE.create(SpacexApi::class.java)
    
    private object RetrofitInstanceHolder{
        val INSTANCE = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}