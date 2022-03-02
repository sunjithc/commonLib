package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SupplementInfo implements Serializable {

    @SerializedName("SupplementID")
    @Expose
    private long supplementID;
    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("IsMandatory")
    @Expose
    private boolean isMandatory;
    @SerializedName("ChargeType")
    @Expose
    private String chargeType;
    @SerializedName("Price")
    @Expose
    private double price;
    @SerializedName("AgePrice")
    @Expose
    private long agePrice;
    @SerializedName("From")
    @Expose
    private long from;
    @SerializedName("To")
    @Expose
    private long to;
    @SerializedName("Quantity")
    @Expose
    private long quantity;
    @SerializedName("Currency")
    @Expose
    private String currency;


    public long getSupplementID() {
        return supplementID;
    }

    public void setSupplementID(long supplementID) {
        this.supplementID = supplementID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getAgePrice() {
        return agePrice;
    }

    public void setAgePrice(long agePrice) {
        this.agePrice = agePrice;
    }

    public long getFrom() {
        return from;
    }

    public void setFrom(long from) {
        this.from = from;
    }

    public long getTo() {
        return to;
    }

    public void setTo(long to) {
        this.to = to;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeLong(supplementID);
//        dest.writeString(type);
//        dest.writeString(name);
//        dest.writeByte((byte) (isMandatory ? 1 : 0));
//        dest.writeString(chargeType);
//        dest.writeDouble(price);
//        dest.writeLong(agePrice);
//        dest.writeLong(from);
//        dest.writeLong(to);
//        dest.writeLong(quantity);
//        dest.writeString(currency);
//    }
}
