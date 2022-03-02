package com.travel.commonlib.activity.searchkey

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class SearchIdResponse : Serializable {
    @SerializedName("SearchId")
    @Expose
    var searchId: String? = null

    companion object {
        private const val serialVersionUID = 6866886448338009716L
    }
}