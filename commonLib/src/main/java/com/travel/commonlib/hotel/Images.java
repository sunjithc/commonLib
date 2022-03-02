
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Images implements Serializable {

    @SerializedName("Count")
    @Expose
    private long count;
    @SerializedName("Image")
    @Expose
    private ArrayList<Image> image = null;
    @SerializedName("imageurl")
    @Expose
    private ArrayList<Image> imageurl = null;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public ArrayList<Image> getImage() {
        return image;
    }

    public void setImage(ArrayList<Image> image) {
        this.image = image;
    }

    public ArrayList<Image> getImageurl() {
        return imageurl;
    }

    public void setImageurl(ArrayList<Image> imageurl) {
        this.imageurl = imageurl;
    }
}
