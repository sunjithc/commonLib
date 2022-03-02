package com.travel.commonlib.transfer.transferPaxModels

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.travel.jumbo.Transfers.model.TransfersDetails.Pickupdetails
import com.travel.jumbo.Transfers.model.TransfersDetails.Pricedetails
import com.travel.jumbo.Transfers.model.TransferResult.AllJourney
import com.travel.jumbo.Transfers.model.transferPaxModels.TransferItemDetails.TransferReqInfo
import java.io.Serializable
import java.util.ArrayList

class TransferItemDetails : Serializable {
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
    var allJourney: List<AllJourney>? = null

    @SerializedName("TripId")
    @Expose
    var tripId: Int? = null

    @SerializedName("IsFareUpdate")
    @Expose
    var fareUpdate: Boolean? = null

    @SerializedName("SessionKey")
    @Expose
    var sessionKey: String? = null
    var cart_id = 0

    // for cart usage
    var remainingTimeInMinutes = 0

    // for cart usage
    var timer: String? = null
    var transferReqInfo: TransferReqInfo? = null
    fun getaPIId(): Int? {
        return aPIId
    }

    fun setaPIId(aPIId: Int?) {
        this.aPIId = aPIId
    }

    fun getIsFareUpdate(): Boolean? {
        return fareUpdate
    }

    fun setIsFareUpdate(isFareUpdate: Boolean?) {
        fareUpdate = isFareUpdate
    }

    class TransferReqInfo : Serializable {
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
        private var pickUpPoint: ArrayList<String>? = null

        @SerializedName("PickUpCode")
        @Expose
        var pickUpCode: String? = null

        @SerializedName("DropoffType")
        @Expose
        var dropoffType: String? = null

        @SerializedName("DropOffPoint")
        @Expose
        private var dropOffPoint: ArrayList<String>? = null

        @SerializedName("DropOffCode")
        @Expose
        var dropOffCode: String? = null

        @SerializedName("NumberofPassengers")
        @Expose
        var numberofPassengers: Int? = null

        @SerializedName("searchID")
        @Expose
        var searchID: String? = null

        @SerializedName("ChildAges")
        @Expose
        var childAges: String? = null

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
        fun getPickUpPoint(): List<String>? {
            return pickUpPoint
        }

        fun setPickUpPoint(pickUpPoint: ArrayList<String>?) {
            this.pickUpPoint = pickUpPoint
        }

        fun getDropOffPoint(): List<String>? {
            return dropOffPoint
        }

        fun setDropOffPoint(dropOffPoint: ArrayList<String>?) {
            this.dropOffPoint = dropOffPoint
        }
    }
}