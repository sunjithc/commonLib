package com.travel.commonlib.activity.couponcode

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class CouponCodeResponse {
    @SerializedName("StatusCode")
    @Expose
    var statusCode: String? = null

    @SerializedName("Message")
    @Expose
    var message: String? = null

    @SerializedName("Data")
    @Expose
    var data: CouponCodeData? = null
}