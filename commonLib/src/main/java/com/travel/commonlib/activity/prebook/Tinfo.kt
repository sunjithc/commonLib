package com.travel.commonlib.activity.prebook

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Tinfo : Serializable {
    @SerializedName("TransactionId")
    @Expose
    var transactionId: Long = 0

    @SerializedName("TransactionTypeDetailsId")
    @Expose
    var transactionTypeDetailsId: Long = 0

    @SerializedName("BookingId")
    @Expose
    var bookingId: Long = 0

    companion object {
        private const val serialVersionUID = -2452587908626193484L
    }
}