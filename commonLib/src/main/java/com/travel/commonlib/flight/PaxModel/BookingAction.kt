package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.PaymentSubmitModel.ScheduleChanged
import com.travel.commonlib.flight.ResultModel.BaggageInfo
import java.io.Serializable
import java.util.*

class BookingAction : Serializable {
    @SerializedName("RequestType")
    @Expose
    var requestType: String? = null

    @SerializedName("IsValidPassenger")
    @Expose
    var validPassenger: Boolean? = null

    @SerializedName("IsUnAvail")
    @Expose
    var unAvail: Boolean? = null

    @SerializedName("IsFareChanged")
    @Expose
    var fareChanged: Boolean? = null

    @SerializedName("IsSecondFareUpdate")
    @Expose
    var secondFareUpdate: Boolean? = null

    @SerializedName("IsServiceChanged")
    @Expose
    var serviceChanged: Boolean? = null

    @SerializedName("IsPayLater")
    @Expose
    var payLater: Boolean? = null

    @SerializedName("BookingStatus")
    @Expose
    var bookingStatus: Int? = null

    @SerializedName("IsBooked")
    @Expose
    var booked: Boolean? = null

    @SerializedName("IsBookingFailed")
    @Expose
    var bookingFailed: Boolean? = null

    @SerializedName("IsBookingAttempted")
    @Expose
    var bookingAttempted: Boolean? = null

    @SerializedName("IsSkipPayment")
    @Expose
    var skipPayment: Boolean? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("ProcessUrl")
    @Expose
    var processUrl: String? = null

    @SerializedName("IsCashOnDelivery")
    @Expose
    var cashOnDelivery: Boolean? = null

    @SerializedName("IsTicketAttempted")
    @Expose
    var ticketAttempted: Boolean? = null

    @SerializedName("IsTicketFareChange")
    @Expose
    var ticketFareChange: Boolean? = null

    @SerializedName("BookingAttemptDate")
    @Expose
    var bookingAttemptDate: String? = null

    @SerializedName("IsCabinChanged")
    @Expose
    val cabinChanged: Boolean? = null

    @SerializedName("IsBaggageChanged")
    @Expose
    var isbaggageChanged: Boolean? = null

    @SerializedName("BaggageChanged")
    @Expose
    var baggageChanged: ArrayList<BaggageInfo>? = null

    @SerializedName("ScheduleChanged")
    @Expose
    var scheduleChangedList = ArrayList<ScheduleChanged>()

    @SerializedName("BookingClassChanged")
    @Expose
    var bookingClassChanged: Any? = null

    @SerializedName("ChangedCabinClass")
    @Expose
    var changedCabinClass: Any? = null

    @SerializedName("Remarks")
    @Expose
    var remarks: Any? = null

    @SerializedName("IsBookingFareChange")
    @Expose
    var bookingFareChange: Boolean? = null

    @SerializedName("IsSuccessfulRequestReservation")
    @Expose
    var successfulRequestReservation: Boolean? = null

    @SerializedName("OnurAirProceedToTicket")
    @Expose
    var onurAirProceedToTicket: Boolean? = null

    @SerializedName("HesCodeFailedPassengersInfo")
    @Expose
    var hesCodeFailedPassengersInfo: Any? = null

}