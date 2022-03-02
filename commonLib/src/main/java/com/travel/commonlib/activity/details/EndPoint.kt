package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class EndPoint : Serializable {
    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    companion object {
        private const val serialVersionUID = 5436124430297496082L
    }
}