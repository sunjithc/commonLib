package com.travel.commonlib.transfer.TransfersGetPax

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class MobileCountryCode : Serializable {
    @SerializedName("CountryId")
    @Expose
    var countryId: Int? = null

    @SerializedName("CountryName")
    @Expose
    var countryName: String? = null

    @SerializedName("CountryNameArabic")
    @Expose
    var countryNameArabic: String? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: String? = null

    @SerializedName("MobileCode")
    @Expose
    var mobileCode: String? = null

    @SerializedName("CurrencyCode")
    @Expose
    var currencyCode: String? = null

    @SerializedName("IsdCode")
    @Expose
    var isdCode: String? = null

    @SerializedName("Ranking")
    @Expose
    var ranking: Int? = null

    @SerializedName("MobileCodeArabic")
    @Expose
    var mobileCodeArabic: String? = null

    @SerializedName("culture")
    @Expose
    var culture: Int? = null

    @SerializedName("CountryFormat")
    @Expose
    var countryFormat: Int? = null

    @SerializedName("CountryCodeFormat")
    @Expose
    var countryCodeFormat: Int? = null

    @SerializedName("CountrynameFormatted")
    @Expose
    var countrynameFormatted: String? = null

    @SerializedName("CountryCodeFormatted")
    @Expose
    var countryCodeFormatted: String? = null

    @SerializedName("CountryNumber")
    @Expose
    var countryNumber: Any? = null

    @SerializedName("CountryUNCode")
    @Expose
    var countryUNCode: Any? = null
}