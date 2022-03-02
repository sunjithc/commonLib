package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SupInfo : Serializable {
    @SerializedName("VatName")
    @Expose
    var vatName: Any? = null

    @SerializedName("VatNumber")
    @Expose
    var vatNumber: Any? = null

    companion object {
        private const val serialVersionUID = -4060676214566730147L
    }
}