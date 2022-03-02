package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PreferenceInfo implements Serializable {
    
    @SerializedName("PassengerPreferenceId")
    @Expose
    private int passengerPreferenceId;
    @SerializedName("SsrAirline")
    @Expose
    private String ssrAirline;
    @SerializedName("SegmentNumber")
    @Expose
    private int segmentNumber;
    @SerializedName("SsrClass")
    @Expose
    private String ssrClass;
    @SerializedName("SsrCode")
    @Expose
    private String ssrCode;
    @SerializedName("SsrDateOfJourney")
    @Expose
    private String ssrDateOfJourney;
    @SerializedName("SsrStartPoint")
    @Expose
    private String ssrStartPoint;
    @SerializedName("SsrEndPoint")
    @Expose
    private String ssrEndPoint;
    @SerializedName("SsrFltNum")
    @Expose
    private String ssrFltNum;
    @SerializedName("SsrText")
    @Expose
    private String ssrText;
    @SerializedName("SsrType")
    @Expose
    private String ssrType;

    public int getPassengerPreferenceId() {
        return passengerPreferenceId;
    }

    public void setPassengerPreferenceId(int passengerPreferenceId) {
        this.passengerPreferenceId = passengerPreferenceId;
    }

    public String getSsrAirline() {
        return ssrAirline;
    }

    public void setSsrAirline(String ssrAirline) {
        this.ssrAirline = ssrAirline;
    }

    public int getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentNumber(int segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public String getSsrClass() {
        return ssrClass;
    }

    public void setSsrClass(String ssrClass) {
        this.ssrClass = ssrClass;
    }

    public String getSsrCode() {
        return ssrCode;
    }

    public void setSsrCode(String ssrCode) {
        this.ssrCode = ssrCode;
    }

    public String getSsrDateOfJourney() {
        return ssrDateOfJourney;
    }

    public void setSsrDateOfJourney(String ssrDateOfJourney) {
        this.ssrDateOfJourney = ssrDateOfJourney;
    }

    public String getSsrStartPoint() {
        return ssrStartPoint;
    }

    public void setSsrStartPoint(String ssrStartPoint) {
        this.ssrStartPoint = ssrStartPoint;
    }

    public String getSsrEndPoint() {
        return ssrEndPoint;
    }

    public void setSsrEndPoint(String ssrEndPoint) {
        this.ssrEndPoint = ssrEndPoint;
    }

    public String getSsrFltNum() {
        return ssrFltNum;
    }

    public void setSsrFltNum(String ssrFltNum) {
        this.ssrFltNum = ssrFltNum;
    }

    public String getSsrText() {
        return ssrText;
    }

    public void setSsrText(String ssrText) {
        this.ssrText = ssrText;
    }

    public String getSsrType() {
        return ssrType;
    }

    public void setSsrType(String ssrType) {
        this.ssrType = ssrType;
    }
}
