package com.travel.commonlib.transfer.TransfersGetPax

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class PassengerModel : Serializable {
    @SerializedName("FirstName")
    @Expose
    var firstName: String? = null

    @SerializedName("LastName")
    @Expose
    var lastName: String? = null

    @SerializedName("MiddleName")
    @Expose
    var middleName: String? = null

    @SerializedName("paxname")
    @Expose
    var paxname: String? = null

    @SerializedName("paxid")
    @Expose
    var paxid: Int? = null

    @SerializedName("Title")
    @Expose
    var title: String? = null

    @SerializedName("PassengerType")
    @Expose
    var passengerType: String? = null

    @SerializedName("Age")
    @Expose
    var age: Int? = null

    @SerializedName("DOB")
    @Expose
    var dob: String? = null

    @SerializedName("DateOfBirth ")
    @Expose
    var dateOfBirth : String? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: String? = null
}