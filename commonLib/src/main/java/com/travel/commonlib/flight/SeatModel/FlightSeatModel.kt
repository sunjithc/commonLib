package com.travel.commonlib.flight.SeatModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class FlightSeatModel : Serializable {
    @SerializedName("FlightSeatInfo")
    @Expose
    var flightSeatInfo: FlightSeatInfo? = null
}