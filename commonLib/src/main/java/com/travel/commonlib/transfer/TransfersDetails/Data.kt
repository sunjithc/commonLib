package com.travel.commonlib.transfer.TransfersDetails

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Data : Serializable {
    @SerializedName("SelectedItemDetailsDCO")
    @Expose
    var selectedItemDetailsDCO: SelectedItemDetailsDCO? = null

    @SerializedName("TransfersPassengerDetailsDCO")
    @Expose
    var transfersPassengerDetailsDCO: Any? = null

    @SerializedName("PaymentDetailsDCO")
    @Expose
    var paymentDetailsDCO: Any? = null

    @SerializedName("CompanyGenQuoteDetails")
    @Expose
    var companyGenQuoteDetails: Any? = null

    @SerializedName("Source")
    @Expose
    var source: Any? = null

    @SerializedName("Destination")
    @Expose
    var destination: Any? = null

    @SerializedName("BookedPasengerName")
    @Expose
    var bookedPasengerName: Any? = null

    @SerializedName("flag")
    @Expose
    var flag: Boolean? = null

    @SerializedName("sessionkey")
    @Expose
    var sessionkey: String? = null
}