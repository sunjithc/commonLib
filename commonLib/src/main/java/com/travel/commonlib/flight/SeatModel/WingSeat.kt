package com.travel.commonlib.flight.SeatModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class WingSeat :Serializable{
    @SerializedName("FirstRow")
    @Expose
    var firstRow = 0

    @SerializedName("LastRow")
    @Expose
    var lastRow = 0
}