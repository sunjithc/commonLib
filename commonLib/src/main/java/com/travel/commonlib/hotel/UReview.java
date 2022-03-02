
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class UReview implements Serializable {

    @SerializedName("Rate")
    @Expose
    public Object rate;
    @SerializedName("Count")
    @Expose
    public Object count;
    @SerializedName("Type")
    @Expose
    public Object type;

}
