package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class PassengerDetail implements Serializable {

    @SerializedName("Tittle")
    @Expose
    private String tittle;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("MiddleName")
    @Expose
    private String middleName;
    @SerializedName("PhoneCountryCode")
    @Expose
    private String phoneCountryCode;
    @SerializedName("MobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Age")
    @Expose
    private long age;
    @SerializedName("Index")
    @Expose
    private long index;
    @SerializedName("RoomIndex")
    @Expose
    private long roomIndex;
    @SerializedName("PassengerType")
    @Expose
    private int passengerType;
    @SerializedName("DateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("SpecialRequests")
    @Expose
    private String specialRequests;
    @SerializedName("IsSelected")
    @Expose
    private boolean isSelected;
    @SerializedName("IsLeadPassenger")
    @Expose
    private boolean isLeadPassenger;
    @SerializedName("PaxTotalNameLength")
    @Expose
    private int paxTotalNameLength;
    @SerializedName("CountryOfResdidence")
    @Expose
    private String countryOfResdidence;

    @SerializedName("Nationality")
    @Expose
    private String nationality;

    @SerializedName("IsGSTInfoGiven")
    @Expose
    private boolean isGstInfoGiven;
    @SerializedName("GSTNumber")
    @Expose
    private String gstNumber;
    @SerializedName("GSTEmail")
    @Expose
    private String gstEmail;
    @SerializedName("GSTAddress")
    @Expose
    private String gstAddress;
    @SerializedName("GSTPhone")
    @Expose
    private String gstPhone;
    @SerializedName("GSTCity")
    @Expose
    private String gstCity;
    @SerializedName("GSTState")
    @Expose
    private String gstState;
    @SerializedName("GSTPincode")
    @Expose
    private String gstPincode;
    @SerializedName("GSTCompany")
    @Expose
    private String gstCompany;
    @SerializedName("MembershipReffNo")
    @Expose
    private String membershipReffNo;
    @SerializedName("AgencyReffNo")
    @Expose
    private String agencyReffNo;
    @SerializedName("SecondaryMobileCode")
    @Expose
    public Object secondaryMobileCode;
    @SerializedName("SecondaryMobileNumber")
    @Expose
    public Object secondaryMobileNumber;



    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int isPaxTotalNameLength() {
        return paxTotalNameLength;
    }

    public void setPaxTotalNameLength(int paxTotalNameLength) {
        this.paxTotalNameLength = paxTotalNameLength;
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

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public long getRoomIndex() {
        return roomIndex;
    }

    public void setRoomIndex(long roomIndex) {
        this.roomIndex = roomIndex;
    }

    public int getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(int passengerType) {
        this.passengerType = passengerType;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    public boolean isIsLeadPassenger() {
        return isLeadPassenger;
    }

    public void setIsLeadPassenger(boolean isLeadPassenger) {
        this.isLeadPassenger = isLeadPassenger;
    }

    public String getCountryOfResdidence() {
        return countryOfResdidence;
    }

    public void setCountryOfResdidence(String countryOfResdidence) {
        this.countryOfResdidence = countryOfResdidence;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isLeadPassenger() {
        return isLeadPassenger;
    }

    public void setLeadPassenger(boolean leadPassenger) {
        isLeadPassenger = leadPassenger;
    }

    public boolean isGstInfoGiven() {
        return isGstInfoGiven;
    }

    public void setGstInfoGiven(boolean gstInfoGiven) {
        isGstInfoGiven = gstInfoGiven;
    }

    public String getGstNumber() {
        return gstNumber;
    }

    public void setGstNumber(String gstNumber) {
        this.gstNumber = gstNumber;
    }

    public String getGstEmail() {
        return gstEmail;
    }

    public void setGstEmail(String gstEmail) {
        this.gstEmail = gstEmail;
    }

    public String getGstAddress() {
        return gstAddress;
    }

    public void setGstAddress(String gstAddress) {
        this.gstAddress = gstAddress;
    }

    public String getGstPhone() {
        return gstPhone;
    }

    public void setGstPhone(String gstPhone) {
        this.gstPhone = gstPhone;
    }

    public String getGstCity() {
        return gstCity;
    }

    public void setGstCity(String gstCity) {
        this.gstCity = gstCity;
    }

    public String getGstState() {
        return gstState;
    }

    public void setGstState(String gstState) {
        this.gstState = gstState;
    }

    public String getGstPincode() {
        return gstPincode;
    }

    public void setGstPincode(String gstPincode) {
        this.gstPincode = gstPincode;
    }

    public String getGstCompany() {
        return gstCompany;
    }

    public void setGstCompany(String gstCompany) {
        this.gstCompany = gstCompany;
    }

    public String getMembershipReffNo() {
        return membershipReffNo;
    }

    public void setMembershipReffNo(String membershipReffNo) {
        this.membershipReffNo = membershipReffNo;
    }

    public String getAgencyReffNo() {
        return agencyReffNo;
    }

    public void setAgencyReffNo(String agencyReffNo) {
        this.agencyReffNo = agencyReffNo;
    }

    public int getPaxTotalNameLength() {
        return paxTotalNameLength;
    }

    public Object getSecondaryMobileCode() {
        return secondaryMobileCode;
    }

    public void setSecondaryMobileCode(Object secondaryMobileCode) {
        this.secondaryMobileCode = secondaryMobileCode;
    }

    public Object getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }

    public void setSecondaryMobileNumber(Object secondaryMobileNumber) {
        this.secondaryMobileNumber = secondaryMobileNumber;
    }
}
