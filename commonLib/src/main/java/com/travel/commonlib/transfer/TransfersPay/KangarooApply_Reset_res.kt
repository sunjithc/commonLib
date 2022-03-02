package com.travel.commonlib.transfer.TransfersPay

import java.io.Serializable
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import com.travel.jumbo.Flight.Models.PaxSubmitModel.KangarooRewardPoint

/**
 * Created by Rohith (Android) on 8/30/2021.
 */
class KangarooApply_Reset_res : Serializable {
    @SerializedName("StatusCode")
    @Expose
    var statusCode: String? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("Data")
    @Expose
    var data: KangarooRewardPoint? = null

    @SerializedName("AgencyInsufficientBalance")
    @Expose
    var agencyInsufficientBalance: Boolean? = null

    @SerializedName("IsMobileApp")
    @Expose
    var isMobileApp: Boolean? = null

    @SerializedName("IsMilespointAvailable")
    @Expose
    var isMilespointAvailable: Boolean? = null
}