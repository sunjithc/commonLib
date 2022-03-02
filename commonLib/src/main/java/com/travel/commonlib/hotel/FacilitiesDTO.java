
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.FacilitiesList;

import java.io.Serializable;
import java.util.List;

public class FacilitiesDTO implements Serializable {

    @SerializedName("FacilitiesName")
    @Expose
    private String facilitiesName;
    @SerializedName("FacilitiesList")
    @Expose
    private List<FacilitiesList> facilitiesList = null;

    public String getFacilitiesName() {
        return facilitiesName;
    }

    public void setFacilitiesName(String facilitiesName) {
        this.facilitiesName = facilitiesName;
    }

    public List<FacilitiesList> getFacilitiesList() {
        return facilitiesList;
    }

    public void setFacilitiesList(List<FacilitiesList> facilitiesList) {
        this.facilitiesList = facilitiesList;
    }

}
