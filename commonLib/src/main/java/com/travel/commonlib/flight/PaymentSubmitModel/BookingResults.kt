package com.travel.commonlib.flight.PaymentSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BookingResults : Serializable {
    @SerializedName("TransactionDetails")
    @Expose
    var transactionDetails: Any? = null

    @SerializedName("TransactionId")
    @Expose
    var transactionId: Int? = null

    @SerializedName("UserTransactionId")
    @Expose
    var userTransactionId: Any? = null

    @SerializedName("BookingPnr")
    @Expose
    var bookingPnr: Any? = null

    @SerializedName("AirpricingInfoReference")
    @Expose
    var airpricingInfoReference: Any? = null

    @SerializedName("AirReserLocatorCode")
    @Expose
    var airReserLocatorCode: Any? = null

    @SerializedName("DateOfCreation")
    @Expose
    var dateOfCreation: Any? = null

    @SerializedName("UniversalRecord")
    @Expose
    var universalRecord: Any? = null

    @SerializedName("BookedCurrency")
    @Expose
    var bookedCurrency: Any? = null

    @SerializedName("BookedTotalFare")
    @Expose
    var bookedTotalFare: Double? = null

    @SerializedName("Passengers")
    @Expose
    var passengers: List<Any>? = null

    @SerializedName("FlightBookingId")
    @Expose
    var flightBookingId: Int? = null

    @SerializedName("PaymentDetailId")
    @Expose
    var paymentDetailId: Int? = null

    @SerializedName("TransactionTypeDetailId")
    @Expose
    var transactionTypeDetailId: Int? = null

    @SerializedName("lstSegCountDetails")
    @Expose
    var lstSegCountDetails: Any? = null

    @SerializedName("FareChangeIndicator")
    @Expose
    var fareChangeIndicator: Boolean? = null

    @SerializedName("InsuranceBookingId")
    @Expose
    var insuranceBookingId: Int? = null

    @SerializedName("LastTicketDate")
    @Expose
    var lastTicketDate: Any? = null

    @SerializedName("MainTransactionId")
    @Expose
    var mainTransactionId: Int? = null

    @SerializedName("SecurityToken")
    @Expose
    var securityToken: Any? = null
}