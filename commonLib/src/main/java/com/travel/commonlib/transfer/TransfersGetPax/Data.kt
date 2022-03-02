package com.travel.commonlib.transfer.TransfersGetPax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.jumbo.Transfers.model.TransfersDetails.Pickupdetails
import java.io.Serializable
import java.util.*

class Data : Serializable {
    @SerializedName("pickupdetails")
    @Expose
    var pickupdetails: Pickupdetails? = null

    @SerializedName("dropoffdetails")
    @Expose
    var dropoffdetails: Dropoffdetails? = null

    @SerializedName("address")
    @Expose
    var address: Address? = null

    @SerializedName("contact")
    @Expose
    var contact: contact? = null

    @SerializedName("Isclicked")
    @Expose
    var isclicked: Boolean? = null

    @SerializedName("PassengerList")
    @Expose
    var passengerList: ArrayList<PassengerModel>? = null

    @SerializedName("TravelNum")
    @Expose
    var travelNum: String? = null

    @SerializedName("TravelNum1")
    @Expose
    var travelNum1: String? = null

    @SerializedName("TravelTime")
    @Expose
    var travelTime: String? = null

    @SerializedName("TravelTime1")
    @Expose
    var travelTime1: String? = null

    @SerializedName("TravelCompanyName")
    @Expose
    var travelCompanyName: String? = null

    @SerializedName("TravelCompanyName1")
    @Expose
    var travelCompanyName1: String? = null

    @SerializedName("PickupDateTime")
    @Expose
    var pickupDateTime: String? = null

    @SerializedName("ReturnDateTime")
    @Expose
    var returnDateTime: String? = null

    @SerializedName("HotelAddress")
    @Expose
    var hotelAddress: String? = null

    @SerializedName("SelectedItemDetails")
    @Expose
    var selectedItemDetails: SelectedItemDetails? = null

    @SerializedName("sessionkey")
    @Expose
    var sessionkey: String? = null

    @SerializedName("travellers")
    @Expose
    var travellers: ArrayList<Traveller>? = null

    @SerializedName("MobileCountryCodes")
    @Expose
    var mobileCountryCodes: ArrayList<MobileCountryCode>? = null

    @SerializedName("ohsFrom")
    @Expose
    var ohsFrom: ArrayList<Any>? = null

    @SerializedName("ohsto")
    @Expose
    var ohsto: ArrayList<Any>? = null

    @SerializedName("ohsupplement")
    @Expose
    var ohsupplement: ArrayList<Any>? = null

    @SerializedName("Isloggined")
    @Expose
    var isloggined: Boolean? = null

    @SerializedName("SearchID")
    @Expose
    var searchID: Any? = null

    @SerializedName("Currency")
    @Expose
    var currency: Any? = null

    @SerializedName("Culture")
    @Expose
    var culture: Any? = null

    @SerializedName("IsMobileApp")
    @Expose
    var mobileApp: Boolean? = null

    @SerializedName("SourceInfo")
    @Expose
    var sourceInfo: Any? = null
}