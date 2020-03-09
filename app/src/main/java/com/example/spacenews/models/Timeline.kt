package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class Timeline(

	@field:SerializedName("webcast_liftoff")
	val webcastLiftoff: Int? = null
)