
package com.travel.commonlib.hotel.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RequestRoomDetails {

    @SerializedName("NoOfRoom")
    @Expose
    private int noOfRoom;
    @SerializedName("room")
    @Expose
    private List<RequestRoom> requestRooms = null;
    @SerializedName("TotalPassengers")
    @Expose
    private int totalPassengers;

    public int getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(int noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public List<RequestRoom> getRequestRooms() {
        return requestRooms;
    }

    public void setRequestRooms(List<RequestRoom> requestRooms) {
        this.requestRooms = requestRooms;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

}
