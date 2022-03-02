package com.travel.commonlib.transfer.TransfersGetPayment

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.travel.jumbo.InsuranceModel.Policy_Insurance
import java.io.Serializable

class TransfersPayment : Serializable {
    @SerializedName("StatusCode")
    @Expose
    var statusCode: Any? = null

    @SerializedName("Message")
    @Expose
    var message: Any? = null

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
    var isMobileApp: Boolean? = null

    @SerializedName("InsuranceBookingModel")
    @Expose
    var insuranceBookingModel: Policy_Insurance? = null

}