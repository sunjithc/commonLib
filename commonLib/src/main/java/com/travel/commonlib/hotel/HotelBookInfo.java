
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.InsuranceModel.Policy_Insurance;
import com.travel.jumbo.model.hotel.BookingTransactionIdModel;
import com.travel.jumbo.model.hotel.PassengerModel;
import com.travel.jumbo.model.hotel.PaymentResults;

import java.io.Serializable;
import java.util.List;

public class HotelBookInfo implements Serializable {

    @SerializedName("SessionKey")
    @Expose
    public String sessionKey;
    @SerializedName("RequestInfo")
    @Expose
    public RequestInfo requestInfo;
    @SerializedName("SelectedHotel")
    @Expose
    public Hotel selectedHotel;
    @SerializedName("PassengerModel")
    @Expose
    public PassengerModel passengerModel;
    @SerializedName("PaymentModel")
    @Expose
    public PaymentModel paymentModel;
    @SerializedName("BookingTransactionIdModel")
    @Expose
    public BookingTransactionIdModel bookingTransactionIdModel;
    @SerializedName("Loyalties")
    @Expose
    public List<Loyalty> loyalties = null;
    @SerializedName("BookingAction")
    @Expose
    public Object bookingAction;
    @SerializedName("TransactionstatusID")
    @Expose
    public int transactionstatusID;
    @SerializedName("Transactionstatus")
    @Expose
    public Object transactionstatus;
    @SerializedName("supplierPNR")
    @Expose
    public Object supplierPNR;
    @SerializedName("FinalTotal")
    @Expose
    public double finalTotal;
    @SerializedName("ErrorInfo")
    @Expose
    public String errorInfo;
    @SerializedName("ReferralModel")
    @Expose
    public Object referralModel;
    @SerializedName("Agencyinsucffieientbalace")
    @Expose
    public boolean agencyinsucffieientbalace;
    @SerializedName("TransactionTypeDetailId")
    @Expose
    public int transactionTypeDetailId;
    @SerializedName("TransactionId")
    @Expose
    public int transactionId;
    @SerializedName("WhatsappCharge")
    @Expose
    public double whatsappCharge;
    @SerializedName("Erp_Commission")
    @Expose
    public double erpCommission;
    @SerializedName("Erp_Discount")
    @Expose
    public double erpDiscount;
    @SerializedName("Erp_ServiceCharge")
    @Expose
    public double erpServiceCharge;
    @SerializedName("Erp_Tax")
    @Expose
    public double erpTax;
    @SerializedName("PaymentResults")
    @Expose
    public PaymentResults paymentResults;
    @SerializedName("UserDetails")
    @Expose
    public UserDetails userDetails;
    @SerializedName("InsuranceBookingModel")
    @Expose
    private Policy_Insurance insuranceBookingModel;


    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public Hotel getSelectedHotel() {
        return selectedHotel;
    }

    public void setSelectedHotel(Hotel selectedHotel) {
        this.selectedHotel = selectedHotel;
    }

    public PassengerModel getPassengerModel() {
        return passengerModel;
    }

    public void setPassengerModel(PassengerModel passengerModel) {
        this.passengerModel = passengerModel;
    }

    public PaymentModel getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(PaymentModel paymentModel) {
        this.paymentModel = paymentModel;
    }

    public BookingTransactionIdModel getBookingTransactionIdModel() {
        return bookingTransactionIdModel;
    }

    public void setBookingTransactionIdModel(BookingTransactionIdModel bookingTransactionIdModel) {
        this.bookingTransactionIdModel = bookingTransactionIdModel;
    }

    public List<Loyalty> getLoyalties() {
        return loyalties;
    }

    public void setLoyalties(List<Loyalty> loyalties) {
        this.loyalties = loyalties;
    }

    public Object getBookingAction() {
        return bookingAction;
    }

    public void setBookingAction(Object bookingAction) {
        this.bookingAction = bookingAction;
    }

    public int getTransactionstatusID() {
        return transactionstatusID;
    }

    public void setTransactionstatusID(int transactionstatusID) {
        this.transactionstatusID = transactionstatusID;
    }

    public Object getTransactionstatus() {
        return transactionstatus;
    }

    public void setTransactionstatus(Object transactionstatus) {
        this.transactionstatus = transactionstatus;
    }

    public Object getSupplierPNR() {
        return supplierPNR;
    }

    public void setSupplierPNR(Object supplierPNR) {
        this.supplierPNR = supplierPNR;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(double finalTotal) {
        this.finalTotal = finalTotal;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Object getReferralModel() {
        return referralModel;
    }

    public void setReferralModel(Object referralModel) {
        this.referralModel = referralModel;
    }

    public boolean isAgencyinsucffieientbalace() {
        return agencyinsucffieientbalace;
    }

    public void setAgencyinsucffieientbalace(boolean agencyinsucffieientbalace) {
        this.agencyinsucffieientbalace = agencyinsucffieientbalace;
    }

    public int getTransactionTypeDetailId() {
        return transactionTypeDetailId;
    }

    public void setTransactionTypeDetailId(int transactionTypeDetailId) {
        this.transactionTypeDetailId = transactionTypeDetailId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getWhatsappCharge() {
        return whatsappCharge;
    }

    public void setWhatsappCharge(double whatsappCharge) {
        this.whatsappCharge = whatsappCharge;
    }

    public double getErpCommission() {
        return erpCommission;
    }

    public void setErpCommission(double erpCommission) {
        this.erpCommission = erpCommission;
    }

    public double getErpDiscount() {
        return erpDiscount;
    }

    public void setErpDiscount(double erpDiscount) {
        this.erpDiscount = erpDiscount;
    }

    public double getErpServiceCharge() {
        return erpServiceCharge;
    }

    public void setErpServiceCharge(double erpServiceCharge) {
        this.erpServiceCharge = erpServiceCharge;
    }

    public double getErpTax() {
        return erpTax;
    }

    public void setErpTax(double erpTax) {
        this.erpTax = erpTax;
    }

    public PaymentResults getPaymentResults() {
        return paymentResults;
    }

    public void setPaymentResults(PaymentResults paymentResults) {
        this.paymentResults = paymentResults;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
