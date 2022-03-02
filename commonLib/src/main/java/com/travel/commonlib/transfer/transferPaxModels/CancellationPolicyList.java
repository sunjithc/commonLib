
package com.travel.commonlib.transfer.transferPaxModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CancellationPolicyList implements Serializable {

    @SerializedName("charge")
    @Expose
    private Boolean charge;
    @SerializedName("chargeAmount")
    @Expose
    private Double chargeAmount;
    @SerializedName("Currency")
    @Expose
    private Object currency;
    @SerializedName("FromDate")
    @Expose
    private String fromDate;
    @SerializedName("ToDate")
    @Expose
    private Object toDate;
    @SerializedName("FreeCancellationEndDate")
    @Expose
    private String freeCancellationEndDate;

    public Boolean getCharge() {
        return charge;
    }

    public void setCharge(Boolean charge) {
        this.charge = charge;
    }

    public Double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(Double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    public Object getCurrency() {
        return currency;
    }

    public void setCurrency(Object currency) {
        this.currency = currency;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public Object getToDate() {
        return toDate;
    }

    public void setToDate(Object toDate) {
        this.toDate = toDate;
    }

    public String getFreeCancellationEndDate() {
        return freeCancellationEndDate;
    }

    public void setFreeCancellationEndDate(String freeCancellationEndDate) {
        this.freeCancellationEndDate = freeCancellationEndDate;
    }

}
