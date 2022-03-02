package com.travel.commonlib.activity.loyality
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class kangarooRewardPointModel {
    @SerializedName("UserId")
    @Expose
    var UserId : Int? = null

    @SerializedName("RewardUserID")
    @Expose
    var RewardUserID: String? = null

    @SerializedName("IsApplied")
    @Expose
    var IsApplied : Boolean? = false

    @SerializedName("Flag")
    @Expose
    var Flag: String? = null

    @SerializedName("TotalRewardPoints")
    @Expose
    var TotalRewardPoints : Int? = null

    @SerializedName("TotalRewardAmount")
    @Expose
    var TotalRewardAmount : Double? = null

    @SerializedName("KangarooRewardPoints")
    @Expose
    var KangarooRewardPoints : Int? = null

    @SerializedName("KangarooRewardCharge")
    @Expose
    var KangarooRewardCharge  : Double? = null

    @SerializedName("HasTotalRewardPoints")
    @Expose
    var HasTotalRewardPoints : Boolean? = false

    @SerializedName("ApplyId")
    @Expose
    var ApplyId : Int? = null

    @SerializedName("Id")
    @Expose
    var Id : Int? = null

    @SerializedName("AmountPerPoint")
    @Expose
    var AmountPerPoint : Double? = null

    @SerializedName("ActivityReference")
    @Expose
    var ActivityReference: String? = null

    @SerializedName("ModeCode")
    @Expose
    var ModeCode: String? = null

    @SerializedName("HotelApplyId")
    @Expose
    var HotelApplyId  : Int? = null

    @SerializedName("IsHotelApplied")
    @Expose
    var IsHotelApplied : Boolean? = false


    @SerializedName("KangarooHotelRewardCharge")
    @Expose
    var KangarooHotelRewardCharge : Double? = null

    @SerializedName("KangarooFlightRewardCharge")
    @Expose
    var KangarooFlightRewardCharge : Double? = null

    @SerializedName("PaymentGateWay")
    @Expose
    var PaymentGateWay : Int? = null

    @SerializedName("SearchId")
    @Expose
    var SearchId: String? = null

    @SerializedName("sKey")
    @Expose
    var sKey: String? = null

//    fun setIsApplied(isApplied: Boolean) {
//        isIsApplied = isApplied
//    }
//
//    fun setIsHotelApplied(isHotelApplied: Boolean) {
//        isIsHotelApplied = isHotelApplied
//    }
}
