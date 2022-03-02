package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class FeatureGroup : Serializable {
    @SerializedName("Groupcode")
    @Expose
    var groupcode: String? = null

    @SerializedName("Included")
    @Expose
    var included: List<Included>? = null

    @SerializedName("Excluded")
    @Expose
    var excluded: List<Excluded>? = null

    companion object {
        private const val serialVersionUID = 7284620679331464798L
    }
}