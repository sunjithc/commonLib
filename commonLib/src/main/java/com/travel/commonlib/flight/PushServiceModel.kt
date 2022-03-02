package com.travel.commonlib.flight

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 5/10/2021.
 */
class PushServiceModel : Serializable {
    @SerializedName("UniqueIdentifier")
    @Expose
    var uniqueIdentifier: String? = null

    @SerializedName("ServiceName")
    @Expose
    var serviceName: String? = null

    @SerializedName("Trigger")
    @Expose
    var trigger: String? = null

    @SerializedName("property")
    @Expose
    var property: String? = null

    @SerializedName("Data")
    @Expose
    var data: PushData? = null

    @SerializedName("DeviceId")
    @Expose
    var deviceId: String? = null

    @SerializedName("registrationToken")
    @Expose
    var registrationToken: String? = null

    @SerializedName("DeviceType")
    @Expose
    var deviceType = 0

    @SerializedName("Source")
    @Expose
    var source: String? = null

    @SerializedName("Destination")
    @Expose
    var destination: String? = null

    @SerializedName("CurrentLocation")
    @Expose
    var currentLocation: String? = null

    @SerializedName("TravelDate")
    @Expose
    var travelDate: String? = null

    @SerializedName("UserId")
    @Expose
    var userId: String? = null
}