package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Contactinfo : Serializable {
    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("phone")
    @Expose
    var phone: String? = null

    @SerializedName("fax")
    @Expose
    var fax: String? = null

    @SerializedName("website")
    @Expose
    var website: String? = null
}