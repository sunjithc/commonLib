package com.travel.commonlib.transfer.TransfersDetails

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.travel.jumbo.Transfers.model.TransferResult.AllJourney
import java.io.Serializable
import java.util.ArrayList

class SelectedItemDetailsDCO : Serializable {
    @SerializedName("APIId")
    @Expose
    var aPIId: Int? = null

    @SerializedName("passengercount")
    @Expose
    var passengercount: Int? = null

    @SerializedName("PickupType")
    @Expose
    var pickupType: String? = null

    @SerializedName("DropoffType")
    @Expose
    var dropoffType: String? = null

    @SerializedName("PickUpPointName")
    @Expose
    var pickUpPointName: String? = null

    @SerializedName("DropOffPointName")
    @Expose
    var dropOffPointName: String? = null

    @SerializedName("DropOffPointCode")
    @Expose
    var dropOffPointCode: String? = null

    @SerializedName("PickUpPointCode")
    @Expose
    var pickUpPointCode: String? = null

    @SerializedName("TransferDate")
    @Expose
    var transferDate: String? = null

    @SerializedName("ReturnDate")
    @Expose
    var returnDate: String? = null

    @SerializedName("TransferLanguage")
    @Expose
    var transferLanguage: Any? = null

    @SerializedName("DriverLanguage")
    @Expose
    var driverLanguage: Any? = null

    @SerializedName("TransferCity")
    @Expose
    var transferCity: Any? = null

    @SerializedName("AdultCount")
    @Expose
    var adultCount: Int? = null

    @SerializedName("ChildCount")
    @Expose
    var childCount: Int? = null

    @SerializedName("childAges")
    @Expose
    var childAges: Any? = null

    @SerializedName("pickupdetails")
    @Expose
    var pickupdetails: Pickupdetails? = null

    @SerializedName("dropoffdetails")
    @Expose
    var dropoffdetails: Any? = null

    @SerializedName("PickupHotelInfo")
    @Expose
    var pickupHotelInfo: Any? = null

    @SerializedName("DropOffHotelInfo")
    @Expose
    var dropOffHotelInfo: Any? = null

    @SerializedName("Pricedetails")
    @Expose
    var pricedetails: Pricedetails? = null

    @SerializedName("AllJourney")
    @Expose
    var allJourney: ArrayList<AllJourney>? = null

    @SerializedName("TripId")
    @Expose
    var tripId: Int? = null

    @SerializedName("IsFareUpdate")
    @Expose
    var isFareUpdate: Boolean? = null

    @SerializedName("SessionKey")
    @Expose
    var sessionKey: String? = null

    @SerializedName("SelectedPaymentgatewayID")
    @Expose
    var selectedPaymentgatewayID: Int? = null

}