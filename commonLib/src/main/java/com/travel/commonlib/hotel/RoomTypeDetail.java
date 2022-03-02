
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class RoomTypeDetail implements Serializable {

    @SerializedName("AdultCount")
    @Expose
    private int adultCount;
    @SerializedName("ChildCount")
    @Expose
    private int childCount;
    @SerializedName("firstChildAge")
    @Expose
    private long firstChildAge;
    @SerializedName("secondChildAge")
    @Expose
    private long secondChildAge;
    @SerializedName("thirdChildAge")
    @Expose
    private long thirdChildAge;
    @SerializedName("fourthChildAge")
    @Expose
    private long fourthChildAge;
    @SerializedName("fifthChildAge")
    @Expose
    private long fifthChildAge;
    @SerializedName("sixthChildAge")
    @Expose
    private long sixthChildAge;
    @SerializedName("seventhChildAge")
    @Expose
    private long seventhChildAge;
    @SerializedName("eighthChildAge")
    @Expose
    private long eighthChildAge;
    @SerializedName("ninthChildAge")
    @Expose
    private long ninthChildAge;
    @SerializedName("roomType")
    @Expose
    private long roomType;
    @SerializedName("RoomTypeName")
    @Expose
    private String roomTypeName;
    @SerializedName("ResultCode")
    @Expose
    private String resultCode;
    @SerializedName("PackageCode")
    @Expose
    private String packageCode;
    @SerializedName("PackageRoomCode")
    @Expose
    private String packageRoomCode;
    @SerializedName("RoomUniqueId")
    @Expose
    private long roomUniqueId;
    @SerializedName("RoomCode")
    @Expose
    private String roomCode;
    @SerializedName("Bedding")
    @Expose
    private String bedding;
    @SerializedName("RateKey")
    @Expose
    private String rateKey;
    @SerializedName("RoomTypeIdentifier")
    @Expose
    private String roomTypeIdentifier;
    @SerializedName("allocationString")
    @Expose
    private String allocationString;
    @SerializedName("BoardCode")
    @Expose
    private String boardCode;
    @SerializedName("BoardType")
    @Expose
    private String boardType;
    @SerializedName("RoomStatus")
    @Expose
    private String roomStatus;
    @SerializedName("MealBasisID")
    @Expose
    private long mealBasisID;
    @SerializedName("ChildAgeList")
    @Expose
    private List<Integer> childAgeList;
    @SerializedName("CancelPolicyStatus")
    @Expose
    private boolean cancelPolicyStatus;
    @SerializedName("AdditionalPayInfo")
    @Expose
    private String additionalPayInfo;
    @SerializedName("InfantCount")
    @Expose
    public long infantCount;
    @SerializedName("RoomDescrption")
    @Expose
    public Object roomDescrption;
    @SerializedName("RoomName")
    @Expose
    public Object roomName;

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

    public long getFirstChildAge() {
        return firstChildAge;
    }

    public void setFirstChildAge(long firstChildAge) {
        this.firstChildAge = firstChildAge;
    }

    public long getSecondChildAge() {
        return secondChildAge;
    }

    public void setSecondChildAge(long secondChildAge) {
        this.secondChildAge = secondChildAge;
    }

    public long getThirdChildAge() {
        return thirdChildAge;
    }

    public void setThirdChildAge(long thirdChildAge) {
        this.thirdChildAge = thirdChildAge;
    }

    public long getFourthChildAge() {
        return fourthChildAge;
    }

    public void setFourthChildAge(long fourthChildAge) {
        this.fourthChildAge = fourthChildAge;
    }

    public long getFifthChildAge() {
        return fifthChildAge;
    }

    public void setFifthChildAge(long fifthChildAge) {
        this.fifthChildAge = fifthChildAge;
    }

    public long getSixthChildAge() {
        return sixthChildAge;
    }

    public void setSixthChildAge(long sixthChildAge) {
        this.sixthChildAge = sixthChildAge;
    }

    public long getSeventhChildAge() {
        return seventhChildAge;
    }

    public void setSeventhChildAge(long seventhChildAge) {
        this.seventhChildAge = seventhChildAge;
    }

    public long getEighthChildAge() {
        return eighthChildAge;
    }

    public void setEighthChildAge(long eighthChildAge) {
        this.eighthChildAge = eighthChildAge;
    }

    public long getNinthChildAge() {
        return ninthChildAge;
    }

    public void setNinthChildAge(long ninthChildAge) {
        this.ninthChildAge = ninthChildAge;
    }

    public long getRoomType() {
        return roomType;
    }

    public void setRoomType(long roomType) {
        this.roomType = roomType;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getPackageRoomCode() {
        return packageRoomCode;
    }

    public void setPackageRoomCode(String packageRoomCode) {
        this.packageRoomCode = packageRoomCode;
    }

    public long getRoomUniqueId() {
        return roomUniqueId;
    }

    public void setRoomUniqueId(long roomUniqueId) {
        this.roomUniqueId = roomUniqueId;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getBedding() {
        return bedding;
    }

    public void setBedding(String bedding) {
        this.bedding = bedding;
    }

    public String getRateKey() {
        return rateKey;
    }

    public void setRateKey(String rateKey) {
        this.rateKey = rateKey;
    }

    public String getRoomTypeIdentifier() {
        return roomTypeIdentifier;
    }

    public void setRoomTypeIdentifier(String roomTypeIdentifier) {
        this.roomTypeIdentifier = roomTypeIdentifier;
    }

    public String getAllocationString() {
        return allocationString;
    }

    public void setAllocationString(String allocationString) {
        this.allocationString = allocationString;
    }

    public String getBoardCode() {
        return boardCode;
    }

    public void setBoardCode(String boardCode) {
        this.boardCode = boardCode;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public long getMealBasisID() {
        return mealBasisID;
    }

    public void setMealBasisID(long mealBasisID) {
        this.mealBasisID = mealBasisID;
    }

    public List<Integer> getChildAgeList() {
        return childAgeList;
    }

    public void setChildAgeList(List<Integer> childAgeList) {
        this.childAgeList = childAgeList;
    }

    public boolean isCancelPolicyStatus() {
        return cancelPolicyStatus;
    }

    public void setCancelPolicyStatus(boolean cancelPolicyStatus) {
        this.cancelPolicyStatus = cancelPolicyStatus;
    }

    public String getAdditionalPayInfo() {
        return additionalPayInfo;
    }

    public void setAdditionalPayInfo(String additionalPayInfo) {
        this.additionalPayInfo = additionalPayInfo;
    }

    public long getInfantCount() {
        return infantCount;
    }

    public void setInfantCount(long infantCount) {
        this.infantCount = infantCount;
    }

    public Object getRoomDescrption() {
        return roomDescrption;
    }

    public void setRoomDescrption(Object roomDescrption) {
        this.roomDescrption = roomDescrption;
    }

    public Object getRoomName() {
        return roomName;
    }

    public void setRoomName(Object roomName) {
        this.roomName = roomName;
    }
}
