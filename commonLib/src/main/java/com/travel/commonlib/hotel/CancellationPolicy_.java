
package com.travel.commonlib.hotel;

import android.os.Parcel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CancellationPolicy_ implements Serializable {

    @SerializedName("Amount")
    @Expose
    private double amount;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("Value")
    @Expose
    private String value;
    @SerializedName("IsManuelText")
    @Expose
    private boolean isManuelText;
    @SerializedName("CancelRestricted")
    @Expose
    private boolean cancelRestricted;
    @SerializedName("PolicyServiceCharge")
    @Expose
    private double PolicyServiceCharge;

    protected CancellationPolicy_(Parcel in) {
        amount = in.readDouble();
        currency = in.readString();
        value = in.readString();
        isManuelText = in.readByte() != 0;
        cancelRestricted = in.readByte() != 0;
        PolicyServiceCharge = in.readDouble();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isIsManuelText() {
        return isManuelText;
    }

    public void setIsManuelText(boolean isManuelText) {
        this.isManuelText = isManuelText;
    }

    public boolean isCancelRestricted() {
        return cancelRestricted;
    }

    public void setCancelRestricted(boolean cancelRestricted) {
        this.cancelRestricted = cancelRestricted;
    }

    public double getPolicyServiceCharge() {
        return PolicyServiceCharge;
    }

    public void setPolicyServiceCharge(double policyServiceCharge) {
        PolicyServiceCharge = policyServiceCharge;
    }
}
