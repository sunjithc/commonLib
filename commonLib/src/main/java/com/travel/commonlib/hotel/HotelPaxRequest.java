package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotelPaxRequest {

    @SerializedName("cart_id")
    @Expose
    private int cartId;
    @SerializedName("FinalTotal")
    @Expose
    private double finalTotal;
    @SerializedName("RequestInfo")
    @Expose
    private RequestInfo requestInfo;
    @SerializedName("SelectedHotel")
    @Expose
    private Hotel hotel;
    @SerializedName("SessionKey")
    @Expose
    private String sessionKey;
    @SerializedName("UserDetails")
    @Expose
    private UserDetails userDetails;
    @SerializedName("WhatsappCharge")
    @Expose
    private double WhatsappCharge;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(double finalTotal) {
        this.finalTotal = finalTotal;
    }

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public double getWhatsappCharge() {
        return WhatsappCharge;
    }

    public void setWhatsappCharge(double whatsappCharge) {
        WhatsappCharge = whatsappCharge;
    }
}
