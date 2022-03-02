package com.travel.commonlib.activity.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MeetingPoint : Serializable {
    @SerializedName("Type")
    @Expose
    var type: Any? = null

    @SerializedName("GeoLocation")
    @Expose
    var geoLocation: Any? = null

    @SerializedName("Address")
    @Expose
    var address: Any? = null

    @SerializedName("Country")
    @Expose
    var country: Any? = null

    @SerializedName("City")
    @Expose
    var city: Any? = null

    @SerializedName("Zip")
    @Expose
    var zip: Any? = null

    @SerializedName("Description")
    @Expose
    var description: Any? = null

    companion object {
        private const val serialVersionUID = -8411356120932819969L
    }
}