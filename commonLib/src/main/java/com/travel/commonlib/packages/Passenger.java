
package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.Flight.Model.PaxSubmitModel.MealInfos;
import com.travel.jumbo.Flight.Model.SeatModel.FlightSeatInfoSelected;
import com.travel.jumbo.model.packages.BoardingInfo;
import com.travel.jumbo.model.packages.PreferenceInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Passenger implements Serializable {

    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("CountryCode")
    @Expose
    private String countryCode;
    @SerializedName("DateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("IsLeadPassenger")
    @Expose
    private boolean isLeadPassenger;
    @SerializedName("PassportNumber")
    @Expose
    private String passportNumber;
    @SerializedName("PassportIssuePlace")
    @Expose
    private String passportIssuePlace;
    private String passportIssuePlaceName;
    @SerializedName("PassportExpiryDate")
    @Expose
    private String passportExpiryDate;
    @SerializedName("PassengerType")
    @Expose
    private int passengerType;
    @SerializedName("MobileCode")
    @Expose
    private String mobileCode;
    @SerializedName("PhoneCountryCode")
    @Expose
    private String phoneCountryCode;
    @SerializedName("MobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("IsPassportRequired")
    @Expose
    private boolean isPassportRequired;
    @SerializedName("PreferenceInfo")
    @Expose
    private List<PreferenceInfo> preferenceInfos = null;
    @SerializedName("Age")
    @Expose
    private String age;
    @SerializedName("Index")
    @Expose
    private int index;
    @SerializedName("RoomIndex")
    @Expose
    private int roomIndex;
    @SerializedName("SpecialRequests")
    @Expose
    private String specialRequests;
    @SerializedName("IsSelected")
    @Expose
    private boolean isSelected;
    @SerializedName("CountryOfResdidence")
    @Expose
    private String countryOfResdidence;
    @SerializedName("BoardingInfos")
    @Expose
    private List<BoardingInfo> boardingInfos = null;
    @SerializedName("IsClicked")
    @Expose
    public boolean isClicked;
    @SerializedName("Isloggined")
    @Expose
    public boolean isloggined;
    @SerializedName("SessionKey")
    @Expose
    public String sessionKey;
    @SerializedName("SelectedSeat")
    @Expose
    private ArrayList<FlightSeatInfoSelected> selectedSeat = null;
    @SerializedName("MealInfos")
    @Expose
    private MealInfos mealInfos;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isIsLeadPassenger() {
        return isLeadPassenger;
    }

    public void setIsLeadPassenger(boolean isLeadPassenger) {
        this.isLeadPassenger = isLeadPassenger;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportIssuePlace() {
        return passportIssuePlace;
    }

    public void setPassportIssuePlace(String passportIssuePlace) {
        this.passportIssuePlace = passportIssuePlace;
    }

    public String getPassportExpiryDate() {
        return passportExpiryDate;
    }

    public void setPassportExpiryDate(String passportExpiryDate) {
        this.passportExpiryDate = passportExpiryDate;
    }

    public int getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(int passengerType) {
        this.passengerType = passengerType;
    }

    public String getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsPassportRequired() {
        return isPassportRequired;
    }

    public void setIsPassportRequired(boolean isPassportRequired) {
        this.isPassportRequired = isPassportRequired;
    }

    public List<PreferenceInfo> getPreferenceInfos() {
        return preferenceInfos;
    }

    public void setPreferenceInfos(List<PreferenceInfo> preferenceInfos) {
        this.preferenceInfos = preferenceInfos;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getRoomIndex() {
        return roomIndex;
    }

    public void setRoomIndex(int roomIndex) {
        this.roomIndex = roomIndex;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }

    public boolean isIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public String getCountryOfResdidence() {
        return countryOfResdidence;
    }

    public void setCountryOfResdidence(String countryOfResdidence) {
        this.countryOfResdidence = countryOfResdidence;
    }

    public String getPassportIssuePlaceName() {
        return passportIssuePlaceName;
    }

    public void setPassportIssuePlaceName(String passportIssuePlaceName) {
        this.passportIssuePlaceName = passportIssuePlaceName;
    }

    public List<BoardingInfo> getBoardingInfos() {
        return boardingInfos;
    }

    public void setBoardingInfos(List<BoardingInfo> boardingInfos) {
        this.boardingInfos = boardingInfos;
    }

    public ArrayList<FlightSeatInfoSelected> getSelectedSeat() {
        return selectedSeat;
    }

    public void setSelectedSeat(ArrayList<FlightSeatInfoSelected> selectedSeat) {
        this.selectedSeat = selectedSeat;
    }

    public MealInfos getMealInfos() {
        return mealInfos;
    }

    public void setMealInfos(MealInfos mealInfos) {
        this.mealInfos = mealInfos;
    }
}
