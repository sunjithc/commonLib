package com.travel.commonlib.flight.PaxSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class HandToHandDetails : Serializable {
    @SerializedName("chargeid")
    @Expose
    var chargeid: Int? = null

    @SerializedName("charge")
    @Expose
    var charge: Int? = null

    @SerializedName("updatedDate")
    @Expose
    var updatedDate: String? = null

    @SerializedName("active")
    @Expose
    var active: Boolean? = null

    @SerializedName("Address1")
    @Expose
    var address1: Any? = null

    @SerializedName("Address2")
    @Expose
    var address2: Any? = null

    companion object {
        private const val serialVersionUID = -969861151633625640L
    }
}