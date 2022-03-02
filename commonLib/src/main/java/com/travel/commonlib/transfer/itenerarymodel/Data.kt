package com.travel.commonlib.transfer.itenerarymodel

import android.os.Parcel
import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.travel.jumbo.Transfers.model.TransfersDetails.SelectedItemDetailsDCO
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
    fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeValue(selectedItemDetailsDCO)
        dest.writeValue(transfersPassengerDetailsDCO)
        dest.writeValue(paymentDetailsDCO)
        dest.writeValue(companyGenQuoteDetails)
        dest.writeValue(source)
        dest.writeValue(destination)
        dest.writeValue(bookedPasengerName)
        dest.writeValue(flag)
        dest.writeValue(sessionkey)
    }

    fun describeContents(): Int {
        return 0
    }
}