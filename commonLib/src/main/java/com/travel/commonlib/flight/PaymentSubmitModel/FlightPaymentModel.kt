package com.travel.commonlib.flight.PaymentSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.InsuranceModel.Policy_Insurance
import com.travel.commonlib.flight.PaxModel.BookingAction
import com.travel.commonlib.flight.PaxModel.PassengerModel
import com.travel.commonlib.flight.PaxModel.PaymentModel
import com.travel.commonlib.flight.PaxModel.UserInfoModal
import com.travel.commonlib.flight.ResultModel.FlightTrip
import com.travel.commonlib.flight.ResultModel.RequestInfo
import java.io.Serializable
import java.util.*

class FlightPaymentModel : Serializable {
    @SerializedName("SessionKey")
    @Expose
    var sessionKey: String? = null

    @SerializedName("FlightTrips")
    @Expose
    var flightTrips: ArrayList<FlightTrip>? = null

    @SerializedName("RequestInfo")
    @Expose
    var requestInfo: RequestInfo? = null

    @SerializedName("PassengerModel")
    @Expose
    var passengerModel: PassengerModel? = null

    @SerializedName("PaymentModel")
    @Expose
    var paymentModel: PaymentModel? = null

    @SerializedName("BookingAction")
    @Expose
    var bookingAction: BookingAction? = null

    @SerializedName("CouponModal")
    @Expose
    var couponModal: CouponModal? = null

    @SerializedName("UserInfoModal")
    @Expose
    var userInfoModal: UserInfoModal? = null

    @SerializedName("IsPackagePaymentSuccessfull")
    @Expose
    var packagePaymentSuccessfull: Boolean? = null

    @SerializedName("DomesticBookingAction")
    @Expose
    var domesticBookingAction: ArrayList<Any>? = null

    @SerializedName("PaymentResults")
    @Expose
    var paymentResults: PaymentResults? = null

    @SerializedName("Agencyinsucffieientbalace")
    @Expose
    var agencyinsucffieientbalace: Boolean? = null

    @SerializedName("UserTransactionID")
    @Expose
    var userTransactionID: String? = null

    @SerializedName("Action")
    @Expose
    var action: Any? = null

    @SerializedName("Status")
    @Expose
    var status: Any? = null

    @SerializedName("IsInsuranceActive")
    @Expose
    var isInsuranceActive: String? = null

    @SerializedName("IsEnabledRequestReservation")
    @Expose
    var enabledRequestReservation: Boolean? = null

    @SerializedName("IsAppliedRequestReservation")
    @Expose
    var appliedRequestReservation: Boolean? = null

    @SerializedName("InsuranceBookingModel")
    @Expose
    var insuranceBookingModel: Policy_Insurance? = null
}