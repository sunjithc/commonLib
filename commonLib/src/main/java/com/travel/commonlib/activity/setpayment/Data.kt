package com.travel.commonlib.activity.setpayment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Data : Serializable {
    @SerializedName("PaymentResults")
    @Expose
    var paymentResults: PaymentResults? = null

    companion object {
        private const val serialVersionUID = 1298663312344643188L
    }
}