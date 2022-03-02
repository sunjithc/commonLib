package com.travel.commonlib;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class LoyaltyModel implements Serializable {
    @SerializedName("StatusCode")
    @Expose
    String StatusCode;
    @SerializedName("Message")
    @Expose
    String Message;
    @SerializedName("Data")
    @Expose
    Loyalty_Data data;
    @SerializedName("IsMobileApp")
    @Expose
    boolean isMobileApp;
    @SerializedName("ValidationMessage")
    @Expose
    String validationMessage;
    @SerializedName("AgencyInsufficientBalance")
    @Expose
    boolean agencyInsufficientBalance;
    @SerializedName("vResponse")
    @Expose
    Object v_Response;

    public boolean isMobileApp() {
        return isMobileApp;
    }

    public void setMobileApp(boolean mobileApp) {
        isMobileApp = mobileApp;
    }

    public String getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }

    public boolean isAgencyInsufficientBalance() {
        return agencyInsufficientBalance;
    }

    public void setAgencyInsufficientBalance(boolean agencyInsufficientBalance) {
        this.agencyInsufficientBalance = agencyInsufficientBalance;
    }

    public Object getV_Response() {
        return v_Response;
    }

    public void setV_Response(Object v_Response) {
        this.v_Response = v_Response;
    }

    public String getStatusCode() {
        return StatusCode;
    }

    public void setStatusCode(String statusCode) {
        StatusCode = statusCode;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Loyalty_Data getData() {
        return data;
    }

    public void setData(Loyalty_Data data) {
        this.data = data;
    }
}
