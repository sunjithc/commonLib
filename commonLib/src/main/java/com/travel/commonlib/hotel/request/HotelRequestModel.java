
package com.travel.commonlib.hotel.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.request.RequestRoomDetails;

public class HotelRequestModel {

    @SerializedName("searchID")
    @Expose
    private String searchID;
    @SerializedName("apiID")
    @Expose
    private String apiID;
    @SerializedName("locationDetails")
    @Expose
    private String locationDetails;
    @SerializedName("searchType")
    @Expose
    private String searchType = "Hotel";
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("checkIn")
    @Expose
    private String checkIn;
    @SerializedName("checkOut")
    @Expose
    private String checkOut;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("selectedCurrency")
    @Expose
    private String selectedCurrency;
    @SerializedName("starRating")
    @Expose
    private String starRating;
    @SerializedName("RoomDetails")
    @Expose
    private RequestRoomDetails requestRoomDetails;
    @SerializedName("CountryOfResidence")
    @Expose
    private String countryOfResidence;
    @SerializedName("IsCompressedResult")
    @Expose
    private boolean isCompressedResult;

    public String getSearchID() {
        return searchID;
    }

    public void setSearchID(String searchID) {
        this.searchID = searchID;
    }

    public String getApiID() {
        return apiID;
    }

    public void setApiID(String apiID) {
        this.apiID = apiID;
    }

    public String getLocationDetails() {
        return locationDetails;
    }

    public void setLocationDetails(String locationDetails) {
        this.locationDetails = locationDetails;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSelectedCurrency() {
        return selectedCurrency;
    }

    public void setSelectedCurrency(String selectedCurrency) {
        this.selectedCurrency = selectedCurrency;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }

    public RequestRoomDetails getRequestRoomDetails() {
        return requestRoomDetails;
    }

    public void setRequestRoomDetails(RequestRoomDetails requestRoomDetails) {
        this.requestRoomDetails = requestRoomDetails;
    }
    public void setCompressedResult(boolean isCompressedReult){ this.isCompressedResult = isCompressedReult;}


    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }
}
