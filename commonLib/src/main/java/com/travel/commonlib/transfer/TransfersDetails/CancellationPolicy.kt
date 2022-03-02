package com.travel.commonlib.transfer.TransfersDetails

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class CancellationPolicy : Serializable {
    @SerializedName("charge")
    @Expose
    var charge: Boolean? = null

    @SerializedName("chargeAmount")
    @Expose
    var chargeAmount: Double? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("FromDate")
    @Expose
    var fromDate: String? = null

    @SerializedName("ToDate")
    @Expose
    var toDate: Any? = null

    @SerializedName("FreeCancellationEndDate")
    @Expose
    var freeCancellationEndDate: String? = null
}