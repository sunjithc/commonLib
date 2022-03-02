package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Segment : Serializable {
    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

    companion object {
        private const val serialVersionUID = -6254637438438675656L
    }
}