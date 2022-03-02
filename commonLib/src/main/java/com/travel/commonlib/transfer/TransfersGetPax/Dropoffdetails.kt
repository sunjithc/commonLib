package com.travel.commonlib.transfer.TransfersGetPax

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

/**
 * Created by Rohith (Android) on 5/21/2021.
 */
class Dropoffdetails : Serializable {
    @SerializedName("Time")
    @Expose
    var time: String? = null

    @SerializedName("arrivingFrom")
    @Expose
    var arrivingFrom: String? = null

    @SerializedName("departingTo")
    @Expose
    var departingTo: String? = null

    @SerializedName("City")
    @Expose
    var city: String? = null

    @SerializedName("cityCode")
    @Expose
    var cityCode: String? = null

    @SerializedName("Address")
    @Expose
    var address: String? = null

    @SerializedName("shipName")
    @Expose
    var shipName: String? = null

    @SerializedName("trainName")
    @Expose
    var trainName: String? = null

    @SerializedName("shippingCompany")
    @Expose
    var shippingCompany: String? = null

    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Point")
    @Expose
    var point: Any? = null

    @SerializedName("nextday")
    @Expose
    var nextday: Boolean? = null

    @SerializedName("TravelNumber")
    @Expose
    var travelNumber: String? = null
}