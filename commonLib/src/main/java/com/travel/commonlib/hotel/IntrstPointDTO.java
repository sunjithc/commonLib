package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class IntrstPointDTO implements Serializable {

    @SerializedName("facilityCode")
    @Expose
    private long facilityCode;
    @SerializedName("facilityGroupCode")
    @Expose
    private long facilityGroupCode;
    @SerializedName("order")
    @Expose
    private long order;
    @SerializedName("poiName")
    @Expose
    private String poiName;
    @SerializedName("distance")
    @Expose
    private String distance;
    @SerializedName("description")
    @Expose
    private String description;

    public long getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(long facilityCode) {
        this.facilityCode = facilityCode;
    }

    public long getFacilityGroupCode() {
        return facilityGroupCode;
    }

    public void setFacilityGroupCode(long facilityGroupCode) {
        this.facilityGroupCode = facilityGroupCode;
    }

    public long getOrder() {
        return order;
    }

    public void setOrder(long order) {
        this.order = order;
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
