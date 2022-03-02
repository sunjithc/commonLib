package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class BoardingInfos : Serializable {
    @SerializedName("AllowBaggages")
    @Expose
    var isAllowBaggages = false

    @SerializedName("AllowPriorityBoarding")
    @Expose
    var isAllowPriorityBoarding = false

    @SerializedName("AllowCheckIn")
    @Expose
    var isAllowCheckIn = false

    @SerializedName("AllowHandBaggage")
    @Expose
    var isAllowHandBaggage = false

    @SerializedName("BaggageList")
    @Expose
    var baggageLists: ArrayList<BaggageList>? = null

    @SerializedName("CheckInList")
    @Expose
    var checkInLists: ArrayList<CheckInList>? = null

    @SerializedName("BoardingText")
    @Expose
    var boardingText: String? = null

    @SerializedName("HandBagText")
    @Expose
    var handBagText: String? = null

    @SerializedName("BaggageId")
    @Expose
    var baggageId: String? = null

    @SerializedName("CheckInId")
    @Expose
    var checkInId: String? = null

    @SerializedName("IsPriorityBoarding")
    @Expose
    var isPriorityBoarding = false

    @SerializedName("IsHandBaggage")
    @Expose
    var isHandBaggage = false

    @SerializedName("SameCheckinForAllPassenger")
    @Expose
    var isSameCheckinForAllPassenger = false

    /**
     * For cart pax Purpose
     * #CartId
     */
    @SerializedName("CartId")
    @Expose
    var isCartId = 0
}