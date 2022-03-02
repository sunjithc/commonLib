package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PreferenceInfo : Serializable {
    @SerializedName("PassengerPreferenceId")
    @Expose
    var passengerPreferenceId: Int? = null

    @SerializedName("SsrAirline")
    @Expose
    var ssrAirline: String? = null

    @SerializedName("SegmentNumber")
    @Expose
    var segmentNumber: Int? = null

    @SerializedName("SsrClass")
    @Expose
    var ssrClass: String? = null

    @SerializedName("SsrCode")
    @Expose
    var ssrCode: Any? = null

    @SerializedName("SsrDateOfJourney")
    @Expose
    var ssrDateOfJourney: String? = null

    @SerializedName("SsrStartPoint")
    @Expose
    var ssrStartPoint: String? = null

    @SerializedName("SsrEndPoint")
    @Expose
    var ssrEndPoint: String? = null

    @SerializedName("SsrFltNum")
    @Expose
    var ssrFltNum: String? = null

    @SerializedName("SsrText")
    @Expose
    var ssrText: String? = null

    @SerializedName("SsrType")
    @Expose
    var ssrType: String? = null
}