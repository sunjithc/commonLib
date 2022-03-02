package com.travel.commonlib.activity.loyality

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class LoyaltyModel : Serializable {
    @SerializedName("StatusCode")
    @Expose
    var statusCode: String? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("Data")
    @Expose
    var data: Data? = null

    @SerializedName("IsMobileApp")
    @Expose
    var isMobileApp = false

    @SerializedName("ValidationMessage")
    @Expose
    var validationMessage: String? = null

    @SerializedName("AgencyInsufficientBalance")
    @Expose
    var isAgencyInsufficientBalance = false

    @SerializedName("vResponse")
    @Expose
    var v_Response: Any? = null

    class Data {
        @SerializedName("UserId")
        @Expose
        var userId = 0

        @SerializedName("IsApplied")
        @Expose
        var isApplied = false

        @SerializedName("Flag")
        @Expose
        var flag = 0

        @SerializedName("LoyaltyPoints")
        @Expose
        var loyaltyPoints = 0.0

        @SerializedName("LoyaltyValue")
        @Expose
        var loyaltyValue = 0.0

        @SerializedName("RedeemPoints")
        @Expose
        var redeemPoints = 0.0

        @SerializedName("RedeemValue")
        @Expose
        var redeemValue = 0.0

        @SerializedName("Message")
        @Expose
        var message: String? = null
    }
}