package com.travel.commonlib.activity.getpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Question : Serializable {
    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Question")
    @Expose
    var question: String? = null

    @SerializedName("IsRequired")
    @Expose
    var isIsRequired = false
        private set
    var answer: String? = null
    fun setIsRequired(isRequired: Boolean) {
        isIsRequired = isRequired
    }
}