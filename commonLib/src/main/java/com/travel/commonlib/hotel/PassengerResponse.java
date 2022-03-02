package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PassengerResponse implements Serializable {

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
    @SerializedName("BookingAction")
    @Expose
    private Object bookingAction;
    @SerializedName("FinalTotal")
    @Expose
    private double finalTotal;
    @SerializedName("WhatsappCharge")
    @Expose
    private double WhatsappCharge;

    public double getWhatsappCharge() {
        return WhatsappCharge;
    }

    public void setWhatsappCharge(double whatsappCharge) {
        WhatsappCharge = whatsappCharge;
    }

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

//    @Override
//    public int describeContents() {
//        return 0;
//    }

//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(sessionKey);
//        dest.writeParcelable(requestInfo, flags);
//        dest.writeParcelable(selectedHotel, flags);
//        dest.writeDouble(finalTotal);
//    }
}
