package com.travel.commonlib.transfer.TransfersGetPax

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class TransfersPax : Serializable {
    @SerializedName("StatusCode")
    @Expose
    var statusCode: String? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("Data")
    @Expose
    var data: Data? = null

    @SerializedName("vResponse")
    @Expose
    private var vResponse: Any? = null

    @SerializedName("AgencyInsufficientBalance")
    @Expose
    var agencyInsufficientBalance: Boolean? = null

    @SerializedName("ValidationMessage")
    @Expose
    var validationMessage: Any? = null

    @SerializedName("IsMobileApp")
    @Expose
    var mobileApp: Boolean? = null
    fun getvResponse(): Any? {
        return vResponse
    }

    fun setvResponse(vResponse: Any?) {
        this.vResponse = vResponse
    }
}