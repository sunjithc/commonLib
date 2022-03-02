package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Comment : Serializable {
    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("Text")
    @Expose
    var text: String? = null

    companion object {
        private const val serialVersionUID = -5839748241541105466L
    }
}