package com.travel.commonlib.flight.PaymentSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaymentResults : Serializable {
    @SerializedName("SelectedPaymentId")
    @Expose
    var selectedPaymentId = 0

    @SerializedName("PaymentUrl")
    @Expose
    var paymentUrl = ""

    @SerializedName("CcAvenueDetails")
    @Expose
    var ccAvenueDetails: CcAvenueDetails? = null

    @SerializedName("PaymentForm")
    @Expose
    var paymentForm: String? = null
}