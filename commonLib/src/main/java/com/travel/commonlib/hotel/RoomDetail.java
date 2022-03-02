
package com.travel.commonlib.hotel;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.CancellationPolicy;
import com.travel.jumbo.model.hotel.FareDetails;
import com.travel.jumbo.model.hotel.RoomAmenities;
import com.travel.jumbo.model.hotel.RoomExtraDetails;
import com.travel.jumbo.model.hotel.SupplementInfo;

import java.io.Serializable;
import java.util.List;


public class RoomDetail implements Serializable {

    @SerializedName("RoomName")
    @Expose
    private String roomName;
    @SerializedName("RoomId")
    @Expose
    private String roomId;
    @SerializedName("RateCode")
    @Expose
    private String rateCode;
    @SerializedName("BoardType")
    @Expose
    private String boardType;
    @SerializedName("BoardTypeArabic")
    @Expose
    private String boardTypeArabic;
    @SerializedName("AdultCount")
    @Expose
    private int adultCount;
    @SerializedName("ChildCount")
    @Expose
    private int childCount;
    @SerializedName("RoomUniqueId")
    @Expose
    private int roomUniqueId;
    @SerializedName("DescriptionText")
    @Expose
    private String descriptionText;
    @SerializedName("RoomExtraDetails")
    @Expose
    private RoomExtraDetails roomExtraDetails;
    @SerializedName("FareDetails")
    @Nullable
    @Expose
    private FareDetails fareDetails;
    @SerializedName("ExtraNotes")
    @Nullable
    @Expose
    private List<ExtraNote> extraNotes = null;
    @SerializedName("CancellationPolicy")
    @Expose
    @Nullable
    private CancellationPolicy cancellationPolicy;
    @SerializedName("CancellationPolicyArabic")
    @Expose
    private String cancellationPolicyArabic;
    @SerializedName("RoomAmenities")
    @Expose
    private List<RoomAmenities> roomAmenities;
    @SerializedName("QuoteId")
    @Expose
    private String quoteId;
    @SerializedName("RateCommentsId")
    @Expose
    private String rateCommentsId;
    @SerializedName("RateComments")
    @Expose
    private String rateComments;
    @SerializedName("IsRecheck")
    @Expose
    private boolean isRecheck;
    @SerializedName("AllocationDetailsList")
    @Expose
    private List<String> allocationDetailsList;
    @SerializedName("AvailCount")
    @Expose
    private long availCount;
    @SerializedName("allocationDetails")
    @Expose
    private String allocationDetails;
    @SerializedName("HotelRoomCharacteristicCode")
    @Expose
    private String hotelRoomCharacteristicCode;
    @SerializedName("SupplementInfo")
    @Expose
    private List<SupplementInfo> supplementInfo;
    @SerializedName("RoomCode")
    @Expose
    private String roomCode;
    @SerializedName("AvailToken")
    @Expose
    private String AvailToken;
    @SerializedName("RoomImages")
    @Expose
    public List<Image> roomImages = null;
    @SerializedName("RoomImageItems")
    @Expose
    public Object roomImageItems;
    @SerializedName("IsNonRefundable")
    @Expose
    public String isNonRefundable;
     @SerializedName("RoomRefundableStatusUnknown")
    @Expose
    public Boolean RoomRefundableStatusUnknown;
    @SerializedName("Inclusions")
    @Expose
    public Object inclusions;
    @SerializedName("RateDescription")
    @Expose
    public Object rateDescription;
    @SerializedName("roompolicies")
    @Expose
    public Object roompolicies;
    @SerializedName("RoomFacility")
    @Expose
    public Object roomFacility;
    @SerializedName("CancelPolicyStatus")
    @Expose
    public boolean cancelPolicyStatus;

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRateCode() {
        return rateCode;
    }

    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }

    public String getBoardTypeArabic() {
        return boardTypeArabic;
    }

    public void setBoardTypeArabic(String boardTypeArabic) {
        this.boardTypeArabic = boardTypeArabic;
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

    public int getRoomUniqueId() {
        return roomUniqueId;
    }

    public void setRoomUniqueId(int roomUniqueId) {
        this.roomUniqueId = roomUniqueId;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public RoomExtraDetails getRoomExtraDetails() {
        return roomExtraDetails;
    }

    public void setRoomExtraDetails(RoomExtraDetails roomExtraDetails) {
        this.roomExtraDetails = roomExtraDetails;
    }

    public FareDetails getFareDetails() {
        return fareDetails;
    }

    public void setFareDetails(FareDetails fareDetails) {
        this.fareDetails = fareDetails;
    }

    @org.jetbrains.annotations.Nullable
    public List<ExtraNote> getExtraNotes() {
        return extraNotes;
    }

    public void setExtraNotes(@org.jetbrains.annotations.Nullable List<ExtraNote> extraNotes) {
        this.extraNotes = extraNotes;
    }

    @org.jetbrains.annotations.Nullable
    public CancellationPolicy getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(@org.jetbrains.annotations.Nullable CancellationPolicy cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public String getCancellationPolicyArabic() {
        return cancellationPolicyArabic;
    }

    public void setCancellationPolicyArabic(String cancellationPolicyArabic) {
        this.cancellationPolicyArabic = cancellationPolicyArabic;
    }

    public List<RoomAmenities> getRoomAmenities() {
        return roomAmenities;
    }

    public void setRoomAmenities(List<RoomAmenities> roomAmenities) {
        this.roomAmenities = roomAmenities;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    public String getRateCommentsId() {
        return rateCommentsId;
    }

    public void setRateCommentsId(String rateCommentsId) {
        this.rateCommentsId = rateCommentsId;
    }

    public String getRateComments() {
        return rateComments;
    }

    public void setRateComments(String rateComments) {
        this.rateComments = rateComments;
    }

    public boolean isIsRecheck() {
        return isRecheck;
    }

    public void setIsRecheck(boolean isRecheck) {
        this.isRecheck = isRecheck;
    }

    public List<String> getAllocationDetailsList() {
        return allocationDetailsList;
    }

    public void setAllocationDetailsList(List<String> allocationDetailsList) {
        this.allocationDetailsList = allocationDetailsList;
    }

    public long getAvailCount() {
        return availCount;
    }

    public void setAvailCount(long availCount) {
        this.availCount = availCount;
    }

    public String getHotelRoomCharacteristicCode() {
        return hotelRoomCharacteristicCode;
    }

    public void setHotelRoomCharacteristicCode(String hotelRoomCharacteristicCode) {
        this.hotelRoomCharacteristicCode = hotelRoomCharacteristicCode;
    }

    public String getAllocationDetails() {
        return allocationDetails;
    }

    public void setAllocationDetails(String allocationDetails) {
        this.allocationDetails = allocationDetails;
    }

    public List<SupplementInfo> getSupplementInfo() {
        return supplementInfo;
    }

    public void setSupplementInfo(List<SupplementInfo> supplementInfo) {
        this.supplementInfo = supplementInfo;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getAvailToken() {
        return AvailToken;
    }

    public void setAvailToken(String availToken) {
        AvailToken = availToken;
    }

    public boolean isRecheck() {
        return isRecheck;
    }

    public void setRecheck(boolean recheck) {
        isRecheck = recheck;
    }

    public List<Image> getRoomImages() {
        return roomImages;
    }

    public void setRoomImages(List<Image> roomImages) {
        this.roomImages = roomImages;
    }

    public Object getRoomImageItems() {
        return roomImageItems;
    }

    public void setRoomImageItems(Object roomImageItems) {
        this.roomImageItems = roomImageItems;
    }

    public String getIsNonRefundable() {
        return isNonRefundable;
    }

    public void setIsNonRefundable(String isNonRefundable) {
        this.isNonRefundable = isNonRefundable;
    }
    public Boolean getRoomRefundableStatusUnknown() {
        return RoomRefundableStatusUnknown;
    }

    public void setRoomRefundableStatusUnknown(Boolean RoomRefundableStatusUnknown) {
        this.RoomRefundableStatusUnknown = RoomRefundableStatusUnknown;
    }
    public Object getInclusions() {
        return inclusions;
    }

    public void setInclusions(Object inclusions) {
        this.inclusions = inclusions;
    }

    public Object getRateDescription() {
        return rateDescription;
    }

    public void setRateDescription(Object rateDescription) {
        this.rateDescription = rateDescription;
    }

    public Object getRoompolicies() {
        return roompolicies;
    }

    public void setRoompolicies(Object roompolicies) {
        this.roompolicies = roompolicies;
    }

    public Object getRoomFacility() {
        return roomFacility;
    }

    public void setRoomFacility(Object roomFacility) {
        this.roomFacility = roomFacility;
    }

    public boolean isCancelPolicyStatus() {
        return cancelPolicyStatus;
    }

    public void setCancelPolicyStatus(boolean cancelPolicyStatus) {
        this.cancelPolicyStatus = cancelPolicyStatus;
    }
}
