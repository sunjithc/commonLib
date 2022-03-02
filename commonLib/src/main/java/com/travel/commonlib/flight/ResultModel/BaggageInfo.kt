package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BaggageInfo : Serializable {
    @SerializedName("UniqueKey")
    @Expose
    var uniqueKey: Int? = 0

    @SerializedName("SegmentNumber")
    @Expose
    var segmentNumber: Int? = 0

    @SerializedName("Baggage")
    @Expose
    var baggage: String? = ""

    @SerializedName("FareBasisCode")
    @Expose
    var fareBasisCode: Any? = null

    @SerializedName("BookingCode")
    @Expose
    var bookingCode: Any? = null

    @SerializedName("Airline")
    @Expose
    var airline: String? = ""

    @SerializedName("FlightNumber")
    @Expose
    var flightNumber: String? = ""
}