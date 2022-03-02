
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.PassengerModel;
import com.travel.jumbo.model.hotel.PaymentModel;
import com.travel.jumbo.model.hotel.RequestInfo;
import com.travel.jumbo.model.hotel.UserDetails;

public class Result {

    @SerializedName("SessionKey")
    @Expose
    private String sessionKey;
    @SerializedName("RequestInfo")
    @Expose
    private RequestInfo requestInfo;
    @SerializedName("SelectedHotel")
    @Expose
    private Hotel selectedHotel;
    @SerializedName("PassengerModel")
    @Expose
    private PassengerModel passengerModel;
    @SerializedName("PaymentModel")
    @Expose
    private PaymentModel paymentModel;
    @SerializedName("UserDetails")
    @Expose
    private UserDetails userDetails;
    @SerializedName("BookingAction")
    @Expose
    private Object bookingAction;
    @SerializedName("FinalTotal")
    @Expose
    private double finalTotal;

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

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public Object getBookingAction() {
        return bookingAction;
    }

    public void setBookingAction(Object bookingAction) {
        this.bookingAction = bookingAction;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(double finalTotal) {
        this.finalTotal = finalTotal;
    }

}
