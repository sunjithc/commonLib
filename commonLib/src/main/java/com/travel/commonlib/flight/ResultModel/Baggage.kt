package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Baggage : Serializable {

    @SerializedName("CategoryId")
    @Expose
    private val categoryId = 0

    @SerializedName("CodeType")
    @Expose
    private val codeType: Any? = null

    @SerializedName("Description")
    @Expose
    private val description: Any? = null

    @SerializedName("QuantityAvailable")
    @Expose
    private val quantityAvailable = 0

    @SerializedName("FlightID")
    @Expose
    private val flightID = 0

    @SerializedName("ServiceID")
    @Expose
    private val serviceID = 0

    @SerializedName("BaggageId")
    @Expose
    private val baggageId = 0

    @SerializedName("AllowPriorityBoarding")
    @Expose
    private val allowPriorityBoarding = false

    @SerializedName("BaggageFee")
    @Expose
    private val baggageFee: BaggageFee? = null

    @SerializedName("MaxPieceWeight")
    @Expose
    private val maxPieceWeight = 0

    @SerializedName("NumberOfPieces")
    @Expose
    private val numberOfPieces = 0

    @SerializedName("TotalMaxWeight")
    @Expose
    private val totalMaxWeight = 0

    @SerializedName("PaySurchargesAtAirport")
    @Expose
    private val paySurchargesAtAirport = false

    @SerializedName("PriorityBoardingFee")
    @Expose
    private val priorityBoardingFee: Any? = null

    @SerializedName("HashCode")
    @Expose
    private val hashCode: Any? = null

    @SerializedName("ChargeComment")
    @Expose
    private val chargeComment: Any? = null

    @SerializedName("WayType")
    @Expose
    private val wayType: Any? = null

    @SerializedName("AirlineCode")
    @Expose
    private val airlineCode: Any? = null

    @SerializedName("Key")
    @Expose
    private val key: Any? = null

    @SerializedName("AirSegmentRef")
    @Expose
    private val airSegmentRef: Any? = null

    @SerializedName("BookingTravelerRef")
    @Expose
    private val bookingTravelerRef: Any? = null

    @SerializedName("ServiceInfo")
    @Expose
    private val serviceInfo: Any? = null

    @SerializedName("Origin")
    @Expose
    private val origin: Any? = null

    @SerializedName("Destination")
    @Expose
    private val destination: Any? = null

    @SerializedName("CreateDate")
    @Expose
    private val createDate: Any? = null

    @SerializedName("Text")
    @Expose
    private val text: Any? = null
}