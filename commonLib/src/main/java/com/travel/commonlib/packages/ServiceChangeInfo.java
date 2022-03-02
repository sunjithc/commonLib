package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ServiceChangeInfo {
    @SerializedName("PropertyType")
    @Expose
    private long propertyType;
    @SerializedName("IsServiceChanged")
    @Expose
    private boolean isServiceChanged;
    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("ServiceChangeData")
    @Expose
    private List<ServiceChangeData> serviceChangeData = null;

    public long getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(long propertyType) {
        this.propertyType = propertyType;
    }

    public boolean isServiceChanged() {
        return isServiceChanged;
    }

    public void setServiceChanged(boolean serviceChanged) {
        isServiceChanged = serviceChanged;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ServiceChangeData> getServiceChangeData() {
        return serviceChangeData;
    }

    public void setServiceChangeData(List<ServiceChangeData> serviceChangeData) {
        this.serviceChangeData = serviceChangeData;
    }
}
