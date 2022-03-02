package com.travel.commonlib.transfer.TransfersGetPax

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

/**
 * Created by Rohith (Android) on 5/21/2021.
 */
class Address : Serializable {
    @SerializedName("PickupAddress")
    @Expose
    var pickupAddress: String? = null

    @SerializedName("DropoffAddress")
    @Expose
    var dropoffAddress: String? = null

    @SerializedName("CityName")
    @Expose
    var cityName: String? = null

    @SerializedName("CityCode")
    @Expose
    var cityCode: String? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: String? = null

    @SerializedName("SourcePostalCode")
    @Expose
    var sourcePostalCode: String? = null

    @SerializedName("DestinationPostalCode")
    @Expose
    var destinationPostalCode: String? = null

    @SerializedName("Country")
    @Expose
    var country: String? = null

    @SerializedName("Zipcode")
    @Expose
    var zipcode: String? = null

    @SerializedName("State")
    @Expose
    var state: String? = null
}