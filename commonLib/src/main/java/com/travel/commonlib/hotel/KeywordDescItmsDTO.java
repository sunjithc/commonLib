
package com.travel.commonlib.hotel;

import android.os.Parcel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class KeywordDescItmsDTO implements Serializable {

    @SerializedName("DescriptionName")
    @Expose
    private String descriptionName;
    @SerializedName("DescriptionText")
    @Expose
    private String descriptionText;

    protected KeywordDescItmsDTO(Parcel in) {
        descriptionName = in.readString();
        descriptionText = in.readString();
    }

    public String getDescriptionName() {
        return descriptionName;
    }

    public void setDescriptionName(String descriptionName) {
        this.descriptionName = descriptionName;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

}
