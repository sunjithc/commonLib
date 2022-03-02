package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Destination : Serializable {
    @SerializedName("citycode")
    @Expose
    var citycode: String? = null

    @SerializedName("cityname")
    @Expose
    var cityname: String? = null

    @SerializedName("countrycode")
    @Expose
    var countrycode: String? = null

    @SerializedName("countryname")
    @Expose
    var countryname: String? = null

    @SerializedName("area")
    @Expose
    var area: String? = null

    @SerializedName("state")
    @Expose
    var state: String? = null
}