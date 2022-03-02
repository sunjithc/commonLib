
package com.travel.commonlib.activity.city;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Source {

    @SerializedName("cityid")
    @Expose
    private int cityid;
    @SerializedName("hotelid")
    @Expose
    private String hotelid;
    @SerializedName("cityname")
    @Expose
    private String cityname;
    @SerializedName("countryname")
    @Expose
    private String countryname;
    @SerializedName("citynamear")
    @Expose
    private String citynamear;
    @SerializedName("countrynamear")
    @Expose
    private String countrynamear;
    @SerializedName("countrycode")
    @Expose
    private String countrycode;
    @SerializedName("displayname")
    @Expose
    private String displayname;
    @SerializedName("displaynamear")
    @Expose
    private String displaynamear;
    @SerializedName("cityapis")
    @Expose
    private String cityapis;
    @SerializedName("allowedapis")
    @Expose
    private List<Long> allowedapis = null;
    @SerializedName("ishotel")
    @Expose
    private boolean ishotel;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("allowedhotelapis")
    @Expose
    private List<Long> allowedhotelapis = null;
    @SerializedName("hotelapis")
    @Expose
    private String hotelapis;
    @SerializedName("ranking")
    @Expose
    private Object ranking;
    @SerializedName("hotelname")
    @Expose
    private String hotelname;
    @SerializedName("hotelnamear")
    @Expose
    private String hotelnamear;
    @SerializedName("mergecityid")
    @Expose
    private Object mergecityid;
    @SerializedName("mergehotelid")
    @Expose
    private Object mergehotelid;
    @SerializedName("airportcode")
    @Expose
    private Object airportcode;
    @SerializedName("isairport")
    @Expose
    private boolean isairport;

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCitynamear() {
        return citynamear;
    }

    public void setCitynamear(String citynamear) {
        this.citynamear = citynamear;
    }

    public String getCountrynamear() {
        return countrynamear;
    }

    public void setCountrynamear(String countrynamear) {
        this.countrynamear = countrynamear;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getDisplaynamear() {
        return displaynamear;
    }

    public void setDisplaynamear(String displaynamear) {
        this.displaynamear = displaynamear;
    }

    public String getCityapis() {
        return cityapis;
    }

    public void setCityapis(String cityapis) {
        this.cityapis = cityapis;
    }

    public List<Long> getAllowedapis() {
        return allowedapis;
    }

    public void setAllowedapis(List<Long> allowedapis) {
        this.allowedapis = allowedapis;
    }

    public boolean isIshotel() {
        return ishotel;
    }

    public void setIshotel(boolean ishotel) {
        this.ishotel = ishotel;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Long> getAllowedhotelapis() {
        return allowedhotelapis;
    }

    public void setAllowedhotelapis(List<Long> allowedhotelapis) {
        this.allowedhotelapis = allowedhotelapis;
    }

    public String getHotelapis() {
        return hotelapis;
    }

    public void setHotelapis(String hotelapis) {
        this.hotelapis = hotelapis;
    }

    public Object getRanking() {
        return ranking;
    }

    public void setRanking(Object ranking) {
        this.ranking = ranking;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getHotelnamear() {
        return hotelnamear;
    }

    public void setHotelnamear(String hotelnamear) {
        this.hotelnamear = hotelnamear;
    }

    public Object getMergecityid() {
        return mergecityid;
    }

    public void setMergecityid(Object mergecityid) {
        this.mergecityid = mergecityid;
    }

    public Object getMergehotelid() {
        return mergehotelid;
    }

    public void setMergehotelid(Object mergehotelid) {
        this.mergehotelid = mergehotelid;
    }

    public Object getAirportcode() {
        return airportcode;
    }

    public void setAirportcode(Object airportcode) {
        this.airportcode = airportcode;
    }

    public boolean isIsairport() {
        return isairport;
    }

    public void setIsairport(boolean isairport) {
        this.isairport = isairport;
    }

    public String getCityname(String lang) {
        switch (lang) {
            case "ar":
                return citynamear;
            case "en":
            default:
                return cityname;
        }
    }

    public String getCountryName(String lang) {
        switch (lang) {
            case "ar":
                return countrynamear;
            case "en":
            default:
                return countryname;
        }
    }

    public String getHotelName(String lang) {
        switch (lang) {
            case "ar":
                return hotelnamear;
            case "en":
            default:
                return hotelname;
        }
    }

    public String getDisplayName(String lang) {
        switch (lang) {
            case "ar":
                return displaynamear;
            case "en":
            default:
                return displayname;
        }
    }

}
