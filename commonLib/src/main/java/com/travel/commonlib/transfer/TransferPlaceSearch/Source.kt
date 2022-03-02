package com.travel.commonlib.transfer.TransferPlaceSearch

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Source : Serializable {
    @SerializedName("tid")
    @Expose
    var tid: Int? = null

    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("cityname")
    @Expose
    val cityname: String? = null

    @SerializedName("hotelcode")
    @Expose
    val hotelcode: String? = null

    @SerializedName("citycode")
    @Expose
    val citycode: String? = null
}