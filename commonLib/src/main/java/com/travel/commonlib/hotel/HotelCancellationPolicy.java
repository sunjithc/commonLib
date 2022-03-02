package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HotelCancellationPolicy {

    @SerializedName("ExtraNotes")
    @Expose
    private List<ExtraNote> extraNotes = null;
    @SerializedName("CancellationPolicy")
    @Expose
    private CancellationPolicy cancellationPolicy;
    @SerializedName("RoomName")
    @Expose
    private String roomName;

    public List<ExtraNote> getExtraNotes() {
        return extraNotes;
    }

    public void setExtraNotes(List<ExtraNote> extraNotes) {
        this.extraNotes = extraNotes;
    }

    public CancellationPolicy getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(CancellationPolicy cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
