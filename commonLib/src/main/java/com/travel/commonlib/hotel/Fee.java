
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Fee implements Serializable {

    @SerializedName("FeeType")
    @Expose
    private String feeType;
    @SerializedName("Fees")
    @Expose
    private double fees;
    @SerializedName("FrequencyType")
    @Expose
    private String frequencyType;
    @SerializedName("Scope")
    @Expose
    private String scope;
    @SerializedName("RoomUniqueId")
    @Expose
    private long roomUniqueId;

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getFrequencyType() {
        return frequencyType;
    }

    public void setFrequencyType(String frequencyType) {
        this.frequencyType = frequencyType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public long getRoomUniqueId() {
        return roomUniqueId;
    }

    public void setRoomUniqueId(long roomUniqueId) {
        this.roomUniqueId = roomUniqueId;
    }

}
