package com.travel.commonlib.flight.AirportSearch

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 5/7/2021.
 */
class AirportResponse : Serializable {
    @SerializedName("took")
    @Expose
    var took: Int? = null

    @SerializedName("timed_out")
    @Expose
    var timedOut: Boolean? = null

    @SerializedName("_shards")
    @Expose
    var shards: Shards? = null

    @SerializedName("hits")
    @Expose
    var hits: Hits? = null
}