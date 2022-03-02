
package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.Flight.Model.ResultModel.FlightTrip;
import com.travel.jumbo.Flight.Model.ResultModel.RequestInfo;

import java.io.Serializable;
import java.util.ArrayList;

public class FlightResults implements Serializable {

    @SerializedName("SearchId")
    @Expose
    private String searchId;
    @SerializedName("ResultCount")
    @Expose
    private long resultCount;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("DecimalPoint")
    @Expose
    private long decimalPoint;
    @SerializedName("SearchType")
    @Expose
    private String searchType;
    @SerializedName("FlightTrips")
    @Expose
    private ArrayList<FlightTrip> flightTrips = null;
    @SerializedName("OnwardDistinctAirlines")
    @Expose
    private String onwardDistinctAirlines;
    @SerializedName("StopOverAirports")
    @Expose
    private String stopOverAirports;
    @SerializedName("RequestInfo")
    @Expose
    private RequestInfo requestInfo;

    @SerializedName("FlightResults")
    @Expose
    private FlightResults flightResults;

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public long getResultCount() {
        return resultCount;
    }

    public void setResultCount(long resultCount) {
        this.resultCount = resultCount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getDecimalPoint() {
        return decimalPoint;
    }

    public void setDecimalPoint(long decimalPoint) {
        this.decimalPoint = decimalPoint;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public ArrayList<FlightTrip> getFlightTrips() {
        return flightTrips;
    }

    public void setFlightTrips(ArrayList<FlightTrip> flightTrips) {
        this.flightTrips = flightTrips;
    }

    public String getOnwardDistinctAirlines() {
        return onwardDistinctAirlines;
    }

    public void setOnwardDistinctAirlines(String onwardDistinctAirlines) {
        this.onwardDistinctAirlines = onwardDistinctAirlines;
    }

    public String getStopOverAirports() {
        return stopOverAirports;
    }

    public void setStopOverAirports(String stopOverAirports) {
        this.stopOverAirports = stopOverAirports;
    }

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public FlightResults getFlightResults() {
        return flightResults;
    }

    public void setFlightResults(FlightResults flightResults) {
        this.flightResults = flightResults;
    }


}
