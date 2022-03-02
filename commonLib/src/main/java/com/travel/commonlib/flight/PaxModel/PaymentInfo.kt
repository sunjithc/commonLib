package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaymentInfo : Serializable {
    @SerializedName("PaymentId")
    @Expose
    var paymentId: Int? = null

    @SerializedName("PaymentName")
    @Expose
    var paymentName: String? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("ServiceCharge")
    @Expose
    var serviceCharge = 0.0

    @SerializedName("IsPercentage")
    @Expose
    var percentage: Boolean? = null

    @SerializedName("TimeOut")
    @Expose
    var timeOut: Int? = null

    @SerializedName("IsActive")
    @Expose
    var active: Boolean? = null

    @SerializedName("PaymentGateWayId")
    @Expose
    var paymentGateWayId: Int? = null

    @SerializedName("KfhUrl")
    @Expose
    var kfhUrl: String? = null

    @SerializedName("ConvertionRatio")
    @Expose
    var convertionRatio: Int? = null

    @SerializedName("CheckoutPublicKey")
    @Expose
    var checkoutPublicKey: String? = null

    @SerializedName("IsThirdParty")
    @Expose
    var thirdParty: Boolean? = null

    @SerializedName("IsDefault")
    @Expose
    var default: Boolean? = null

    @SerializedName("CardTypeBasedCharges")
    @Expose
    var cardTypeBasedCharges: List<Any>? = null
}