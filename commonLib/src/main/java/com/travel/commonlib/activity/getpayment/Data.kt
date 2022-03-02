package com.travel.commonlib.activity.getpayment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Data : Serializable {
    @SerializedName("TotalAmount")
    @Expose
    var totalAmount = 0.0

    @SerializedName("BaseFare")
    @Expose
    var baseFare = 0.0

    @SerializedName("Discount")
    @Expose
    var discount = 0.0

    @SerializedName("Markup")
    @Expose
    var markup = 0.0

    @SerializedName("SearchId")
    @Expose
    var searchId: String? = null

    @SerializedName("PaymentGateways")
    @Expose
    var paymentGateways: List<PaymentGateway>? = null

    @SerializedName("GstvatAmount")
    @Expose
    var gstvatAmount = 0.0

    companion object {
        private const val serialVersionUID = -8085235515641887390L
    }
}