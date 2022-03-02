package com.travel.commonlib.register

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoginResponse {
    @SerializedName("access_token")
    @Expose
    var access_token: String? = null

    @SerializedName("token_type")
    @Expose
    var token_type: String? = null

    @SerializedName("expires_in")
    @Expose
    var expires_in = 0

    @SerializedName("refresh_token")
    @Expose
    var refresh_token: String? = null

    @SerializedName("UserName")
    @Expose
    var userName: String? = null

    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("IsAuthorized")
    @Expose
    var isAuthorized: String? = null

    @SerializedName("IsLoginUser")
    @Expose
    var isLoginUser: String? = null

    @SerializedName("UserId")
    @Expose
    var userId: String? = null

    @SerializedName("Role")
    @Expose
    var role: String? = null

    @SerializedName("IsGCCCountry")
    @Expose
    var isGCCCountry: String? = null

    @SerializedName("ProfileImg")
    @Expose
    var profileImg: String? = null

    @SerializedName("RewardUserID")
    @Expose
    var rewardUserID: String? = null

    @SerializedName(".issue")
    @Expose
    var issue: String? = null

    @SerializedName(".expires")
    @Expose
    var expires: String? = null
}