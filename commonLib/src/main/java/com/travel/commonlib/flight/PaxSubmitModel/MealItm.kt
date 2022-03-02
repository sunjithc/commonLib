package com.travel.commonlib.flight.PaxSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class MealItm : Serializable {
    @SerializedName("AirlineCode")
    @Expose
    var airlineCode: String? = ""

    @SerializedName("TravelDirection")
    @Expose
    var travelDirection: String? = ""

    @SerializedName("FlightNumber")
    @Expose
    var flightNumber: String? = ""

    @SerializedName("WayType")
    @Expose
    var wayType: String? = ""

    @SerializedName("Code")
    @Expose
    var code: String? = ""

    @SerializedName("Description")
    @Expose
    var description: String? = ""

    @SerializedName("AirlineDescription")
    @Expose
    var airlineDescription: String? = ""

    @SerializedName("Quantity")
    @Expose
    var quantity: Int? = 0

    @SerializedName("Currency")
    @Expose
    var currency: String? = ""

    @SerializedName("Price")
    @Expose
    var price: Double? = 0.0

    @SerializedName("ActualCurrency")
    @Expose
    var actualCurrency: String? = ""

    @SerializedName("ActualPrice")
    @Expose
    var actualPrice: Double? = 0.0

    @SerializedName("Origin")
    @Expose
    var origin: String? = ""

    @SerializedName("Destination")
    @Expose
    var destination: String? = ""

    @SerializedName("JourneyType")
    @Expose
    var journeyType: Int? = 0

    @SerializedName("Selected")
    @Expose
    var selected: Boolean? = false

    @SerializedName("MealsMarkup")
    @Expose
    var mealsMarkup: Double? = 0.0

    @SerializedName("TotaMealsPrice")
    @Expose
    var totaMealsPrice: Double? = 0.0

    @SerializedName("uniqueTripid")
    @Expose
    var uniqueTripid: String? = ""

    @SerializedName("MealId")
    @Expose
    var mealId: Int? = 0

    @SerializedName("SegmentNumber")
    @Expose
    var segmentNumber: Int? = 0

    @SerializedName("BasePrice")
    @Expose
    var basePrice: Int? = 0

    @SerializedName("ApproximateTotalPrice")
    @Expose
    var approximateTotalPrice: Int? = 0

    @SerializedName("ApproximateBasePrice")
    @Expose
    var approximateBasePrice: Int? = 0

    @SerializedName("CreateDate")
    @Expose
    var createDate: String? = ""

    @SerializedName("Key")
    @Expose
    var key: String? = ""

    @SerializedName("AirSegmentRef")
    @Expose
    var airSegmentRef: String? = ""

    @SerializedName("ServiceInfo")
    @Expose
    var serviceInfo: ArrayList<ServiceInfo_>? = null

    @SerializedName("CommercialName")
    @Expose
    var commercialName: String? = ""

    @SerializedName("BookingTravelerRef")
    @Expose
    var bookingTravelerRef: String? = ""

    @SerializedName("PassengerCode")
    @Expose
    var passengerCode: String? = ""
}
