package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BoardingInfo implements Serializable {

    @SerializedName("AllowBaggages")
    @Expose
    private boolean allowBaggages;
    @SerializedName("AllowPriorityBoarding")
    @Expose
    private boolean allowPriorityBoarding;
    @SerializedName("AllowCheckIn")
    @Expose
    private boolean allowCheckIn;
    @SerializedName("AllowHandBaggage")
    @Expose
    private boolean allowHandBaggage;
    @SerializedName("BaggageList")
    @Expose
    private ArrayList<BaggageList> baggageList = null;
    @SerializedName("CheckInList")
    @Expose
    private List<String> checkInList = null;
    @SerializedName("BoardingText")
    @Expose
    private String boardingText;
    @SerializedName("HandBagText")
    @Expose
    private String handBagText;
    @SerializedName("BaggageId")
    @Expose
    private int baggageId;
    @SerializedName("CheckInId")
    @Expose
    private int checkInId;
    @SerializedName("IsPriorityBoarding")
    @Expose
    private boolean isPriorityBoarding;
    @SerializedName("IsHandBaggage")
    @Expose
    private boolean isHandBaggage;
    @SerializedName("SameCheckinForAllPassenger")
    @Expose
    private boolean sameCheckinForAllPassenger;

    public boolean isAllowBaggages() {
        return allowBaggages;
    }

    public void setAllowBaggages(boolean allowBaggages) {
        this.allowBaggages = allowBaggages;
    }

    public boolean isAllowPriorityBoarding() {
        return allowPriorityBoarding;
    }

    public void setAllowPriorityBoarding(boolean allowPriorityBoarding) {
        this.allowPriorityBoarding = allowPriorityBoarding;
    }

    public boolean isAllowCheckIn() {
        return allowCheckIn;
    }

    public void setAllowCheckIn(boolean allowCheckIn) {
        this.allowCheckIn = allowCheckIn;
    }

    public boolean isAllowHandBaggage() {
        return allowHandBaggage;
    }

    public void setAllowHandBaggage(boolean allowHandBaggage) {
        this.allowHandBaggage = allowHandBaggage;
    }

    public ArrayList<BaggageList> getBaggageList() {
        return baggageList;
    }

    public void setBaggageList(ArrayList<BaggageList> baggageList) {
        this.baggageList = baggageList;
    }

    public String getBoardingText() {
        return boardingText;
    }

    public void setBoardingText(String boardingText) {
        this.boardingText = boardingText;
    }

    public String getHandBagText() {
        return handBagText;
    }

    public void setHandBagText(String handBagText) {
        this.handBagText = handBagText;
    }

    public int getBaggageId() {
        return baggageId;
    }

    public void setBaggageId(int baggageId) {
        this.baggageId = baggageId;
    }

    public int getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(int checkInId) {
        this.checkInId = checkInId;
    }

    public boolean isPriorityBoarding() {
        return isPriorityBoarding;
    }

    public void setPriorityBoarding(boolean priorityBoarding) {
        isPriorityBoarding = priorityBoarding;
    }

    public boolean isHandBaggage() {
        return isHandBaggage;
    }

    public void setHandBaggage(boolean handBaggage) {
        isHandBaggage = handBaggage;
    }

    public boolean isSameCheckinForAllPassenger() {
        return sameCheckinForAllPassenger;
    }

    public void setSameCheckinForAllPassenger(boolean sameCheckinForAllPassenger) {
        this.sameCheckinForAllPassenger = sameCheckinForAllPassenger;
    }

}
