package com.travel.commonlib.activity.getpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Data : Serializable {
    @SerializedName("Paxinfo")
    @Expose
    var paxinfo: List<Paxinfo>? = null

    @SerializedName("Summary")
    @Expose
    var summary: Summary? = null

    @SerializedName("CommonInfo")
    @Expose
    var commonInfo: CommonInfo? = null

    @SerializedName("IsLoggedIn")
    @Expose
    var isIsLoggedIn = false
        private set

    @SerializedName("SearchId")
    @Expose
    var searchId: String? = null
    fun setIsLoggedIn(isLoggedIn: Boolean) {
        isIsLoggedIn = isLoggedIn
    }

    companion object {
        private const val serialVersionUID = -385759085834615891L
    }
}