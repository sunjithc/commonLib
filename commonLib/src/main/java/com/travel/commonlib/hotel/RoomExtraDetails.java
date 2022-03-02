
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.BookingIdentifier;

import java.io.Serializable;

public class RoomExtraDetails implements Serializable {

    @SerializedName("AllocationDetails")
    @Expose
    private String allocationDetails;
    @SerializedName("HotelRoomTypeCode")
    @Expose
    private String hotelRoomTypeCode;
    @SerializedName("RateBasisId")
    @Expose
    private int rateBasisId;
    @SerializedName("ExtraBed")
    @Expose
    private long extraBed;
    @SerializedName("AdultsCode")
    @Expose
    private long adultsCode;
    @SerializedName("ChildrenCode")
    @Expose
    private long childrenCode;
    @SerializedName("NamesRequiredOnBooking")
    @Expose
    private long namesRequiredOnBooking;
    @SerializedName("IsChangedOccupancy")
    @Expose
    private boolean isChangedOccupancy;
    @SerializedName("childrenAges")
    @Expose
    private String childrenAges;
    @SerializedName("BookingIdentifier")
    @Expose
    public BookingIdentifier bookingIdentifier;
    @SerializedName("RoomExtraKeys")
    @Expose
    public Object roomExtraKeys;

    public String getAllocationDetails() {
        return allocationDetails;
    }

    public void setAllocationDetails(String allocationDetails) {
        this.allocationDetails = allocationDetails;
    }

    public int getRateBasisId() {
        return rateBasisId;
    }

    public void setRateBasisId(int rateBasisId) {
        this.rateBasisId = rateBasisId;
    }

    public String getHotelRoomTypeCode() {
        return hotelRoomTypeCode;
    }

    public void setHotelRoomTypeCode(String hotelRoomTypeCode) {
        this.hotelRoomTypeCode = hotelRoomTypeCode;
    }

    public long getExtraBed() {
        return extraBed;
    }

    public void setExtraBed(long extraBed) {
        this.extraBed = extraBed;
    }

    public long getAdultsCode() {
        return adultsCode;
    }

    public void setAdultsCode(long adultsCode) {
        this.adultsCode = adultsCode;
    }

    public long getChildrenCode() {
        return childrenCode;
    }

    public void setChildrenCode(long childrenCode) {
        this.childrenCode = childrenCode;
    }

    public long getNamesRequiredOnBooking() {
        return namesRequiredOnBooking;
    }

    public void setNamesRequiredOnBooking(long namesRequiredOnBooking) {
        this.namesRequiredOnBooking = namesRequiredOnBooking;
    }

    public boolean isIsChangedOccupancy() {
        return isChangedOccupancy;
    }

    public void setIsChangedOccupancy(boolean isChangedOccupancy) {
        this.isChangedOccupancy = isChangedOccupancy;
    }

    public String getChildrenAges() {
        return childrenAges;
    }

    public void setChildrenAges(String childrenAges) {
        this.childrenAges = childrenAges;
    }

    public boolean isChangedOccupancy() {
        return isChangedOccupancy;
    }

    public void setChangedOccupancy(boolean changedOccupancy) {
        isChangedOccupancy = changedOccupancy;
    }

    public BookingIdentifier getBookingIdentifier() {
        return bookingIdentifier;
    }

    public void setBookingIdentifier(BookingIdentifier bookingIdentifier) {
        this.bookingIdentifier = bookingIdentifier;
    }

    public Object getRoomExtraKeys() {
        return roomExtraKeys;
    }

    public void setRoomExtraKeys(Object roomExtraKeys) {
        this.roomExtraKeys = roomExtraKeys;
    }
}
