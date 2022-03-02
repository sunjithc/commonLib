package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DepartureTimeFormat : Serializable {
    @SerializedName("Hours")
    @Expose
    var hours: Int? = null

    @SerializedName("Minutes")
    @Expose
    var minutes: Int? = null

    @SerializedName("Meridian")
    @Expose
    var meridian: String? = null
}