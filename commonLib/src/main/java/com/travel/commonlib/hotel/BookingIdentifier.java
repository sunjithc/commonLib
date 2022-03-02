
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class BookingIdentifier implements Serializable {

    @SerializedName("Property")
    @Expose
    public List<Object> property = null;
    @SerializedName("Id")
    @Expose
    public String id;

}
