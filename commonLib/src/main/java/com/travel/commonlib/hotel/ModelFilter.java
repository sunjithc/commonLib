package com.travel.commonlib.hotel;


import com.travel.jumbo.model.hotel.FilterBoardType;

import java.util.ArrayList;

public class ModelFilter extends ModelSort {

    private double filterMinPrice;
    private double filterMaxPrice;

    private boolean blFilterPrice = false;
//    private boolean blFilterRefund = false;
    private boolean blFilterName = false;
    private boolean blFilterLocation = false;
    private boolean blFilterAddress = false;
    private boolean blFilterBoardTypes = false;
    private String strSearchName = "";
    private String strLocation = "";
    private String strAddress = "";
    private ArrayList<FilterBoardType> alBoardType;
    private boolean isBoardType = false;
    private ArrayList<FilterBoardType> facilities;
    private boolean isFacility = false;
    int[] starCount;
    boolean isRefundable = false;
    int refundableCount = 0;
    boolean isNonRefundable = false;
    int nonRefundableCount = 0;

    private int pWheelChairCount;
    private boolean isPWheelChair = false;
    private int pMultiStaffCount;
    private boolean isPMultiStaff = false;
    private int pCarParkCount;
    private boolean isPCarPark = false;
    private int pLiftCount;
    private boolean isPLift = false;
    private int pLargePetsCount;
    private boolean isPLargePets = false;
    private int pSmallPetsCount;
    private boolean isPSmallPets = false;

    private int fGymCount;
    private boolean isFGym = false;
    private int fPlaygroundCount;
    private boolean isFPlayground = false;
    private int fGameRoomCount;
    private boolean isFGameRoom = false;
    private int fNightClubCount;
    private boolean isFNightClub = false;

    public double getFilterMinPrice() {
        return filterMinPrice;
    }

    public void setFilterMinPrice(double filterMinPrice) {
        this.filterMinPrice = filterMinPrice;
    }

    public double getFilterMaxPrice() {
        return filterMaxPrice;
    }

    public void setFilterMaxPrice(double filterMaxPrice) {
        this.filterMaxPrice = filterMaxPrice;
    }

    public Boolean getBlFilterPrice() {
        return blFilterPrice;
    }

    public void setBlFilterPrice(Boolean blFilterPrice) {
        this.blFilterPrice = blFilterPrice;
    }

//    public boolean isBlFilterRefund() {
//        return blFilterRefund;
//    }
//
//    public void setBlFilterRefund(boolean blFilterRefund) {
//        this.blFilterRefund = blFilterRefund;
//    }

    public Boolean getBlFilterName() {
        return blFilterName;
    }

    public void setBlFilterName(Boolean blFilterName) {
        this.blFilterName = blFilterName;
    }

    public Boolean getBlFilterBoardTypes() {
        return blFilterBoardTypes;
    }

    public void setBlFilterBoardTypes(Boolean blFilterBoardTypes) {
        this.blFilterBoardTypes = blFilterBoardTypes;
    }

    public String getStrSearchName() {
        return strSearchName;
    }

    public void setStrSearchName(String strSearchName) {
        this.strSearchName = strSearchName;
    }

    public ArrayList<FilterBoardType> getAlBoardType() {
        return alBoardType;
    }

    public void setAlBoardType(ArrayList<FilterBoardType> alBoardType) {
        this.alBoardType = alBoardType;
    }

    public boolean isBoardType() {
        return isBoardType;
    }

    public void setBoardType(boolean boardType) {
        isBoardType = boardType;
    }

    public ArrayList<FilterBoardType> getFacilities() {
        return facilities;
    }

    public void setFacilities(ArrayList<FilterBoardType> facilities) {
        this.facilities = facilities;
    }

    public boolean isFacility() {
        return isFacility;
    }

    public void setFacility(boolean facility) {
        isFacility = facility;
    }

    public boolean isBlFilterLocation() {
        return blFilterLocation;
    }

    public void setBlFilterLocation(boolean blFilterLocation) {
        this.blFilterLocation = blFilterLocation;
    }

    public boolean isBlFilterAddress() {
        return blFilterAddress;
    }

    public void setBlFilterAddress(boolean blFilterAddress) {
        this.blFilterAddress = blFilterAddress;
    }

    public String getStrLocation() {
        return strLocation;
    }

    public void setStrLocation(String strLocation) {
        this.strLocation = strLocation;
    }

    public String getStrAddress() {
        return strAddress;
    }

    public void setStrAddress(String strAddress) {
        this.strAddress = strAddress;
    }

    public boolean isBlFilterPrice() {
        return blFilterPrice;
    }

    public void setBlFilterPrice(boolean blFilterPrice) {
        this.blFilterPrice = blFilterPrice;
    }

    public boolean isBlFilterName() {
        return blFilterName;
    }

    public void setBlFilterName(boolean blFilterName) {
        this.blFilterName = blFilterName;
    }

    public boolean isBlFilterBoardTypes() {
        return blFilterBoardTypes;
    }

    public void setBlFilterBoardTypes(boolean blFilterBoardTypes) {
        this.blFilterBoardTypes = blFilterBoardTypes;
    }

    public int[] getStarCount() {
        return starCount;
    }

    public void setStarCount(int[] starCount) {
        this.starCount = starCount;
    }

    public boolean isRefundable() {
        return isRefundable;
    }

    public void setRefundable(boolean refundable) {
        isRefundable = refundable;
    }

    public boolean isNonRefundable() {
        return isNonRefundable;
    }

    public void setNonRefundable(boolean nonRefundable) {
        isNonRefundable = nonRefundable;
    }

    public int getRefundableCount() {
        return refundableCount;
    }

    public void setRefundableCount(int refundableCount) {
        this.refundableCount = refundableCount;
    }

    public int getNonRefundableCount() {
        return nonRefundableCount;
    }

    public void setNonRefundableCount(int nonRefundableCount) {
        this.nonRefundableCount = nonRefundableCount;
    }

    public int getpWheelChairCount() {
        return pWheelChairCount;
    }

    public void setpWheelChairCount(int pWheelChairCount) {
        this.pWheelChairCount = pWheelChairCount;
    }

    public boolean isPWheelChair() {
        return isPWheelChair;
    }

    public void setPWheelChair(boolean PWheelChair) {
        isPWheelChair = PWheelChair;
    }

    public int getpMultiStaffCount() {
        return pMultiStaffCount;
    }

    public void setpMultiStaffCount(int pMultiStaffCount) {
        this.pMultiStaffCount = pMultiStaffCount;
    }

    public boolean isPMultiStaff() {
        return isPMultiStaff;
    }

    public void setPMultiStaff(boolean PMultiStaff) {
        isPMultiStaff = PMultiStaff;
    }

    public int getpCarParkCount() {
        return pCarParkCount;
    }

    public void setpCarParkCount(int pCarParkCount) {
        this.pCarParkCount = pCarParkCount;
    }

    public boolean isPCarPark() {
        return isPCarPark;
    }

    public void setPCarPark(boolean PCarPark) {
        isPCarPark = PCarPark;
    }

    public int getpLiftCount() {
        return pLiftCount;
    }

    public void setpLiftCount(int pLiftCount) {
        this.pLiftCount = pLiftCount;
    }

    public boolean isPLift() {
        return isPLift;
    }

    public void setPLift(boolean PLift) {
        isPLift = PLift;
    }

    public int getpLargePetsCount() {
        return pLargePetsCount;
    }

    public void setpLargePetsCount(int pLargePetsCount) {
        this.pLargePetsCount = pLargePetsCount;
    }

    public boolean isPLargePets() {
        return isPLargePets;
    }

    public void setPLargePets(boolean PLargePets) {
        isPLargePets = PLargePets;
    }

    public int getpSmallPetsCount() {
        return pSmallPetsCount;
    }

    public void setpSmallPetsCount(int pSmallPetsCount) {
        this.pSmallPetsCount = pSmallPetsCount;
    }

    public boolean isPSmallPets() {
        return isPSmallPets;
    }

    public void setPSmallPets(boolean PSmallPets) {
        isPSmallPets = PSmallPets;
    }

    public int getfGymCount() {
        return fGymCount;
    }

    public void setfGymCount(int fGymCount) {
        this.fGymCount = fGymCount;
    }

    public boolean isFGym() {
        return isFGym;
    }

    public void setFGym(boolean FGym) {
        isFGym = FGym;
    }

    public int getfPlaygroundCount() {
        return fPlaygroundCount;
    }

    public void setfPlaygroundCount(int fPlaygroundCount) {
        this.fPlaygroundCount = fPlaygroundCount;
    }

    public boolean isFPlayground() {
        return isFPlayground;
    }

    public void setFPlayground(boolean FPlayground) {
        isFPlayground = FPlayground;
    }

    public int getfGameRoomCount() {
        return fGameRoomCount;
    }

    public void setfGameRoomCount(int fGameRoomCount) {
        this.fGameRoomCount = fGameRoomCount;
    }

    public boolean isFGameRoom() {
        return isFGameRoom;
    }

    public void setFGameRoom(boolean FGameRoom) {
        isFGameRoom = FGameRoom;
    }

    public int getfNightClubCount() {
        return fNightClubCount;
    }

    public void setfNightClubCount(int fNightClubCount) {
        this.fNightClubCount = fNightClubCount;
    }

    public boolean isFNightClub() {
        return isFNightClub;
    }

    public void setFNightClub(boolean FNightClub) {
        isFNightClub = FNightClub;
    }
}
