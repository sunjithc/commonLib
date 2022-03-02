package com.travel.commonlib.activity.prebook

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ExtVoucher : Serializable {
    @SerializedName("Code")
    @Expose
    var code: Any? = null

    @SerializedName("Url")
    @Expose
    var url: Any? = null

    companion object {
        private const val serialVersionUID = 3520173267230395568L
    }
}