package com.travel.commonlib.flight.SeatModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 8/26/2020.
 */
class FlightSeatInfoSelected : Serializable {
    @SerializedName("AirSegmentNumber")
    @Expose
    var airSegmentNumber: Int? = null

    @SerializedName("ColumnNumber")
    @Expose
    var columnNumber: String? = null

    @SerializedName("RowNumber")
    @Expose
    var rowNumber: String? = null

    @SerializedName("TripId")
    @Expose
    var tripId: String? = null

    @SerializedName("tripCount")
    @Expose
    var tripCount: Int? = null

    @SerializedName("price")
    @Expose
    var price: Double? = null
}