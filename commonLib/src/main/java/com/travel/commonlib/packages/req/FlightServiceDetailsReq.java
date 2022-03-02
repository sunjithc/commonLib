package com.travel.commonlib.packages.req;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.Flight.Model.ResultModel.FlightTrip;
import com.travel.jumbo.Flight.Model.ResultModel.RequestInfo;

import java.util.ArrayList;

public class FlightServiceDetailsReq {

    @SerializedName("RequestType")
    @Expose
    private int requestType;
    @SerializedName("FlightTrips")
    @Expose
    private ArrayList<FlightTrip> flightTrips;
    @SerializedName("RequestInfo")
    @Expose
    private RequestInfo requestInfo;
    @SerializedName("UserInfo")
    @Expose
    private String userInfo;

    public int getRequestType() {
        return requestType;
    }

    public void setRequestType(int requestType) {
        this.requestType = requestType;
    }

    public ArrayList<FlightTrip> getFlightTrips() {
        return flightTrips;
    }

    public void setFlightTrips(ArrayList<FlightTrip> flightTrips) {
        this.flightTrips = flightTrips;
    }

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }
}
