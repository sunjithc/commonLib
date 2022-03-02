
package com.travel.commonlib.hotel;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.KeywordDescItmsDTO;

import java.io.Serializable;
import java.util.List;


public class DescriptionItem implements Serializable {

    @SerializedName("HeaderItmsDTO")
    @Nullable
    @Expose
    private List<HeaderItmsDTO> headerItmsDTO = null;
    @SerializedName("KeywordDescItmsDTO")
    @Nullable
    @Expose
    private List<KeywordDescItmsDTO> keywordDescItmsDTO = null;
    @Nullable
    @SerializedName("AmenitiesDscDTO")
    @Expose
    private List<AmenitiesDscDTO> amenitiesDscDTO = null;
    @SerializedName("FacilitiesDTO")
    @Nullable
    @Expose
    private List<FacilitiesDTO> facilitiesDTO = null;
    @SerializedName("IntrstPointDTO")
    @Nullable
    @Expose
    private List<IntrstPointDTO> intrstPointDTO;
    @SerializedName("roomFacityDTO")
    @Nullable
    @Expose
    private String roomFacityDTO;
    @SerializedName("HotelFecilityList")
    @Nullable
    @Expose
    private List<String> hotelFecilityList = null;
    @SerializedName("HotelAttractionsList")
    @Nullable
    @Expose
    private String hotelAttractionsList;
    @SerializedName("objAmenities")
    @Nullable
    @Expose
    private String objAmenities;
    @SerializedName("HotelRoomAmenities")
    @Nullable
    @Expose
    private String hotelRoomAmenities;
    @SerializedName("ImageUrls")
    @Nullable
    @Expose
    private String imageUrls;
    @SerializedName("Latitude")
    @Nullable
    @Expose
    private String latitude;
    @SerializedName("Longitude")
    @Nullable
    @Expose
    private String longitude;
    @SerializedName("GaliloDescText")
    @Nullable
    @Expose
    private String galiloDescText;
    @SerializedName("Rooms")
    @Expose
    public Object rooms;
    @SerializedName("Roomcombination")
    @Expose
    public Object roomcombination;
    @SerializedName("HotelLogo")
    @Expose
    public Object hotelLogo;
    @SerializedName("CheckInTime")
    @Expose
    public Object checkInTime;
    @SerializedName("CheckOutTime")
    @Expose
    public Object checkOutTime;
    @SerializedName("IsNonMultiRoomSupport")
    @Expose
    public boolean isNonMultiRoomSupport;

    @org.jetbrains.annotations.Nullable
    public List<HeaderItmsDTO> getHeaderItmsDTO() {
        return headerItmsDTO;
    }

    public void setHeaderItmsDTO(@org.jetbrains.annotations.Nullable List<HeaderItmsDTO> headerItmsDTO) {
        this.headerItmsDTO = headerItmsDTO;
    }

    @org.jetbrains.annotations.Nullable
    public List<KeywordDescItmsDTO> getKeywordDescItmsDTO() {
        return keywordDescItmsDTO;
    }

    public void setKeywordDescItmsDTO(@org.jetbrains.annotations.Nullable List<KeywordDescItmsDTO> keywordDescItmsDTO) {
        this.keywordDescItmsDTO = keywordDescItmsDTO;
    }

    @org.jetbrains.annotations.Nullable
    public List<AmenitiesDscDTO> getAmenitiesDscDTO() {
        return amenitiesDscDTO;
    }

    public void setAmenitiesDscDTO(@org.jetbrains.annotations.Nullable List<AmenitiesDscDTO> amenitiesDscDTO) {
        this.amenitiesDscDTO = amenitiesDscDTO;
    }

    @org.jetbrains.annotations.Nullable
    public List<FacilitiesDTO> getFacilitiesDTO() {
        return facilitiesDTO;
    }

    public void setFacilitiesDTO(@org.jetbrains.annotations.Nullable List<FacilitiesDTO> facilitiesDTO) {
        this.facilitiesDTO = facilitiesDTO;
    }

    @org.jetbrains.annotations.Nullable
    public List<IntrstPointDTO> getIntrstPointDTO() {
        return intrstPointDTO;
    }

    public void setIntrstPointDTO(@org.jetbrains.annotations.Nullable List<IntrstPointDTO> intrstPointDTO) {
        this.intrstPointDTO = intrstPointDTO;
    }

    @org.jetbrains.annotations.Nullable
    public String getRoomFacityDTO() {
        return roomFacityDTO;
    }

    public void setRoomFacityDTO(@org.jetbrains.annotations.Nullable String roomFacityDTO) {
        this.roomFacityDTO = roomFacityDTO;
    }

    @org.jetbrains.annotations.Nullable
    public List<String> getHotelFecilityList() {
        return hotelFecilityList;
    }

    public void setHotelFecilityList(@org.jetbrains.annotations.Nullable List<String> hotelFecilityList) {
        this.hotelFecilityList = hotelFecilityList;
    }

    @org.jetbrains.annotations.Nullable
    public String getHotelAttractionsList() {
        return hotelAttractionsList;
    }

    public void setHotelAttractionsList(@org.jetbrains.annotations.Nullable String hotelAttractionsList) {
        this.hotelAttractionsList = hotelAttractionsList;
    }

    @org.jetbrains.annotations.Nullable
    public String getObjAmenities() {
        return objAmenities;
    }

    public void setObjAmenities(@org.jetbrains.annotations.Nullable String objAmenities) {
        this.objAmenities = objAmenities;
    }

    @org.jetbrains.annotations.Nullable
    public String getHotelRoomAmenities() {
        return hotelRoomAmenities;
    }

    public void setHotelRoomAmenities(@org.jetbrains.annotations.Nullable String hotelRoomAmenities) {
        this.hotelRoomAmenities = hotelRoomAmenities;
    }

    @org.jetbrains.annotations.Nullable
    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(@org.jetbrains.annotations.Nullable String imageUrls) {
        this.imageUrls = imageUrls;
    }

    @org.jetbrains.annotations.Nullable
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(@org.jetbrains.annotations.Nullable String latitude) {
        this.latitude = latitude;
    }

    @org.jetbrains.annotations.Nullable
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(@org.jetbrains.annotations.Nullable String longitude) {
        this.longitude = longitude;
    }

    @org.jetbrains.annotations.Nullable
    public String getGaliloDescText() {
        return galiloDescText;
    }

    public void setGaliloDescText(@org.jetbrains.annotations.Nullable String galiloDescText) {
        this.galiloDescText = galiloDescText;
    }

    public Object getRooms() {
        return rooms;
    }

    public void setRooms(Object rooms) {
        this.rooms = rooms;
    }

    public Object getRoomcombination() {
        return roomcombination;
    }

    public void setRoomcombination(Object roomcombination) {
        this.roomcombination = roomcombination;
    }

    public Object getHotelLogo() {
        return hotelLogo;
    }

    public void setHotelLogo(Object hotelLogo) {
        this.hotelLogo = hotelLogo;
    }

    public Object getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Object checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Object getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Object checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public boolean isNonMultiRoomSupport() {
        return isNonMultiRoomSupport;
    }

    public void setNonMultiRoomSupport(boolean nonMultiRoomSupport) {
        isNonMultiRoomSupport = nonMultiRoomSupport;
    }
}
