package com.travel.commonlib.activity.getpayment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.InsuranceModel.Policy_Insurance
import java.io.Serializable

class GetPaymentResponse : Serializable {
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

    @SerializedName("InsuranceBookingModel")
    @Expose
    var insuranceBookingModel: Policy_Insurance? = null

    companion object {
        private const val serialVersionUID = 2876378042912682300L
    }
}