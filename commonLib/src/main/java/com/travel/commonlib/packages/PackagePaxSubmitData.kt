package com.travel.commonlib.packages

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PackagePaxSubmitData :Serializable {

    @SerializedName("Passengers")
    @Expose
    var passengers: List<Passenger>? = null
}