package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BaggageFee : Serializable {

    @SerializedName("Amount")
    @Expose
    private val amount = 0.0

    @SerializedName("EquivalentAmount")
    @Expose
    private val equivalentAmount = 0.0

    @SerializedName("EquivalentTotalAmount")
    @Expose
    private val equivalentTotalAmount = 0.0

    @SerializedName("Currency")
    @Expose
    private val currency = ""

    @SerializedName("EquivalentCurrency")
    @Expose
    private val equivalentCurrency = ""

    @SerializedName("MinimumSurcharge")
    @Expose
    private val minimumSurcharge = 0

    @SerializedName("EquivalentMinimumSurcharge")
    @Expose
    private val equivalentMinimumSurcharge = 0

    @SerializedName("IsForEachPassenger")
    @Expose
    private val isForEachPassenger = false

    @SerializedName("IsForEachSegment")
    @Expose
    private val isForEachSegment = false

    @SerializedName("SeatMarkup")
    @Expose
    private val seatMarkup = 0

}