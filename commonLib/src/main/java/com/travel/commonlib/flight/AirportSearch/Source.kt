package com.travel.commonlib.flight.AirportSearch

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Source : Serializable {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("code")
    @Expose
    var code: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("arabicname")
    @Expose
    var arabicname: String? = null

    @SerializedName("city")
    @Expose
    var city: String? = null

    @SerializedName("arabiccity")
    @Expose
    var arabiccity: String? = null

    @SerializedName("countrycode")
    @Expose
    var countrycode: String? = null

    @SerializedName("countryname")
    @Expose
    var countryname: String? = null

    @SerializedName("arabiccountryname")
    @Expose
    var arabiccountryname: String? = null

    @SerializedName("isdomestic")
    @Expose
    var isdomestic: Boolean? = null

    @SerializedName("isallairport")
    @Expose
    var isallairport: Boolean? = null

    @SerializedName("hidden")
    @Expose
    var hidden: Boolean? = null

    @SerializedName("ranking")
    @Expose
    var ranking: Int? = null

    @SerializedName("parentid")
    @Expose
    var parentid: Int? = null

    @SerializedName("longitude")
    @Expose
    var longitude: String? = null

    @SerializedName("latitude")
    @Expose
    var latitude: String? = null

    @SerializedName("displayname")
    @Expose
    var displayname: Any? = null

    @SerializedName("displaynamear")
    @Expose
    var displaynamear: Any? = null

    companion object {
        private const val serialVersionUID = -9044255899516104847L
    }
}