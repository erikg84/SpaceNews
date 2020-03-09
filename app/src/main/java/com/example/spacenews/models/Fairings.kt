package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class Fairings(

	@field:SerializedName("recovered")
	val recovered: Boolean? = null,

	@field:SerializedName("recovery_attempt")
	val recoveryAttempt: Boolean? = null,

	@field:SerializedName("ship")
	val ship: Any? = null,

	@field:SerializedName("reused")
	val reused: Boolean? = null
)