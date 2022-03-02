package com.travel.commonlib.flight.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class InsuranceData : Serializable {
    @SerializedName("Policies")
    @Expose
    var policies: ArrayList<Policy_Insurance>? = null

    @SerializedName("ErrorInfo")
    @Expose
    var errorInfo: Any? = null
}