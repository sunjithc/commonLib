package com.travel.commonlib.register

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserRegister {
    @SerializedName("UserInfo")
    @Expose
    var userInfo: UserInfos? = null

    @SerializedName("IsAuthorized")
    @Expose
    var isAuthorized = false

    @SerializedName("IsAnotherLoginType")
    @Expose
    var isAnotherLoginType = false

    @SerializedName("Type")
    @Expose
    var type = 0

    @SerializedName("SocialLogin")
    @Expose
    var socialLogin = 0

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("IsAppUser")
    @Expose
    var isAppUser = false

    @SerializedName("Culture")
    var culture: String? = null

    @SerializedName("RegisterSuccess")
    @Expose
    var isRegisterSuccess = false

    @SerializedName("IsAdmin")
    @Expose
    var isAdmin = false

    @SerializedName("RegistrationPayInfo")
    @Expose
    var registrationPayInfo: Any? = null
}