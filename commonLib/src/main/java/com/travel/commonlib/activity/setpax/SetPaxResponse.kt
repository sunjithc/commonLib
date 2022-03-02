package com.travel.commonlib.activity.setpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SetPaxResponse : Serializable {
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
    var isAgencyInsufficientBalance = false

    @SerializedName("ValidationMessage")
    @Expose
    var validationMessage: Any? = null

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
    var milespointMessage: Any? = null
    fun getvResponse(): Any? {
        return vResponse
    }

    fun setvResponse(vResponse: Any?) {
        this.vResponse = vResponse
    }

    fun setIsMobileApp(isMobileApp: Boolean) {
        isIsMobileApp = isMobileApp
    }

    fun setIsMilespointAvailable(isMilespointAvailable: Boolean) {
        isIsMilespointAvailable = isMilespointAvailable
    }

    companion object {
        private const val serialVersionUID = -7792228036343402210L
    }
}