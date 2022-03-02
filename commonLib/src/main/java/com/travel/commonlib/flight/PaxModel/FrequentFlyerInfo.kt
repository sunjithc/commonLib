package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 10/1/2020.
 */
class FrequentFlyerInfo : Serializable {
    @SerializedName("flyerNumber")
    @Expose
    var flyerNumber: String? = null

    @SerializedName("airlineCode0")
    @Expose
    var airlineCode0: String? = null
}