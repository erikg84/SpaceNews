package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class CoresItem(

	@field:SerializedName("flight")
	val flight: Int? = null,

	@field:SerializedName("landing_type")
	val landingType: Any? = null,

	@field:SerializedName("gridfins")
	val gridfins: Boolean? = null,

	@field:SerializedName("landing_intent")
	val landingIntent: Boolean? = null,

	@field:SerializedName("legs")
	val legs: Boolean? = null,

	@field:SerializedName("land_success")
	val landSuccess: Any? = null,

	@field:SerializedName("landing_vehicle")
	val landingVehicle: Any? = null,

	@field:SerializedName("block")
	val block: Any? = null,

	@field:SerializedName("reused")
	val reused: Boolean? = null,

	@field:SerializedName("core_serial")
	val coreSerial: String? = null
)