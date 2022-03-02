package com.travel.commonlib.hotel;

public class ModelSort {

    private boolean blAllStar = true;
    private boolean blNoStar = false;
    private boolean blOneStar = false;
    private boolean blTwoStar = false;
    private boolean blThreeStar = false;
    private boolean blFourStar = false;
    private boolean blFiveStar = false;

    private boolean blPrice = true;
    private boolean blRating = false;
    private boolean blName = false;
    private boolean pricelow = true;

    private String strSortPriceType = "Low";
    private String strSortRatingType = "Low";
    private String strSortHotelNameType = "Low";

    public boolean isBlAllStar() {
        return blAllStar;
    }

    public void setBlAllStar(boolean blAllStar) {
        this.blAllStar = blAllStar;
    }

    public boolean isBlNoStar() {
        return blNoStar;
    }

    public void setBlNoStar(boolean blNoStar) {
        this.blNoStar = blNoStar;
    }

    public boolean isBlOneStar() {
        return blOneStar;
    }

    public void setBlOneStar(boolean blOneStar) {
        this.blOneStar = blOneStar;
    }

    public boolean isBlTwoStar() {
        return blTwoStar;
    }

    public void setBlTwoStar(boolean blTwoStar) {
        this.blTwoStar = blTwoStar;
    }

    public boolean isBlThreeStar() {
        return blThreeStar;
    }

    public void setBlThreeStar(boolean blThreeStar) {
        this.blThreeStar = blThreeStar;
    }

    public boolean isBlFourStar() {
        return blFourStar;
    }

    public void setBlFourStar(boolean blFourStar) {
        this.blFourStar = blFourStar;
    }

    public boolean isBlFiveStar() {
        return blFiveStar;
    }

    public void setBlFiveStar(boolean blFiveStar) {
        this.blFiveStar = blFiveStar;
    }

    public String getStrSortPriceType() {
        return strSortPriceType;
    }

    public void setStrSortPriceType(String strSortPriceType) {
        this.strSortPriceType = strSortPriceType;
    }

    public String getStrSortRatingType() {
        return strSortRatingType;
    }

    public void setStrSortRatingType(String strSortRatingType) {
        this.strSortRatingType = strSortRatingType;
    }

    public String getStrSortHotelNameType() {
        return strSortHotelNameType;
    }

    public void setStrSortHotelNameType(String strSortHotelNameType) {
        this.strSortHotelNameType = strSortHotelNameType;
    }

    public boolean isBlPrice() {
        return blPrice;
    }

    public void setBlPrice(boolean blPrice) {
        this.blPrice = blPrice;
    }

    public boolean isBlRating() {
        return blRating;
    }

    public void setBlRating(boolean blRating) {
        this.blRating = blRating;
    }

    public boolean isBlName() {
        return blName;
    }

    public void setBlName(boolean blName) {
        this.blName = blName;
    }

    public boolean isPricelow() {
        return pricelow;
    }

    public void setPricelow(boolean pricelow) {
        this.pricelow = pricelow;
    }

    public static ModelSort getObject(ModelSort modelSort) {
        ModelSort model = new ModelSort();
        model.setBlAllStar(modelSort.isBlAllStar());
        model.setBlNoStar(modelSort.isBlNoStar());
        model.setBlOneStar(modelSort.isBlOneStar());
        model.setBlTwoStar(modelSort.isBlTwoStar());
        model.setBlThreeStar(modelSort.isBlThreeStar());
        model.setBlFourStar(modelSort.isBlFourStar());
        model.setBlFiveStar(modelSort.isBlFiveStar());
        model.setBlPrice(modelSort.isBlPrice());
        model.setBlRating(modelSort.isBlRating());
        model.setBlName(modelSort.isBlName());
        model.setPricelow(modelSort.isPricelow());
        model.setStrSortPriceType(modelSort.getStrSortPriceType());
        model.setStrSortRatingType(modelSort.getStrSortRatingType());
        model.setStrSortHotelNameType(modelSort.getStrSortHotelNameType());

        return model;
    }
}
