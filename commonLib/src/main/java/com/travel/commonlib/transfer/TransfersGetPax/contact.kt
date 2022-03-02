package com.travel.commonlib.transfer.TransfersGetPax

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

/**
 * Created by Rohith (Android) on 5/21/2021.
 */
class contact : Serializable {
    @SerializedName("CountryCode")
    @Expose
    var countryCode: String? = null

    @SerializedName("PhoneNumber")
    @Expose
    var phoneNumber: String? = null

    @SerializedName("EmailAddress")
    @Expose
    var emailAddress: String? = null

    @SerializedName("Nationality")
    @Expose
    var nationality: String? = null
}