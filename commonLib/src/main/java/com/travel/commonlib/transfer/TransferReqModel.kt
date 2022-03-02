package com.travel.commonlib.transfer

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

/**
 * Created by Rohith (Android) on 5/20/2021.
 */
class TransferReqModel : Serializable {
    @SerializedName("TransferDate")
    @Expose
    var transferDate: String? = null

    @SerializedName("RequestType")
    @Expose
    var requestType: String? = null

    @SerializedName("Time")
    @Expose
    var time: String? = null

    @SerializedName("ReturnTime")
    @Expose
    var returnTime: String? = null

    @SerializedName("AdultCount")
    @Expose
    var adultCount: Int? = null

    @SerializedName("ChildCount")
    @Expose
    var childCount: Int? = null

    @SerializedName("ReturnDate")
    @Expose
    var returnDate: String? = null

    @SerializedName("CountryName")
    @Expose
    var countryName: String? = null

    @SerializedName("PickupType")
    @Expose
    var pickupType: String? = null

    @SerializedName("PickUpPoint")
    @Expose
    var pickUpPoint: ArrayList<String>? = null

    @SerializedName("PickUpCode")
    @Expose
    var pickUpCode: String? = null

    @SerializedName("DropoffType")
    @Expose
    var dropoffType: String? = null

    @SerializedName("DropOffPoint")
    @Expose
    var dropOffPoint: ArrayList<String>? = null

    @SerializedName("DropOffCode")
    @Expose
    var dropOffCode: String? = null

    @SerializedName("NumberofPassengers")
    @Expose
    var numberofPassengers: Int? = null

    @SerializedName("DropOffStation")
    @Expose
    var dropOffStation: String? = null

    @SerializedName("DropOffLocationName")
    @Expose
    var dropOffLocationName: String? = null

    @SerializedName("PickUpStation")
    @Expose
    var pickUpStation: String? = null

    @SerializedName("PickUpLocationName")
    @Expose
    var pickUpLocationName: String? = null

    @SerializedName("searchID")
    @Expose
    var searchID: String? = null

    @SerializedName("ChildAges")
    @Expose
    var childAges: String? = null
}