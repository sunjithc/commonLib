package com.travel.commonlib.flight.InsuranceModel

import java.io.Serializable
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class InsCountryModel :Serializable{
    @SerializedName("Code")
    @Expose
    var code: Double? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

}
