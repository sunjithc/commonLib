
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class FacilitiesList implements Serializable {

    @SerializedName("DescriptionText")
    @Expose
    private String descriptionText;
    @SerializedName("FacilitiesSubName")
    @Expose
    private String facilitiesSubName;
    @SerializedName("IsChargeable")
    @Expose
    private boolean isChargeable;
    @SerializedName("Amount")
    @Expose
    private String amount;
    @SerializedName("Currency")
    @Expose
    private String currency;

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public String getFacilitiesSubName() {
        return facilitiesSubName;
    }

    public void setFacilitiesSubName(String facilitiesSubName) {
        this.facilitiesSubName = facilitiesSubName;
    }

    public boolean isIsChargeable() {
        return isChargeable;
    }

    public void setIsChargeable(boolean isChargeable) {
        this.isChargeable = isChargeable;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
