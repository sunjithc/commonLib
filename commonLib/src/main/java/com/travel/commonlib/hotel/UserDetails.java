
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserDetails {

    @SerializedName("UserId")
    @Expose
    private long userId;
    @SerializedName("Name")
    @Expose
    private Object name;
    @SerializedName("LastName")
    @Expose
    private Object lastName;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("Password")
    @Expose
    private Object password;
    @SerializedName("NewPassword")
    @Expose
    private Object newPassword;
    @SerializedName("Email")
    @Expose
    private Object email;
    @SerializedName("IsActive")
    @Expose
    private boolean isActive;
    @SerializedName("IsLoggedIn")
    @Expose
    private boolean isLoggedIn;
    @SerializedName("Encrypt")
    @Expose
    private Object encrypt;
    @SerializedName("AllowedAPI")
    @Expose
    private Object allowedAPI;
    @SerializedName("AgencyId")
    @Expose
    private Object agencyId;
    @SerializedName("Agency")
    @Expose
    private long agency;
    @SerializedName("IataId")
    @Expose
    private Object iataId;
    @SerializedName("RoleID")
    @Expose
    private long roleID;
    @SerializedName("MobileNo")
    @Expose
    private Object mobileNo;
    @SerializedName("UserIpAddress")
    @Expose
    private Object userIpAddress;
    @SerializedName("CountryCode")
    @Expose
    private Object countryCode;
    @SerializedName("CountryName")
    @Expose
    private Object countryName;
    @SerializedName("CorporateCode")
    @Expose
    private boolean corporateCode;
    @SerializedName("ExpireDate")
    @Expose
    private Object expireDate;
    @SerializedName("UK")
    @Expose
    private Object uK;
    @SerializedName("SocialToken")
    @Expose
    private Object socialToken;
    @SerializedName("loginType")
    @Expose
    private long loginType;
    @SerializedName("MiddleName")
    @Expose
    public Object middleName;
    @SerializedName("MobileCode")
    @Expose
    public Object mobileCode;
    @SerializedName("ReferralCode")
    @Expose
    public Object referralCode;
    @SerializedName("AppID")
    @Expose
    public Object appID;
    @SerializedName("IsGCCCountry")
    @Expose
    public boolean isGCCCountry;
    @SerializedName("customerType")
    @Expose
    public long customerType;
    @SerializedName("RewardUserID")
    @Expose
    public Object rewardUserID;
    @SerializedName("CorporateId")
    @Expose
    public Object corporateId;
    @SerializedName("AgencyLogo")
    @Expose
    public Object agencyLogo;
    @SerializedName("EnablePhoneNumberCheck")
    @Expose
    public boolean enablePhoneNumberCheck;
    @SerializedName("PaidMembershipId")
    @Expose
    public Object paidMembershipId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getLastName() {
        return lastName;
    }

    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Object getPassword() {
        return password;
    }

    public void setPassword(Object password) {
        this.password = password;
    }

    public Object getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(Object newPassword) {
        this.newPassword = newPassword;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public Object getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Object encrypt) {
        this.encrypt = encrypt;
    }

    public Object getAllowedAPI() {
        return allowedAPI;
    }

    public void setAllowedAPI(Object allowedAPI) {
        this.allowedAPI = allowedAPI;
    }

    public Object getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Object agencyId) {
        this.agencyId = agencyId;
    }

    public long getAgency() {
        return agency;
    }

    public void setAgency(long agency) {
        this.agency = agency;
    }

    public Object getIataId() {
        return iataId;
    }

    public void setIataId(Object iataId) {
        this.iataId = iataId;
    }

    public long getRoleID() {
        return roleID;
    }

    public void setRoleID(long roleID) {
        this.roleID = roleID;
    }

    public Object getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Object mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Object getUserIpAddress() {
        return userIpAddress;
    }

    public void setUserIpAddress(Object userIpAddress) {
        this.userIpAddress = userIpAddress;
    }

    public Object getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Object countryCode) {
        this.countryCode = countryCode;
    }

    public Object getCountryName() {
        return countryName;
    }

    public void setCountryName(Object countryName) {
        this.countryName = countryName;
    }

    public boolean isCorporateCode() {
        return corporateCode;
    }

    public void setCorporateCode(boolean corporateCode) {
        this.corporateCode = corporateCode;
    }

    public Object getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Object expireDate) {
        this.expireDate = expireDate;
    }

    public Object getUK() {
        return uK;
    }

    public void setUK(Object uK) {
        this.uK = uK;
    }

    public Object getSocialToken() {
        return socialToken;
    }

    public void setSocialToken(Object socialToken) {
        this.socialToken = socialToken;
    }

    public long getLoginType() {
        return loginType;
    }

    public void setLoginType(long loginType) {
        this.loginType = loginType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public Object getuK() {
        return uK;
    }

    public void setuK(Object uK) {
        this.uK = uK;
    }

    public Object getMiddleName() {
        return middleName;
    }

    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    public Object getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(Object mobileCode) {
        this.mobileCode = mobileCode;
    }

    public Object getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(Object referralCode) {
        this.referralCode = referralCode;
    }

    public Object getAppID() {
        return appID;
    }

    public void setAppID(Object appID) {
        this.appID = appID;
    }

    public boolean isGCCCountry() {
        return isGCCCountry;
    }

    public void setGCCCountry(boolean GCCCountry) {
        isGCCCountry = GCCCountry;
    }

    public long getCustomerType() {
        return customerType;
    }

    public void setCustomerType(long customerType) {
        this.customerType = customerType;
    }

    public Object getRewardUserID() {
        return rewardUserID;
    }

    public void setRewardUserID(Object rewardUserID) {
        this.rewardUserID = rewardUserID;
    }

    public Object getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(Object corporateId) {
        this.corporateId = corporateId;
    }

    public Object getAgencyLogo() {
        return agencyLogo;
    }

    public void setAgencyLogo(Object agencyLogo) {
        this.agencyLogo = agencyLogo;
    }

    public boolean isEnablePhoneNumberCheck() {
        return enablePhoneNumberCheck;
    }

    public void setEnablePhoneNumberCheck(boolean enablePhoneNumberCheck) {
        this.enablePhoneNumberCheck = enablePhoneNumberCheck;
    }

    public Object getPaidMembershipId() {
        return paidMembershipId;
    }

    public void setPaidMembershipId(Object paidMembershipId) {
        this.paidMembershipId = paidMembershipId;
    }
}
