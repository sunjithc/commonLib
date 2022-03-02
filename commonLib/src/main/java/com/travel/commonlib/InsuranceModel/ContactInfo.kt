package com.travel.commonlib.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ContactInfo : Serializable {

    @SerializedName("CivilId")
    @Expose
    var civilId : String? = null
    @SerializedName("RelationCode")
    @Expose
    var relationCode: String? = null
    @SerializedName("DateOfBirth")
    @Expose
    var dateOfBirth: String? = null
    @SerializedName("Nationality")
    @Expose
    var nationality: String? = null
    @SerializedName("PassengerType")
    @Expose
    var passengerType: String? = null
}
