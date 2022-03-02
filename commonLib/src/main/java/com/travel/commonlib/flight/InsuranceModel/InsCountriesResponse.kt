package com.travel.commonlib.flight.InsuranceModel

import java.io.Serializable
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
/**
 * Created by Rohith (Android) on 11/11/2021.
 */
class InsCountriesResponse:Serializable {
    @SerializedName("RegionalCountries")
    @Expose
    var regionalCountries: ArrayList<RegionalCountry>? = null

    @SerializedName("EuropianCountries")
    @Expose
    var europianCountries: ArrayList<InsCountryModel>? = null
}