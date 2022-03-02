package com.travel.commonlib.transfer.transferPaxModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class TransferPaymentResponseData implements Serializable {

    @SerializedName("SelectedPaymentId")
    @Expose
    private Integer selectedPaymentId;
    @SerializedName("PaymentTransactionId")
    @Expose
    private Integer paymentTransactionId;
    @SerializedName("DirectPaymentId")
    @Expose
    private Integer directPaymentId;
    @SerializedName("PaymentUrl")
    @Expose
    private String paymentUrl;
    @SerializedName("IsPaymentSuccess")
    @Expose
    private Boolean isPaymentSuccess;
    @SerializedName("Result")
    @Expose
    private String result;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("Amount")
    @Expose
    private Double amount;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("PaymentId")
    @Expose
    private String paymentId;
    @SerializedName("TransactionNumber")
    @Expose
    private String transactionNumber;
    @SerializedName("ReceiptNo")
    @Expose
    private String receiptNo;
    @SerializedName("TrackId")
    @Expose
    private String trackId;
    @SerializedName("TransactionTime")
    @Expose
    private String transactionTime;
    @SerializedName("AuthorizeId")
    @Expose
    private String authorizeId;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("ReferenceNumber")
    @Expose
    private String referenceNumber;
    @SerializedName("BatchNo")
    @Expose
    private Object batchNo;
    @SerializedName("kfhsessionId")
    @Expose
    private Object kfhsessionId;
    @SerializedName("kfhDetails")
    @Expose
    private Object kfhDetails;
    @SerializedName("kfhString")
    @Expose
    private Object kfhString;
    @SerializedName("CardStartNo")
    @Expose
    private String cardStartNo;
    @SerializedName("CardEndNo")
    @Expose
    private String cardEndNo;
    @SerializedName("CardType")
    @Expose
    private String cardType;
    @SerializedName("CardIssuer")
    @Expose
    private String cardIssuer;
    @SerializedName("BankName")
    @Expose
    private String bankName;
    @SerializedName("PayedByName")
    @Expose
    private String payedByName;
    @SerializedName("CardBasicInfo")
    @Expose
    private Object cardBasicInfo;
    @SerializedName("PaymentForm")
    @Expose
    private String paymentForm;

    public String getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
    }

    public Integer getSelectedPaymentId() {
        return selectedPaymentId;
    }

    public void setSelectedPaymentId(Integer selectedPaymentId) {
        this.selectedPaymentId = selectedPaymentId;
    }

    public Integer getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(Integer paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public Integer getDirectPaymentId() {
        return directPaymentId;
    }

    public void setDirectPaymentId(Integer directPaymentId) {
        this.directPaymentId = directPaymentId;
    }

    public String getPaymentUrl() {
        return paymentUrl;
    }

    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    public Boolean getPaymentSuccess() {
        return isPaymentSuccess;
    }

    public void setPaymentSuccess(Boolean paymentSuccess) {
        isPaymentSuccess = paymentSuccess;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getAuthorizeId() {
        return authorizeId;
    }

    public void setAuthorizeId(String authorizeId) {
        this.authorizeId = authorizeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
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

    public Object getKfhDetails() {
        return kfhDetails;
    }

    public void setKfhDetails(Object kfhDetails) {
        this.kfhDetails = kfhDetails;
    }

    public Object getKfhString() {
        return kfhString;
    }

    public void setKfhString(Object kfhString) {
        this.kfhString = kfhString;
    }

    public String getCardStartNo() {
        return cardStartNo;
    }

    public void setCardStartNo(String cardStartNo) {
        this.cardStartNo = cardStartNo;
    }

    public String getCardEndNo() {
        return cardEndNo;
    }

    public void setCardEndNo(String cardEndNo) {
        this.cardEndNo = cardEndNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(String cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPayedByName() {
        return payedByName;
    }

    public void setPayedByName(String payedByName) {
        this.payedByName = payedByName;
    }

    public Object getCardBasicInfo() {
        return cardBasicInfo;
    }

    public void setCardBasicInfo(Object cardBasicInfo) {
        this.cardBasicInfo = cardBasicInfo;
    }
}
