package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SegmentDatum : Serializable {
    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("Segments")
    @Expose
    var segments: List<Segment>? = null

    companion object {
        private const val serialVersionUID = -3625174543038840640L
    }
}