package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class FlightResultModel : Serializable {
    @SerializedName("SearchId")
    @Expose
    var searchId: String? = null

    @SerializedName("ResultCount")
    @Expose
    var resultCount: Int? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("DecimalPoint")
    @Expose
    var decimalPoint: Int? = null

    @SerializedName("SearchType")
    @Expose
    var searchType: String? = null

    @SerializedName("FlightTrips")
    @Expose
    var flightTrips: ArrayList<FlightTrip>? = null

    @SerializedName("OnwardDistinctAirlines")
    @Expose
    var onwardDistinctAirlines: Any? = null

    @SerializedName("StopOverAirports")
    @Expose
    var stopOverAirports: Any? = null

    @SerializedName("RequestInfo")
    @Expose
    var requestInfo: RequestInfo? = null

    @SerializedName("IsDomesticFlight")
    @Expose
    var domesticFlight: Boolean? = null
    fun getIsDomesticFlight(): Boolean? {
        return domesticFlight
    }

    fun setIsDomesticFlight(isDomesticFlight: Boolean?) {
        domesticFlight = isDomesticFlight
    }
}