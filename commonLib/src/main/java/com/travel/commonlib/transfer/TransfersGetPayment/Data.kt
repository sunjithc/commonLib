package com.travel.commonlib.transfer.TransfersGetPayment

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable
import java.util.ArrayList

class Data : Serializable {
    @SerializedName("TotalAmount")
    @Expose
    var totalAmount: Double? = null

    @SerializedName("TotalBoardingFee")
    @Expose
    var totalBoardingFee: Double? = null

    @SerializedName("TotalAmountInBaseCurrency")
    @Expose
    var totalAmountInBaseCurrency: Double? = null

    @SerializedName("BaseFare")
    @Expose
    var baseFare: Double? = null

    @SerializedName("PaxCount")
    @Expose
    var paxCount: Int? = null

    @SerializedName("ServiceCharge")
    @Expose
    var serviceCharge: Double? = null

    @SerializedName("RoomCount")
    @Expose
    var roomCount: Int? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("DecimalPoint")
    @Expose
    var decimalPoint: Int? = null

    @SerializedName("PaymentGateway")
    @Expose
    var paymentGateway: String? = null

    @SerializedName("PaymentGatewayType")
    @Expose
    var paymentGatewayType: Any? = null

    @SerializedName("IsMigsPaymentGatewayActive")
    @Expose
    var isMigsPaymentGatewayActive: Boolean? = null

    @SerializedName("IsPayTabsPaymentGatewayActive")
    @Expose
    var isPayTabsPaymentGatewayActive: Boolean? = null

    @SerializedName("IsPaymentAtHomeActive")
    @Expose
    var isPaymentAtHomeActive: Boolean? = null

    @SerializedName("IsPaymentAtStoreActive")
    @Expose
    var isPaymentAtStoreActive: Boolean? = null

    @SerializedName("TnCChecked")
    @Expose
    var tnCChecked: Boolean? = null

    @SerializedName("TapPaymentToken")
    @Expose
    var tapPaymentToken: Any? = null

    @SerializedName("IsInsurance")
    @Expose
    var isInsurance: Boolean? = null

    @SerializedName("faresummary")
    @Expose
    var faresummary: Any? = null

    @SerializedName("trainfaresummary")
    @Expose
    var trainfaresummary: Any? = null

    @SerializedName("AvailablePaymentGateways")
    @Expose
    var availablePaymentGateways: ArrayList<AvailablePaymentGateway>? = null

    @SerializedName("IsCashOnDeliveryActive")
    @Expose
    var isCashOnDeliveryActive: Boolean? = null

    @SerializedName("IsCashOnDelivery")
    @Expose
    var isCashOnDelivery: Boolean? = null

    @SerializedName("IsInvoiceActive")
    @Expose
    var isInvoiceActive: Boolean? = null

    @SerializedName("IsInvoice")
    @Expose
    var isInvoice: Boolean? = null

    @SerializedName("CashOnDeliveryTimeTable")
    @Expose
    var cashOnDeliveryTimeTable: Any? = null

    @SerializedName("CashOnDeliveryInfo")
    @Expose
    var cashOnDeliveryInfo: Any? = null

    @SerializedName("CodServiceList")
    @Expose
    var codServiceList: Any? = null

    @SerializedName("CodServiceListApps")
    @Expose
    var codServiceListApps: Any? = null

    @SerializedName("CompanyGenQuoteDetailsModel")
    @Expose
    var companyGenQuoteDetailsModel: Any? = null

    @SerializedName("CompanyGenQuoteForHotel")
    @Expose
    var companyGenQuoteForHotel: Any? = null

    @SerializedName("CompanyGenQuoteForTrain")
    @Expose
    var companyGenQuoteForTrain: Any? = null

    @SerializedName("KentCharge")
    @Expose
    var kentCharge: Double? = null

    @SerializedName("MigsCharge")
    @Expose
    var migsCharge: Double? = null

    @SerializedName("PayTabsCharge")
    @Expose
    var payTabsCharge: Double? = null

    @SerializedName("CashUCharge")
    @Expose
    var cashUCharge: Double? = null

    @SerializedName("IsFlightExcluded")
    @Expose
    var isFlightExcluded: Boolean? = null

    @SerializedName("NeedInsurance")
    @Expose
    var needInsurance: Boolean? = null

    @SerializedName("NeedVisa")
    @Expose
    var needVisa: Boolean? = null

    @SerializedName("ApiId")
    @Expose
    var apiId: Int? = null

    @SerializedName("InsuranceAmount")
    @Expose
    var insuranceAmount: Double? = null

    @SerializedName("CardDetails")
    @Expose
    var cardDetails: Any? = null

    @SerializedName("ConversionRate")
    @Expose
    var conversionRate: Double? = null

    @SerializedName("Address1")
    @Expose
    var address1: Any? = null

    @SerializedName("Address2")
    @Expose
    var address2: Any? = null

    @SerializedName("CreditCardDurationMessage")
    @Expose
    var creditCardDurationMessage: Any? = null

    @SerializedName("RedeemPoint")
    @Expose
    var redeemPoint: Double? = null

    @SerializedName("IsRedeemPoint")
    @Expose
    private var isRedeemPoint: Boolean? = null

    @SerializedName("ReferralRedeemPoint")
    @Expose
    var referralRedeemPoint: Int? = null

    @SerializedName("IsReferralRedeemPoint")
    @Expose
    private var isReferralRedeemPoint: Boolean? = null

    @SerializedName("IsPaymentHasPaxInfo")
    @Expose
    var isPaymentHasPaxInfo: Boolean? = null

    @SerializedName("Is3rdPartyBooking")
    @Expose
    var is3rdPartyBooking: Boolean? = null

    @SerializedName("ModalityId")
    @Expose
    var modalityId: Any? = null

    @SerializedName("instantServiceCharge")
    @Expose
    var instantServiceCharge: Double? = null

    @SerializedName("instantDiscount")
    @Expose
    var instantDiscount: Double? = null

    @SerializedName("Amountstatus")
    @Expose
    var amountstatus: Boolean? = null

    @SerializedName("Amount")
    @Expose
    var amount: Double? = null

    @SerializedName("ExtraAmount")
    @Expose
    var extraAmount: Double? = null

    @SerializedName("sessionkey")
    @Expose
    var sessionkey: String? = null
    fun getIsRedeemPoint(): Boolean? {
        return isRedeemPoint
    }

    fun setIsRedeemPoint(isRedeemPoint: Boolean?) {
        this.isRedeemPoint = isRedeemPoint
    }

    fun getIsReferralRedeemPoint(): Boolean? {
        return isReferralRedeemPoint
    }

    fun setIsReferralRedeemPoint(isReferralRedeemPoint: Boolean?) {
        this.isReferralRedeemPoint = isReferralRedeemPoint
    }
}