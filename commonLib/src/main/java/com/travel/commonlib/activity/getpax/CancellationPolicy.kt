package com.travel.commonlib.activity.getpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CancellationPolicy : Serializable {
    @SerializedName("FromDate")
    @Expose
    var fromDate: String? = null

    @SerializedName("CustomDate")
    @Expose
    var customDate: String? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("Amount")
    @Expose
    var amount = 0.0

    companion object {
        private const val serialVersionUID = -4686163958221891544L
    }
}