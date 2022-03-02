package com.travel.commonlib.deals

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FlightsDeal {
    @SerializedName("HoteldealId")
    @Expose
    var hoteldealId = 0

    @SerializedName("FeaturedId")
    @Expose
    var featuredId = 0

    @SerializedName("SourceCode")
    @Expose
    var sourceCode: String? = null

    @SerializedName("Source")
    @Expose
    var source: String? = null

    @SerializedName("SourceAllAirportIndicator")
    @Expose
    var sourceAllAirportIndicator: String? = null

    @SerializedName("SourceArabic")
    @Expose
    var sourceArabic: String? = null

    @SerializedName("DestinationCode")
    @Expose
    var destinationCode: String? = null

    @SerializedName("DestinationAllAirportIndicator")
    @Expose
    var destinationAllAirportIndicator: String? = null

    @SerializedName("Destination")
    @Expose
    var destination: String? = null

    @SerializedName("DestinationArabic")
    @Expose
    var destinationArabic: String? = null

    @SerializedName("Region")
    @Expose
    var region: String? = null

    @SerializedName("FromDate")
    @Expose
    var fromDate: String? = null

    @SerializedName("ToDate")
    @Expose
    var toDate: String? = null

    @SerializedName("FromDateString")
    @Expose
    var fromDateString: String? = null

    @SerializedName("ToDateString")
    @Expose
    var toDateString: String? = null

    @SerializedName("Price")
    @Expose
    var price = 0.0

    @SerializedName("DisplayPrice")
    @Expose
    var displayPrice: String? = null

    @SerializedName("UpdatedDate")
    @Expose
    var updatedDate: String? = null

    @SerializedName("SearchType")
    @Expose
    var searchType: String? = null

    @SerializedName("PaxCount")
    @Expose
    var paxCount = 0

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("FinalDestination")
    @Expose
    var finalDestination: String? = null

    @SerializedName("FinalDestinationArabic")
    @Expose
    var finalDestinationArabic: String? = null

    @SerializedName("HotelCountry")
    @Expose
    var hotelCountry: Any? = null

    @SerializedName("roomDetailsJson")
    @Expose
    var roomDetailsJson: Any? = null

    @SerializedName("imageName")
    @Expose
    var imageName: String? = null

    @SerializedName("imageUrl")
    @Expose
    var imageUrl: String? = null

    @SerializedName("decimalPoints")
    @Expose
    var decimalPoints = 0

    @SerializedName("locationUrl")
    @Expose
    var locationUrl: Any? = null

    @SerializedName("_IsSoldOut")
    @Expose
    var isIsSoldOut = false
        private set

    @SerializedName("description")
    @Expose
    var description: Any? = null

    @SerializedName("AirLineName")
    @Expose
    var airLineName: Any? = null

    @SerializedName("AirLineCode")
    @Expose
    var airLineCode: String? = null

    @SerializedName("Time")
    @Expose
    var time: Any? = null

    @SerializedName("HotelName")
    @Expose
    var hotelName: Any? = null

    @SerializedName("LatLong")
    @Expose
    var latLong: Any? = null

    @SerializedName("StarRating")
    @Expose
    var starRating: Any? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: Any? = null

    @SerializedName("OnWard")
    @Expose
    var onWard = 0

    @SerializedName("BackWard")
    @Expose
    var backWard = 0

    @SerializedName("IsPreferredAirline")
    @Expose
    var isIsPreferredAirline = false

    @SerializedName("Discount")
    @Expose
    var discount = 0.0

    @SerializedName("SourceElasticData")
    @Expose
    var sourceElasticData: String? = null

    @SerializedName("DestinationElasticData")
    @Expose
    var destinationElasticData: String? = null

    @SerializedName("Priority")
    @Expose
    var priority: String? = null

    @SerializedName("SearchID")
    @Expose
    var searchID: String? = null

    @SerializedName("RefundableValue")
    @Expose
    var refundableValue = 0
    fun setIsSoldOut(isSoldOut: Boolean) {
        isIsSoldOut = isSoldOut
    }


}