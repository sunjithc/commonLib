package com.travel.commonlib.flight.SeatModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class FlightSeatInfo : Serializable {
    @SerializedName("SegmentDetails")
    @Expose
    var segmentDetails: ArrayList<SegmentDetail>? = null

    @SerializedName("RowDetails")
    @Expose
    var rowDetails: Any? = null

    @SerializedName("SeatDetailItems")
    @Expose
    var seatDetailItems: Any? = null

    // For seat selection purpose added manually
    @SerializedName("TripId")
    @Expose
    var tripId: String? = null
}