package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class PenaltiesInfo : Serializable {
    @SerializedName("Penalty")
    @Expose
    var penalty: ArrayList<Penalty>? = null
}