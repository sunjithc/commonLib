
package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AirlineMatrix implements Serializable {

    @SerializedName("OperatingVender")
    @Expose
    private String operatingVender;
    @SerializedName("OperatingAirlineName")
    @Expose
    private String operatingAirlineName;
    @SerializedName("FinalTotalFare")
    @Expose
    private double finalTotalFare;

    public String getOperatingVender() {
        return operatingVender;
    }

    public void setOperatingVender(String operatingVender) {
        this.operatingVender = operatingVender;
    }

    public String getOperatingAirlineName() {
        return operatingAirlineName;
    }

    public void setOperatingAirlineName(String operatingAirlineName) {
        this.operatingAirlineName = operatingAirlineName;
    }

    public double getFinalTotalFare() {
        return finalTotalFare;
    }

    public void setFinalTotalFare(double finalTotalFare) {
        this.finalTotalFare = finalTotalFare;
    }

}
