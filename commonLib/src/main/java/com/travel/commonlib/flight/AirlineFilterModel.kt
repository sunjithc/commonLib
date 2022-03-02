package com.travel.commonlib.flight

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 6/8/2021.
 */
class AirlineFilterModel:Serializable {
    @SerializedName("AirlineName")
    @Expose
    var airlineName: String? = null
    @SerializedName("AirlineImage")
    @Expose
    var airlineImage: String? = null
}