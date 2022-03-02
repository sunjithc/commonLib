package com.travel.commonlib.InsuranceModel

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable


/**
 * Created by Rohith (Android) on 11/23/2021.
 */
class InsuranceExtensionResponse:Serializable {
    @SerializedName("ValidityDays")
    @Expose
    var validityDays: String? = null

    @SerializedName("DayValue")
    @Expose
    var dayValue: Int? = null
}