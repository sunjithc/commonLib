package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SegmentDetail : Serializable {
    @SerializedName("UniqueKey")
    @Expose
    var uniqueKey: Int? = null

    @SerializedName("SegmentNumber")
    @Expose
    var segmentNumber: Int? = null

    @SerializedName("FareBasisCode")
    @Expose
    var fareBasisCode: Any? = null

    @SerializedName("Baggage")
    @Expose
    var baggage: String? = null

    @SerializedName("BookingCode")
    @Expose
    var bookingCode: Any? = null

    @SerializedName("FlightNumber")
    @Expose
    var flightNumber: Any? = null

    @SerializedName("BaggageDescription1")
    @Expose
    var baggageDescription1: String? = null

    @SerializedName("BaggageDescription2")
    @Expose
    var baggageDescription2: String? = null

}