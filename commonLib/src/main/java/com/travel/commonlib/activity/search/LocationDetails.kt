package com.travel.commonlib.activity.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class LocationDetails : Serializable {
    @SerializedName("CountryCode")
    @Expose
    var countryCode: Any? = null

    @SerializedName("CountryName")
    @Expose
    var countryName: Any? = null

    @SerializedName("DestinationCode")
    @Expose
    var destinationCode: Any? = null

    @SerializedName("DestinationName")
    @Expose
    var destinationName: Any? = null

    @SerializedName("StartingPoints")
    @Expose
    var startingPoints: List<StartingPoint>? = null

    @SerializedName("EndPoints")
    @Expose
    var endPoints: Any? = null

    companion object {
        private const val serialVersionUID = -1842195830493704320L
    }
}