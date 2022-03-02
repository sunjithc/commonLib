package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Hits : Serializable{
    @SerializedName("total")
    @Expose
    var total = 0

    @SerializedName("max_score")
    @Expose
    var maxScore = 0.0

    @SerializedName("hits")
    @Expose
    var hits: List<Hit>? = null
}