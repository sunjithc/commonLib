package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CheckInList : Serializable {
    @SerializedName("Text")
    @Expose
    var text: String? = null

    @SerializedName("Value")
    @Expose
    var value: String? = null

    @SerializedName("Selected")
    @Expose
    var isSelected = false

    @SerializedName("Price")
    @Expose
    var price = 0.0

    @SerializedName("Currency")
    @Expose
    var currency: String? = null
}