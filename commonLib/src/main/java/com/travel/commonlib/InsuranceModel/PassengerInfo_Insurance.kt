package com.travel.commonlib.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PassengerInfo_Insurance :Serializable{

    @SerializedName("Gender")
    @Expose
    var gender: String? = null
    @SerializedName("FirstName")
    @Expose
    var firstName: String? = null
    @SerializedName("LastName")
    @Expose
    var lastName: String? = null
    @SerializedName("PassengerType")
    @Expose
    var passengerType: String? = null
    @SerializedName("Email")
    @Expose
    var email: String? = null
    @SerializedName("MobileNumber")
    @Expose
    var mobileNumber: String? = null
    @SerializedName("DateOfBirth")
    @Expose
    var dateOfBirth: String? = null
    @SerializedName("PassportNumber")
    @Expose
    var passportNumber: String? = null
    @SerializedName("Nationality")
    @Expose
    var nationality: String? = null
}
