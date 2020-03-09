package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class PayloadsItem(

	@field:SerializedName("payload_type")
	val payloadType: String? = null,

	@field:SerializedName("payload_mass_kg")
	val payloadMassKg: Double? = null,

	@field:SerializedName("payload_id")
	val payloadId: String? = null,

	@field:SerializedName("nationality")
	val nationality: String? = null,

	@field:SerializedName("norad_id")
	val noradId: List<Any?>? = null,

	@field:SerializedName("customers")
	val customers: List<String?>? = null,

	@field:SerializedName("orbit")
	val orbit: String? = null,

	@field:SerializedName("orbit_params")
	val orbitParams: OrbitParams? = null,

	@field:SerializedName("payload_mass_lbs")
	val payloadMassLbs: Double? = null,

	@field:SerializedName("reused")
	val reused: Boolean? = null,

	@field:SerializedName("manufacturer")
	val manufacturer: String? = null
)