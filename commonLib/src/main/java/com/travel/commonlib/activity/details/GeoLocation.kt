package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class GeoLocation : Serializable {
    @SerializedName("Latitude")
    @Expose
    var latitude = 0.0

    @SerializedName("Longitude")
    @Expose
    var longitude = 0.0

    companion object {
        private const val serialVersionUID = 4197197281999145129L
    }
}