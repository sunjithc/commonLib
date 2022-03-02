package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class FlightJourney : Serializable {
    @SerializedName("TravelDirection")
    @Expose
    var travelDirection: String? = null

    @SerializedName("FlightItems")
    @Expose
    var flightItems: ArrayList<FlightItem>? = null

    @SerializedName("TotalDurationInMinutes")
    @Expose
    var totalDurationInMinutes = 0.0

    @SerializedName("TotalDurations")
    @Expose
    var totalDurations: TotalDurations? = null

    @SerializedName("TotalStops")
    @Expose
    var totalStops = 0

    @SerializedName("UniqueReference")
    @Expose
    var uniqueReference: String? = null

    @SerializedName("Fareid")
    @Expose
    var fareid: String? = null

    @SerializedName("Supplier")
    @Expose
    var supplier: Any? = null

    @SerializedName("LsOfferDetails")
    @Expose
    var lsOfferDetails: ArrayList<Any>? = null

    @SerializedName("OfferTotalAmount")
    @Expose
    var offerTotalAmount = 0.0

    @SerializedName("PaxJourneyRefID")
    @Expose
    var paxJourneyRefID: Any? = null

    @SerializedName("OriginDestID")
    @Expose
    var originDestID: Any? = null
}