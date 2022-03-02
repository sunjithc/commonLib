package com.travel.commonlib.flight.PaxSubmitModel

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

/**
 * Created by Rohith (Android) on 8/17/2021.
 */
class KangarooRewardPoint : Serializable {
    @SerializedName("UserId")
    @Expose
    var userId: Int? = null

    @SerializedName("RewardUserID")
    @Expose
    var rewardUserID: String? = null

    @SerializedName("IsApplied")
    @Expose
    var applied: Boolean? = null

    @SerializedName("Flag")
    @Expose
    var flag: Any? = null

    @SerializedName("TotalRewardPoints")
    @Expose
    var totalRewardPoints: Int? = null

    @SerializedName("TotalRewardAmount")
    @Expose
    var totalRewardAmount: Double? = null

    @SerializedName("KangarooRewardPoints")
    @Expose
    var kangarooRewardPoints: Int? = null

    @SerializedName("KangarooRewardCharge")
    @Expose
    var kangarooRewardCharge: Double? = null

    @SerializedName("HasTotalRewardPoints")
    @Expose
    var hasTotalRewardPoints: Boolean? = null

    @SerializedName("ApplyId")
    @Expose
    var applyId: Int? = null

    @SerializedName("Id")
    @Expose
    var id: Int? = null

    @SerializedName("AmountPerPoint")
    @Expose
    var amountPerPoint: Double? = null

    @SerializedName("HotelApplyId")
    @Expose
    var hotelApplyId: Int? = null

    @SerializedName("IsHotelApplied")
    @Expose
    var hotelApplied: Boolean? = null

    @SerializedName("KangarooHotelRewardCharge")
    @Expose
    var kangarooHotelRewardCharge: Int? = null

    @SerializedName("KangarooFlightRewardCharge")
    @Expose
    var kangarooFlightRewardCharge: Int? = null

    @SerializedName("PaymentGateWay")
    @Expose
    var paymentGateWay: Int? = null
}