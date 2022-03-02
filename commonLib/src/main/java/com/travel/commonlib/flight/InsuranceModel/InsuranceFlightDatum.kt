package com.travel.commonlib.flight.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class InsuranceFlightDatum : Serializable {
    @SerializedName("DepartCountryCode")
    @Expose
    var departCountryCode: String? = null

    @SerializedName("DepartStationCode")
    @Expose
    var departStationCode: String? = null

    @SerializedName("ArrivalCountryCode")
    @Expose
    var arrivalCountryCode: String? = null

    @SerializedName("ArrivalStationCode")
    @Expose
    var arrivalStationCode: String? = null

    @SerializedName("DepartAirlineCode")
    @Expose
    var departAirlineCode: String? = null

    @SerializedName("DepartDateTime")
    @Expose
    var departDateTime: String? = null

    @SerializedName("ReturnAirlineCode")
    @Expose
    var returnAirlineCode: String? = null

    @SerializedName("ReturnDateTime")
    @Expose
    var returnDateTime: String? = null

    @SerializedName("DepartFlightNo")
    @Expose
    var departFlightNo: String? = null

    @SerializedName("ReturnFlightNo")
    @Expose
    var returnFlightNo: String? = null

    @SerializedName("TravelDirectionType")
    @Expose
    var travelDirectionType: Int? = null

    @SerializedName("LastLegIndex")
    @Expose
    var lastLegIndex: Int? = null
}