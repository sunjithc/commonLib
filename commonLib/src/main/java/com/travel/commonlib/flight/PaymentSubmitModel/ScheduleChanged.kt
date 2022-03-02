package com.travel.commonlib.flight.PaymentSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ScheduleChanged : Serializable {
    @SerializedName("ArrivalDateTime")
    @Expose
    var arrivalDateTime = ""

    @SerializedName("DepartureDateTime")
    @Expose
    var departureDateTime = ""

    @SerializedName("From")
    @Expose
    var from: String? = null

    @SerializedName("Airline")
    @Expose
    var airline: String? = null

    @SerializedName("To")
    @Expose
    var to: String? = null

    @SerializedName("FlightCode")
    @Expose
    var flightCode: String? = null
}