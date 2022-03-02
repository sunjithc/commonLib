
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Tax implements Serializable {

    @SerializedName("Tax")
    @Expose
    private double tax;
    @SerializedName("RoomId")
    @Expose
    private long roomId;
    @SerializedName("SalesTax")
    @Expose
    private double salesTax;
    @SerializedName("taxServiceFee")
    @Expose
    private double taxServiceFee;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getTaxServiceFee() {
        return taxServiceFee;
    }

    public void setTaxServiceFee(double taxServiceFee) {
        this.taxServiceFee = taxServiceFee;
    }


}
