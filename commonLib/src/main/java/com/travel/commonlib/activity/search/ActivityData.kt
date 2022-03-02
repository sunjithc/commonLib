package com.travel.commonlib.activity.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ActivityData : Serializable {
    @SerializedName("ApiId")
    @Expose
    var apiId: Long = 0

    @SerializedName("ApiName")
    @Expose
    var apiName: String? = null

    @SerializedName("ActivityName")
    @Expose
    var activityName: String? = null

    @SerializedName("ActivityCode")
    @Expose
    var activityCode: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("Images")
    @Expose
    var images: List<String>? = null

    @SerializedName("Destination")
    @Expose
    var destination: String? = null

    @SerializedName("CompanyQuote")
    @Expose
    var companyQuote: List<CompanyQuote>? = null

    @SerializedName("Segments")
    @Expose
    var segments: List<Segment>? = null

    @SerializedName("LocationDetails")
    @Expose
    var locationDetails: LocationDetails? = null

    companion object {
        private const val serialVersionUID = -1143067823432795345L
    }
}