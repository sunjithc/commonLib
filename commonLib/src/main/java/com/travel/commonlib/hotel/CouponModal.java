package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CouponModal implements Serializable {

    @SerializedName("UserId")
    @Expose
    private long userId;
    @SerializedName("TransactionType")
    @Expose
    private long transactionType;
    @SerializedName("CouponCodeApplyID")
    @Expose
    private long couponCodeApplyID;
    @SerializedName("TransactionId")
    @Expose
    private long transactionId;
    @SerializedName("Code")
    @Expose
    private String code;
    @SerializedName("Flag")
    @Expose
    private Object flag;
    @SerializedName("Status")
    @Expose
    private String status;
    @SerializedName("discount")
    @Expose
    private double discount;
    @SerializedName("Ispercentage")
    @Expose
    private boolean ispercentage;
    @SerializedName("isCouponCode")
    @Expose
    private boolean isCouponCode;
    @SerializedName("successMessageEn")
    @Expose
    private Object successMessageEn;
    @SerializedName("successMessageAr")
    @Expose
    private Object successMessageAr;
    @SerializedName("isBinEnable")
    @Expose
    private boolean isBinEnable;
    @SerializedName("selectedBinSeries")
    @Expose
    private Object selectedBinSeries;

    public CouponModal() {

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(long transactionType) {
        this.transactionType = transactionType;
    }

    public long getCouponCodeApplyID() {
        return couponCodeApplyID;
    }

    public void setCouponCodeApplyID(long couponCodeApplyID) {
        this.couponCodeApplyID = couponCodeApplyID;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getFlag() {
        return flag;
    }

    public void setFlag(Object flag) {
        this.flag = flag;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isIspercentage() {
        return ispercentage;
    }

    public void setIspercentage(boolean ispercentage) {
        this.ispercentage = ispercentage;
    }

    public boolean isCouponCode() {
        return isCouponCode;
    }

    public void setCouponCode(boolean couponCode) {
        isCouponCode = couponCode;
    }

    public Object getSuccessMessageEn() {
        return successMessageEn;
    }

    public void setSuccessMessageEn(Object successMessageEn) {
        this.successMessageEn = successMessageEn;
    }

    public Object getSuccessMessageAr() {
        return successMessageAr;
    }

    public void setSuccessMessageAr(Object successMessageAr) {
        this.successMessageAr = successMessageAr;
    }

    public boolean isBinEnable() {
        return isBinEnable;
    }

    public void setBinEnable(boolean binEnable) {
        isBinEnable = binEnable;
    }

    public Object getSelectedBinSeries() {
        return selectedBinSeries;
    }

    public void setSelectedBinSeries(Object selectedBinSeries) {
        this.selectedBinSeries = selectedBinSeries;
    }
}
