package com.travel.commonlib.flight.InsuranceModel

import java.io.Serializable
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class RegionalCountry :Serializable{
    @SerializedName("MiddleEastCountries")
    @Expose
    var middleEastCountries: ArrayList<InsCountryModel>? = null

    @SerializedName("ISCCountries")
    @Expose
    var iSCCountries: ArrayList<InsCountryModel>? = null

    @SerializedName("SeaCountries")
    @Expose
    var seaCountries: ArrayList<InsCountryModel>? = null
}
