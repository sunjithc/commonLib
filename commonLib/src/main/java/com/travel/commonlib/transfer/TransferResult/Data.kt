package com.travel.commonlib.transfer.TransferResult

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Data : Serializable {
    @SerializedName("SessionKey")
    @Expose
    var sessionKey: String? = null

    @SerializedName("DecimalPoints")
    @Expose
    var decimalPoints: Int? = null

    @SerializedName("supplierCurrency")
    @Expose
    var supplierCurrency: Any? = null

    @SerializedName("currency")
    @Expose
    var currency: Any? = null

    @SerializedName("resultsCount")
    @Expose
    var resultsCount: String? = null

    @SerializedName("minimumPrice")
    @Expose
    var minimumPrice: Double? = null

    @SerializedName("maximumPrice")
    @Expose
    var maximumPrice: Double? = null

    @SerializedName("Transferdate")
    @Expose
    var transferdate: String? = null

    @SerializedName("ReturnDate")
    @Expose
    var returnDate: String? = null

    @SerializedName("Time")
    @Expose
    var time: String? = null

    @SerializedName("ReturnTime")
    @Expose
    var returnTime: String? = null

    @SerializedName("numberofpassengers")
    @Expose
    var numberofpassengers: Int? = null

    @SerializedName("IsRoundTrip")
    @Expose
    var isRoundTrip: Boolean? = null

    @SerializedName("TransfersResults")
    @Expose
    var transfersResults: ArrayList<TransfersResult?>? = null

    @SerializedName("Vehicles")
    @Expose
    var vehicles: ArrayList<String>? = null

    @SerializedName("resultsCountForDisplay")
    @Expose
    var resultsCountForDisplay: String? = null

    @SerializedName("searchID")
    @Expose
    var searchID: String? = null

    @SerializedName("pickuplocation")
    @Expose
    var pickuplocation: String? = null

    @SerializedName("DropOffLocation")
    @Expose
    var dropOffLocation: String? = null

    @SerializedName("PickUpType")
    @Expose
    var pickUpType: Any? = null

    @SerializedName("DropOffType")
    @Expose
    var dropOffType: Any? = null

    @SerializedName("SearchId")
    @Expose
    var searchId: Any? = null
}