package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FareChangeInfos {

    @SerializedName("ItemId")
    @Expose
    private String itemId;
    @SerializedName("PropertyType")
    @Expose
    private int propertyType;
    @SerializedName("IsFareChanged")
    @Expose
    private boolean isFareChanged;
    @SerializedName("PreviousAmount")
    @Expose
    private double previousAmount;
    @SerializedName("UpdatedAmount")
    @Expose
    private double updatedAmount;
    @SerializedName("Message")
    @Expose
    private String message;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public int getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(int propertyType) {
        this.propertyType = propertyType;
    }

    public boolean isFareChanged() {
        return isFareChanged;
    }

    public void setFareChanged(boolean fareChanged) {
        isFareChanged = fareChanged;
    }

    public double getPreviousAmount() {
        return previousAmount;
    }

    public void setPreviousAmount(double previousAmount) {
        this.previousAmount = previousAmount;
    }

    public double getUpdatedAmount() {
        return updatedAmount;
    }

    public void setUpdatedAmount(double updatedAmount) {
        this.updatedAmount = updatedAmount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
