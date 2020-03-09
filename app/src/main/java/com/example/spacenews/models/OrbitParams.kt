package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class OrbitParams(

	@field:SerializedName("periapsis_km")
	val periapsisKm: Double? = null,

	@field:SerializedName("mean_anomaly")
	val meanAnomaly: Any? = null,

	@field:SerializedName("inclination_deg")
	val inclinationDeg: Double? = null,

	@field:SerializedName("regime")
	val regime: String? = null,

	@field:SerializedName("arg_of_pericenter")
	val argOfPericenter: Any? = null,

	@field:SerializedName("eccentricity")
	val eccentricity: Any? = null,

	@field:SerializedName("apoapsis_km")
	val apoapsisKm: Double? = null,

	@field:SerializedName("semi_major_axis_km")
	val semiMajorAxisKm: Any? = null,

	@field:SerializedName("raan")
	val raan: Any? = null,

	@field:SerializedName("epoch")
	val epoch: Any? = null,

	@field:SerializedName("lifespan_years")
	val lifespanYears: Any? = null,

	@field:SerializedName("reference_system")
	val referenceSystem: String? = null,

	@field:SerializedName("period_min")
	val periodMin: Any? = null,

	@field:SerializedName("mean_motion")
	val meanMotion: Any? = null,

	@field:SerializedName("longitude")
	val longitude: Any? = null
)