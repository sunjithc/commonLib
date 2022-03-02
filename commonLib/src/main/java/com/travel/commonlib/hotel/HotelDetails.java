
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class HotelDetails implements Serializable {

    @SerializedName("SessionKey")
    @Expose
    private String sessionKey;
    @SerializedName("RequestInfo")
    @Expose
    private RequestInfo requestInfo;
    @SerializedName("SelectedHotel")
    @Expose
    private Hotel selectedHotel;
    @SerializedName("BookingAction")
    @Expose
    private String bookingAction;
    @SerializedName("FinalTotal")
    @Expose
    private double finalTotal;
    @SerializedName("WhatsappCharge")
    @Expose
    private double WhatsappCharge;

    int cart_id;

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public HotelDetails(){

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

    public String getBookingAction() {
        return bookingAction;
    }

    public void setBookingAction(String bookingAction) {
        this.bookingAction = bookingAction;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(double finalTotal) {
        this.finalTotal = finalTotal;
    }

    public double getWhatsappCharge() {
        return WhatsappCharge;
    }

    public void setWhatsappCharge(double whatsappCharge) {
        WhatsappCharge = whatsappCharge;
    }
}
