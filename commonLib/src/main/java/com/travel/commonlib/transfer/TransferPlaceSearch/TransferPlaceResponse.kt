package com.travel.commonlib.transfer.TransferPlaceSearch

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class TransferPlaceResponse : Serializable {
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