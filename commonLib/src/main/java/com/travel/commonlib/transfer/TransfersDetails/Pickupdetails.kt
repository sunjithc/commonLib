package com.travel.commonlib.transfer.TransfersDetails

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Pickupdetails : Serializable {
    @SerializedName("Time")
    @Expose
    var time: Any? = null

    @SerializedName("arrivingFrom")
    @Expose
    var arrivingFrom: Any? = null

    @SerializedName("departingTo")
    @Expose
    var departingTo: Any? = null

    @SerializedName("City")
    @Expose
    var city: Any? = null

    @SerializedName("cityCode")
    @Expose
    var cityCode: Any? = null

    @SerializedName("Address")
    @Expose
    var address: Any? = null

    @SerializedName("shipName")
    @Expose
    var shipName: Any? = null

    @SerializedName("trainName")
    @Expose
    var trainName: Any? = null

    @SerializedName("shippingCompany")
    @Expose
    var shippingCompany: Any? = null

    @SerializedName("Code")
    @Expose
    var code: Any? = null

    @SerializedName("Point")
    @Expose
    var point: Any? = null

    @SerializedName("nextday")
    @Expose
    var nextday: Boolean? = null

    @SerializedName("TravelNumber")
    @Expose
    var travelNumber: Any? = null

    @SerializedName("TravelCompanyName")
    @Expose
    var travelCompanyName: Any? = null
}