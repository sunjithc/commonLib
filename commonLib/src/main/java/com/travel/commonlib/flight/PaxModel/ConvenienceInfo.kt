package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ConvenienceInfo : Serializable {
    @SerializedName("ServiceCharge")
    @Expose
    var serviceCharge: Int? = null

    @SerializedName("IsPercentage")
    @Expose
    var percentage: Boolean? = null

    @SerializedName("PaymentId")
    @Expose
    var paymentId: Int? = null

    @SerializedName("PaymentName")
    @Expose
    var paymentName: String? = null
}