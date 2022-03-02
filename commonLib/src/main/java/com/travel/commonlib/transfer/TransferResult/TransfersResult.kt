package com.travel.commonlib.transfer.TransferResult

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.jumbo.Transfers.model.TransferResult.FareInfo
import java.io.Serializable
import java.util.*

class TransfersResult : Serializable {
    @SerializedName("AllJourney")
    @Expose
    var allJourney: ArrayList<AllJourney>? = null

    @SerializedName("FareInfo")
    @Expose
    var fareInfo: FareInfo? = null

    @SerializedName("TripId")
    @Expose
    var tripId: Int? = null

    @SerializedName("ApiId")
    @Expose
    var apiId: Int? = null

    @SerializedName("PickUpHotelInfo")
    @Expose
    var pickUpHotelInfo: Any? = null

    @SerializedName("DropOffpHotelInfo")
    @Expose
    var dropOffpHotelInfo: Any? = null
}