package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ContentDetails : Serializable {
    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("SegmentData")
    @Expose
    var segmentData: List<SegmentDatum>? = null

    @SerializedName("FeatureGroups")
    @Expose
    var featureGroups: List<FeatureGroup>? = null

    @SerializedName("ImageUrl")
    @Expose
    var imageUrl: String? = null

    @SerializedName("LocationDetails")
    @Expose
    var locationDetails: LocationDetails? = null

    @SerializedName("ImportantInfo")
    @Expose
    var importantInfo: List<String>? = null

    @SerializedName("GuidingOptions")
    @Expose
    var guidingOptions: GuidingOptions? = null

    companion object {
        private const val serialVersionUID = 3008594837401527847L
    }
}