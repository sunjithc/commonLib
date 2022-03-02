package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.PaxSubmitModel.HandToHandDetails
import java.io.Serializable
import java.util.*

class PaymentModel : Serializable {
    @SerializedName("SelectedPaymentId")
    @Expose
    var selectedPaymentId: Int? = null

    @SerializedName("PaymentInfos")
    @Expose
    var paymentInfos: ArrayList<PaymentInfo>? = null

    @SerializedName("CashOnDeliveryInfo")
    @Expose
    var cashOnDeliveryInfo: CashOnDeliveryInfo? = null

    @SerializedName("HandToHandDetails")
    @Expose
    var handToHandDetails: HandToHandDetails? = null

    @SerializedName("IsCodAvailable")
    @Expose
    var codAvailable: Boolean? = null

    @SerializedName("IsCashOnDeliveryActive")
    @Expose
    var cashOnDeliveryActive: Boolean? = null

    @SerializedName("IsHandToHandChargeActive")
    @Expose
    var handToHandChargeActive: Boolean? = null

    @SerializedName("IsPayLaterAvailable")
    @Expose
    var payLaterAvailable: Boolean? = null

    @SerializedName("IsPayLaterActive")
    @Expose
    var payLaterActive: Boolean? = null

    @SerializedName("IsPayLaterTicketActive")
    @Expose
    var payLaterTicketActive: Boolean? = null

    @SerializedName("PayLaterAmount")
    @Expose
    var payLaterAmount: Int? = null

    @SerializedName("PayLaterAmountConv")
    @Expose
    var payLaterAmountConv: Int? = null

    @SerializedName("IsPayLaterAutoTicket")
    @Expose
    var payLaterAutoTicket: Boolean? = null

    @SerializedName("TransactionIdAutoTicket")
    @Expose
    var transactionIdAutoTicket: Int? = null

    @SerializedName("PayLaterId")
    @Expose
    var payLaterId: Int? = null

    @SerializedName("kfhSessionId")
    @Expose
    var kfhSessionId: Any? = null

    @SerializedName("IsCommonMultiPayment")
    @Expose
    var commonMultiPayment: Boolean? = null

    @SerializedName("MultiPaymentItemCount")
    @Expose
    var multiPaymentItemCount: Int? = null

    @SerializedName("IsCardPayment")
    @Expose
    var cardPayment: Boolean? = null

    @SerializedName("CardToken")
    @Expose
    var cardToken: Any? = null

    @SerializedName("CardID")
    @Expose
    var cardID: Any? = null

    @SerializedName("CardCVV")
    @Expose
    var cardCVV: Any? = null

    @SerializedName("BinNo")
    @Expose
    var binNo: Any? = null

    @SerializedName("CardAutoSave")
    @Expose
    var cardAutoSave: Boolean? = null

    @SerializedName("SavedCards")
    @Expose
    var savedCards: List<Any>? = null

    @SerializedName("BookingAddOns")
    @Expose
    var bookingAddOns: Any? = null

    @SerializedName("SelectedAncillery")
    @Expose
    var selectedAncillery: Any? = null

    @SerializedName("IsThirdParty")
    @Expose
    var thirdParty: Boolean? = null

    @SerializedName("Notes")
    @Expose
    var notes: List<Any>? = null

    @SerializedName("TapPaymentToken")
    @Expose
    var tapPaymentToken: Any? = null

    @SerializedName("InstantMarkup")
    @Expose
    var instantMarkup: Int? = null

    @SerializedName("InstantDiscount")
    @Expose
    var instantDiscount: Int? = null

    @SerializedName("InstantServiceCharge")
    @Expose
    var instantServiceCharge: Int? = null

    @SerializedName("IsBookingOnly")
    @Expose
    var bookingOnly: Boolean? = null

    @SerializedName("TicketQueueing")
    @Expose
    var ticketQueueing: Boolean? = null

    @SerializedName("TotalSeatPrice")
    @Expose
    var totalSeatPrice: Int? = null

    @SerializedName("CrediMaxSessionId")
    @Expose
    var crediMaxSessionId: Any? = null

    @SerializedName("IsB2BtroughPG")
    @Expose
    var b2BtroughPG: Boolean? = null

    @SerializedName("ConvenienceInfo")
    @Expose
    var convenienceInfo: ArrayList<ConvenienceInfo>? = null

    @SerializedName("WhatsAppNotificationRequested")
    @Expose
    var whatsAppNotificationRequested: Boolean? = null
}