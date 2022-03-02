package com.travel.commonlib.flight.PaxSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class LoyaltyRedeemPoint : Serializable {
    @SerializedName("UserId")
    @Expose
    var userId: Int? = null

    @SerializedName("IsApplied")
    @Expose
    var applied: Boolean? = null

    @SerializedName("Flag")
    @Expose
    var flag: Int? = null

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

    @SerializedName("MaxRedeemablePercent")
    @Expose
    var maxRedeemablePercent: Int? = null
}