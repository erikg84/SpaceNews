package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class FirstStage(

	@field:SerializedName("cores")
	val cores: List<CoresItem?>? = null
)