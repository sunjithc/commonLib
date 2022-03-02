package com.travel.commonlib.transfer.TransferResult

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Contract : Serializable {
    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("IncomingOfficeCode")
    @Expose
    var incomingOfficeCode: String? = null

    @SerializedName("Sequence")
    @Expose
    var sequence: Any? = null
}