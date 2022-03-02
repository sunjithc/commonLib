package com.travel.commonlib.transfer;

import java.io.Serializable;
import java.util.Date;

public class TransfersSearchModel implements Serializable {

    int triptype = 2;

    String pickUpPoint;
    String pickUpStation;
    String pickUpLocationName;
    String pickUpHotelCode;
    String pickUpType = "";
    String pickUpDateString;
    String pickUpDayMonthString;
    String pickUpYearString;
    String pickUpTime;
    Date pickUpDate;

    String dropOffHotelCode;
    String dropOffPoint;
    String dropOffStation;
    String dropOffLocationName;
    String dropOffType = "";
    String dropOffDateString;
    String dropOffDayMonthString;
    String dropOffYearString;
    String dropOffTime;
    Date dropOffDate;

    int adultCount;
    int childCount;
    int childOneAge;
    int childTwoAge;

    String searchId;

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public String getPickUpHotelCode() {
        return pickUpHotelCode;
    }

    public void setPickUpHotelCode(String pickUpHotelCode) {
        this.pickUpHotelCode = pickUpHotelCode;
    }

    public String getDropOffHotelCode() {
        return dropOffHotelCode;
    }

    public void setDropOffHotelCode(String dropOffHotelCode) {
        this.dropOffHotelCode = dropOffHotelCode;
    }

    public String getPickUpLocationName() {
        return pickUpLocationName;
    }

    public void setPickUpLocationName(String pickUpLocationName) {
        this.pickUpLocationName = pickUpLocationName;
    }

    public String getDropOffLocationName() {
        return dropOffLocationName;
    }

    public void setDropOffLocationName(String dropOffLocationName) {
        this.dropOffLocationName = dropOffLocationName;
    }

    public String getPickUpType() {
        return pickUpType;
    }

    public void setPickUpType(String pickUpType) {
        this.pickUpType = pickUpType;
    }

    public String getDropOffType() {
        return dropOffType;
    }

    public void setDropOffType(String dropOffType) {
        this.dropOffType = dropOffType;
    }

    public int getTriptype() {
        return triptype;
    }

    public void setTriptype(int triptype) {
        this.triptype = triptype;
    }

    public String getPickUpPoint() {
        return pickUpPoint;
    }

    public void setPickUpPoint(String pickUpPoint) {
        this.pickUpPoint = pickUpPoint;
    }

    public String getPickUpStation() {
        return pickUpStation;
    }

    public void setPickUpStation(String pickUpStation) {
        this.pickUpStation = pickUpStation;
    }

    public String getDropOffPoint() {
        return dropOffPoint;
    }

    public void setDropOffPoint(String dropOffPoint) {
        this.dropOffPoint = dropOffPoint;
    }

    public String getDropOffStation() {
        return dropOffStation;
    }

    public void setDropOffStation(String dropOffStation) {
        this.dropOffStation = dropOffStation;
    }

    public String getPickUpDateString() {
        return pickUpDateString;
    }

    public void setPickUpDateString(String pickUpDateString) {
        this.pickUpDateString = pickUpDateString;
    }

    public String getPickUpDayMonthString() {
        return pickUpDayMonthString;
    }

    public void setPickUpDayMonthString(String pickUpDayMonthString) {
        this.pickUpDayMonthString = pickUpDayMonthString;
    }

    public String getPickUpYearString() {
        return pickUpYearString;
    }

    public void setPickUpYearString(String pickUpYearString) {
        this.pickUpYearString = pickUpYearString;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public String getDropOffDateString() {
        return dropOffDateString;
    }

    public void setDropOffDateString(String dropOffDateString) {
        this.dropOffDateString = dropOffDateString;
    }

    public String getDropOffDayMonthString() {
        return dropOffDayMonthString;
    }

    public void setDropOffDayMonthString(String dropOffDayMonthString) {
        this.dropOffDayMonthString = dropOffDayMonthString;
    }

    public String getDropOffYearString() {
        return dropOffYearString;
    }

    public void setDropOffYearString(String dropOffYearString) {
        this.dropOffYearString = dropOffYearString;
    }

    public String getDropOffTime() {
        return dropOffTime;
    }

    public void setDropOffTime(String dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public Date getDropOffDate() {
        return dropOffDate;
    }

    public void setDropOffDate(Date dropOffDate) {
        this.dropOffDate = dropOffDate;
    }

    public int getAdultCount() {
        return adultCount;
    }

    public void setAdultCount(int adultCount) {
        this.adultCount = adultCount;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getChildOneAge() {
        return childOneAge;
    }

    public void setChildOneAge(int childOneAge) {
        this.childOneAge = childOneAge;
    }

    public int getChildTwoAge() {
        return childTwoAge;
    }

    public void setChildTwoAge(int childTwoAge) {
        this.childTwoAge = childTwoAge;
    }


}
