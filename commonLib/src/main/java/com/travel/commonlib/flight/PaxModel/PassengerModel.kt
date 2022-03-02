package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class PassengerModel : Serializable {
    @SerializedName("IsLoggedIn")
    @Expose
    var loggedIn: Boolean? = null

    @SerializedName("UserName")
    @Expose
    var userName: String? = null

    @SerializedName("CountryList")
    @Expose
    var countryList: Any? = null

    @SerializedName("PassengerInfos")
    @Expose
    var passengerInfos: ArrayList<PassengerInfo>? = null

    @SerializedName("SSRDetails")
    @Expose
    private var sSRDetails: String? = null

}