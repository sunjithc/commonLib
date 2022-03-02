
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PaymentResults  implements Serializable {

    @SerializedName("SelectedPaymentId")
    @Expose
    public int selectedPaymentId;
    @SerializedName("TransactionId")
    @Expose
    public int transactionId;
    @SerializedName("PaymentTransactionId")
    @Expose
    public int paymentTransactionId;
    @SerializedName("DirectPaymentId")
    @Expose
    public int directPaymentId;
    @SerializedName("PaymentUrl")
    @Expose
    public String paymentUrl;
    @SerializedName("PaymentForm")
    @Expose
    public String paymentForm;
    @SerializedName("IsPaymentSuccess")
    @Expose
    public boolean isPaymentSuccess;
    @SerializedName("Result")
    @Expose
    public Object result;
    @SerializedName("Currency")
    @Expose
    public String currency;
    @SerializedName("Amount")
    @Expose
    public double amount;
    @SerializedName("Message")
    @Expose
    public String message;
    @SerializedName("PaymentId")
    @Expose
    public Object paymentId;
    @SerializedName("TransactionNumber")
    @Expose
    public Object transactionNumber;
    @SerializedName("ReceiptNo")
    @Expose
    public Object receiptNo;
    @SerializedName("TrackId")
    @Expose
    public Object trackId;
    @SerializedName("TransactionTime")
    @Expose
    public Object transactionTime;
    @SerializedName("AuthorizeId")
    @Expose
    public Object authorizeId;
    @SerializedName("Description")
    @Expose
    public Object description;
    @SerializedName("ReferenceNumber")
    @Expose
    public Object referenceNumber;
    @SerializedName("BatchNo")
    @Expose
    public Object batchNo;
    @SerializedName("kfhsessionId")
    @Expose
    public Object kfhsessionId;
    @SerializedName("CrediMaxsessionId")
    @Expose
    public Object crediMaxsessionId;
    @SerializedName("kfhDetails")
    @Expose
    public Object kfhDetails;
    @SerializedName("CrediMaxDetails")
    @Expose
    public Object crediMaxDetails;
    @SerializedName("CcAvenueDetails")
    @Expose
    public Object ccAvenueDetails;
    @SerializedName("kfhString")
    @Expose
    public Object kfhString;
    @SerializedName("CardStartNo")
    @Expose
    public Object cardStartNo;
    @SerializedName("CardEndNo")
    @Expose
    public Object cardEndNo;
    @SerializedName("CardType")
    @Expose
    public Object cardType;
    @SerializedName("CardIssuer")
    @Expose
    public Object cardIssuer;
    @SerializedName("BankName")
    @Expose
    public Object bankName;
    @SerializedName("PayedByName")
    @Expose
    public Object payedByName;
    @SerializedName("PaymentStatus")
    @Expose
    public int paymentStatus;
    @SerializedName("CardBasicInfo")
    @Expose
    public Object cardBasicInfo;
    @SerializedName("IsPayLater")
    @Expose
    public boolean isPayLater;
    @SerializedName("IsPayLaterTicket")
    @Expose
    public boolean isPayLaterTicket;
    @SerializedName("IsDummyTicket")
    @Expose
    public boolean isDummyTicket;
    @SerializedName("PaymentSubSectionInfo")
    @Expose
    public Object paymentSubSectionInfo;
    @SerializedName("IsCommonMultiPayment")
    @Expose
    public boolean isCommonMultiPayment;
    @SerializedName("TransactionTypeId")
    @Expose
    public int transactionTypeId;
    @SerializedName("olpIdAlias")
    @Expose
    public Object olpIdAlias;

    public int getSelectedPaymentId() {
        return selectedPaymentId;
    }

    public void setSelectedPaymentId(int selectedPaymentId) {
        this.selectedPaymentId = selectedPaymentId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(int paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public int getDirectPaymentId() {
        return directPaymentId;
    }

    public void setDirectPaymentId(int directPaymentId) {
        this.directPaymentId = directPaymentId;
    }

    public String getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public String getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
    }

    public boolean isPaymentSuccess() {
        return isPaymentSuccess;
    }

    public void setPaymentSuccess(boolean paymentSuccess) {
        isPaymentSuccess = paymentSuccess;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Object paymentId) {
        this.paymentId = paymentId;
    }

    public Object getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(Object transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Object getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(Object receiptNo) {
        this.receiptNo = receiptNo;
    }

    public Object getTrackId() {
        return trackId;
    }

    public void setTrackId(Object trackId) {
        this.trackId = trackId;
    }

    public Object getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Object transactionTime) {
        this.transactionTime = transactionTime;
    }

    public Object getAuthorizeId() {
        return authorizeId;
    }

    public void setAuthorizeId(Object authorizeId) {
        this.authorizeId = authorizeId;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(Object referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Object getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(Object batchNo) {
        this.batchNo = batchNo;
    }

    public Object getKfhsessionId() {
        return kfhsessionId;
    }

    public void setKfhsessionId(Object kfhsessionId) {
        this.kfhsessionId = kfhsessionId;
    }

    public Object getCrediMaxsessionId() {
        return crediMaxsessionId;
    }

    public void setCrediMaxsessionId(Object crediMaxsessionId) {
        this.crediMaxsessionId = crediMaxsessionId;
    }

    public Object getKfhDetails() {
        return kfhDetails;
    }

    public void setKfhDetails(Object kfhDetails) {
        this.kfhDetails = kfhDetails;
    }

    public Object getCrediMaxDetails() {
        return crediMaxDetails;
    }

    public void setCrediMaxDetails(Object crediMaxDetails) {
        this.crediMaxDetails = crediMaxDetails;
    }

    public Object getCcAvenueDetails() {
        return ccAvenueDetails;
    }

    public void setCcAvenueDetails(Object ccAvenueDetails) {
        this.ccAvenueDetails = ccAvenueDetails;
    }

    public Object getKfhString() {
        return kfhString;
    }

    public void setKfhString(Object kfhString) {
        this.kfhString = kfhString;
    }

    public Object getCardStartNo() {
        return cardStartNo;
    }

    public void setCardStartNo(Object cardStartNo) {
        this.cardStartNo = cardStartNo;
    }

    public Object getCardEndNo() {
        return cardEndNo;
    }

    public void setCardEndNo(Object cardEndNo) {
        this.cardEndNo = cardEndNo;
    }

    public Object getCardType() {
        return cardType;
    }

    public void setCardType(Object cardType) {
        this.cardType = cardType;
    }

    public Object getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(Object cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    public Object getBankName() {
        return bankName;
    }

    public void setBankName(Object bankName) {
        this.bankName = bankName;
    }

    public Object getPayedByName() {
        return payedByName;
    }

    public void setPayedByName(Object payedByName) {
        this.payedByName = payedByName;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Object getCardBasicInfo() {
        return cardBasicInfo;
    }

    public void setCardBasicInfo(Object cardBasicInfo) {
        this.cardBasicInfo = cardBasicInfo;
    }

    public boolean isPayLater() {
        return isPayLater;
    }

    public void setPayLater(boolean payLater) {
        isPayLater = payLater;
    }

    public boolean isPayLaterTicket() {
        return isPayLaterTicket;
    }

    public void setPayLaterTicket(boolean payLaterTicket) {
        isPayLaterTicket = payLaterTicket;
    }

    public boolean isDummyTicket() {
        return isDummyTicket;
    }

    public void setDummyTicket(boolean dummyTicket) {
        isDummyTicket = dummyTicket;
    }

    public Object getPaymentSubSectionInfo() {
        return paymentSubSectionInfo;
    }

    public void setPaymentSubSectionInfo(Object paymentSubSectionInfo) {
        this.paymentSubSectionInfo = paymentSubSectionInfo;
    }

    public boolean isCommonMultiPayment() {
        return isCommonMultiPayment;
    }

    public void setCommonMultiPayment(boolean commonMultiPayment) {
        isCommonMultiPayment = commonMultiPayment;
    }

    public int getTransactionTypeId() {
        return transactionTypeId;
    }

    public void setTransactionTypeId(int transactionTypeId) {
        this.transactionTypeId = transactionTypeId;
    }

    public Object getOlpIdAlias() {
        return olpIdAlias;
    }

    public void setOlpIdAlias(Object olpIdAlias) {
        this.olpIdAlias = olpIdAlias;
    }
}
