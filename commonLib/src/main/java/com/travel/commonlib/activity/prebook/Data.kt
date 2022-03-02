package com.travel.commonlib.activity.prebook

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Data : Serializable {
    @SerializedName("IsBooked")
    @Expose
    var isIsBooked = false
        private set

    @SerializedName("ClientReference")
    @Expose
    var clientReference: String? = null

    @SerializedName("BookingRefrence")
    @Expose
    var bookingRefrence: String? = null

    @SerializedName("IsPreBookingAttempted")
    @Expose
    var isIsPreBookingAttempted = false
        private set

    @SerializedName("Supplier")
    @Expose
    var supplier: Supplier? = null

    @SerializedName("ExtVoucher")
    @Expose
    var extVoucher: ExtVoucher? = null

    @SerializedName("Tinfo")
    @Expose
    var tinfo: Tinfo? = null

    @SerializedName("Error")
    @Expose
    var error: Any? = null

    @SerializedName("Culture")
    @Expose
    var culture: Any? = null

    @SerializedName("ModeCode")
    @Expose
    var modeCode: String? = null

    @SerializedName("IsMilespointAvailable")
    @Expose
    var isIsMilespointAvailable = false
        private set

    fun setIsBooked(isBooked: Boolean) {
        isIsBooked = isBooked
    }

    fun setIsPreBookingAttempted(isPreBookingAttempted: Boolean) {
        isIsPreBookingAttempted = isPreBookingAttempted
    }

    fun setIsMilespointAvailable(isMilespointAvailable: Boolean) {
        isIsMilespointAvailable = isMilespointAvailable
    }

    companion object {
        private const val serialVersionUID = 876733671656532312L
    }
}