package com.travel.commonlib.transfer.TransferResult

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class GeneralInfo : Serializable {
    @SerializedName("Infocode")
    @Expose
    var infocode: String? = null

    @SerializedName("Infovalue")
    @Expose
    var infovalue: String? = null
}