package com.example.spacenews.network

import com.example.spacenews.models.HistoricLaunchesResponse
import com.example.spacenews.models.LaunchesResponse
import retrofit2.http.GET
import retrofit2.Response
import retrofit2.http.Query

interface SpacexApi {
    @GET("v3/history?filter=flight_number&sort=flight_number&order=desc")
    suspend fun getHistoricLaunches(): Response<List<HistoricLaunchesResponse>>

    @GET("v3/launches")
    suspend fun getLaunches(@Query("flight_number") flightNumber:String): Response<List<LaunchesResponse>>
}