
package com.travel.commonlib.hotel;

import android.text.TextUtils;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.Common.AdResponse;
import com.travel.jumbo.model.hotel.AllocationDetails;
import com.travel.jumbo.model.hotel.Amenitie;
import com.travel.jumbo.model.hotel.DescriptionItem;
import com.travel.jumbo.model.hotel.ExtraNote;
import com.travel.jumbo.model.hotel.Facilities;
import com.travel.jumbo.model.hotel.FacilityData;
import com.travel.jumbo.model.hotel.FareDetails;
import com.travel.jumbo.model.hotel.GeoPoint;
import com.travel.jumbo.model.hotel.HotelAmenitiesFacilite;
import com.travel.jumbo.model.hotel.HotelFareDetails;
import com.travel.jumbo.model.hotel.Images;
import com.travel.jumbo.model.hotel.KangarooRewardPoint;
import com.travel.jumbo.model.hotel.RequestInfo;
import com.travel.jumbo.model.hotel.RoomDetail;
import com.travel.jumbo.model.hotel.UReview;
import com.travel.jumbo.utilities.CommonFunctions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Hotel implements Serializable {

    @SerializedName("DescriptionItems")
    @Expose
    private ArrayList<DescriptionItem> descriptionItems = null;
    @SerializedName("ApiId")
    @Expose
    private int apiId;
    @SerializedName("HapId")
    @Expose
    private int hapId;
    @SerializedName("HotelUniqueId")
    @Expose
    private String hotelUniqueId;
    @SerializedName("HotelId")
    @Expose
    private String hotelId;
    @SerializedName("HotelCode")
    @Expose
    private String hotelCode;
    @SerializedName("SearchUniqueId")
    @Expose
    private String searchUniqueId;
    @SerializedName("SupportedApis")
    @Expose
    private String supportedApis;
    @SerializedName("OfflineDBId")
    @Expose
    private String offlineDBId;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("DescriptionArabic")
    @Expose
    private String descriptionArabic;
    @SerializedName("HotelName")
    @Expose
    private String hotelName;
    @SerializedName("HotelNameArabic")
    @Expose
    private String hotelNameArabic;
    @SerializedName("Address")
    @Expose
    private String address;
    @SerializedName("AddressArabic")
    @Expose
    private String addressArabic;
    @SerializedName("ZipCode")
    @Expose
    private String zipCode;
    @SerializedName("Fax")
    @Expose
    private String fax;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("HotelPhone")
    @Expose
    private String hotelPhone;
    @SerializedName("Rating")
    @Expose
    private String rating;
    @SerializedName("Location")
    @Expose
    private String location;
    @SerializedName("LocationArabic")
    @Expose
    private String locationArabic;
    @SerializedName("LocationId")
    @Expose
    private String locationId;
    @SerializedName("Amenitie")
    @Expose
    private Amenitie amenitie;
    @SerializedName("Images")
    @Expose
    private Images images;
    @SerializedName("GeoPoint")
    @Expose
    private GeoPoint geoPoint;
    @SerializedName("IsCombination")
    @Expose
    private boolean isCombination;
    @SerializedName("RoomCombination")
    @Expose
    private List<String> roomCombination = null;
    @SerializedName("RoomDetails")
    @Expose
    private ArrayList<RoomDetail> roomDetails = null;
    @SerializedName("AllocationDetails")
    @Expose
    private AllocationDetails allocationDetails;
    @SerializedName("ExtraRequestForRoom")
    @Expose
    private boolean extraRequestForRoom;
    @SerializedName("ExtraRequestforRateComment")
    @Expose
    private boolean extraRequestforRateComment;
    @SerializedName("GroupCancellationPolicyAvailable")
    @Expose
    private boolean groupCancellationPolicyAvailable;
    @SerializedName("BlockSelectedRoom")
    @Expose
    private boolean blockSelectedRoom;
    @SerializedName("RealTimeAvailabilityRequestRequired")
    @Expose
    private boolean realTimeAvailabilityRequestRequired;
    @SerializedName("ExtraRequestForDescription")
    @Expose
    private boolean extraRequestForDescription;
    @SerializedName("SelectedRoomId")
    @Expose
    private String selectedRoomId;
    @SerializedName("ErrorInfo")
    @Expose
    private String errorInfo;
    @SerializedName("FareDetails")
    @Nullable
    @Expose
    private FareDetails fareDetails;
    @SerializedName("ReferenceNumber")
    @Expose
    private int referenceNumber;
    @SerializedName("IsBookingAllowed")
    @Expose
    private boolean isBookingAllowed;
    @SerializedName("ProcessId")
    @Expose
    private String processId;
    @SerializedName("BookingCurrency")
    @Expose
    private String bookingCurrency;
    @SerializedName("TotalBookingAmount")
    @Expose
    private double totalBookingAmount;
    @SerializedName("ZoneName")
    @Expose
    private String zoneName;
    @SerializedName("DestinationCity")
    @Expose
    private String destinationCity;
    @SerializedName("CountryName")
    @Expose
    private String countryName;
    @SerializedName("HotelAmenitiesFacilites")
    @Expose
    private List<HotelAmenitiesFacilite> hotelAmenitiesFacilites = null;
    @SerializedName("ShowTicketAmount")
    @Expose
    private boolean showTicketAmount;
    @SerializedName("SupplierName")
    @Expose
    private String supplierName;
    @SerializedName("VatNumber")
    @Expose
    private String vatNumber;
    @SerializedName("LOHBookingCode")
    @Expose
    private String lOHBookingCode;
    @SerializedName("IsAvailability")
    @Expose
    private boolean isAvailability;
    @SerializedName("SessionId")
    @Expose
    private String sessionId;
    @SerializedName("IndexId")
    @Expose
    private int indexId;
    @SerializedName("ExtraNotes")
    @Nullable
    @Expose
    private List<ExtraNote> extraNotes = null;
    @SerializedName("CaxHotelID")
    @Nullable
    @Expose
    private int caxHotelID;
    @SerializedName("FacilityData")
    @Nullable
    @Expose
    private com.travel.jumbo.model.hotel.FacilityData FacilityData;
    @SerializedName("IsNonMultiRoomSupport")
    @Nullable
    @Expose
    private boolean isNonMultiRoomSupport;
    @SerializedName("HotelStayInfo")
    @Expose
    private String hotelStayInfo;
    @SerializedName("HotelStayInfoArAr")
    @Expose
    private String hotelStayInfoArAr;
 @SerializedName("KangarooRewardPoint")
    @Expose
    private KangarooRewardPoint kangarooRewardPoint;

    int cart_id;

    // for cart usage
    int RemainingTimeInMinutes;

    // for cart usage
    String Timer;

    // For cart function
    @SerializedName("RequestInfo")
    @Expose
    RequestInfo requestInfo;
    @SerializedName("facilitiesitemsEn")
    @Expose
    List<Facilities> facilitiesitemsEn;
    @SerializedName("RoomFacilitiesEn")
    @Expose
    List<Facilities> roomFacilitiesEn;
    @SerializedName("BoardType")
    @Expose
    List<String> boardType;
    @SerializedName("IsRefundable")
    @Expose
    public boolean isRefundable;
    @SerializedName("RefundableStatusUnknown ")
    @Expose
    public boolean RefundableStatusUnknown ;

    @SerializedName("pType")
    @Expose
    public Object pType;
    @SerializedName("uReview")
    @Expose
    public UReview uReview;
    @SerializedName("facilities")
    @Expose
    private List<String> facilities;
    @SerializedName("CheckoutTime")
    @Expose
    public Object checkoutTime;
    @SerializedName("CheckinTime")
    @Expose
    public Object checkinTime;
    @SerializedName("UserTransactionId")
    @Expose
    public Object userTransactionId;
    @SerializedName("TrivagoCurrency")
    @Expose
    public String trivagoCurrency;
    @SerializedName("hotelAmenities")
    @Expose
    public Object hotelAmenities;
    @SerializedName("IsCombinationAndMultiRoomSupport")
    @Expose
    public boolean isCombinationAndMultiRoomSupport;
    @SerializedName("IsCompressedResult")
    @Expose
    public boolean isCompressedResult;
    @SerializedName("Umrahlocation")
    @Expose
    public String umrahlocation;
    @SerializedName("hotelpolicies")
    @Expose
    public Object hotelpolicies;
    @SerializedName("QuoteId")
    @Expose
    public Object quoteId;
    @SerializedName("PaymentGuaranteedBy")
    @Expose
    public Object paymentGuaranteedBy;
    @SerializedName("RoomFacilities")
    @Expose
    public Object roomFacilities;
    @SerializedName("HotelBookingUrl")
    @Expose
    public Object hotelBookingUrl;
    @SerializedName("authToken")
    @Expose
    public Object authToken;
    @SerializedName("supplierTGH")
    @Expose
    public Object supplierTGH;
    @SerializedName("CityCodeTGH")
    @Expose
    public Object cityCodeTGH;
    @SerializedName("Index")
    @Expose
    public long index;
    @SerializedName("IsDummyVoucher")
    @Expose
    public boolean isDummyVoucher;
    @SerializedName("TGHBookingKey")
    @Expose
    public Object tGHBookingKey;
    @SerializedName("facilitiesitemsAr")
    @Expose
    public List<Facilities> facilitiesitemsAr;
    @SerializedName("RoomFacilitiesAr")
    @Expose
    public  List<Facilities> roomFacilitiesAr;
    @SerializedName("ApiName")
    @Expose
    public String apiName;
    @SerializedName("CanInvoice")
    @Expose
    public boolean canInvoice;
    @SerializedName("MandatoryFee")
    @Expose
    public Object mandatoryFee;
    @SerializedName("MandatoryFeeAr")
    @Expose
    public Object mandatoryFeeAr;
    @SerializedName("IsFareUpdate")
    @Expose
    public boolean isFareUpdate;
    public int viewType = 0;
    public ArrayList<AdResponse> adResponses;
    @SerializedName("HotelFareDetails")
    @Expose
    private HotelFareDetails hotelFareDetails;


    public int getRemainingTimeInMinutes() {
        return RemainingTimeInMinutes;
    }

    public void setRemainingTimeInMinutes(int remainingTimeInMinutes) {
        RemainingTimeInMinutes = remainingTimeInMinutes;
    }

    public KangarooRewardPoint getKangarooRewardPoint() {
        return kangarooRewardPoint;
    }

    public void setKangarooRewardPoint(KangarooRewardPoint kangarooRewardPoint) {
        this.kangarooRewardPoint = kangarooRewardPoint;
    }

    public String getTimer() {
        return Timer;
    }

    public void setTimer(String timer) {
        Timer = timer;
    }

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public ArrayList<DescriptionItem> getDescriptionItems() {
        return descriptionItems;
    }

    public void setDescriptionItems(ArrayList<DescriptionItem> descriptionItems) {
        this.descriptionItems = descriptionItems;
    }

    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    public int getHapId() {
        return hapId;
    }

    public void setHapId(int hapId) {
        this.hapId = hapId;
    }

    public String getHotelUniqueId() {
        return hotelUniqueId;
    }

    public void setHotelUniqueId(String hotelUniqueId) {
        this.hotelUniqueId = hotelUniqueId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelCode() {
        return hotelCode;
    }

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public String getSearchUniqueId() {
        return searchUniqueId;
    }

    public void setSearchUniqueId(String searchUniqueId) {
        this.searchUniqueId = searchUniqueId;
    }

    public String getSupportedApis() {
        return supportedApis;
    }

    public void setSupportedApis(String supportedApis) {
        this.supportedApis = supportedApis;
    }

    public String getOfflineDBId() {
        return offlineDBId;
    }

    public void setOfflineDBId(String offlineDBId) {
        this.offlineDBId = offlineDBId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionArabic() {
        return descriptionArabic;
    }

    public void setDescriptionArabic(String descriptionArabic) {
        this.descriptionArabic = descriptionArabic;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelNameArabic() {
        return hotelNameArabic;
    }

    public void setHotelNameArabic(String hotelNameArabic) {
        this.hotelNameArabic = hotelNameArabic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressArabic() {
        return addressArabic;
    }

    public void setAddressArabic(String addressArabic) {
        this.addressArabic = addressArabic;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationArabic() {
        return locationArabic;
    }

    public void setLocationArabic(String locationArabic) {
        this.locationArabic = locationArabic;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Amenitie getAmenitie() {
        return amenitie;
    }

    public void setAmenitie(Amenitie amenitie) {
        this.amenitie = amenitie;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public boolean isIsCombination() {
        return isCombination;
    }

    public void setIsCombination(boolean isCombination) {
        this.isCombination = isCombination;
    }

    public ArrayList<RoomDetail> getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(ArrayList<RoomDetail> roomDetails) {
        this.roomDetails = roomDetails;
    }

    public AllocationDetails getAllocationDetails() {
        return allocationDetails;
    }

    public void setAllocationDetails(AllocationDetails allocationDetails) {
        this.allocationDetails = allocationDetails;
    }

    public boolean isExtraRequestForRoom() {
        return extraRequestForRoom;
    }

    public void setExtraRequestForRoom(boolean extraRequestForRoom) {
        this.extraRequestForRoom = extraRequestForRoom;
    }

    public boolean isExtraRequestforRateComment() {
        return extraRequestforRateComment;
    }

    public void setExtraRequestforRateComment(boolean extraRequestforRateComment) {
        this.extraRequestforRateComment = extraRequestforRateComment;
    }

    public boolean isGroupCancellationPolicyAvailable() {
        return groupCancellationPolicyAvailable;
    }

    public void setGroupCancellationPolicyAvailable(boolean groupCancellationPolicyAvailable) {
        this.groupCancellationPolicyAvailable = groupCancellationPolicyAvailable;
    }

    public boolean isBlockSelectedRoom() {
        return blockSelectedRoom;
    }

    public void setBlockSelectedRoom(boolean blockSelectedRoom) {
        this.blockSelectedRoom = blockSelectedRoom;
    }

    public boolean isRealTimeAvailabilityRequestRequired() {
        return realTimeAvailabilityRequestRequired;
    }

    public void setRealTimeAvailabilityRequestRequired(boolean realTimeAvailabilityRequestRequired) {
        this.realTimeAvailabilityRequestRequired = realTimeAvailabilityRequestRequired;
    }

    public boolean isExtraRequestForDescription() {
        return extraRequestForDescription;
    }

    public void setExtraRequestForDescription(boolean extraRequestForDescription) {
        this.extraRequestForDescription = extraRequestForDescription;
    }

    public String getSelectedRoomId() {
        return selectedRoomId;
    }

    public void setSelectedRoomId(String selectedRoomId) {
        this.selectedRoomId = selectedRoomId;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    @org.jetbrains.annotations.Nullable
    public FareDetails getFareDetails() {
        return fareDetails;
    }

    public void setFareDetails(FareDetails fareDetails) {
        this.fareDetails = fareDetails;
    }

    public int getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public boolean isIsBookingAllowed() {
        return isBookingAllowed;
    }

    public void setIsBookingAllowed(boolean isBookingAllowed) {
        this.isBookingAllowed = isBookingAllowed;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getBookingCurrency() {
        return bookingCurrency;
    }

    public void setBookingCurrency(String bookingCurrency) {
        this.bookingCurrency = bookingCurrency;
    }

    public double getTotalBookingAmount() {
        return totalBookingAmount;
    }

    public void setTotalBookingAmount(double totalBookingAmount) {
        this.totalBookingAmount = totalBookingAmount;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<HotelAmenitiesFacilite> getHotelAmenitiesFacilites() {
        return hotelAmenitiesFacilites;
    }


    public void setHotelAmenitiesFacilites(List<HotelAmenitiesFacilite> hotelAmenitiesFacilites) {
        this.hotelAmenitiesFacilites = hotelAmenitiesFacilites;
    }

    public boolean isShowTicketAmount() {
        return showTicketAmount;
    }

    public void setShowTicketAmount(boolean showTicketAmount) {
        this.showTicketAmount = showTicketAmount;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getLOHBookingCode() {
        return lOHBookingCode;
    }

    public void setLOHBookingCode(String lOHBookingCode) {
        this.lOHBookingCode = lOHBookingCode;
    }

    public boolean isIsAvailability() {
        return isAvailability;
    }

    public void setIsAvailability(boolean isAvailability) {
        this.isAvailability = isAvailability;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public boolean isCombination() {
        return isCombination;
    }

    public void setCombination(boolean combination) {
        isCombination = combination;
    }

    public List<String> getRoomCombination() {
        return roomCombination;
    }

    public void setRoomCombination(List<String> roomCombination) {
        this.roomCombination = roomCombination;
    }

    public boolean isBookingAllowed() {
        return isBookingAllowed;
    }

    public void setBookingAllowed(boolean bookingAllowed) {
        isBookingAllowed = bookingAllowed;
    }

    public String getlOHBookingCode() {
        return lOHBookingCode;
    }

    public void setlOHBookingCode(String lOHBookingCode) {
        this.lOHBookingCode = lOHBookingCode;
    }

    public boolean isAvailability() {
        return isAvailability;
    }

    public void setAvailability(boolean availability) {
        isAvailability = availability;
    }

    public List<ExtraNote> getExtraNotes() {
        return extraNotes;
    }

    public void setExtraNotes(List<ExtraNote> extraNotes) {
        this.extraNotes = extraNotes;
    }

    public int getCaxHotelID() {
        return caxHotelID;
    }

    public void setCaxHotelID(int caxHotelID) {
        this.caxHotelID = caxHotelID;
    }

    public FacilityData getFacilityData() {
        return FacilityData;
    }

    public boolean isNonMultiRoomSupport() {
        return isNonMultiRoomSupport;
    }

    public void setNonMultiRoomSupport(boolean nonMultiRoomSupport) {
        isNonMultiRoomSupport = nonMultiRoomSupport;
    }

    public String getHotelStayInfo() {
        return hotelStayInfo;
    }

    public void setHotelStayInfo(String hotelStayInfo) {
        this.hotelStayInfo = hotelStayInfo;
    }

    public String getHotelStayInfoArAr() {
        return hotelStayInfoArAr;
    }

    public void setHotelStayInfoArAr(String hotelStayInfoArAr) {
        this.hotelStayInfoArAr = hotelStayInfoArAr;
    }

    public void setFacilityData(FacilityData facilityData) {
        FacilityData = facilityData;
    }

    public List<Facilities> getFacilitiesitemsEn() {
        return facilitiesitemsEn;
    }

    public void setFacilitiesitemsEn(List<Facilities> facilitiesitemsEn) {
        this.facilitiesitemsEn = facilitiesitemsEn;
    }

    public List<Facilities> getRoomFacilitiesEn() {
        return roomFacilitiesEn;
    }

    public void setRoomFacilitiesEn(List<Facilities> roomFacilitiesEn) {
        this.roomFacilitiesEn = roomFacilitiesEn;
    }

    public List<String> getBoardType() {
        return boardType;
    }

    public void setBoardType(List<String> boardType) {
        this.boardType = boardType;
    }

    public boolean isRefundable() {
        return isRefundable;
    }

    public void setRefundable(boolean refundable) {
        isRefundable = refundable;
    }

     public boolean isRefundableStatusUnknown() {
        return RefundableStatusUnknown;
    }

    public void setRefundableStatusUnknown(boolean refundable) {
        RefundableStatusUnknown = refundable;
    }



    public Object getpType() {
        return pType;
    }

    public void setpType(Object pType) {
        this.pType = pType;
    }

    public UReview getuReview() {
        return uReview;
    }

    public void setuReview(UReview uReview) {
        this.uReview = uReview;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public Object getCheckoutTime() {
        return checkoutTime;
    }

    public void setCheckoutTime(Object checkoutTime) {
        this.checkoutTime = checkoutTime;
    }

    public Object getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Object checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Object getUserTransactionId() {
        return userTransactionId;
    }

    public void setUserTransactionId(Object userTransactionId) {
        this.userTransactionId = userTransactionId;
    }

    public String getTrivagoCurrency() {
        return trivagoCurrency;
    }

    public void setTrivagoCurrency(String trivagoCurrency) {
        this.trivagoCurrency = trivagoCurrency;
    }

    public Object getHotelAmenities() {
        return hotelAmenities;
    }

    public void setHotelAmenities(Object hotelAmenities) {
        this.hotelAmenities = hotelAmenities;
    }

    public boolean isCombinationAndMultiRoomSupport() {
        return isCombinationAndMultiRoomSupport;
    }

    public void setCombinationAndMultiRoomSupport(boolean combinationAndMultiRoomSupport) {
        isCombinationAndMultiRoomSupport = combinationAndMultiRoomSupport;
    }

    public boolean isCompressedResult() {
        return isCompressedResult;
    }

    public void setCompressedResult(boolean compressedResult) {
        isCompressedResult = compressedResult;
    }

    public String getUmrahlocation() {
        return umrahlocation;
    }

    public void setUmrahlocation(String umrahlocation) {
        this.umrahlocation = umrahlocation;
    }

    public Object getHotelpolicies() {
        return hotelpolicies;
    }

    public void setHotelpolicies(Object hotelpolicies) {
        this.hotelpolicies = hotelpolicies;
    }

    public Object getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Object quoteId) {
        this.quoteId = quoteId;
    }

    public Object getPaymentGuaranteedBy() {
        return paymentGuaranteedBy;
    }

    public void setPaymentGuaranteedBy(Object paymentGuaranteedBy) {
        this.paymentGuaranteedBy = paymentGuaranteedBy;
    }

    public Object getRoomFacilities() {
        return roomFacilities;
    }

    public void setRoomFacilities(Object roomFacilities) {
        this.roomFacilities = roomFacilities;
    }

    public Object getHotelBookingUrl() {
        return hotelBookingUrl;
    }

    public void setHotelBookingUrl(Object hotelBookingUrl) {
        this.hotelBookingUrl = hotelBookingUrl;
    }

    public Object getAuthToken() {
        return authToken;
    }

    public void setAuthToken(Object authToken) {
        this.authToken = authToken;
    }

    public Object getSupplierTGH() {
        return supplierTGH;
    }

    public void setSupplierTGH(Object supplierTGH) {
        this.supplierTGH = supplierTGH;
    }

    public Object getCityCodeTGH() {
        return cityCodeTGH;
    }

    public void setCityCodeTGH(Object cityCodeTGH) {
        this.cityCodeTGH = cityCodeTGH;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public boolean isDummyVoucher() {
        return isDummyVoucher;
    }

    public void setDummyVoucher(boolean dummyVoucher) {
        isDummyVoucher = dummyVoucher;
    }

    public Object gettGHBookingKey() {
        return tGHBookingKey;
    }

    public void settGHBookingKey(Object tGHBookingKey) {
        this.tGHBookingKey = tGHBookingKey;
    }

    public List<Facilities> getFacilitiesitemsAr() {
        return facilitiesitemsAr;
    }

    public void setFacilitiesitemsAr(List<Facilities> facilitiesitemsAr) {
        this.facilitiesitemsAr = facilitiesitemsAr;
    }

    public List<Facilities> getRoomFacilitiesAr() {
        return roomFacilitiesAr;
    }

    public void setRoomFacilitiesAr(List<Facilities> roomFacilitiesAr) {
        this.roomFacilitiesAr = roomFacilitiesAr;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public boolean isCanInvoice() {
        return canInvoice;
    }

    public void setCanInvoice(boolean canInvoice) {
        this.canInvoice = canInvoice;
    }

    public Object getMandatoryFee() {
        return mandatoryFee;
    }

    public void setMandatoryFee(Object mandatoryFee) {
        this.mandatoryFee = mandatoryFee;
    }

    public Object getMandatoryFeeAr() {
        return mandatoryFeeAr;
    }

    public void setMandatoryFeeAr(Object mandatoryFeeAr) {
        this.mandatoryFeeAr = mandatoryFeeAr;
    }

    public boolean isFareUpdate() {
        return isFareUpdate;
    }

    public void setFareUpdate(boolean fareUpdate) {
        isFareUpdate = fareUpdate;
    }

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public ArrayList<AdResponse> getAdResponses() {
        return adResponses;
    }

    public void setAdResponses(ArrayList<AdResponse> adResponses) {
        this.adResponses = adResponses;
    }

    public HotelFareDetails getHotelFareDetails() {
        return hotelFareDetails;
    }

    public void setHotelFareDetails(HotelFareDetails hotelFareDetails) {
        this.hotelFareDetails = hotelFareDetails;
    }

    public float getRatingValue() {
        float rate = 0;
        if (!TextUtils.isEmpty(rating)) {
            switch (rating) {
                case "Zero":
                    rate = 0;
                    break;
                case "One":
                    rate = 1;
                    break;
                case "Two":
                    rate = 2;
                    break;
                case "Three":
                    rate = 3;
                    break;
                case "Four":
                    rate = 4;
                    break;
                case "Five":
                    rate = 5;
                    break;
            }
        }
        return rate;
    }

    public String getDescriptionText() {
        switch (CommonFunctions.lang) {
            case "ar":
                return descriptionArabic;
            case "en":
            default:
                return description;

        }
    }

    public String getStayInfoText() {
        switch (CommonFunctions.lang) {
            case "ar":
                return !TextUtils.isEmpty(hotelStayInfoArAr) ? hotelStayInfoArAr : hotelStayInfo;
            case "en":
            default:
                return hotelStayInfo;

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return caxHotelID == hotel.caxHotelID ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(caxHotelID);
    }
}
