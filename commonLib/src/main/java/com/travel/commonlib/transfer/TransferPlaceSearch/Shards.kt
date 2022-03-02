package com.travel.commonlib.transfer.TransferPlaceSearch

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Shards : Serializable {
    @SerializedName("total")
    @Expose
    var total: Int? = null

    @SerializedName("successful")
    @Expose
    var successful: Int? = null

    @SerializedName("skipped")
    @Expose
    var skipped: Int? = null

    @SerializedName("failed")
    @Expose
    var failed: Int? = null

    companion object {
        private const val serialVersionUID = 6393844469611922238L
    }
}