package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Rate : Serializable {
    @SerializedName("RateCode")
    @Expose
    var rateCode: String? = null

    @SerializedName("RateInfo")
    @Expose
    var rateInfo: RateInfo? = null

    companion object {
        private const val serialVersionUID = 4978829680294359340L
    }
}