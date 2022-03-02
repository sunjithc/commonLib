package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class AirSegmentInfo : Serializable {
    @SerializedName("DepartureCity")
    @Expose
    var departureCity: String? = null

    @SerializedName("ArrivalCity")
    @Expose
    var arrivalCity: String? = null

    @SerializedName("SeatingClass")
    @Expose
    var seatingClass: String? = null

    @SerializedName("DateOfJourney")
    @Expose
    var dateOfJourney: String? = null
}