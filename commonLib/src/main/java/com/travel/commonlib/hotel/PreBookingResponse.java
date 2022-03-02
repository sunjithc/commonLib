
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PreBookingResponse {
    @SerializedName("hotelBookInfo")
    @Expose
    public HotelBookInfo hotelBookInfo;

    public HotelBookInfo getHotelBookInfo() {
        return hotelBookInfo;
    }

    public void setHotelBookInfo(HotelBookInfo hotelBookInfo) {
        this.hotelBookInfo = hotelBookInfo;
    }
}
