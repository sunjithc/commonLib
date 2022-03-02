package com.travel.commonlib.flight.DetailsModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.ResultModel.FlightTrip
import com.travel.commonlib.flight.ResultModel.RequestInfo
import java.io.Serializable
import java.util.*


/**
 * Created by Rohith (Android) on 5/5/2021.
 */
class DetailRequestModel : Serializable {

    @SerializedName("FlightTrips")
    @Expose
    var flightTrips: ArrayList<FlightTrip>? = null

    @SerializedName("RequestType")
    @Expose
    var requestType: String? = null

    @SerializedName("RequestInfo")
    @Expose
    var requestInfo: RequestInfo? = null

    @SerializedName("IsDomesticFlight")
    @Expose
    private val isDomesticFlight: Boolean? = false

    @SerializedName("FareType")
    @Expose
    private val fareType: Any? = null

    @SerializedName("TBOBookingDtls")
    @Expose
    private val tBOBookingDtls: Any? = null

    @SerializedName("AncillaryInfos")
    @Expose
    private val ancillaryInfos: Any? = null
}