package com.travel.commonlib.activity.setpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaxData : Serializable {
    @SerializedName("Paxinfo")
    @Expose
    var paxinfo: List<PaxSinfo>? = null

    @SerializedName("Summary")
    @Expose
    var summary: Any? = null

    @SerializedName("CommonInfo")
    @Expose
    var commonInfo: Any? = null

    @SerializedName("IsLoggedIn")
    @Expose
    var isIsLoggedIn = false
        private set

    @SerializedName("SearchId")
    @Expose
    var searchId: Any? = null
    fun setIsLoggedIn(isLoggedIn: Boolean) {
        isIsLoggedIn = isLoggedIn
    }

    companion object {
        private const val serialVersionUID = -5774431105050035814L
    }
}