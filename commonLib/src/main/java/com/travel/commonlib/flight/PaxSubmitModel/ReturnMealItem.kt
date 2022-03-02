package com.travel.commonlib.flight.PaxSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ReturnMealItem : Serializable {
    @SerializedName("AirlineCode")
    @Expose
    var airlineCode: String? = null

    @SerializedName("TravelDirection")
    @Expose
    var travelDirection: String? = null

    @SerializedName("FlightNumber")
    @Expose
    var flightNumber: String? = null

    @SerializedName("WayType")
    @Expose
    var wayType: String? = null

    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("AirlineDescription")
    @Expose
    var airlineDescription: String? = null

    @SerializedName("Quantity")
    @Expose
    var quantity: Int? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("Price")
    @Expose
    var price = 0.0

    @SerializedName("ActualCurrency")
    @Expose
    var actualCurrency: String? = null

    @SerializedName("ActualPrice")
    @Expose
    var actualPrice = 0.0

    @SerializedName("Origin")
    @Expose
    var origin: String? = null

    @SerializedName("Destination")
    @Expose
    var destination: String? = null

    @SerializedName("JourneyType")
    @Expose
    var journeyType: Int? = null

    @SerializedName("Selected")
    @Expose
    var selected: Boolean? = null

    @SerializedName("MealsMarkup")
    @Expose
    var mealsMarkup: Int? = null

    @SerializedName("TotaMealsPrice")
    @Expose
    var totaMealsPrice = 0.0
}