package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AmenitiesDscDTO implements Serializable {
    @SerializedName("AmenitiesName")
    @Expose
    private String amenitiesName;
    @SerializedName("AmenitiesText")
    @Expose
    private String amenitiesText;
    @SerializedName("NoOfRoom")
    @Expose
    private String noOfRoom;

    public String getAmenitiesName() {
        return amenitiesName;
    }

    public void setAmenitiesName(String amenitiesName) {
        this.amenitiesName = amenitiesName;
    }

    public String getAmenitiesText() {
        return amenitiesText;
    }

    public void setAmenitiesText(String amenitiesText) {
        this.amenitiesText = amenitiesText;
    }

    public String getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(String noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

}
