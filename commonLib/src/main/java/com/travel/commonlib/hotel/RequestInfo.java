package com.travel.commonlib.hotel;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.RoomTypeDetail;

import java.io.Serializable;
import java.util.List;


public class RequestInfo implements Serializable {

    @SerializedName("CountryName")
    @Nullable
    @Expose
    private String countryName;
    @SerializedName("CountryCode")
    @Nullable
    @Expose
    private String countryCode;
    @SerializedName("DestinationCity")
    @Nullable
    @Expose
    private String destinationCity;
    @SerializedName("DestinationCityCode")
    @Nullable
    @Expose
    private String destinationCityCode;
    @SerializedName("CheckInDate")
    @Nullable
    @Expose
    private String checkInDate;
    @SerializedName("CheckOutDate")
    @Nullable
    @Expose
    private String checkOutDate;
    @SerializedName("Nationality")
    @Nullable
    @Expose
    private String nationality;
    @SerializedName("RoomTypeDetails")
    @Nullable
    @Expose
    private List<RoomTypeDetail> roomTypeDetails = null;
    @SerializedName("RoomCount")
    @Nullable
    @Expose
    private int roomCount;
    @SerializedName("StarRating")
    @Nullable
    @Expose
    private String starRating;
    @SerializedName("BaseCurrency")
    @Nullable
    @Expose
    private String baseCurrency;
    @SerializedName("Currency")
    @Nullable
    @Expose
    private String currency;
    @SerializedName("CurrentCulture")
    @Nullable
    @Expose
    private String currentCulture;
    @SerializedName("AgencyId")
    @Nullable
    @Expose
    private long agencyId;
    @SerializedName("AgencyLogo")
    @Nullable
    @Expose
    private String agencyLogo;
    @SerializedName("IsShowAgencyContact")
    @Nullable
    @Expose
    private boolean isShowAgencyContact;
    @SerializedName("AgencyCustomerNumber")
    @Nullable
    @Expose
    private String agencyCustomerNumber;
    @SerializedName("AgencyEmail")
    @Nullable
    @Expose
    private String agencyEmail;
    @SerializedName("IataBranchId")
    @Nullable
    @Expose
    private long iataBranchId;
    @SerializedName("DecimalPoints")
    @Nullable
    @Expose
    private long decimalPoints;
    @SerializedName("PropertyId")
    @Nullable
    @Expose
    private long propertyId;
    @SerializedName("NoOfNights")
    @Nullable
    @Expose
    private long noOfNights;
    @SerializedName("IsMetaSearch")
    @Nullable
    @Expose
    private boolean isMetaSearch;
    @SerializedName("MetaType")
    @Nullable
    @Expose
    private long metaType;
    @SerializedName("DateOfIssue")
    @Nullable
    @Expose
    private String dateOfIssue;
    @SerializedName("SearchId")
    @Nullable
    @Expose
    private String searchId;
    @SerializedName("CountryOfResdnce")
    @Nullable
    @Expose
    private String countryOfResdnce;
    @SerializedName("ItineraryNameForLogging")
    @Nullable
    @Expose
    private String itineraryNameForLogging;
    @SerializedName("SourceInfo")
    @Nullable
    @Expose
    private String SourceInfo;

    @SerializedName("IsMobileApp")
    @Nullable
    @Expose
    private boolean IsMobileApp;
    @SerializedName("Source")
    @Nullable
    @Expose
    private String source;
    @SerializedName("utmparams")
    @Expose
    public Object utmparams;
    @SerializedName("TrivagoCurrency")
    @Expose
    public Object trivagoCurrency;
    @SerializedName("IsAirport")
    @Expose
    public boolean isAirport;
    @SerializedName("UniqueId")
    @Expose
    public Object uniqueId;
    @SerializedName("DeviceCategory")
    @Expose
    public Object deviceCategory;
    @SerializedName("loyaltyType")
    @Expose
    public long loyaltyType;
    @SerializedName("CheckInTime")
    @Expose
    public Object checkInTime;
    @SerializedName("CheckOutTime")
    @Expose
    public Object checkOutTime;
    @SerializedName("UserCountryCode")
    @Expose
    public Object userCountryCode;
    @SerializedName("MetaSearchCountry")
    @Expose
    public Object metaSearchCountry;

    @Nullable
    public String getSource() {
        return source;
    }

    public void setSource(@Nullable String source) {
        this.source = source;
    }

    @Nullable
    public String getSourceInfo() {
        return SourceInfo;
    }

    public void setSourceInfo(@Nullable String sourceInfo) {
        SourceInfo = sourceInfo;
    }

    @Nullable
    public boolean getMobileApp() {
        return IsMobileApp;
    }

    public void setMobileApp(@Nullable boolean mobileApp) {
        IsMobileApp = mobileApp;
    }

    @Nullable
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(@Nullable String countryName) {
        this.countryName = countryName;
    }

    @Nullable
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(@Nullable String countryCode) {
        this.countryCode = countryCode;
    }

    @Nullable
    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(@Nullable String destinationCity) {
        this.destinationCity = destinationCity;
    }

    @Nullable
    public String getDestinationCityCode() {
        return destinationCityCode;
    }

    public void setDestinationCityCode(@Nullable String destinationCityCode) {
        this.destinationCityCode = destinationCityCode;
    }

    @Nullable
    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(@Nullable String checkInDate) {
        this.checkInDate = checkInDate;
    }

    @Nullable
    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(@Nullable String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Nullable
    public String getNationality() {
        return nationality;
    }

    public void setNationality(@Nullable String nationality) {
        this.nationality = nationality;
    }

    @Nullable
    public List<RoomTypeDetail> getRoomTypeDetails() {
        return roomTypeDetails;
    }

    public void setRoomTypeDetails(@Nullable List<RoomTypeDetail> roomTypeDetails) {
        this.roomTypeDetails = roomTypeDetails;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    @Nullable
    public String getStarRating() {
        return starRating;
    }

    public void setStarRating(@Nullable String starRating) {
        this.starRating = starRating;
    }

    @Nullable
    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrentCulture() {
        return currentCulture;
    }

    public void setCurrentCulture(String currentCulture) {
        this.currentCulture = currentCulture;
    }

    public long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(long agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgencyLogo() {
        return agencyLogo;
    }

    public void setAgencyLogo(String agencyLogo) {
        this.agencyLogo = agencyLogo;
    }

    public boolean isIsShowAgencyContact() {
        return isShowAgencyContact;
    }

    public void setIsShowAgencyContact(boolean isShowAgencyContact) {
        this.isShowAgencyContact = isShowAgencyContact;
    }

    public String getAgencyCustomerNumber() {
        return agencyCustomerNumber;
    }

    public void setAgencyCustomerNumber(String agencyCustomerNumber) {
        this.agencyCustomerNumber = agencyCustomerNumber;
    }

    public String getAgencyEmail() {
        return agencyEmail;
    }

    public void setAgencyEmail(String agencyEmail) {
        this.agencyEmail = agencyEmail;
    }

    public long getIataBranchId() {
        return iataBranchId;
    }

    public void setIataBranchId(long iataBranchId) {
        this.iataBranchId = iataBranchId;
    }

    public long getDecimalPoints() {
        return decimalPoints;
    }

    public void setDecimalPoints(long decimalPoints) {
        this.decimalPoints = decimalPoints;
    }

    public long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(long propertyId) {
        this.propertyId = propertyId;
    }

    public long getNoOfNights() {
        return noOfNights;
    }

    public void setNoOfNights(long noOfNights) {
        this.noOfNights = noOfNights;
    }

    public boolean isIsMetaSearch() {
        return isMetaSearch;
    }

    public void setIsMetaSearch(boolean isMetaSearch) {
        this.isMetaSearch = isMetaSearch;
    }

    public long getMetaType() {
        return metaType;
    }

    public void setMetaType(long metaType) {
        this.metaType = metaType;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public String getCountryOfResdnce() {
        return countryOfResdnce;
    }

    public void setCountryOfResdnce(String countryOfResdnce) {
        this.countryOfResdnce = countryOfResdnce;
    }

    public String getItineraryNameForLogging() {
        return itineraryNameForLogging;
    }

    public void setItineraryNameForLogging(String itineraryNameForLogging) {
        this.itineraryNameForLogging = itineraryNameForLogging;
    }

    public boolean isShowAgencyContact() {
        return isShowAgencyContact;
    }

    public void setShowAgencyContact(boolean showAgencyContact) {
        isShowAgencyContact = showAgencyContact;
    }

    public boolean isMetaSearch() {
        return isMetaSearch;
    }

    public void setMetaSearch(boolean metaSearch) {
        isMetaSearch = metaSearch;
    }

    public boolean isMobileApp() {
        return IsMobileApp;
    }

    public Object getUtmparams() {
        return utmparams;
    }

    public void setUtmparams(Object utmparams) {
        this.utmparams = utmparams;
    }

    public Object getTrivagoCurrency() {
        return trivagoCurrency;
    }

    public void setTrivagoCurrency(Object trivagoCurrency) {
        this.trivagoCurrency = trivagoCurrency;
    }

    public boolean isAirport() {
        return isAirport;
    }

    public void setAirport(boolean airport) {
        isAirport = airport;
    }

    public Object getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Object uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Object getDeviceCategory() {
        return deviceCategory;
    }

    public void setDeviceCategory(Object deviceCategory) {
        this.deviceCategory = deviceCategory;
    }

    public long getLoyaltyType() {
        return loyaltyType;
    }

    public void setLoyaltyType(long loyaltyType) {
        this.loyaltyType = loyaltyType;
    }

    public Object getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Object checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Object getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Object checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public Object getUserCountryCode() {
        return userCountryCode;
    }

    public void setUserCountryCode(Object userCountryCode) {
        this.userCountryCode = userCountryCode;
    }

    public Object getMetaSearchCountry() {
        return metaSearchCountry;
    }

    public void setMetaSearchCountry(Object metaSearchCountry) {
        this.metaSearchCountry = metaSearchCountry;
    }
}
