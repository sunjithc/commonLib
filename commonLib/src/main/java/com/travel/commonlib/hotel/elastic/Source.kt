package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Source : Serializable {
    @SerializedName("CaxHotelID")
    @Expose
    var caxHotelID = 0

    @SerializedName("GIATACode")
    @Expose
    var gIATACode = 0

    @SerializedName("Data")
    @Expose
    var data: String? = null

    @SerializedName("FK_MasterHotelCityId")
    @Expose
    var fKMasterHotelCityId = 0

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("StarRating")
    @Expose
    var starRating = 0

    @SerializedName("DisplayName")
    @Expose
    var displayName: String? = null

    @SerializedName("HotelCodes")
    @Expose
    var hotelCodes: List<String>? = null

    @SerializedName("SupportedApis")
    @Expose
    var supportedApis: String? = null

    @SerializedName("cityname")
    @Expose
    var cityname: Any? = null
}