package com.travel.commonlib.flight.SeatModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SeatDetailItemInfo : Serializable {
    @SerializedName("SeatColumnId")
    @Expose
    var seatColumnId: String? = null

    @SerializedName("SeatAvailStatus")
    @Expose
    var seatAvailStatus: Any? = null

    @SerializedName("isSeatAvail")
    @Expose
    var seatAvail: Boolean? = null

    @SerializedName("SeatType")
    @Expose
    var seatType: Any? = null

    @SerializedName("RowNumber")
    @Expose
    var rowNumber: String? = null

    @SerializedName("isChargeable")
    @Expose
    var chargeable: Boolean? = null

    @SerializedName("SeatPrice")
    @Expose
    var seatPrice: SeatPrice? = null

    @SerializedName("Location")
    @Expose
    var location: Any? = null

    @SerializedName("Facilities")
    @Expose
    var facilities: Any? = null

    @SerializedName("ExitRow")
    @Expose
    var exitRow: Boolean? = null

    @SerializedName("IsNotAllowed_InfantOrWithPass")
    @Expose
    var notAllowedInfantOrWithPass: Boolean? = null

    @SerializedName("IsNotSuitable_Infant")
    @Expose
    var notSuitableInfant: Boolean? = null

    @SerializedName("IsNotSuitable_Child")
    @Expose
    var notSuitableChild: Boolean? = null

    @SerializedName("SeatMarkup")
    @Expose
    var seatMarkup = 0.0

    @SerializedName("IsSeatMarkupPercentage")
    @Expose
    var seatMarkupPercentage: Boolean? = null

    @SerializedName("TotalSeatMarkup")
    @Expose
    var totalSeatMarkup = 0.0

    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("SeatNo")
    @Expose
    var seatNo: Any? = null

    @SerializedName("SeatWayType")
    @Expose
    var seatWayType: Any? = null

    @SerializedName("Compartment")
    @Expose
    var compartment: Any? = null

    @SerializedName("Deck")
    @Expose
    var deck: Any? = null

    @SerializedName("Text")
    @Expose
    var text: Any? = null

    @SerializedName("selected")
    @Expose
    var selected: Boolean? = null

    @SerializedName("AvailabilityType")
    @Expose
    var availabilityType: Int? = null

    @SerializedName("AirlineCode")
    @Expose
    var airlineCode: Any? = null

    @SerializedName("craftType")
    @Expose
    var craftType: Any? = null

    @SerializedName("Origin")
    @Expose
    var origin: Any? = null

    @SerializedName("Destination")
    @Expose
    var destination: Any? = null

    @SerializedName("flightSeatInfo_selected")
    @Expose
    var flightSeatInfoSelected: FlightSeatInfoSelected? = null

    @SerializedName("TripId") // For seat selection purpose added manually
    @Expose // For seat selection purpose added manually
    var tripId : String? = null

    @SerializedName("AirSegmentNumber") // For seat selection purpose added manually
    @Expose // For seat selection purpose added manually
    var airSegmentNumber  = 0

    @SerializedName("uniqueTripid")
    @Expose
    var uniqueTripid: String? = null
}