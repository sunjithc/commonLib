package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ActivityDatum : Serializable {
    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("Questions")
    @Expose
    var questions: List<Question>? = null

    @SerializedName("Comments")
    @Expose
    var comments: List<Comment>? = null

    @SerializedName("Rate")
    @Expose
    var rate: Rate? = null

    @SerializedName("ModeCode")
    @Expose
    var modeCode: String? = null

    companion object {
        private const val serialVersionUID = 6221291586684506841L
    }
}