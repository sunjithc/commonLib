package com.travel.commonlib.activity.getpayment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaymentGateway : Serializable {
    @SerializedName("PaymentId")
    @Expose
    var paymentId: Int = 0

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
    var isIsPercentage = false
        private set

    @SerializedName("TimeOut")
    @Expose
    var timeOut: Long = 0

    @SerializedName("IsActive")
    @Expose
    var isIsActive = false
        private set

    @SerializedName("PaymentGateWayId")
    @Expose
    var paymentGateWayId: Long = 0

    @SerializedName("KfhUrl")
    @Expose
    var kfhUrl: String? = null

    @SerializedName("CredimaxUrl")
    @Expose
    var credimaxUrl: String? = null

    @SerializedName("ConvertionRatio")
    @Expose
    var convertionRatio = 0.0

    @SerializedName("CheckoutPublicKey")
    @Expose
    var checkoutPublicKey: String? = null

    @SerializedName("IsThirdParty")
    @Expose
    var isIsThirdParty = false


    @SerializedName("IsDefault")
    @Expose
    var isIsDefault = false


    @SerializedName("CardTypeBasedCharges")
    @Expose
    var cardTypeBasedCharges: List<Any>? = null
    fun setIsPercentage(isPercentage: Boolean) {
        isIsPercentage = isPercentage
    }

    fun setIsActive(isActive: Boolean) {
        isIsActive = isActive
    }



    companion object {
        private const val serialVersionUID = 5188413091673313589L
    }
}