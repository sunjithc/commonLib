
package com.travel.commonlib.transfer.itenerarymodel;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CancellationPolicyList implements Parcelable
{

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
    public final static Creator<CancellationPolicyList> CREATOR = new Creator<CancellationPolicyList>() {


        @SuppressWarnings({
            "unchecked"
        })
        public CancellationPolicyList createFromParcel(Parcel in) {
            return new CancellationPolicyList(in);
        }

        public CancellationPolicyList[] newArray(int size) {
            return (new CancellationPolicyList[size]);
        }

    }
    ;

    protected CancellationPolicyList(Parcel in) {
        this.charge = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.chargeAmount = ((Double) in.readValue((Double.class.getClassLoader())));
        this.currency = ((Object) in.readValue((Object.class.getClassLoader())));
        this.fromDate = ((String) in.readValue((String.class.getClassLoader())));
        this.toDate = ((Object) in.readValue((Object.class.getClassLoader())));
        this.freeCancellationEndDate = ((String) in.readValue((String.class.getClassLoader())));
    }

    public CancellationPolicyList() {
    }

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

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(charge);
        dest.writeValue(chargeAmount);
        dest.writeValue(currency);
        dest.writeValue(fromDate);
        dest.writeValue(toDate);
        dest.writeValue(freeCancellationEndDate);
    }

    public int describeContents() {
        return  0;
    }

}
