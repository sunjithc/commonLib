package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ResbookingCode : Serializable {
    @SerializedName("segmentNo")
    @Expose
    var segmentNo: Int? = null

    @SerializedName("item")
    @Expose
    var item: String? = null
}