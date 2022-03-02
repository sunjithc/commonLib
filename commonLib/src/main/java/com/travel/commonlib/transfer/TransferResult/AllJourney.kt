package com.travel.commonlib.transfer.TransferResult

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.jumbo.Transfers.model.TransfersDetails.CancellationPolicy
import com.travel.jumbo.Transfers.model.TransfersDetails.CheckPickup
import com.travel.jumbo.Transfers.model.itenerarymodel.CancellationPolicyList
import java.io.Serializable
import java.util.*

class AllJourney : Serializable {
    @SerializedName("outofhourssupplementdetails")
    @Expose
    var outofhourssupplementdetails: ArrayList<Any>? = null

    @SerializedName("itemcode")
    @Expose
    var itemcode: String? = null

    @SerializedName("approximatetransfertime")
    @Expose
    var approximatetransfertime: String? = null

    @SerializedName("TransferConditions")
    @Expose
    var transferConditions: String? = null

    @SerializedName("ImportantTcondition")
    @Expose
    var importantTcondition: String? = null

    @SerializedName("CancellationPolicyList")
    @Expose
    var cancellationPolicyList: List<CancellationPolicy>? = null

    @SerializedName("vehiclename")
    @Expose
    var vehiclename: String? = null

    @SerializedName("DriverLanguage")
    @Expose
    var driverLanguage: Any? = null

    @SerializedName("vehiclecode")
    @Expose
    var vehiclecode: String? = null

    @SerializedName("maxpassengers")
    @Expose
    var maxpassengers: Int? = null

    @SerializedName("MaximumLuggage")
    @Expose
    var maximumLuggage: String? = null

    @SerializedName("itempricecurrency")
    @Expose
    var itempricecurrency: String? = null

    @SerializedName("itemprice")
    @Expose
    var itemprice: Double? = null

    @SerializedName("confirmationcode")
    @Expose
    var confirmationcode: Any? = null

    @SerializedName("MeetingPoint")
    @Expose
    var meetingPoint: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("Services")
    @Expose
    var services: Services? = null

    @SerializedName("MaximumWTInternational")
    @Expose
    var maximumWTInternational: String? = null

    @SerializedName("MaximumWTDomestic")
    @Expose
    var maximumWTDomestic: String? = null

    @SerializedName("numberofvehiclesrequired")
    @Expose
    var numberofvehiclesrequired: Int? = null

    @SerializedName("CancelPolicy")
    @Expose
    var cancelPolicy: Any? = null

    @SerializedName("OHS")
    @Expose
    var ohs: Any? = null

    @SerializedName("PickUpLocation")
    @Expose
    var pickUpLocation: String? = null

    @SerializedName("DropOffLocation")
    @Expose
    var dropOffLocation: String? = null

    @SerializedName("PickUpAddress")
    @Expose
    var pickUpAddress: Any? = null

    @SerializedName("DropOffAddress")
    @Expose
    var dropOffAddress: Any? = null

    @SerializedName("PickUpDate")
    @Expose
    var pickUpDate: String? = null

    @SerializedName("PickUpTime")
    @Expose
    var pickUpTime: String? = null

    @SerializedName("DriverArrivingTime")
    @Expose
    var driverArrivingTime: Any? = null

    @SerializedName("WaitingTime")
    @Expose
    var waitingTime: String? = null

    @SerializedName("CheckPickup")
    @Expose
    var checkPickup: Any? = null

    @SerializedName("PickUpType")
    @Expose
    var pickUpType: Any? = null

    @SerializedName("DropOffType")
    @Expose
    var dropOffType: Any? = null

    @SerializedName("FareInfo")
    @Expose
    var fareInfo: FareInfo? = null

    @SerializedName("TripId")
    @Expose
    var tripId: Int? = null

    @SerializedName("ApiId")
    @Expose
    var apiId: Int? = null

    @SerializedName("PickUpHotelInfo")
    @Expose
    var pickUpHotelInfo: Any? = null

    @SerializedName("DropOffpHotelInfo")
    @Expose
    var dropOffpHotelInfo: Any? = null

}