package com.travel.commonlib.activity.search

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

    @SerializedName("Segments")
    @Expose
    var segments: List<Segment__1>? = null

    companion object {
        private const val serialVersionUID = -1567606088263749577L
    }
}