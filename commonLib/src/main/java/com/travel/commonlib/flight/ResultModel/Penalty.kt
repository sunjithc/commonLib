package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Penalty : Serializable {
    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("Applicability")
    @Expose
    var applicability: String? = null

    @SerializedName("Changeable")
    @Expose
    var changeable: Boolean? = null

    @SerializedName("ConditionsApply")
    @Expose
    var conditionsApply: Boolean? = null

    @SerializedName("Amount")
    @Expose
    var amount = 0.0

    @SerializedName("CurrencyCode")
    @Expose
    var currencyCode: String? = null

    @SerializedName("DecimalPlaces")
    @Expose
    var decimalPlaces: Int? = null

    @SerializedName("Refundable")
    @Expose
    var refundable: Boolean? = null

    @SerializedName("IsPercentage")
    @Expose
    var percentage = false
}