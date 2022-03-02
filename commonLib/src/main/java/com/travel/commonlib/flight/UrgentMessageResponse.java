package com.travel.commonlib.flight;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.commonlib.flight.Result;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Rohith (Android) on 7/2/2021.
 */
public class UrgentMessageResponse implements Serializable {
    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("StatusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("ErrorMessage")
    @Expose
    private String errorMessage;
    @SerializedName("Result")
    @Expose
    private ArrayList<Result> result = null;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ArrayList<Result> getResult() {
        return result;
    }

    public void setResult(ArrayList<Result> result) {
        this.result = result;
    }
}
