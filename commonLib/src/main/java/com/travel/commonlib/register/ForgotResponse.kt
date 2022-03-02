package com.travel.commonlib.register

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ForgotResponse {
    @SerializedName("Status")
    @Expose
    var status: String? = null
}