package com.travel.commonlib.flight.AirportSearch

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
    var score: Any? = null

    @SerializedName("_source")
    @Expose
    var source: Source? = null

    companion object {
        private const val serialVersionUID = -8188091948298417756L
    }
}