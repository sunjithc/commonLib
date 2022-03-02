package com.travel.commonlib.flight.SeatModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SeatPrice : Serializable {
    @SerializedName("TotalAmount")
    @Expose
    var totalAmount = 0.0

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("ActualTotalAmount")
    @Expose
    var actualTotalAmount = 0.0

    @SerializedName("ActualCurrency")
    @Expose
    var actualCurrency: Any? = null
}