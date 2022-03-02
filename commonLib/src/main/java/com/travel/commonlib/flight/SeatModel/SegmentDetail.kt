package com.travel.commonlib.flight.SeatModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.SeatModel.WingSeat
import java.io.Serializable
import java.util.*

class SegmentDetail : Serializable {
    @SerializedName("AirSegmentNumber")
    @Expose
    var airSegmentNumber: Int? = null

    @SerializedName("Airline")
    @Expose
    var airline: String? = null

    @SerializedName("AirlineNum")
    @Expose
    var airlineNum: String? = null

    @SerializedName("DateOfJourney")
    @Expose
    var dateOfJourney: String? = null

    @SerializedName("DepartureCity")
    @Expose
    var departureCity: String? = null

    @SerializedName("ArrivalCity")
    @Expose
    var arrivalCity: String? = null

    @SerializedName("ClassOfService")
    @Expose
    var classOfService: String? = null

    @SerializedName("AircraftType")
    @Expose
    var aircraftType: String? = null

    @SerializedName("SeatDisplayStatus")
    @Expose
    var seatDisplayStatus: String? = null

    @SerializedName("ColumnDefinition")
    @Expose
    var columnDefinition: Any? = null

    @SerializedName("DayChange")
    @Expose
    var dayChange: Any? = null

    @SerializedName("NumberOfPassengers")
    @Expose
    var numberOfPassengers: Int? = null

    @SerializedName("ClassLocation")
    @Expose
    var classLocation: Any? = null

    @SerializedName("FirstRow")
    @Expose
    var firstRow: Int? = null

    @SerializedName("LastRow")
    @Expose
    var lastRow: Int? = null

    @SerializedName("RowDetails")
    @Expose
    var rowDetails: ArrayList<RowDetail>? = null

    @SerializedName("ColumnItems")
    @Expose
    var columnItems: ArrayList<ColumnItem>? = null

    @SerializedName("WingSeat")
    @Expose
    var wingSeat: WingSeat? = null

    @SerializedName("Currency")
    @Expose
    var currency: Any? = null

    @SerializedName("TripId")
    @Expose
    var tripId: String? = null
}