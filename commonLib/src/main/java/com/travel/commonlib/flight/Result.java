package com.travel.commonlib.flight;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Rohith (Android) on 7/2/2021.
 */
public class Result implements Serializable {
    @SerializedName("fid")
    @Expose
    private String fid;
    @SerializedName("fbcid")
    @Expose
    private Integer fbcid;
    @SerializedName("property")
    @Expose
    private String property;
    @SerializedName("placefrom")
    @Expose
    private String placefrom;
    @SerializedName("placeto")
    @Expose
    private String placeto;
    @SerializedName("airline")
    @Expose
    private String airline;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("sportsSearchEntity")
    @Expose
    private String sportsSearchEntity;
    @SerializedName("sportsSearchLocation")
    @Expose
    private String sportsSearchLocation;
    @SerializedName("rplacefrom")
    @Expose
    private String rplacefrom;
    @SerializedName("rplaceto")
    @Expose
    private String rplaceto;
    @SerializedName("acity")
    @Expose
    private String acity;
    @SerializedName("result_count")
    @Expose
    private String resultCount;
    @SerializedName("popularitymessage")
    @Expose
    private String popularitymessage;
    @SerializedName("popularitymessagearb")
    @Expose
    private String popularitymessagearb;
    @SerializedName("availabilitymessage")
    @Expose
    private String availabilitymessage;
    @SerializedName("availabilitymessagearb")
    @Expose
    private String availabilitymessagearb;
    @SerializedName("countdownmessage")
    @Expose
    private String countdownmessage;
    @SerializedName("countdownmessagearb")
    @Expose
    private String countdownmessagearb;
    @SerializedName("isactive")
    @Expose
    private String isactive;
    @SerializedName("isupdate")
    @Expose
    private Boolean isupdate;
    @SerializedName("hotelname")
    @Expose
    private String hotelname;

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public Integer getFbcid() {
        return fbcid;
    }

    public void setFbcid(Integer fbcid) {
        this.fbcid = fbcid;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getPlacefrom() {
        return placefrom;
    }

    public void setPlacefrom(String placefrom) {
        this.placefrom = placefrom;
    }

    public String getPlaceto() {
        return placeto;
    }

    public void setPlaceto(String placeto) {
        this.placeto = placeto;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSportsSearchEntity() {
        return sportsSearchEntity;
    }

    public void setSportsSearchEntity(String sportsSearchEntity) {
        this.sportsSearchEntity = sportsSearchEntity;
    }

    public String getSportsSearchLocation() {
        return sportsSearchLocation;
    }

    public void setSportsSearchLocation(String sportsSearchLocation) {
        this.sportsSearchLocation = sportsSearchLocation;
    }

    public String getRplacefrom() {
        return rplacefrom;
    }

    public void setRplacefrom(String rplacefrom) {
        this.rplacefrom = rplacefrom;
    }

    public String getRplaceto() {
        return rplaceto;
    }

    public void setRplaceto(String rplaceto) {
        this.rplaceto = rplaceto;
    }

    public String getAcity() {
        return acity;
    }

    public void setAcity(String acity) {
        this.acity = acity;
    }

    public String getResultCount() {
        return resultCount;
    }

    public void setResultCount(String resultCount) {
        this.resultCount = resultCount;
    }

    public String getPopularitymessage() {
        return popularitymessage;
    }

    public void setPopularitymessage(String popularitymessage) {
        this.popularitymessage = popularitymessage;
    }

    public String getPopularitymessagearb() {
        return popularitymessagearb;
    }

    public void setPopularitymessagearb(String popularitymessagearb) {
        this.popularitymessagearb = popularitymessagearb;
    }

    public String getAvailabilitymessage() {
        return availabilitymessage;
    }

    public void setAvailabilitymessage(String availabilitymessage) {
        this.availabilitymessage = availabilitymessage;
    }

    public String getAvailabilitymessagearb() {
        return availabilitymessagearb;
    }

    public void setAvailabilitymessagearb(String availabilitymessagearb) {
        this.availabilitymessagearb = availabilitymessagearb;
    }

    public String getCountdownmessage() {
        return countdownmessage;
    }

    public void setCountdownmessage(String countdownmessage) {
        this.countdownmessage = countdownmessage;
    }

    public String getCountdownmessagearb() {
        return countdownmessagearb;
    }

    public void setCountdownmessagearb(String countdownmessagearb) {
        this.countdownmessagearb = countdownmessagearb;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public Boolean getIsupdate() {
        return isupdate;
    }

    public void setIsupdate(Boolean isupdate) {
        this.isupdate = isupdate;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }
}
