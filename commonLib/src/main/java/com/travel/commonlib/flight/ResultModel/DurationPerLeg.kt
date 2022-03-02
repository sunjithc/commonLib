package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DurationPerLeg : Serializable {
    @SerializedName("Days")
    @Expose
    var days: Int? = null

    @SerializedName("Hours")
    @Expose
    var hours: Int? = null

    @SerializedName("Minutes")
    @Expose
    var minutes: Int? = null
}