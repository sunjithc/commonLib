package com.travel.commonlib.activity.setpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class TransactionData : Serializable {
    @SerializedName("TransactionType")
    @Expose
    var transactionType: Long = 0

    @SerializedName("TransactionID")
    @Expose
    var transactionID: Long = 0

    @SerializedName("TransactiontypeDetailsID")
    @Expose
    var transactiontypeDetailsID: Long = 0

    @SerializedName("BookingID")
    @Expose
    var bookingID: Long = 0

    @SerializedName("PaymentId")
    @Expose
    var paymentId: Long = 0

    @SerializedName("PassengerId")
    @Expose
    var passengerId: Long = 0

    @SerializedName("MainTransID")
    @Expose
    var mainTransID: Long = 0

    @SerializedName("InsuranceBookingId")
    @Expose
    var insuranceBookingId: Long = 0

    @SerializedName("InsuranceTransactionTypeDetailId")
    @Expose
    var insuranceTransactionTypeDetailId: Long = 0

    @SerializedName("InsuranceTransactionId")
    @Expose
    var insuranceTransactionId: Long = 0

    companion object {
        private const val serialVersionUID = -8983012070993040958L
    }
}