package com.travel.commonlib.flight.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PolicyBenefit : Serializable {
    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("Amount")
    @Expose
    var amount: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null
}