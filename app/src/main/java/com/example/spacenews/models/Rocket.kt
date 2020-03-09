package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class Rocket(

	@field:SerializedName("second_stage")
	val secondStage: SecondStage? = null,

	@field:SerializedName("rocket_id")
	val rocketId: String? = null,

	@field:SerializedName("first_stage")
	val firstStage: FirstStage? = null,

	@field:SerializedName("rocket_type")
	val rocketType: String? = null,

	@field:SerializedName("rocket_name")
	val rocketName: String? = null,

	@field:SerializedName("fairings")
	val fairings: Fairings? = null
)