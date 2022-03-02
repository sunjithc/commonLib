
package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PackPayResponse {

    @SerializedName("StatusCode")
    @Expose
    private String statusCode;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Data")
    @Expose
    private PayData payData;

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

    public PayData getPayData() {
        return payData;
    }

    public void setPayData(PayData payData) {
        this.payData = payData;
    }
}
