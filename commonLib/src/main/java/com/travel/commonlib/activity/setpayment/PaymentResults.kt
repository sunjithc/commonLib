package com.travel.commonlib.activity.setpayment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaymentResults : Serializable {
    @SerializedName("SelectedPaymentId")
    @Expose
    var selectedPaymentId: Long = 0

    @SerializedName("TransactionId")
    @Expose
    var transactionId: Long = 0

    @SerializedName("PaymentTransactionId")
    @Expose
    var paymentTransactionId: Long = 0

    @SerializedName("DirectPaymentId")
    @Expose
    var directPaymentId: Long = 0

    @SerializedName("PaymentUrl")
    @Expose
    var paymentUrl: String? = null

    @SerializedName("PaymentForm")
    @Expose
    var paymentForm: Any? = null

    @SerializedName("IsPaymentSuccess")
    @Expose
    var isIsPaymentSuccess = false
        private set

    @SerializedName("Result")
    @Expose
    var result: Any? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("Amount")
    @Expose
    var amount = 0.0

    @SerializedName("Message")
    @Expose
    var message: Any? = null

    @SerializedName("PaymentId")
    @Expose
    var paymentId: Any? = null

    @SerializedName("TransactionNumber")
    @Expose
    var transactionNumber: Any? = null

    @SerializedName("ReceiptNo")
    @Expose
    var receiptNo: Any? = null

    @SerializedName("TrackId")
    @Expose
    var trackId: Any? = null

    @SerializedName("TransactionTime")
    @Expose
    var transactionTime: Any? = null

    @SerializedName("AuthorizeId")
    @Expose
    var authorizeId: Any? = null

    @SerializedName("Description")
    @Expose
    var description: Any? = null

    @SerializedName("ReferenceNumber")
    @Expose
    var referenceNumber: Any? = null

    @SerializedName("BatchNo")
    @Expose
    var batchNo: Any? = null

    @SerializedName("kfhsessionId")
    @Expose
    var kfhsessionId: Any? = null

    @SerializedName("CrediMaxsessionId")
    @Expose
    var crediMaxsessionId: String? = null

    @SerializedName("kfhDetails")
    @Expose
    var kfhDetails: Any? = null

    @SerializedName("CrediMaxDetails")
    @Expose
    var crediMaxDetails: Any? = null

    @SerializedName("CcAvenueDetails")
    @Expose
    var ccAvenueDetails: Any? = null

    @SerializedName("kfhString")
    @Expose
    var kfhString: Any? = null

    @SerializedName("CardStartNo")
    @Expose
    var cardStartNo: Any? = null

    @SerializedName("CardEndNo")
    @Expose
    var cardEndNo: Any? = null

    @SerializedName("CardType")
    @Expose
    var cardType: Any? = null

    @SerializedName("CardIssuer")
    @Expose
    var cardIssuer: Any? = null

    @SerializedName("BankName")
    @Expose
    var bankName: Any? = null

    @SerializedName("PayedByName")
    @Expose
    var payedByName: Any? = null

    @SerializedName("PaymentStatus")
    @Expose
    var paymentStatus: Long = 0

    @SerializedName("CardBasicInfo")
    @Expose
    var cardBasicInfo: Any? = null

    @SerializedName("IsPayLater")
    @Expose
    var isIsPayLater = false
        private set

    @SerializedName("IsPayLaterTicket")
    @Expose
    var isIsPayLaterTicket = false
        private set

    @SerializedName("IsDummyTicket")
    @Expose
    var isIsDummyTicket = false
        private set

    @SerializedName("PaymentSubSectionInfo")
    @Expose
    var paymentSubSectionInfo: Any? = null

    @SerializedName("IsCommonMultiPayment")
    @Expose
    var isIsCommonMultiPayment = false
        private set

    @SerializedName("TransactionTypeId")
    @Expose
    var transactionTypeId: Long = 0

    @SerializedName("olpIdAlias")
    @Expose
    var olpIdAlias: Any? = null

    @SerializedName("IsMilespointAvailable")
    @Expose
    var isIsMilespointAvailable = false
        private set

    @SerializedName("MilesRedeemReference")
    @Expose
    var milesRedeemReference: Any? = null

    @SerializedName("MilesTransReference")
    @Expose
    var milesTransReference: Any? = null

    @SerializedName("MilesRedeemPoints")
    @Expose
    var milesRedeemPoints = 0.0

    @SerializedName("MilesRedeemAmount")
    @Expose
    var milesRedeemAmount = 0.0

    @SerializedName("IsPayWithRedemOnly")
    @Expose
    var isIsPayWithRedemOnly = false
        private set

    fun setIsPaymentSuccess(isPaymentSuccess: Boolean) {
        isIsPaymentSuccess = isPaymentSuccess
    }

    fun setIsPayLater(isPayLater: Boolean) {
        isIsPayLater = isPayLater
    }

    fun setIsPayLaterTicket(isPayLaterTicket: Boolean) {
        isIsPayLaterTicket = isPayLaterTicket
    }

    fun setIsDummyTicket(isDummyTicket: Boolean) {
        isIsDummyTicket = isDummyTicket
    }

    fun setIsCommonMultiPayment(isCommonMultiPayment: Boolean) {
        isIsCommonMultiPayment = isCommonMultiPayment
    }

    fun setIsMilespointAvailable(isMilespointAvailable: Boolean) {
        isIsMilespointAvailable = isMilespointAvailable
    }

    fun setIsPayWithRedemOnly(isPayWithRedemOnly: Boolean) {
        isIsPayWithRedemOnly = isPayWithRedemOnly
    }

    companion object {
        private const val serialVersionUID = 7308898675065546458L
    }
}