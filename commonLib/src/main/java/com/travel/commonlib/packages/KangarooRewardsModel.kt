package com.travel.commonlib.packages

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class KangarooRewardsModel {
    @SerializedName("UserId")
    @Expose
    var userId = 0

    @SerializedName("RewardUserID")
    @Expose
    var rewardUserID: String? = null

    @SerializedName("IsApplied")
    @Expose
    var isApplied = false

    @SerializedName("Flag")
    @Expose
    var flag: String? = null

    @SerializedName("TotalRewardPoints")
    @Expose
    var totalRewardPoints = 0

    @SerializedName("TotalRewardAmount")
    @Expose
    var totalRewardAmount = 0.0

    @SerializedName("KangarooRewardPoints")
    @Expose
    var kangarooRewardPoints = 0

    @SerializedName("KangarooRewardCharge")
    @Expose
    var kangarooRewardCharge = 0.0

    @SerializedName("HasTotalRewardPoints")
    @Expose
    var hasTotalRewardPoints = false

    @SerializedName("ApplyId")
    @Expose
    var applyId = 0

    @SerializedName("Id")
    @Expose
    var id = 0

    @SerializedName("AmountPerPoint")
    @Expose
    var amountPerPoint = 0.0

    @SerializedName("IsHotelApplied")
    @Expose
    var isHotelApplied = false

    @SerializedName("KangarooHotelRewardCharge")
    @Expose
    var kangarooHotelRewardCharge = 0.0
    @SerializedName("KangarooFlightRewardCharge")
    @Expose
    var kangarooFlightRewardCharge = 0.0

    @SerializedName("HotelApplyId")
    @Expose
    var hotelApplyId = 0

    @SerializedName("PaymentGateWay")
    @Expose
    var paymentGateWay = 0
}