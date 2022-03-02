package com.travel.commonlib.transfer.TransferPlaceSearch

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable
import java.util.ArrayList

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