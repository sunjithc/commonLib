package com.travel.commonlib.deals

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class HotelDealsResponse : Serializable {
    @SerializedName("HotelDeals")
    @Expose
    var hotelDeals: List<HotelDeal>? = null

    @SerializedName("HotelLowestPriceDeal")
    @Expose
    var hotelLowestPriceDeal: List<Any>? = null

    @SerializedName("CheapHotelDeals")
    @Expose
    var cheapHotelDeals: List<Any>? = null

    @SerializedName("DestinationCities")
    @Expose
    var destinationCities: List<Any>? = null

    @SerializedName("OfflinehotelDeals")
    @Expose
    var offlinehotelDeals: Any? = null

    companion object {
        private const val serialVersionUID = -412777643310983441L
    }
}