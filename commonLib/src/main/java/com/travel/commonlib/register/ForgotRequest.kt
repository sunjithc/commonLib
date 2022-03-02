package com.travel.commonlib.register

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ForgotRequest {
    @SerializedName("Culture")
    @Expose
    var culture: String? = null

    @SerializedName("Type")
    @Expose
    var type = 0

    @SerializedName("UserInfo")
    @Expose
    var userInfo: UserInfo? = null

    class UserInfo {
        @SerializedName("UserName")
        @Expose
        var userName: String? = null
    }
}