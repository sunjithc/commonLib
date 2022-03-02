package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Shards : Serializable {
    @SerializedName("total")
    @Expose
    var total = 0

    @SerializedName("successful")
    @Expose
    var successful = 0

    @SerializedName("skipped")
    @Expose
    var skipped = 0

    @SerializedName("failed")
    @Expose
    var failed = 0
}