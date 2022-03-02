package com.travel.commonlib.register

import com.google.gson.annotations.SerializedName

class User {
    @SerializedName("UserInfo")
    var userInfo: UserInf? = null

    class UserInf {
        @SerializedName("UserName")
        var userName: String? = null
    }
}