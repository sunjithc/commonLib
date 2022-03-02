package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ExtraNote implements Serializable {

    @SerializedName("RoomCode")
    @Expose
    private String roomCode;
    @SerializedName("Description")
    @Expose
    private long description;
    @SerializedName("ExtraNotesName")
    @Expose
    private String extraNotesName;
    @SerializedName("Value")
    @Expose
    private String value;

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public long getDescription() {
        return description;
    }

    public void setDescription(long description) {
        this.description = description;
    }

    public String getExtraNotesName() {
        return extraNotesName;
    }

    public void setExtraNotesName(String extraNotesName) {
        this.extraNotesName = extraNotesName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
