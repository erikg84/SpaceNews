package com.example.spacenews.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.spacenews.models.LaunchesResponse
import com.example.spacenews.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val launches = MutableLiveData<List<LaunchesResponse>>()
    private val repo= MainRepository.INSTANCE
    private val historicLaunches = mutableListOf<String>()
    private val launchesFiltered= mutableListOf<LaunchesResponse>()

    fun getLaunches(): LiveData<List<LaunchesResponse>> = launches
    fun getLaunchesObservable(){
        viewModelScope.launch{
            val historicDeferred = withContext(Dispatchers.IO) {repo.getHistoricLaunches()}
            if(historicDeferred.isSuccessful){
                historicDeferred.body()?.forEach {flight -> if(flight.flightNumber != null){historicLaunches.add(flight.flightNumber)}}
                historicLaunches.forEach{flightNumber ->
                    val launchesDeferred = withContext(Dispatchers.IO) {repo.getLaunches(flightNumber)}
                    if(launchesDeferred.isSuccessful){launchesFiltered.add(launchesDeferred.body()!![0])}}
                launches.value = launchesFiltered
            }
        }
    }
}