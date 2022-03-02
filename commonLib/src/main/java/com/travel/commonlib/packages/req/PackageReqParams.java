
package com.travel.commonlib.packages.req;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PackageReqParams {

    @SerializedName("SearchId")
    @Expose
    private String searchId;
    @SerializedName("Category")
    @Expose
    private String category = "RoundTrip";
    @SerializedName("Itinerary")
    @Expose
    private String itinerary;
    @SerializedName("Passengerdetail")
    @Expose
    private String passengerdetail = "A-1-C-0-I-0";
    @SerializedName("SeatingClass")
    @Expose
    private String seatingClass;
    @SerializedName("IsDirect")
    @Expose
    private String isDirect;
    @SerializedName("PreferredAirline")
    @Expose
    private String preferredAirline = "all_flight";
    @SerializedName("AllowedAirport")
    @Expose
    private String allowedAirport = "N-Y";
    @SerializedName("IsFlexibleDate")
    @Expose
    private String isFlexibleDate = "false";
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("FlightApiId")
    @Expose
    private long flightApiId = 0;
    @SerializedName("HotelApiId")
    @Expose
    private long hotelApiId = 0;
    @SerializedName("CheckIn")
    @Expose
    private String checkIn;
    @SerializedName("CheckOut")
    @Expose
    private String checkOut;
    @SerializedName("Nationality")
    @Expose
    private String nationality;
    @SerializedName("RoomDetails")
    @Expose
    private RoomDetails roomDetails;
    @SerializedName("StarRating")
    @Expose
    private String starRating = "";
    @SerializedName("Location")
    @Expose
    private String location;

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItinerary() {
        return itinerary;
    }

    public void setItinerary(String itinerary) {
        this.itinerary = itinerary;
    }

    public String getPassengerdetail() {
        return passengerdetail;
    }

    public void setPassengerdetail(String passengerdetail) {
        this.passengerdetail = passengerdetail;
    }

    public String getSeatingClass() {
        return seatingClass;
    }

    public void setSeatingClass(String seatingClass) {
        this.seatingClass = seatingClass;
    }

    public String getIsDirect() {
        return isDirect;
    }

    public void setIsDirect(String isDirect) {
        this.isDirect = isDirect;
    }

    public String getPreferredAirline() {
        return preferredAirline;
    }

    public void setPreferredAirline(String preferredAirline) {
        this.preferredAirline = preferredAirline;
    }

    public String getAllowedAirport() {
        return allowedAirport;
    }

    public void setAllowedAirport(String allowedAirport) {
        this.allowedAirport = allowedAirport;
    }

    public String getIsFlexibleDate() {
        return isFlexibleDate;
    }

    public void setIsFlexibleDate(String isFlexibleDate) {
        this.isFlexibleDate = isFlexibleDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getFlightApiId() {
        return flightApiId;
    }

    public void setFlightApiId(long flightApiId) {
        this.flightApiId = flightApiId;
    }

    public long getHotelApiId() {
        return hotelApiId;
    }

    public void setHotelApiId(long hotelApiId) {
        this.hotelApiId = hotelApiId;
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

    public RoomDetails getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(RoomDetails roomDetails) {
        this.roomDetails = roomDetails;
    }

    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(String starRating) {
        this.starRating = starRating;
    }
}
