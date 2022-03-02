
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Amenitie implements Serializable {

    @SerializedName("Count")
    @Expose
    private long count;
//    @SerializedName("AmenitieItem")
//    @Expose
//    private String amenitieItem;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

//    public String getAmenitieItem() {
//        return amenitieItem;
//    }
//
//    public void setAmenitieItem(String amenitieItem) {
//        this.amenitieItem = amenitieItem;
//    }

}
