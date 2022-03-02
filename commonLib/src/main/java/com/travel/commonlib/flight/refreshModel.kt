package com.travel.commonlib.flight

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Rohith (Android) on 9/6/2021.
 */
class refreshModel {

    @SerializedName("grant_type")
    @Expose
    var grant_type: String? = null

    @SerializedName("refresh_token")
    @Expose
    var refresh_token: String? = null
}