package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Facilities  implements Serializable {

    @SerializedName("categoryname")
    @Expose
    private String categoryName;
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

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

    public boolean isChargeable() {
        return isChargeable;
    }

    public void setChargeable(boolean chargeable) {
        isChargeable = chargeable;
    }
}
