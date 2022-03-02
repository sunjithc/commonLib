package com.travel.commonlib.register

import com.google.gson.annotations.SerializedName

class RegisterRequest {
    @SerializedName("UserInfo")
    var userInfo: UserInfs? = null

    class UserInfs {
        @SerializedName("Name")
        var name: String? = null

        @SerializedName("LastName")
        var lastName: String? = null

        @SerializedName("Email")
        var email: String? = null

        @SerializedName("CountryCode")
        var countryCode: String? = null

        @SerializedName("MobileCode")
        var mobileCode: String? = null

        @SerializedName("MobileNo")
        var mobileNo: String? = null

        @SerializedName("ReferralCode")
        var referralCode: String? = null

        @SerializedName("Password")
        var password: String? = null
    }
}