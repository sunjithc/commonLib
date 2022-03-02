
package com.travel.commonlib.hotel;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;


public class HotelResponse implements Serializable {

    @SerializedName("SearchId")
    @Nullable
    @Expose
    private String searchId;
    @SerializedName("ResultCount")
    @Nullable
    @Expose
    private long resultCount;
    @SerializedName("RequestInfo")
    @Nullable
    @Expose
    private RequestInfo requestInfo;
    @SerializedName("Hotels")
    @Nullable
    @Expose
    private ArrayList<Hotel> hotels = null;


    @Nullable
    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(@Nullable String searchId) {
        this.searchId = searchId;
    }

    public long getResultCount() {
        return resultCount;
    }

    public void setResultCount(long resultCount) {
        this.resultCount = resultCount;
    }

    @Nullable
    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(@Nullable RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    @Nullable
    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(@Nullable ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

}
