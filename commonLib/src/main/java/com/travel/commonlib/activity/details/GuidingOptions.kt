package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class GuidingOptions : Serializable {
    @SerializedName("GuideType")
    @Expose
    var guideType: String? = null

    @SerializedName("Included")
    @Expose
    var isIncluded = false

    companion object {
        private const val serialVersionUID = -6674151581670661972L
    }
}