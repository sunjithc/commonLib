package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Data : Serializable {
    @SerializedName("ActivityInfo")
    @Expose
    var activityInfo: ActivityInfo? = null

    @SerializedName("CommonInfo")
    @Expose
    var commonInfo: CommonInfo? = null

    @SerializedName("TokenTime")
    @Expose
    var tokenTime: String? = null

    companion object {
        private const val serialVersionUID = -5790554487305980787L
    }
}