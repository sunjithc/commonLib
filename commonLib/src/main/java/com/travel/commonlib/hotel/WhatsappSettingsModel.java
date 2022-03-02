package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WhatsappSettingsModel implements Serializable {
    public boolean status;
    @SerializedName("WhatsappCharge")
    @Expose
    public String whatsappCharge;
    @SerializedName("Ispercentage")
    @Expose
    public boolean ispercentage;
    @SerializedName("IsWhatsappenabled")
    @Expose
    public boolean isWhatsappenabled;
    @SerializedName("errorInfo")
    @Expose
    public String errorInfo;
    @SerializedName("BaseCurrency")
    @Expose
    public String baseCurrency;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getWhatsappCharge() {
        return whatsappCharge;
    }

    public void setWhatsappCharge(String whatsappCharge) {
        this.whatsappCharge = whatsappCharge;
    }

    public boolean isIspercentage() {
        return ispercentage;
    }

    public void setIspercentage(boolean ispercentage) {
        this.ispercentage = ispercentage;
    }

    public boolean isWhatsappenabled() {
        return isWhatsappenabled;
    }

    public void setWhatsappenabled(boolean whatsappenabled) {
        isWhatsappenabled = whatsappenabled;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
}
