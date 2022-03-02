package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MeetingPoint : Serializable {
    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("GeoLocation")
    @Expose
    var geoLocation: GeoLocation? = null

    @SerializedName("Address")
    @Expose
    var address: String? = null

    @SerializedName("Country")
    @Expose
    var country: Country? = null

    @SerializedName("City")
    @Expose
    var city: String? = null

    @SerializedName("Zip")
    @Expose
    var zip: Any? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    companion object {
        private const val serialVersionUID = -2247003103076286984L
    }
}