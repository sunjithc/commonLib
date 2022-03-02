package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class UserInfoModal : Serializable {
    @SerializedName("IsAuthorisedUser")
    @Expose
    var isAuthorisedUser = false

    @SerializedName("IsAuthorized")
    @Expose
    var isAuthorized = false

    @SerializedName("IsLoggedIn")
    @Expose
    var isLoggedIn = false

    @SerializedName("UserId")
    @Expose
    var userId: Int? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("LastName")
    @Expose
    var lastName: String? = null

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
    var active: Boolean? = null

    @SerializedName("Encrypt")
    @Expose
    var encrypt: Any? = null

    @SerializedName("AllowedAPI")
    @Expose
    var allowedAPI: Any? = null

    @SerializedName("AgencyId")
    @Expose
    var agencyId: Any? = null

    @SerializedName("Agency")
    @Expose
    var agency: Int? = null

    @SerializedName("IataId")
    @Expose
    var iataId: Any? = null

    @SerializedName("RoleID")
    @Expose
    var roleID: Int? = null

    @SerializedName("MobileNo")
    @Expose
    var mobileNo: Any? = null

    @SerializedName("UserIpAddress")
    @Expose
    var userIpAddress: Any? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: Any? = null

    @SerializedName("CountryName")
    @Expose
    var countryName: Any? = null

    @SerializedName("CorporateCode")
    @Expose
    var corporateCode: Boolean? = null

    @SerializedName("ExpireDate")
    @Expose
    var expireDate: Any? = null

    @SerializedName("UK")
    @Expose
    private var uK: Any? = null

    @SerializedName("SocialToken")
    @Expose
    var socialToken: Any? = null

    @SerializedName("loginType")
    @Expose
    var loginType: Int? = null

    @SerializedName("MobileCode")
    @Expose
    var mobileCode: Any? = null

    @SerializedName("ReferralCode")
    @Expose
    var referralCode: Any? = null

    @SerializedName("AppID")
    @Expose
    var appID: Any? = null

    @SerializedName("IsGCCCountry")
    @Expose
    var gCCCountry: Boolean? = null

    @SerializedName("customerType")
    @Expose
    var customerType: Int? = null
    fun getuK(): Any? {
        return uK
    }

    fun setuK(uK: Any?) {
        this.uK = uK
    }
}