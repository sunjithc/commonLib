package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Included : Serializable {
    @SerializedName("featureType")
    @Expose
    var featureType: String? = null

    @SerializedName("description")
    @Expose
    var description: String? = null

    companion object {
        private const val serialVersionUID = 3590702035666226141L
    }
}