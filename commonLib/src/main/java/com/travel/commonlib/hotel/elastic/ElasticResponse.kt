package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ElasticResponse : Serializable{
    @SerializedName("took")
    @Expose
    var took = 0

    @SerializedName("timed_out")
    @Expose
    var isTimedOut = false

    @SerializedName("_shards")
    @Expose
    var shards: Shards? = null

    @SerializedName("hits")
    @Expose
    var hits: Hits? = null
}