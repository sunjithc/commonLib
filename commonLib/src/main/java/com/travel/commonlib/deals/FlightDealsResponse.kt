package com.travel.commonlib.deals

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FlightDealsResponse {
    @SerializedName("FlightsDeals")
    @Expose
    var flightsDeals: List<FlightsDeal>? = null

    @SerializedName("FlightLowestPriceDeal")
    @Expose
    var flightLowestPriceDeal: List<Any>? = null

    @SerializedName("CheapFlightDeals")
    @Expose
    var cheapFlightDeals: List<Any>? = null

    @SerializedName("FlightsHotelDeals")
    @Expose
    var flightsHotelDeals: Any? = null

    @SerializedName("FlightOfflineDeals")
    @Expose
    var flightOfflineDeals: Any? = null

    @SerializedName("TopDestinations")
    @Expose
    var topDestinations: List<Any>? = null
}