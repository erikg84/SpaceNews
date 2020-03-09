package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class SecondStage(

	@field:SerializedName("payloads")
	val payloads: List<PayloadsItem?>? = null,

	@field:SerializedName("block")
	val block: Int? = null
)