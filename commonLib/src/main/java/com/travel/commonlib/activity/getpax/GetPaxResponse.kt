package com.travel.commonlib.activity.getpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class GetPaxResponse : Serializable {
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
    private var vResponse: String? = null

    @SerializedName("AgencyInsufficientBalance")
    @Expose
    var isAgencyInsufficientBalance = false

    @SerializedName("ValidationMessage")
    @Expose
    var validationMessage: String? = null

    @SerializedName("IsMobileApp")
    @Expose
    var isIsMobileApp = false
        private set

    @SerializedName("IsMilespointAvailable")
    @Expose
    var isIsMilespointAvailable = false
        private set

    @SerializedName("MilespointMessage")
    @Expose
    var milespointMessage: String? = null
    fun getvResponse(): String? {
        return vResponse
    }

    fun setvResponse(vResponse: String?) {
        this.vResponse = vResponse
    }

    fun setIsMobileApp(isMobileApp: Boolean) {
        isIsMobileApp = isMobileApp
    }

    fun setIsMilespointAvailable(isMilespointAvailable: Boolean) {
        isIsMilespointAvailable = isMilespointAvailable
    }

    companion object {
        private const val serialVersionUID = -440641156587830927L
    }
}