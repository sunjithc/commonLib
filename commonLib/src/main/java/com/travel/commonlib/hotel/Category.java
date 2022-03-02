
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.Facilitiesitem;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

    @SerializedName("categoryname")
    @Expose
    private String categoryname;
    @SerializedName("facilitygroupCode")
    @Expose
    private String facilitygroupCode;
    @SerializedName("facilitiesitems")
    @Expose
    private List<Facilitiesitem> facilitiesitems = null;

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getFacilitygroupCode() {
        return facilitygroupCode;
    }

    public void setFacilitygroupCode(String facilitygroupCode) {
        this.facilitygroupCode = facilitygroupCode;
    }

    public List<Facilitiesitem> getFacilitiesitems() {
        return facilitiesitems;
    }

    public void setFacilitiesitems(List<Facilitiesitem> facilitiesitems) {
        this.facilitiesitems = facilitiesitems;
    }

}
