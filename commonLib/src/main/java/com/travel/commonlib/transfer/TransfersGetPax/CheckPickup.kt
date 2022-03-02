package com.travel.commonlib.transfer.TransfersGetPax

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class CheckPickup : Serializable {
    @SerializedName("mustCheckPickupTime")
    @Expose
    var mustCheckPickupTime: Boolean? = null

    @SerializedName("url")
    @Expose
    var url: Any? = null

    @SerializedName("hoursBeforeConsulting")
    @Expose
    var hoursBeforeConsulting: Int? = null
}