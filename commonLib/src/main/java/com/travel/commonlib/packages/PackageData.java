package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.packages.AirlineMatrix;
import com.travel.jumbo.model.packages.FlightResults;
import com.travel.jumbo.model.packages.HotelResponse;

import java.util.List;

public class PackageData {

    @SerializedName("FlightResults")
    @Expose
    private FlightResults flightResults;
    @SerializedName("HotelResults")
    @Expose
    private HotelResponse hotelResponse;

    @SerializedName("AirlineMatrix")
    @Expose
    private List<AirlineMatrix> airlineMatrix = null;

    public FlightResults getFlightResults() {
        return flightResults;
    }

    public void setFlightResults(FlightResults flightResults) {
        this.flightResults = flightResults;
    }


    public HotelResponse getHotelResponse() {
        return hotelResponse;
    }

    public void setHotelResponse(HotelResponse hotelResponse) {
        this.hotelResponse = hotelResponse;
    }

    public List<AirlineMatrix> getAirlineMatrix() {
        return airlineMatrix;
    }

    public void setAirlineMatrix(List<AirlineMatrix> airlineMatrix) {
        this.airlineMatrix = airlineMatrix;
    }
}
