package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.DetailsModel.MealsService
import com.travel.commonlib.flight.PaxSubmitModel.LoyaltyRedeemPoint
import com.travel.commonlib.flight.PaxSubmitModel.MealInfos
import com.travel.commonlib.flight.PaymentSubmitModel.BookingResults
import com.travel.commonlib.flight.SeatModel.FlightSeatInfo
import com.travel.commonlib.flight.PaxSubmitModel.KangarooRewardPoint
import java.io.Serializable
import java.util.*

class FlightTrip : Serializable {
    @SerializedName("UniqueTripId")
    @Expose
    var uniqueTripId: String? = ""

    @SerializedName("TripId")
    @Expose
    var tripId: Int? = 0

    @SerializedName("AdditionalFareId")
    @Expose
    var additionalFareId = 0

    @SerializedName("LoyaltyRedeemPoint")
    @Expose
    var loyaltyRedeemPoint: LoyaltyRedeemPoint? = null

    @SerializedName("KangarooRewardPoint")
    @Expose
    var kangarooRewardPoint: KangarooRewardPoint? = null

    @SerializedName("ApiId")
    @Expose
    var apiId: Int? = 0

    @SerializedName("HapId")
    @Expose
    var hapId: Int? = 0

    @SerializedName("IsRefundable")
    @Expose
    var refundable = false

    @SerializedName("IsCombinedFare")
    @Expose
    var combinedFare = false

    @SerializedName("IsDomestic")
    @Expose
    var domestic = false

    @SerializedName("IsCouponCode")
    @Expose
    var couponCode = false

    @SerializedName("RefundInfo")
    @Expose
    var refundInfo: RefundInfo? = null

    @SerializedName("OperatingVender")
    @Expose
    var operatingVender: String? = ""

    @SerializedName("TraceId")
    @Expose
    var traceId: Any? = null

    @SerializedName("BookingClass")
    @Expose
    var bookingClass: String? = ""

    @SerializedName("ReturnBookingClass")
    @Expose
    var returnBookingClass: ArrayList<String>? = null

    @SerializedName("SeatLeftCount")
    @Expose
    var seatLeftCount: Int? = 0

    @SerializedName("AdditionalFare")
    @Expose
    var additionalFare: ArrayList<AdditionalFare>? = null

    @SerializedName("FinalTotalFare")
    @Expose
    var finalTotalFare = 0.0

    @SerializedName("CompanyGenQuoteDetails")
    @Expose
    var companyGenQuoteDetails: ArrayList<CompanyGenQuoteDetail>? = null

    @SerializedName("ActualGenQuoteDetails")
    @Expose
    var actualGenQuoteDetails: ArrayList<ActualGenQuoteDetail>? = null

    @SerializedName("FlightJourneys")
    @Expose
    var flightJourneys: ArrayList<FlightJourney>? = null

    @SerializedName("SecuritySignature")
    @Expose
    var securitySignature: String? = ""

    @SerializedName("RuleNumber")
    @Expose
    var ruleNumber: String? = ""

    @SerializedName("RuleKeys")
    @Expose
    var ruleKeys: ArrayList<String>? = null

    @SerializedName("IsFareRuleRequested")
    @Expose
    var fareRuleRequested = false

    @SerializedName("IsServiceRequested")
    @Expose
    var serviceRequested = false

    @SerializedName("IsBaggageRequested")
    @Expose
    var baggageRequested = false

    @SerializedName("IsFlightAvail")
    @Expose
    var flightAvail = false

    @SerializedName("IsPreferredAirline")
    @Expose
    var preferredAirline = false

    @SerializedName("IsMealsRequested")
    @Expose
    var mealsRequested = false

    @SerializedName("IsSeatRequested")
    @Expose
    var seatRequested = false

    @SerializedName("IsCashOnDelivery")
    @Expose
    var cashOnDelivery = false

    @SerializedName("RulesText")
    @Expose
    var rulesText: String? = ""

    @SerializedName("MetaSearchKey")
    @Expose
    var metaSearchKey: String? = ""

    @SerializedName("CompareKey")
    @Expose
    var compareKey: String? = ""

    @SerializedName("OperatingAirlineName")
    @Expose
    var operatingAirlineName: String? = ""

    @SerializedName("OfflineFlightId")
    @Expose
    var offlineFlightId: Int? = 0

    @SerializedName("JSessionIdentifier")
    @Expose
    private var jSessionIdentifier: String? = ""

    @SerializedName("TransactionIdentifier")
    @Expose
    var transactionIdentifier: Any? = null

    @SerializedName("MealsService")
    @Expose
    var mealsServices: ArrayList<MealsService>? = null

    @SerializedName("isAppDownloadCouponCode")
    @Expose
    var appDownloadCouponCode = false

    @SerializedName("IsAncillaryServiceRequested")
    @Expose
    var ancillaryServiceRequested = false

    @SerializedName("IsCabinChangedFQ")
    @Expose
    var cabinChangedFQ = false

    @SerializedName("IsSchedulechangeFQ")
    @Expose
    var schedulechangeFQ = false

    @SerializedName("IsBaggageChangedFQ")
    @Expose
    var baggageChangedFQ = false

    @SerializedName("ScheduleChangedFQ")
    @Expose
    var scheduleChangedFQ: Any? = null

    @SerializedName("IataBranchID")
    @Expose
    var iataBranchID: Int? = 0

    @SerializedName("tripType")
    @Expose
    var tripType: String? = ""

    @SerializedName("IsDomesticFlight")
    @Expose
    var domesticFlight = false

    @SerializedName("MealsMarkup")
    @Expose
    var mealsMarkup = 0.0

    @SerializedName("TotaMealsMarkup")
    @Expose
    var totaMealsMarkup = 0.0

    @SerializedName("IsMealsMarkupPercentage")
    @Expose
    var mealsMarkupPercentage = false

    @SerializedName("ApiName")
    @Expose
    var apiName: String? = ""

    @SerializedName("OnurAirTotalAmount")
    @Expose
    var onurAirTotalAmount = 0.0

    @SerializedName("FlightSeatInfo")
    @Expose
    var flightSeatInfo: FlightSeatInfo? = null

    @SerializedName("TokenId")
    @Expose
    var tokenId: String? = ""

    @SerializedName("MealsPrice")
    @Expose
    var mealsPrice: Double? = 0.0

    @SerializedName("isLcc")
    @Expose
    var lcc = false

    @SerializedName("ResultIndex")
    @Expose
    var resultIndex: Any? = null

    @SerializedName("TBOBookingid")
    @Expose
    private var tBOBookingid: Any? = null

    @SerializedName("TotaMealsPrice")
    @Expose
    var totaMealsPrice: Double? = 0.0

    @SerializedName("IsSSRRequested")
    @Expose
    var sSRRequested = false

    @SerializedName("OnurAirCharge")
    @Expose
    var onurAirCharge: Double? = 0.0

    @SerializedName("IsReturnSpecialFare")
    @Expose
    var returnSpecialFare = false

    @SerializedName("IsGSTEnabled")
    @Expose
    var gSTEnabled = false

    @SerializedName("SameFareIndicator")
    @Expose
    var sameFareIndicator = false

    @SerializedName("ActualFlightAmount")
    @Expose
    var actualFlightAmount = 0.0

    @SerializedName("FareType")
    @Expose
    var fareType: Any? = null

    @SerializedName("MealInfo")
    @Expose
    var mealInfo: MealInfos? = null
    var samePriceCount = 0

    @SerializedName("Cachekey")
    @Expose
    var cachekey: String? = ""

    @SerializedName("FinalTotalDiscount")
    @Expose
    var finalTotalDiscount = 0.0

    @SerializedName("RoutingId")
    @Expose
    var routingId: String? = ""

    @SerializedName("BoardingDetails")
    @Expose
    var boardingDetails: ArrayList<BoardingDetail>? = null

    @SerializedName("BookingRequiredParameters")
    @Expose
    var bookingRequiredParameters: ArrayList<BookingRequiredParameter>? = null

    @SerializedName("BaggageInsuranceDetails")
    @Expose
    var baggageInsuranceDetails: Any? = null

    @SerializedName("BookingResults")
    @Expose
    var bookingResults: BookingResults? = null
    fun gettBOBookingid(): Any? {
        return tBOBookingid
    }

    fun settBOBookingid(tBOBookingid: Any?) {
        this.tBOBookingid = tBOBookingid
    }

    fun getjSessionIdentifier(): String? {
        return jSessionIdentifier
    }

    fun setjSessionIdentifier(jSessionIdentifier: String?) {
        this.jSessionIdentifier = jSessionIdentifier
    }
}