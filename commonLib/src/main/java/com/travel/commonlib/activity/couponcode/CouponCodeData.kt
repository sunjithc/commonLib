package com.travel.commonlib.activity.couponcode

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CouponCodeData {
    @SerializedName("DiscountAmt")
    @Expose
    var discountAmt = 0.0

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("IsApplied")
    @Expose
    var isApplied = false

    @SerializedName("IsBinSpecific")
    @Expose
    var isBinSpecific = false

    @SerializedName("BinSeries")
    @Expose
    var binSeries: String? = null

    @SerializedName("CouponCode")
    @Expose
    var couponCode: String? = null

    @SerializedName("IsDiscountAppliedCompletely")
    @Expose
    var isDiscountAppliedCompletely = false

    @SerializedName("AlertMessage")
    @Expose
    var alertMessage: String? = null

    @SerializedName("successMessageEn")
    @Expose
    var successMessageEn: String? = null

    @SerializedName("successMessageAr")
    @Expose
    var successMessageAr: String? = null

    @SerializedName("MobileCode")
    @Expose
    var mobileCode: String? = null

    @SerializedName("PhoneNumber")
    @Expose
    var phoneNumber: String? = null

    @SerializedName("Email")
    @Expose
    var email: String? = null

    @SerializedName("PaymentGatewayId")
    @Expose
    var paymentGatewayId: String? = null

    @SerializedName("InvalidCouponCode")
    @Expose
    var isInvalidCouponCode = false
}