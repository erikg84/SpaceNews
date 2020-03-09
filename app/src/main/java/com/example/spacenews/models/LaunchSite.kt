package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class LaunchSite(

	@field:SerializedName("site_name")
	val siteName: String? = null,

	@field:SerializedName("site_id")
	val siteId: String? = null,

	@field:SerializedName("site_name_long")
	val siteNameLong: String? = null
)