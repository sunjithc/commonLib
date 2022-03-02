package com.travel.commonlib.transfer.TransfersPay

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Data : Serializable {
    @SerializedName("SelectedPaymentId")
    @Expose
    var selectedPaymentId: Int? = null

    @SerializedName("PaymentTransactionId")
    @Expose
    var paymentTransactionId: Int? = null

    @SerializedName("DirectPaymentId")
    @Expose
    var directPaymentId: Int? = null

    @SerializedName("PaymentUrl")
    @Expose
    var paymentUrl: String? = null

    @SerializedName("IsPaymentSuccess")
    @Expose
    var isPaymentSuccess: Boolean? = null

    @SerializedName("Result")
    @Expose
    var result: String? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("Amount")
    @Expose
    var amount: Double? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("PaymentId")
    @Expose
    var paymentId: String? = null

    @SerializedName("TransactionNumber")
    @Expose
    var transactionNumber: String? = null

    @SerializedName("ReceiptNo")
    @Expose
    var receiptNo: String? = null

    @SerializedName("TrackId")
    @Expose
    var trackId: String? = null

    @SerializedName("TransactionTime")
    @Expose
    var transactionTime: String? = null

    @SerializedName("AuthorizeId")
    @Expose
    var authorizeId: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("ReferenceNumber")
    @Expose
    var referenceNumber: String? = null

    @SerializedName("BatchNo")
    @Expose
    var batchNo: Any? = null

    @SerializedName("kfhsessionId")
    @Expose
    var kfhsessionId: Any? = null

    @SerializedName("CrediMaxSessionId")
    @Expose
    var crediMaxSessionId: Any? = null

    @SerializedName("kfhDetails")
    @Expose
    var kfhDetails: Any? = null

    @SerializedName("CrediMaxDetails")
    @Expose
    var crediMaxDetails: Any? = null

    @SerializedName("kfhString")
    @Expose
    var kfhString: Any? = null

    @SerializedName("CardStartNo")
    @Expose
    var cardStartNo: String? = null

    @SerializedName("CardEndNo")
    @Expose
    var cardEndNo: String? = null

    @SerializedName("CardType")
    @Expose
    var cardType: String? = null

    @SerializedName("CardIssuer")
    @Expose
    var cardIssuer: String? = null

    @SerializedName("BankName")
    @Expose
    var bankName: String? = null

    @SerializedName("PayedByName")
    @Expose
    var payedByName: String? = null

    @SerializedName("CardBasicInfo")
    @Expose
    var cardBasicInfo: Any? = null

    @SerializedName("PaymentForm")
    @Expose
    var paymentForm: Any? = null

    @SerializedName("CcAvenueDetails")
    @Expose
    var ccAvenueDetails: Any? = null
}