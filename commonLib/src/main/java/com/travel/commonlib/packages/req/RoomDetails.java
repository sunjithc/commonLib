
package com.travel.commonlib.packages.req;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RoomDetails {

    @SerializedName("noOfRoom")
    @Expose
    private int noOfRoom;
    @SerializedName("room")
    @Expose
    private List<Room> room = null;
    @SerializedName("totalPassengers")
    @Expose
    private int totalPassengers;

    public int getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(int noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void setTotalPassengers(int totalPassengers) {
        this.totalPassengers = totalPassengers;
    }

}
