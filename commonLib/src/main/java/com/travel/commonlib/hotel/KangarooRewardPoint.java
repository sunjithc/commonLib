
package com.travel.commonlib.hotel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KangarooRewardPoint {

    @SerializedName("UserId")
    @Expose
    private int userId;
    @SerializedName("RewardUserID")
    @Expose
    private String rewardUserID;
    @SerializedName("IsApplied")
    @Expose
    private boolean isApplied;
    @SerializedName("TotalRewardPoints")
    @Expose
    private int totalRewardPoints;
    @SerializedName("TotalRewardAmount")
    @Expose
    private double totalRewardAmount;
    @SerializedName("KangarooRewardPoints")
    @Expose
    private int kangarooRewardPoints;
    @SerializedName("KangarooRewardCharge")
    @Expose
    private double kangarooRewardCharge;
    @SerializedName("HasTotalRewardPoints")
    @Expose
    private boolean hasTotalRewardPoints;
    @SerializedName("ApplyId")
    @Expose
    private int applyId;
    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("AmountPerPoint")
    @Expose
    private double amountPerPoint;
    @SerializedName("HotelApplyId")
    @Expose
    private int hotelApplyId;
    @SerializedName("IsHotelApplied")
    @Expose
    private boolean isHotelApplied;
    @SerializedName("KangarooHotelRewardCharge")
    @Expose
    private int kangarooHotelRewardCharge;
    @SerializedName("KangarooFlightRewardCharge")
    @Expose
    private int kangarooFlightRewardCharge;
    @SerializedName("PaymentGateWay")
    @Expose
    private int paymentGateWay;
 @SerializedName("Flag")
    @Expose
    private String flag;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getRewardUserID() {
        return rewardUserID;
    }

    public void setRewardUserID(String rewardUserID) {
        this.rewardUserID = rewardUserID;
    }

    public boolean isIsApplied() {
        return isApplied;
    }

    public void setIsApplied(boolean isApplied) {
        this.isApplied = isApplied;
    }

    public int getTotalRewardPoints() {
        return totalRewardPoints;
    }

    public void setTotalRewardPoints(int totalRewardPoints) {
        this.totalRewardPoints = totalRewardPoints;
    }

    public double getTotalRewardAmount() {
        return totalRewardAmount;
    }

    public void setTotalRewardAmount(double totalRewardAmount) {
        this.totalRewardAmount = totalRewardAmount;
    }

    public int getKangarooRewardPoints() {
        return kangarooRewardPoints;
    }

    public void setKangarooRewardPoints(int kangarooRewardPoints) {
        this.kangarooRewardPoints = kangarooRewardPoints;
    }

    public double getKangarooRewardCharge() {
        return kangarooRewardCharge;
    }

    public void setKangarooRewardCharge(double kangarooRewardCharge) {
        this.kangarooRewardCharge = kangarooRewardCharge;
    }

    public boolean isHasTotalRewardPoints() {
        return hasTotalRewardPoints;
    }

    public void setHasTotalRewardPoints(boolean hasTotalRewardPoints) {
        this.hasTotalRewardPoints = hasTotalRewardPoints;
    }

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmountPerPoint() {
        return amountPerPoint;
    }

    public void setAmountPerPoint(double amountPerPoint) {
        this.amountPerPoint = amountPerPoint;
    }

    public int getHotelApplyId() {
        return hotelApplyId;
    }

    public void setHotelApplyId(int hotelApplyId) {
        this.hotelApplyId = hotelApplyId;
    }

    public boolean isIsHotelApplied() {
        return isHotelApplied;
    }

    public void setIsHotelApplied(boolean isHotelApplied) {
        this.isHotelApplied = isHotelApplied;
    }

    public int getKangarooHotelRewardCharge() {
        return kangarooHotelRewardCharge;
    }

    public void setKangarooHotelRewardCharge(int kangarooHotelRewardCharge) {
        this.kangarooHotelRewardCharge = kangarooHotelRewardCharge;
    }

    public int getKangarooFlightRewardCharge() {
        return kangarooFlightRewardCharge;
    }

    public void setKangarooFlightRewardCharge(int kangarooFlightRewardCharge) {
        this.kangarooFlightRewardCharge = kangarooFlightRewardCharge;
    }

    public int getPaymentGateWay() {
        return paymentGateWay;
    }

    public void setPaymentGateWay(int paymentGateWay) {
        this.paymentGateWay = paymentGateWay;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
