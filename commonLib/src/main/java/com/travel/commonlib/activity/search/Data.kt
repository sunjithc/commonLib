package com.travel.commonlib.activity.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Data : Serializable {
    @SerializedName("Activities")
    @Expose
    var activities: List<ActivityData>? = null

    @SerializedName("CommonInfo")
    @Expose
    var commonInfo: CommonInfo? = null

    companion object {
        private const val serialVersionUID = 3639785642698264331L
    }
}