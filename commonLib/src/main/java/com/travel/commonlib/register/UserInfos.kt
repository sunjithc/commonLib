package com.travel.commonlib.register

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserInfos {
    @SerializedName("UserId")
    @Expose
    var userId = 0

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("LastName")
    @Expose
    var lastName: String? = null

    @SerializedName("MiddleName")
    @Expose
    var middleName: String? = null

    @SerializedName("UserName")
    @Expose
    var userName: String? = null

    @SerializedName("Password")
    @Expose
    var password: String? = null

    @SerializedName("NewPassword")
    @Expose
    var newPassword: String? = null

    @SerializedName("Email")
    @Expose
    var email: String? = null

    @SerializedName("IsActive")
    @Expose
    var isActive = false

    @SerializedName("IsLoggedIn")
    @Expose
    var isLoggedIn = false

    @SerializedName("Encrypt")
    @Expose
    var encrypt: String? = null

    @SerializedName("AllowedAPI")
    @Expose
    var allowedAPI: String? = null

    @SerializedName("AgencyId")
    @Expose
    var agencyId: String? = null

    @SerializedName("Agency")
    @Expose
    var agency = 0

    @SerializedName("IataId")
    @Expose
    var iataId: String? = null

    @SerializedName("RoleID")
    @Expose
    var roleID = 0

    @SerializedName("MobileNo")
    @Expose
    var mobileNo: String? = null

    @SerializedName("UserIpAddress")
    @Expose
    var userIpAddress: String? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: String? = null

    @SerializedName("CountryName")
    @Expose
    var countryName: String? = null

    @SerializedName("CorporateCode")
    @Expose
    var corporateCode: String? = null

    @SerializedName("ExpireDate")
    @Expose
    var expireDate: String? = null

    @SerializedName("UK")
    @Expose
    var uK: String? = null

    @SerializedName("SocialToken")
    @Expose
    var socialToken: String? = null

    @SerializedName("loginType")
    @Expose
    var loginType = 0

    @SerializedName("MobileCode")
    @Expose
    var mobileCode: String? = null

    @SerializedName("ReferralCode")
    @Expose
    var referralCode: String? = null

    @SerializedName("AppID")
    @Expose
    var appID: String? = null

    @SerializedName("IsGCCCountry")
    @Expose
    var isGCCCountry: String? = null

    @SerializedName("customerType")
    @Expose
    var customerType = 0

    @SerializedName("RewardUserID")
    @Expose
    var rewardUserID: String? = null

    @SerializedName("CorporateId")
    @Expose
    var corporateId: String? = null

    @SerializedName("AgencyLogo")
    @Expose
    var agencyLogo: String? = null

    @SerializedName("EnablePhoneNumberCheck")
    @Expose
    var isEnablePhoneNumberCheck = false

    @SerializedName("PaidMembershipId")
    @Expose
    var paidMembershipId: String? = null
}