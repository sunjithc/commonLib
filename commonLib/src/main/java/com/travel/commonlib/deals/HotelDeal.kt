package com.travel.commonlib.deals

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class HotelDeal : Serializable {
    @SerializedName("DealID")
    @Expose
    var dealID: Long = 0

    @SerializedName("City")
    @Expose
    var city: String? = null

    @SerializedName("CityArabic")
    @Expose
    var cityArabic: String? = null

    @SerializedName("Checkin")
    @Expose
    var checkin: Long = 0

    @SerializedName("CheckOut")
    @Expose
    var checkOut: Long = 0

    @SerializedName("imageUrl")
    @Expose
    var imageUrl: String? = null

    @SerializedName("CheckinDate")
    @Expose
    var checkinDate: String? = null

    @SerializedName("CheckOutDate")
    @Expose
    var checkOutDate: String? = null

    @SerializedName("Price")
    @Expose
    var price = 0.0

    @SerializedName("HotelName")
    @Expose
    var hotelName: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("StarRating")
    @Expose
    var starRating: String? = null

    @SerializedName("LatLon")
    @Expose
    var latLon: String? = null

    @SerializedName("SubDomineID")
    @Expose
    var subDomineID: Long = 0

    @SerializedName("SubDomineName")
    @Expose
    var subDomineName: Any? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: String? = null

    @SerializedName("Region")
    @Expose
    var region: String? = null

    @SerializedName("UpdatedDate")
    @Expose
    var updatedDate: String? = null

    @SerializedName("StarRatingApp")
    @Expose
    var starRatingApp: Long = 0

    @SerializedName("SearchStarRating")
    @Expose
    var searchStarRating: Any? = null

    companion object {
        private const val serialVersionUID = -7508945563929397952L
    }
}