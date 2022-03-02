package com.travel.commonlib.packages

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class PackagePaxSubmitResponse {
    @SerializedName("StatusCode")
    @Expose
    var statusCode: String? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("Data")
    @Expose
    var data : PackagePaxSubmitData? = null

    @SerializedName("AgencyInsufficientBalance")
    @Expose
    var agencyInsufficientBalance = false

    @SerializedName("IsMobileApp")
    @Expose
    var isMobileApp = false

    @SerializedName("IsMilespointAvailable")
    @Expose
    var isMilespointAvailable = false
}