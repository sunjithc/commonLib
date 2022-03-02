package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Hit : Serializable {
    @SerializedName("_index")
    @Expose
    var index: String? = null

    @SerializedName("_type")
    @Expose
    var type: String? = null

    @SerializedName("_id")
    @Expose
    var id: String? = null

    @SerializedName("_score")
    @Expose
    var score = 0.0

    @SerializedName("_source")
    @Expose
    var source: Source? = null
}