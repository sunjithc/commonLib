package com.travel.commonlib.flight.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class InsuranceResponse : Serializable {
    @SerializedName("StatusCode")
    @Expose
    var statusCode: String? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("Data")
    @Expose
    var data: InsuranceData? = null

    @SerializedName("vResponse")
    @Expose
    var vResponse: Any? = null

    @SerializedName("AgencyInsufficientBalance")
    @Expose
    var agencyInsufficientBalance: Boolean? = null

    @SerializedName("ValidationMessage")
    @Expose
    var validationMessage: Any? = null

    @SerializedName("IsMobileApp")
    @Expose
    var isMobileApp: Boolean? = null

    @SerializedName("IsMilespointAvailable")
    @Expose
    var isMilespointAvailable: Boolean? = null

    @SerializedName("MilespointMessage")
    @Expose
    var milespointMessage: Any? = null

}