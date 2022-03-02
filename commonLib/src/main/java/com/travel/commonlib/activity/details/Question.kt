package com.travel.commonlib.activity.details

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
    var required: Boolean? = null

    @SerializedName("answer")
    @Expose
    var answer: String? = null

    @SerializedName("ModeCode")
    @Expose
    var modeCode: String? = null

    @SerializedName("CartId")
    @Expose
    var cartId = 0

    @SerializedName("Title")
    @Expose
    var title: String? = null
}