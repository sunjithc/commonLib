
package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailabilityInfo {

    @SerializedName("ItemId")
    @Expose
    private String itemId;
    @SerializedName("PropertyType")
    @Expose
    private long propertyType;
    @SerializedName("IsAvailable")
    @Expose
    private boolean isAvailable;
    @SerializedName("Message")
    @Expose
    private String message;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public long getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(long propertyType) {
        this.propertyType = propertyType;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
