
package com.travel.commonlib.packages.req;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Room {

    @SerializedName("adultcount")
    @Expose
    private int adultcount;
    @SerializedName("childCount")
    @Expose
    private int childCount;
    @SerializedName("childAgeList")
    @Expose
    private List<String> childAgeList = null;
    @SerializedName("total")
    @Expose
    private int total;

    public int getAdultcount() {
        return adultcount;
    }

    public void setAdultcount(int adultcount) {
        this.adultcount = adultcount;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
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
