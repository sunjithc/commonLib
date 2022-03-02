package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class HeaderItmsDTO implements Serializable {

    @SerializedName("ChainCode")
    @Expose
    private String chainCode;
    @SerializedName("RoomMasNum")
    @Expose
    private String roomMasNum;
    @SerializedName("HotelName")
    @Expose
    private String hotelName;
    @SerializedName("Price")
    @Expose
    private double price;

    public String getChainCode() {
        return chainCode;
    }

    public void setChainCode(String chainCode) {
        this.chainCode = chainCode;
    }

    public String getRoomMasNum() {
        return roomMasNum;
    }

    public void setRoomMasNum(String roomMasNum) {
        this.roomMasNum = roomMasNum;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
