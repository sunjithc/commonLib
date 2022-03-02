package com.travel.commonlib.flight

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.PaymentSubmitModel.CouponModal
import java.io.Serializable

/**
 * Created by Rohith (Android) on 5/10/2021.
 */
class CouponCodeRes : Serializable {
    @SerializedName("StatusCode")
    @Expose
    var statusCode: String? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("Data")
    @Expose
    var couponCodeData: CouponModal? = null

    @SerializedName("AgencyInsufficientBalance")
    @Expose
    var isAgencyInsufficientBalance = false

    @SerializedName("ValidationMessage")
    @Expose
    var validationMessage: String? = null

    @SerializedName("IsMobileApp")
    @Expose
    var isMobileApp = false
}