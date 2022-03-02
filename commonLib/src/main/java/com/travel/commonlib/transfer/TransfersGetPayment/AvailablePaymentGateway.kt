package com.travel.commonlib.transfer.TransfersGetPayment

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class AvailablePaymentGateway : Serializable {
    @SerializedName("ConvertionRate")
    @Expose
    var convertionRate: Double? = null

    @SerializedName("ServiceCharge")
    @Expose
    var serviceCharge: Double? = null

    @SerializedName("IsPercentage")
    @Expose
    var isPercentage: Boolean? = null

    @SerializedName("IsFlightExcluded")
    @Expose
    var isFlightExcluded: Boolean? = null

    @SerializedName("PaymentGateWayId")
    @Expose
    var paymentGateWayId: Int? = null

    @SerializedName("PaymentGateWayName")
    @Expose
    var paymentGateWayName: String? = null

    @SerializedName("FlightServiceCharge")
    @Expose
    var flightServiceCharge: Double? = null

    @SerializedName("HotelServiceCharge")
    @Expose
    var hotelServiceCharge: Double? = null

    @SerializedName("SportsServiceCharge")
    @Expose
    var sportsServiceCharge: Double? = null

    @SerializedName("TimeOut")
    @Expose
    var timeOut: Int? = null

    @SerializedName("FlightIsPercentage")
    @Expose
    var flightIsPercentage: Boolean? = null

    @SerializedName("HotelIsPercentage")
    @Expose
    var hotelIsPercentage: Boolean? = null

    @SerializedName("IsThirdParty")
    @Expose
    var isThirdParty: Boolean? = null

    @SerializedName("IsDefault")
    @Expose
    var default: Boolean? = null

    @SerializedName("KfhUrl")
    @Expose
    var kfhUrl: String? = null

    @SerializedName("CredimaxUrl")
    @Expose
    var credimaxUrl: String? = null
}