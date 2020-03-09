package com.example.spacenews.models


import com.google.gson.annotations.SerializedName

data class HistoricLaunchesResponse(@SerializedName("flight_number") val flightNumber: String? = null)