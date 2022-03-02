package com.travel.commonlib.flight

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

/**
 * Created by Rohith (Android) on 7/1/2021.
 */
class WatsAppResponse : Serializable {
    @SerializedName("status")
    @Expose
    var status: Boolean? = null

    @SerializedName("WhatsappCharge")
    @Expose
    var whatsappCharge: Double? = null

    @SerializedName("Ispercentage")
    @Expose
    var ispercentage: Boolean? = null

    @SerializedName("IsWhatsappenabled")
    @Expose
    var whatsappenabled: Boolean? = null

    @SerializedName("errorInfo")
    @Expose
    var errorInfo: String? = null

    @SerializedName("BaseCurrency")
    @Expose
    var baseCurrency: String? = null
}