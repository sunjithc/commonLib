
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Loyalty implements Serializable {
    @SerializedName("LoyalityPoints")
    @Expose
    public Double loyalityPoints;
    @SerializedName("LoyalityValue")
    @Expose
    public Double loyalityValue;

}
