package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.Hotel;

public class CancellationData {

    @SerializedName("PropertyType")
    @Expose
    private long propertyType;
    @SerializedName("_DetailJson")
    @Expose
    private Hotel hotel;

    public long getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(long propertyType) {
        this.propertyType = propertyType;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
