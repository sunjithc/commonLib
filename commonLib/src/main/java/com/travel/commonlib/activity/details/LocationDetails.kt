package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class LocationDetails : Serializable {
    @SerializedName("CountryCode")
    @Expose
    var countryCode: String? = null

    @SerializedName("CountryName")
    @Expose
    var countryName: String? = null

    @SerializedName("DestinationCode")
    @Expose
    var destinationCode: String? = null

    @SerializedName("DestinationName")
    @Expose
    var destinationName: String? = null

    @SerializedName("StartingPoints")
    @Expose
    var startingPoints: List<StartingPoint>? = null

    @SerializedName("EndPoints")
    @Expose
    var endPoints: List<EndPoint>? = null

    companion object {
        private const val serialVersionUID = 8462065496587214792L
    }
}