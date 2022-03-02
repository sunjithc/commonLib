
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class BookingTransactionIdModel implements Serializable {

    @SerializedName("TransactionTypeDetailId")
    @Expose
    public int transactionTypeDetailId;
    @SerializedName("TransactionId")
    @Expose
    public int transactionId;
    @SerializedName("HotelBookingId")
    @Expose
    public int hotelBookingId;
    @SerializedName("PaymentId")
    @Expose
    public int paymentId;
    @SerializedName("MainTransId")
    @Expose
    public int mainTransId;
    @SerializedName("UserTransactionID")
    @Expose
    public int userTransactionID;
    @SerializedName("InsuranceBookingId")
    @Expose
    public int InsuranceBookingId;
    @SerializedName("InsuranceTransactionTypeDetailId")
    @Expose
    public int InsuranceTransactionTypeDetailId;
    @SerializedName("InsuranceTransactionId")
    @Expose
    public int InsuranceTransactionId;

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

    public int getHotelBookingId() {
        return hotelBookingId;
    }

    public void setHotelBookingId(int hotelBookingId) {
        this.hotelBookingId = hotelBookingId;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getMainTransId() {
        return mainTransId;
    }

    public void setMainTransId(int mainTransId) {
        this.mainTransId = mainTransId;
    }

    public int getUserTransactionID() {
        return userTransactionID;
    }

    public void setUserTransactionID(int userTransactionID) {
        this.userTransactionID = userTransactionID;
    }
}
