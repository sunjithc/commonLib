
package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentSubSectionInfo {

    @SerializedName("TransactionId")
    @Expose
    private int transactionId;
    @SerializedName("PropertyType")
    @Expose
    private int propertyType;
    @SerializedName("Amount")
    @Expose
    private double amount;
    @SerializedName("PaymentGatewayCharge")
    @Expose
    private double paymentGatewayCharge;

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(int propertyType) {
        this.propertyType = propertyType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPaymentGatewayCharge() {
        return paymentGatewayCharge;
    }

    public void setPaymentGatewayCharge(double paymentGatewayCharge) {
        this.paymentGatewayCharge = paymentGatewayCharge;
    }

}
