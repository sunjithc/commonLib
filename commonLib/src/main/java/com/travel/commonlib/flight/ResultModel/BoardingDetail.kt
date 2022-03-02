package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.ResultModel.Baggage
import java.io.Serializable

class BoardingDetail : Serializable {
    @SerializedName("AllowSmsNotification")
    @Expose
    var allowSmsNotification: Boolean? = null

    @SerializedName("Baggages")
    @Expose
    val baggages: List<Baggage>? = null

    @SerializedName("CheckIn")
    @Expose
    var checkIn: Any? = null

    @SerializedName("CheckInFee")
    @Expose
    var checkInFee: Any? = null

    @SerializedName("CheckInType")
    @Expose
    var checkInType: Int? = null

    @SerializedName("HandBaggageFee")
    @Expose
    var handBaggageFee: Any? = null

    @SerializedName("LegIndex")
    @Expose
    var legIndex: Int? = null

    @SerializedName("SmsNotificationFee")
    @Expose
    var smsNotificationFee: Any? = null

    @SerializedName("SameCheckinForAllPassenger")
    @Expose
    var sameCheckinForAllPassenger: Boolean? = null

    @SerializedName("AllowPriorityBoarding")
    @Expose
    var allowPriorityBoarding: Boolean? = null

    @SerializedName("PriorityBoardingFee")
    @Expose
    var priorityBoardingFee: Any? = null

    @SerializedName("PriorityServiceId")
    @Expose
    var priorityServiceId: Int? = null

    @SerializedName("SameBaggageForAllFlight")
    @Expose
    var sameBaggageForAllFlight: Boolean? = null

    @SerializedName("HandBaggage")
    @Expose
    var handBaggage: Any? = null

    @SerializedName("IsPriorityBoarding")
    @Expose
    var priorityBoarding: Boolean? = null
}