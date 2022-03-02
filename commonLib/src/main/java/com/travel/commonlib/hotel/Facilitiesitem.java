
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Facilitiesitem implements Serializable {

    @SerializedName("facilitycode")
    @Expose
    private String facilitycode;
    @SerializedName("itemname")
    @Expose
    private String itemname;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("itemtype")
    @Expose
    private Object itemtype;
    @SerializedName("isChargeable")
    @Expose
    private boolean isChargeable;
    @SerializedName("categoryname")
    @Expose
    public Object categoryname;


    public String getFacilitycode() {
        return facilitycode;
    }

    public void setFacilitycode(String facilitycode) {
        this.facilitycode = facilitycode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getItemtype() {
        return itemtype;
    }

    public void setItemtype(Object itemtype) {
        this.itemtype = itemtype;
    }

    public boolean isIsChargeable() {
        return isChargeable;
    }

    public void setIsChargeable(boolean isChargeable) {
        this.isChargeable = isChargeable;
    }

    public Object getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(Object categoryname) {
        this.categoryname = categoryname;
    }
}
