package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddPackageResponse {

    @SerializedName("StatusCode")
    @Expose
    public String statusCode;
    @SerializedName("Message")
    @Expose
    public String message;
    @SerializedName("Data")
    @Expose
    public boolean data;
    @SerializedName("vResponse")
    @Expose
    public Object vResponse;
    @SerializedName("AgencyInsufficientBalance")
    @Expose
    public boolean agencyInsufficientBalance;
    @SerializedName("ValidationMessage")
    @Expose
    public Object validationMessage;
    @SerializedName("IsMobileApp")
    @Expose
    public boolean isMobileApp;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isData() {
        return data;
    }

    public void setData(boolean data) {
        this.data = data;
    }

    public Object getvResponse() {
        return vResponse;
    }

    public void setvResponse(Object vResponse) {
        this.vResponse = vResponse;
    }

    public boolean isAgencyInsufficientBalance() {
        return agencyInsufficientBalance;
    }

    public void setAgencyInsufficientBalance(boolean agencyInsufficientBalance) {
        this.agencyInsufficientBalance = agencyInsufficientBalance;
    }

    public Object getValidationMessage() {
        return validationMessage;
    }

    public void setValidationMessage(Object validationMessage) {
        this.validationMessage = validationMessage;
    }

    public boolean isMobileApp() {
        return isMobileApp;
    }

    public void setMobileApp(boolean mobileApp) {
        isMobileApp = mobileApp;
    }
}
