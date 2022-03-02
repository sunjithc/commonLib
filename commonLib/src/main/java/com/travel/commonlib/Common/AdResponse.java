package com.travel.commonlib.Common;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AdResponse {

    @SerializedName("ID")
    @Expose
    private int id;
    @SerializedName("ImgDisplayedArea")
    @Expose
    private String imgDisplayedArea;
    @SerializedName("AdvertiseImageUrl")
    @Expose
    private String advertiseImageUrl;
    @SerializedName("RedirectingUrl")
    @Expose
    private String redirectingUrl;
    @SerializedName("ImageOrder")
    @Expose
    private int imageOrder;
    @SerializedName("Heading")
    @Expose
    private String heading;
    @SerializedName("Description")
    @Expose
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgDisplayedArea() {
        return imgDisplayedArea;
    }

    public void setImgDisplayedArea(String imgDisplayedArea) {
        this.imgDisplayedArea = imgDisplayedArea;
    }

    public String getAdvertiseImageUrl() {
        return advertiseImageUrl;
    }

    public void setAdvertiseImageUrl(String advertiseImageUrl) {
        this.advertiseImageUrl = advertiseImageUrl;
    }

    public String getRedirectingUrl() {
        return redirectingUrl;
    }

    public void setRedirectingUrl(String redirectingUrl) {
        this.redirectingUrl = redirectingUrl;
    }

    public int getImageOrder() {
        return imageOrder;
    }

    public void setImageOrder(int imageOrder) {
        this.imageOrder = imageOrder;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
