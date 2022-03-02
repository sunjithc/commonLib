package com.travel.commonlib.flight

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 5/10/2021.
 */
class PushData : Serializable {
    @SerializedName("Amount")
    @Expose
    var amount: String? = null

    @SerializedName("Date")
    @Expose
    var date: String? = null

    @SerializedName("PassengerName")
    @Expose
    var passengerName: String? = null

    @SerializedName("Email")
    @Expose
    var email: String? = null

    @SerializedName("MobileNo")
    @Expose
    var mobileNo: String? = null

    @SerializedName("TransactionDetailId")
    @Expose
    var transactionDetailId: String? = null

    @SerializedName("PaymentGatewayId")
    @Expose
    var paymentGatewayId = 0

    @SerializedName("TransactionId")
    @Expose
    var transactionId: String? = null

    @SerializedName("Culture")
    @Expose
    var culture: String? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("Source")
    @Expose
    var source: String? = null

    @SerializedName("Destination")
    @Expose
    var destination: String? = null

    @SerializedName("DepartureDate")
    @Expose
    var departureDate: String? = null

    @SerializedName("ArrivalDate")
    @Expose
    var arrivalDate: String? = null

    @SerializedName("PassengerCount")
    @Expose
    var passengerCount: String? = null

    @SerializedName("PreferredAirline")
    @Expose
    var preferredAirline: String? = null

    @SerializedName("SearchType")
    @Expose
    var searchType: String? = null

    @SerializedName("DirectFlight")
    @Expose
    var directFlight: String? = null
}