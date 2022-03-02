package com.travel.commonlib.activity.setpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PaxSinfo : Serializable {
    @SerializedName("Title")
    @Expose
    var title: String? = null

    @SerializedName("FirstName")
    @Expose
    var firstName: String? = null

    @SerializedName("LastName")
    @Expose
    var lastName: String? = null

    @SerializedName("FullName")
    @Expose
    var fullName: String? = null

    @SerializedName("Email")
    @Expose
    var email: String? = null

    @SerializedName("MobileCode")
    @Expose
    var mobileCode: String? = null

    @SerializedName("MobileNumber")
    @Expose
    var mobileNumber: String? = null

    @SerializedName("Citizenship")
    @Expose
    var citizenship: String? = null

    @SerializedName("PaxType")
    @Expose
    var paxType: Int = 0

    @SerializedName("Age")
    @Expose
    var age: Long = 0

    @SerializedName("GSTNumber")
    @Expose
    var gSTNumber: Any? = null

    @SerializedName("GSTEmail")
    @Expose
    var gSTEmail: Any? = null

    @SerializedName("GSTAddress")
    @Expose
    var gSTAddress: Any? = null

    @SerializedName("GSTPhone")
    @Expose
    var gSTPhone: Any? = null

    @SerializedName("GSTCity")
    @Expose
    var gSTCity: Any? = null

    @SerializedName("GSTState")
    @Expose
    var gSTState: Any? = null

    @SerializedName("GSTPincode")
    @Expose
    var gSTPincode: Any? = null

    @SerializedName("GSTCompany")
    @Expose
    var gSTCompany: Any? = null

    @SerializedName("DOB")
    @Expose
    var dob: String? = null

    @SerializedName("RelationCode")
    @Expose
    var relationCode: Any? = null

    @SerializedName("Gender")
    @Expose
    var gender: Any? = null

    @SerializedName("NationalityCode")
    @Expose
    var nationalityCode: Any? = null

    @SerializedName("DateOfBirth ")
    @Expose
    var dateOfBirth : String? = null

    companion object {
        private const val serialVersionUID = 205657344400681136L
    }
}