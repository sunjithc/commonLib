package com.travel.commonlib.flight.SeatModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class RowDetail : Serializable {
    @SerializedName("RowNumber")
    @Expose
    var rowNumber: String? = null

    @SerializedName("RowType")
    @Expose
    var rowType: Any? = null

    @SerializedName("SeatDetailItemInfo")
    @Expose
    var seatDetailItemInfo: ArrayList<SeatDetailItemInfo>? = null
}