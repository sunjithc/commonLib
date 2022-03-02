package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.PassengerDetail;

import java.io.Serializable;
import java.util.List;

public class PassengerModel implements Serializable {
    @SerializedName("PassengerDetails")
    @Expose
    private List<PassengerDetail> passengerDetails = null;
    @SerializedName("CountryCodes")
    @Expose
    private List<CountryCode> countryCodes = null;

    public List<PassengerDetail> getPassengerDetails() {
        return passengerDetails;
    }

    public void setPassengerDetails(List<PassengerDetail> passengerDetails) {
        this.passengerDetails = passengerDetails;
    }

    public List<CountryCode> getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(List<CountryCode> countryCodes) {
        this.countryCodes = countryCodes;
    }

}
