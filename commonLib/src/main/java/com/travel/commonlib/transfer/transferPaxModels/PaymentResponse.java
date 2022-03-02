
package com.travel.commonlib.transfer.transferPaxModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.Transfers.model.transferPaxModels.PaymentData;

import java.io.Serializable;

public class PaymentResponse implements Serializable
{

    @SerializedName("StatusCode")
    @Expose
    private String statusCode;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Data")
    @Expose
    private com.travel.jumbo.Transfers.model.transferPaxModels.PaymentData data;

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

    public com.travel.jumbo.Transfers.model.transferPaxModels.PaymentData getData() {
        return data;
    }

    public void setData(PaymentData data) {
        this.data = data;
    }

}
