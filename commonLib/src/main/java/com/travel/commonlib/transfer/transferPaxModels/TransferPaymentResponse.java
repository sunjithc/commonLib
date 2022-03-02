package com.travel.commonlib.transfer.transferPaxModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.Transfers.model.transferPaxModels.TransferPaymentResponseData;

import java.io.Serializable;

public class TransferPaymentResponse implements Serializable {

    @SerializedName("StatusCode")
    @Expose
    private Object statusCode;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Data")
    @Expose
    private TransferPaymentResponseData data;

    public Object getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Object statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TransferPaymentResponseData getData() {
        return data;
    }

    public void setData(TransferPaymentResponseData data) {
        this.data = data;
    }
}
