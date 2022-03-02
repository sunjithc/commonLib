package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ActivityInfo : Serializable {
    @SerializedName("ActivityName")
    @Expose
    var activityName: String? = null

    @SerializedName("ActivityType")
    @Expose
    var activityType: String? = null

    @SerializedName("ExactCode")
    @Expose
    var exactCode: String? = null

    @SerializedName("Location")
    @Expose
    var location: String? = null

    @SerializedName("ActivityData")
    @Expose
    var activityData: List<ActivityDatum>? = null

    @SerializedName("ContentDetails")
    @Expose
    var contentDetails: ContentDetails? = null

    @SerializedName("ActivityReference")
    @Expose
    var activityReference: String? = null

    @SerializedName("SupInfo")
    @Expose
    var supInfo: SupInfo? = null

    companion object {
        private const val serialVersionUID = 6789078066701291347L
    }
}