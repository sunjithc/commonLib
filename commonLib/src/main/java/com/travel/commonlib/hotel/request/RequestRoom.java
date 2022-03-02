
package com.travel.commonlib.hotel.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RequestRoom {

    @SerializedName("adultcount")
    @Expose
    private String adultcount;
    @SerializedName("childCount")
    @Expose
    private String childCount;
    @SerializedName("childAgeList")
    @Expose
    private List<String> childAgeList = null;
    @SerializedName("total")
    @Expose
    private int total;

    public String getAdultcount() {
        return adultcount;
    }

    public void setAdultcount(String adultcount) {
        this.adultcount = adultcount;
    }

    public String getChildCount() {
        return childCount;
    }

    public void setChildCount(String childCount) {
        this.childCount = childCount;
    }

    public List<String> getChildAgeList() {
        return childAgeList;
    }

    public void setChildAgeList(List<String> childAgeList) {
        this.childAgeList = childAgeList;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
