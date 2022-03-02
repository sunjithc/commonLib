package com.travel.commonlib.flight.AirportSearch

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class Hits : Serializable {
    @SerializedName("total")
    @Expose
    var total: Int? = null

    @SerializedName("max_score")
    @Expose
    var maxScore: Any? = null

    @SerializedName("hits")
    @Expose
    var hits: ArrayList<Hit>? = null
}