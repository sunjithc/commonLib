package com.travel.commonlib.flight

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MealsFlightModel {
    @SerializedName("FlightNumber")
    @Expose
    var flightNumber: String? = null

    @SerializedName("AirlineCode")
    @Expose
    var airlineCode: String? = null
}