package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RateInfo : Serializable {
    @SerializedName("RateKey")
    @Expose
    var rateKey: String? = null

    @SerializedName("WorkingDays")
    @Expose
    var workingDays: List<WorkingDay>? = null

    @SerializedName("CompanyQuote")
    @Expose
    var companyQuote: List<CompanyQuote>? = null

    @SerializedName("TotalAmount")
    @Expose
    var totalAmount = 0.0

    companion object {
        private const val serialVersionUID = 5147691432113628453L
    }
}