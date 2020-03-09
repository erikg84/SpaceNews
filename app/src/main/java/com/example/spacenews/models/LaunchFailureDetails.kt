package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class LaunchFailureDetails(

	@field:SerializedName("altitude")
	val altitude: Any? = null,

	@field:SerializedName("reason")
	val reason: String? = null,

	@field:SerializedName("time")
	val time: Int? = null
)