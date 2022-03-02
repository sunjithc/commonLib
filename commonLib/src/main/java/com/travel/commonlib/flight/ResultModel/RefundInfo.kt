package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class RefundInfo : Serializable {
    @SerializedName("Value")
    @Expose
    var value: Int? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null
}