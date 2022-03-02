package com.travel.commonlib.flight

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 9/14/2021.
 */
class RewardsResModel : Serializable {
    @SerializedName("PointPerAmount")
    @Expose
    var pointPerAmount = 0.0

    @SerializedName("Currency")
    @Expose
    var currency = "KWD"
}