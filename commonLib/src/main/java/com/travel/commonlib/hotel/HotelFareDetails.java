package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class HotelFareDetails implements Serializable {

    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("TotalPrice")
    @Expose
    private double totalPrice;
    @SerializedName("PerNightPrice")
    @Expose
    private double perNightPrice;
    @SerializedName("ServiceCharge")
    @Expose
    private double serviceCharge;
    @SerializedName("Discount")
    @Expose
    private double discount;
    @SerializedName("DecimalPoints")
    @Expose
    private double decimalPoints;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPerNightPrice() {
        return perNightPrice;
    }

    public void setPerNightPrice(double perNightPrice) {
        this.perNightPrice = perNightPrice;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDecimalPoints() {
        return decimalPoints;
    }

    public void setDecimalPoints(double decimalPoints) {
        this.decimalPoints = decimalPoints;
    }
}
