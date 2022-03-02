package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class AirlineTax : Serializable {
    @SerializedName("TaxCode")
    @Expose
    var taxCode: String? = null

    @SerializedName("TaxAmount")
    @Expose
    var taxAmount = 0.0

    @SerializedName("TaxId")
    @Expose
    var taxId: Int? = null
}