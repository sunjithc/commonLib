package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class BookingCode : Serializable {
    @SerializedName("PassengerNumber")
    @Expose
    var passengerNumber: Int? = 0

    @SerializedName("BookingCode")
    @Expose
    var bookingCode: String? = ""
}