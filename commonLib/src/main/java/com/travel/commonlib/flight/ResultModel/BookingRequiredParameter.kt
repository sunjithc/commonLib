package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BookingRequiredParameter : Serializable {
    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("DisplayText")
    @Expose
    var displayText: String? = null

    @SerializedName("PerPassenger")
    @Expose
    var perPassenger: Boolean? = null

    @SerializedName("IsOptional")
    @Expose
    var optional: Boolean? = null
}