package com.example.spacenews.models


import com.google.gson.annotations.SerializedName


data class Links(

	@field:SerializedName("mission_patch_small")
	val missionPatchSmall: String? = null,

	@field:SerializedName("mission_patch")
	val missionPatch: String? = null,

	@field:SerializedName("video_link")
	val videoLink: String? = null,

	@field:SerializedName("flickr_images")
	val flickrImages: List<Any?>? = null,

	@field:SerializedName("reddit_recovery")
	val redditRecovery: Any? = null,

	@field:SerializedName("reddit_media")
	val redditMedia: Any? = null,

	@field:SerializedName("reddit_campaign")
	val redditCampaign: Any? = null,

	@field:SerializedName("wikipedia")
	val wikipedia: String? = null,

	@field:SerializedName("reddit_launch")
	val redditLaunch: Any? = null,

	@field:SerializedName("youtube_id")
	val youtubeId: String? = null,

	@field:SerializedName("presskit")
	val presskit: Any? = null,

	@field:SerializedName("article_link")
	val articleLink: String? = null
)