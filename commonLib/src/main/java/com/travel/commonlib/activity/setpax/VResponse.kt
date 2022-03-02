package com.travel.commonlib.activity.setpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class VResponse : Serializable {
    @SerializedName("IsSuspect")
    @Expose
    var isIsSuspect = false
        private set

    @SerializedName("vResponse")
    @Expose
    private var vResponse: Any? = null
    fun setIsSuspect(isSuspect: Boolean) {
        isIsSuspect = isSuspect
    }

    fun getvResponse(): Any? {
        return vResponse
    }

    fun setvResponse(vResponse: Any?) {
        this.vResponse = vResponse
    }

    companion object {
        private const val serialVersionUID = -4127516066164096442L
    }
}