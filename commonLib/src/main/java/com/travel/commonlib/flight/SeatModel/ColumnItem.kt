package com.travel.commonlib.flight.SeatModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ColumnItem : Serializable {
    @SerializedName("Column")
    @Expose
    var column: String? = null

    @SerializedName("Characteristics")
    @Expose
    var characteristics: String? = null

    @SerializedName("SeatPrice")
    @Expose
    var seatPrice: SeatPrice? = null
}