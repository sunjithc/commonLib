package com.travel.commonlib;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Loyalty_Data implements Serializable {
    @SerializedName("UserId")
    @Expose
    int userId;
    @SerializedName("IsApplied")
    @Expose
    boolean isApplied;
    @SerializedName("Flag")
    @Expose
    int flag;
    @SerializedName("LoyaltyPoints")
    @Expose
    double loyaltyPoints;
    @SerializedName("LoyaltyValue")
    @Expose
    double loyaltyValue;
    @SerializedName("RedeemPoints")
    @Expose
    double redeemPoints;
    @SerializedName("RedeemValue")
    @Expose
    double redeemValue;
    @SerializedName("Message")
    @Expose
    String message;
    @SerializedName("LoyaltyType")
    @Expose
    int loyaltyType;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isApplied() {
        return isApplied;
    }

    public void setApplied(boolean applied) {
        isApplied = applied;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public double getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(double loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public double getLoyaltyValue() {
        return loyaltyValue;
    }

    public void setLoyaltyValue(double loyaltyValue) {
        this.loyaltyValue = loyaltyValue;
    }

    public double getRedeemPoints() {
        return redeemPoints;
    }

    public void setRedeemPoints(double redeemPoints) {
        this.redeemPoints = redeemPoints;
    }

    public double getRedeemValue() {
        return redeemValue;
    }

    public void setRedeemValue(double redeemValue) {
        this.redeemValue = redeemValue;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getLoyaltyType() {
        return loyaltyType;
    }

    public void setLoyaltyType(int loyaltyType) {
        this.loyaltyType = loyaltyType;
    }
}