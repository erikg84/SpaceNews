package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class LaunchesResponse(

	@field:SerializedName("mission_name")
	val missionName: String? = null,

	@field:SerializedName("static_fire_date_utc")
	val staticFireDateUtc: String? = null,

	@field:SerializedName("launch_year")
	val launchYear: String? = null,

	@field:SerializedName("launch_date_utc")
	val launchDateUtc: String? = null,

	@field:SerializedName("launch_failure_details")
	val launchFailureDetails: LaunchFailureDetails? = null,

	@field:SerializedName("flight_number")
	val flightNumber: Int? = null,

	@field:SerializedName("is_tentative")
	val isTentative: Boolean? = null,

	@field:SerializedName("rocket")
	val rocket: Rocket? = null,

	@field:SerializedName("mission_id")
	val missionId: List<Any?>? = null,

	@field:SerializedName("launch_window")
	val launchWindow: Int? = null,

	@field:SerializedName("crew")
	val crew: Any? = null,

	@field:SerializedName("launch_date_local")
	val launchDateLocal: String? = null,

	@field:SerializedName("tentative_max_precision")
	val tentativeMaxPrecision: String? = null,

	@field:SerializedName("ships")
	val ships: List<Any?>? = null,

	@field:SerializedName("launch_date_unix")
	val launchDateUnix: Int? = null,

	@field:SerializedName("launch_success")
	val launchSuccess: Boolean? = null,

	@field:SerializedName("static_fire_date_unix")
	val staticFireDateUnix: Int? = null,

	@field:SerializedName("tbd")
	val tbd: Boolean? = null,

	@field:SerializedName("timeline")
	val timeline: Timeline? = null,

	@field:SerializedName("telemetry")
	val telemetry: Telemetry? = null,

	@field:SerializedName("links")
	val links: Links? = null,

	@field:SerializedName("details")
	val details: String? = null,

	@field:SerializedName("launch_site")
	val launchSite: LaunchSite? = null,

	@field:SerializedName("upcoming")
	val upcoming: Boolean? = null
){
	override fun toString(): String {
		return "Flight Number: $flightNumber\n"+
				"Mission Name: $missionName\n"+
				"Mission ID: $missionId\n"+
				"Upcoming: $upcoming\n"+
				"Launch Date: $launchDateUtc\n"+
				"Tentative: $isTentative\n"+
				"To Be Determined: $tbd\n"+
				"Launch Window $launchWindow\n"+
				"Rocket-------------------Details\n"+
				"Rocket ID: ${rocket?.rocketId}\n"+
				"Rocket Name: ${rocket?.rocketName}\n"+
				"Rocket Type: ${rocket?.rocketType}\n"+
				"First-----Stage-----Details\n"+
				"Core Serial: ${rocket?.firstStage?.cores?.get(0)?.coreSerial}\n"+
				"Flight: ${rocket?.firstStage?.cores?.get(0)?.flight}\n"+
				"Block: ${rocket?.firstStage?.cores?.get(0)?.block}\n"+
				"Grid Fins: ${rocket?.firstStage?.cores?.get(0)?.gridfins}\n"+
				"Legs: ${rocket?.firstStage?.cores?.get(0)?.legs}\n"+
				"Reused: ${rocket?.firstStage?.cores?.get(0)?.reused}\n"+
				"Land Success: ${rocket?.firstStage?.cores?.get(0)?.landSuccess}\n"+
				"Landing Intent: ${rocket?.firstStage?.cores?.get(0)?.landingIntent}\n"+
				"Landing Type: ${rocket?.firstStage?.cores?.get(0)?.landingType}\n"+
				"Landing Vehicle: ${rocket?.firstStage?.cores?.get(0)?.landingVehicle}\n"+
				"Second-----Stage------Details\n"+
				"Block: ${rocket?.secondStage?.block}\n"+
				"Payload-------------------Details\n"+
				"Payload ID: ${rocket?.secondStage?.payloads?.get(0)?.payloadId}\n"+
				"NORAD ID: ${rocket?.secondStage?.payloads?.get(0)?.noradId}\n"+
				"Reused: ${rocket?.secondStage?.payloads?.get(0)?.reused}\n"+
				"Customers: ${rocket?.secondStage?.payloads?.get(0)?.customers?.get(0)}\n"+
				"Nationality: ${rocket?.secondStage?.payloads?.get(0)?.nationality}\n"+
				"Manufacturer: ${rocket?.secondStage?.payloads?.get(0)?.manufacturer}\n"+
				"Payload Type: ${rocket?.secondStage?.payloads?.get(0)?.payloadType}\n"+
				"Payload Mass(Kg): ${rocket?.secondStage?.payloads?.get(0)?.payloadMassKg}\n"+
				"Payload Mass(Lbs): ${rocket?.secondStage?.payloads?.get(0)?.payloadMassLbs}\n"+
				"Orbit: ${rocket?.secondStage?.payloads?.get(0)?.orbit}\n"+
				"Reference System: ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.referenceSystem}\n"+
				"Regime: ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.regime}\n"+
				"Longitude: ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.longitude}\n"+
				"Semi-Major Axis(Km): ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.semiMajorAxisKm}\n"+
				"Eccentricity: ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.eccentricity}\n"+
				"Periapsis(Km): ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.periapsisKm}\n"+
				"Apoapsis(Km): ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.apoapsisKm}\n"+
				"Inclination(Deg): ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.inclinationDeg}\n"+
				"Period(Min): ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.periodMin}\n"+
				"Lifespan(Yrs): ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.lifespanYears}\n"+
				"Epoch: ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.epoch}\n"+
				"Mean Motion: ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.meanMotion}\n"+
				"RAAN: ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.raan}\n"+
				"Arg of Pericenter: ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.argOfPericenter}\n"+
				"Mean Anomaly: ${rocket?.secondStage?.payloads?.get(0)?.orbitParams?.meanAnomaly}\n"+
				"Fairings---------------------------\n"+
				"Reused: ${rocket?.fairings?.reused}\n"+
				"Recovery Attempt: ${rocket?.fairings?.recoveryAttempt}\n"+
				"Recovered: ${rocket?.fairings?.recovered}\n"+
				"Ships---------------\n"+
				"Telemetry(Flight Club): ${ships.toString()}\n"+
				"Launch------------------------Site\n"+
				"Site ID: ${launchSite?.siteId}\n"+
				"Site Name: ${launchSite?.siteName}\n"+
				"Site Name Long: ${launchSite?.siteNameLong}\n"+
				"Launch Success: ${launchSuccess}\n"+
				"Launch---------------------Failure\n"+
				"Time: ${launchFailureDetails?.time}\n"+
				"Altitude: ${launchFailureDetails?.altitude}\n"+
				"Reason: ${launchFailureDetails?.reason}\n"+
				"Links--------------------------------\n"+
				"Mission Patch: ${links?.missionPatch}\n"+
				"Mission Patch Small: ${links?.missionPatchSmall}\n"+
				"Reddit Campaing: ${links?.redditCampaign}\n"+
				"Reddit Launch: ${links?.redditLaunch}\n"+
				"Reddit Recovery: ${links?.redditRecovery}\n"+
				"Reddit Media: ${links?.redditMedia}\n"+
				"Presskit: ${links?.presskit}\n"+
				"Article Link: ${links?.articleLink}\n"+
				"Wikipedia: ${links?.wikipedia}\n"+
				"Video Link: ${links?.videoLink}\n"+
				"Youtube ID: ${links?.youtubeId}\n"+
				"Flickr Images: ${links?.flickrImages}\n"+
				"-----------------------------\n"+
				"Details: ${details}\n"+
				"Static Fire Date: ${staticFireDateUtc}\n"+
				"Webcast Liftoff: ${timeline?.webcastLiftoff}\n"+
				"Crew: ${crew}\n"
	}
}