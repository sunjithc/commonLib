package com.travel.commonlib.transfer

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class List_item : Serializable {
    @SerializedName("Id")
    @Expose
    var _id: String? = null

    @SerializedName("Tid")
    @Expose
    var tid = 0

    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("HotelCode")
    @Expose
    var hotel_code: String? = null

    @SerializedName("CityName")
    @Expose
    var city_name: String? = null
}