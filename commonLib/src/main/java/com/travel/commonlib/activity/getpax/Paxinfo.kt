package com.travel.commonlib.activity.getpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Paxinfo : Serializable {
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
    var age: Int = 0

    @SerializedName("GSTNumber")
    @Expose
    var gSTNumber: String? = null

    @SerializedName("GSTEmail")
    @Expose
    var gSTEmail: String? = null

    @SerializedName("GSTAddress")
    @Expose
    var gSTAddress: String? = null

    @SerializedName("GSTPhone")
    @Expose
    var gSTPhone: String? = null

    @SerializedName("GSTCity")
    @Expose
    var gSTCity: Any? = null

    @SerializedName("GSTState")
    @Expose
    var gSTState: String? = null

    @SerializedName("GSTPincode")
    @Expose
    var gSTPincode: String? = null

    @SerializedName("GSTCompany")
    @Expose
    var gSTCompany: String? = null

    @SerializedName("DOB")
    @Expose
    var dob: String? = null

    @SerializedName("RelationCode")
    @Expose
    var relationCode: String? = null

    @SerializedName("Gender")
    @Expose
    var gender: String? = null

    @SerializedName("NationalityCode")
    @Expose
    var nationalityCode: String? = null

    companion object {
        private const val serialVersionUID = -9158318452486469359L
    }
}