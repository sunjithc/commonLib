
package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.packages.AvailabilityInfo;
import com.travel.jumbo.model.packages.BookingInfos;
import com.travel.jumbo.model.packages.FareChangeInfos;
import com.travel.jumbo.model.packages.PaymentSubSectionInfo;
import com.travel.jumbo.model.packages.ServiceChangeInfo;

import java.util.List;

public class PayData {

    @SerializedName("SelectedPaymentId")
    @Expose
    private long selectedPaymentId;
    @SerializedName("PaymentTransactionId")
    @Expose
    private long paymentTransactionId;
    @SerializedName("DirectPaymentId")
    @Expose
    private long directPaymentId;
    @SerializedName("PaymentUrl")
    @Expose
    private String paymentUrl;
    @SerializedName("PaymentForm")
    @Expose
    private String paymentForm;
    @SerializedName("IsPaymentSuccess")
    @Expose
    private boolean isPaymentSuccess;
    @SerializedName("Result")
    @Expose
    private String result;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("Amount")
    @Expose
    private double amount;
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
    private String batchNo;
    @SerializedName("kfhsessionId")
    @Expose
    private String kfhsessionId;
    @SerializedName("kfhDetails")
    @Expose
    private String kfhDetails;
    @SerializedName("kfhString")
    @Expose
    private String kfhString;
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
    @SerializedName("PaymentStatus")
    @Expose
    private long paymentStatus;
    @SerializedName("CardBasicInfo")
    @Expose
    private String cardBasicInfo;
    @SerializedName("IsPayLater")
    @Expose
    private boolean isPayLater;
    @SerializedName("IsPayLaterTicket")
    @Expose
    private boolean isPayLaterTicket;
    @SerializedName("IsDummyTicket")
    @Expose
    private boolean isDummyTicket;
    @SerializedName("PaymentSubSectionInfo")
    @Expose
    private List<PaymentSubSectionInfo> paymentSubSectionInfo = null;
    @SerializedName("AvailabilityInfos")
    @Expose
    private List<AvailabilityInfo> availabilityInfos = null;
    @SerializedName("FareChangeInfos")
    @Expose
    private List<FareChangeInfos> fareChangeInfos = null;
    @SerializedName("ServiceChangeInfos")
    @Expose
    private List<ServiceChangeInfo> serviceChangeInfos = null;
    @SerializedName("BookingInfos")
    @Expose
    private BookingInfos bookingInfos;


    public List<AvailabilityInfo> getAvailabilityInfos() {
        return availabilityInfos;
    }

    public long getSelectedPaymentId() {
        return selectedPaymentId;
    }

    public void setSelectedPaymentId(long selectedPaymentId) {
        this.selectedPaymentId = selectedPaymentId;
    }

    public long getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(long paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    public long getDirectPaymentId() {
        return directPaymentId;
    }

    public void setDirectPaymentId(long directPaymentId) {
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

    public boolean isIsPaymentSuccess() {
        return isPaymentSuccess;
    }

    public void setIsPaymentSuccess(boolean isPaymentSuccess) {
        this.isPaymentSuccess = isPaymentSuccess;
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

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getKfhsessionId() {
        return kfhsessionId;
    }

    public void setKfhsessionId(String kfhsessionId) {
        this.kfhsessionId = kfhsessionId;
    }

    public String getKfhDetails() {
        return kfhDetails;
    }

    public void setKfhDetails(String kfhDetails) {
        this.kfhDetails = kfhDetails;
    }

    public String getKfhString() {
        return kfhString;
    }

    public void setKfhString(String kfhString) {
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

    public long getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(long paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getCardBasicInfo() {
        return cardBasicInfo;
    }

    public void setCardBasicInfo(String cardBasicInfo) {
        this.cardBasicInfo = cardBasicInfo;
    }

    public boolean isIsPayLater() {
        return isPayLater;
    }

    public void setIsPayLater(boolean isPayLater) {
        this.isPayLater = isPayLater;
    }

    public boolean isIsPayLaterTicket() {
        return isPayLaterTicket;
    }

    public void setIsPayLaterTicket(boolean isPayLaterTicket) {
        this.isPayLaterTicket = isPayLaterTicket;
    }

    public boolean isIsDummyTicket() {
        return isDummyTicket;
    }

    public void setIsDummyTicket(boolean isDummyTicket) {
        this.isDummyTicket = isDummyTicket;
    }

    public List<PaymentSubSectionInfo> getPaymentSubSectionInfo() {
        return paymentSubSectionInfo;
    }

    public void setPaymentSubSectionInfo(List<PaymentSubSectionInfo> paymentSubSectionInfo) {
        this.paymentSubSectionInfo = paymentSubSectionInfo;
    }

    public boolean isPaymentSuccess() {
        return isPaymentSuccess;
    }

    public void setPaymentSuccess(boolean paymentSuccess) {
        isPaymentSuccess = paymentSuccess;
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

    public void setAvailabilityInfos(List<AvailabilityInfo> availabilityInfos) {
        this.availabilityInfos = availabilityInfos;
    }

    public List<FareChangeInfos> getFareChangeInfos() {
        return fareChangeInfos;
    }

    public void setFareChangeInfos(List<FareChangeInfos> fareChangeInfos) {
        this.fareChangeInfos = fareChangeInfos;
    }

    public List<ServiceChangeInfo> getServiceChangeInfos() {
        return serviceChangeInfos;
    }

    public void setServiceChangeInfos(List<ServiceChangeInfo> serviceChangeInfos) {
        this.serviceChangeInfos = serviceChangeInfos;
    }

    public BookingInfos getBookingInfos() {
        return bookingInfos;
    }

    public void setBookingInfos(BookingInfos bookingInfos) {
        this.bookingInfos = bookingInfos;
    }
}
