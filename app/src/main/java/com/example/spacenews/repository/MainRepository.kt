package com.example.spacenews.repository

import com.example.spacenews.network.SpacexService

class MainRepository {

    private object RepositoryInstanceHolder{internal val INSTANCE = MainRepository()}

    suspend fun getHistoricLaunches() = SpacexService.getSpacexService.getHistoricLaunches()

    suspend fun getLaunches(flightNumber:String) = SpacexService.getSpacexService.getLaunches(flightNumber)

    companion object{val INSTANCE = RepositoryInstanceHolder.INSTANCE}
}