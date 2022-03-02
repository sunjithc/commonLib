package com.travel.commonlib.activity.prebook

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Supplier : Serializable {
    @SerializedName("VatNumber")
    @Expose
    var vatNumber: String? = null

    @SerializedName("VatName")
    @Expose
    var vatName: String? = null

    companion object {
        private const val serialVersionUID = 811410178062805271L
    }
}