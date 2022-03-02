package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Country : Serializable {
    @SerializedName("Code")
    @Expose
    var code: String? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("Destinations")
    @Expose
    var destinations: List<Destination>? = null

    companion object {
        private const val serialVersionUID = -8879357007895475657L
    }
}