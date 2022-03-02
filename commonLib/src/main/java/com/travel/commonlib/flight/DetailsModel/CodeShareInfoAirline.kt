package com.travel.commonlib.flight.DetailsModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CodeShareInfoAirline : Serializable {
    @SerializedName("OperatingAirlineName")
    @Expose
    var operatingAirlineName: String? = null

    @SerializedName("OperatingCarrier")
    @Expose
    var operatingCarrier: String? = null

    @SerializedName("IsOperatingCarrier")
    @Expose
    var isOperatingCarrier: Boolean? = null

    @SerializedName("OperatingFlightNumber")
    @Expose
    var operatingFlightNumber: String? = null
}