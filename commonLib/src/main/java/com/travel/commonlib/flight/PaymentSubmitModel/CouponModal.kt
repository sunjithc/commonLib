package com.travel.commonlib.flight.PaymentSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.jumbo.utilities.CommonFunctions

import java.io.Serializable

/**
 * Created by Rohith (Android) on 10/30/2020.
 */
class CouponModal : Serializable {
    @SerializedName("UserId")
    @Expose
    var userId: Int? = null

    @SerializedName("TransactionType")
    @Expose
    var transactionType = 0

    @SerializedName("CouponCodeApplyID")
    @Expose
    var couponCodeApplyID: Int? = null

    @SerializedName("TransactionId")
    @Expose
    var transactionId: Int? = null

    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Flag")
    @Expose
    var flag: String? = null

    @SerializedName("Status")
    @Expose
    var status: Any? = null

    @SerializedName("discount")
    @Expose
    var discount: Double? = null

    @SerializedName("Ispercentage")
    @Expose
    var ispercentage: Boolean? = null

    @SerializedName("isCouponCode")
    @Expose
    private var isCouponCode: Boolean? = null

    @SerializedName("CouponCode")
    @Expose
    private var couponCode: String? = null

    @SerializedName("successMessageEn")
    @Expose
    var successMessageEn: String? = null

    @SerializedName("successMessageAr")
    @Expose
    var successMessageAr: String? = null

    @SerializedName("isBinEnable")
    @Expose
    var binEnable: Boolean? = null

    @SerializedName("selectedBinSeries")
    @Expose
    var selectedBinSeries: Any? = null

    @SerializedName("IsBasefareInclude")
    @Expose
    var basefareInclude: Boolean? = null

    @SerializedName("IsTaxInclude")
    @Expose
    var taxInclude: Boolean? = null

    @SerializedName("CouponLimitAmount")
    @Expose
    var couponLimitAmount: String? = null

    @SerializedName("MobileCode")
    @Expose
    var mobileCode: String? = null

    @SerializedName("PhoneNumber")
    @Expose
    var phoneNumber: String? = null

    @SerializedName("Email")
    @Expose
    var email: Any? = null

    @SerializedName("PaymentGatewayId")
    @Expose
    var paymentGatewayId: String? = null

    @SerializedName("IsLoggedIn")
    @Expose
    var isLoggedIn: String? = null

    @SerializedName("ModalityId")
    @Expose
    var modalityId = 0

    @SerializedName("IsBinSpecific")
    @Expose
    var isBinSpecific = false

    @SerializedName("DiscountAmt")
    @Expose
    var discountAmt = 0.0

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("IsApplied")
    @Expose
    var isApplied = false

    @SerializedName("BinSeries")
    @Expose
    var binSeries: Any? = null

    @SerializedName("IsDiscountAppliedCompletely")
    @Expose
    var isDiscountAppliedCompletely = false

    @SerializedName("AlertMessage")
    @Expose
    var alertMessage: String? = null

    @SerializedName("InvalidCouponCode")
    @Expose
    var isInvalidCouponCode = false
    fun setCouponCode(couponCode: Boolean?) {
        isCouponCode = couponCode
    }

    fun getIsBinSpecific(): Boolean {
        return isBinSpecific
    }

    fun setIsBinSpecific(isBinSpecific: Boolean) {
        this.isBinSpecific = isBinSpecific
    }

    fun getCouponCode(): String? {
        return couponCode
    }

    fun setCouponCode(couponCode: String?) {
        this.couponCode = couponCode
    }

    fun IsCouponCode(): Boolean? {
        return isCouponCode
    }

    fun setIsCouponCode(couponCode: Boolean?) {
        isCouponCode = couponCode
    }

    fun getMessage(): String? {
        return when (CommonFunctions.lang) {
            "ar" -> successMessageAr
            "en" -> successMessageEn
            else -> successMessageEn
        }
    }
}