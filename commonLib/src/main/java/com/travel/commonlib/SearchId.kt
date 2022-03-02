package com.travel.commonlib

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

/**
 * Created by Rohith (Android) on 5/7/2021.
 */
class SearchId : Serializable {
    @SerializedName("SearchId")
    @Expose
    var searchId: String? = null
}