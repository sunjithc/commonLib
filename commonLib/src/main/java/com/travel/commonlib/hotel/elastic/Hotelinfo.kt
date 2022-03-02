package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.jumbo.model.hotel.FacilityData
import com.travel.jumbo.model.hotel.Images
import java.io.Serializable

class Hotelinfo : Serializable {
    @SerializedName("accommodationtype")
    @Expose
    val accommodationtype: String? = null

    @SerializedName("hotelcode")
    @Expose
    val hotelcode: String? = null

    @SerializedName("hotelname")
    @Expose
    val hotelname: String? = null

    @SerializedName("hotelnamear")
    @Expose
    val hotelnamear: String? = null

    @SerializedName("giataid")
    @Expose
    val giataid: String? = null

    @SerializedName("address")
    @Expose
    val address: String? = null

    @SerializedName("addressar")
    @Expose
    val addressar: String? = null

    @SerializedName("description")
    @Expose
    val description: String? = null

    @SerializedName("descriptionarabic")
    @Expose
    val descriptionarabic: String? = null

    @SerializedName("star")
    @Expose
    val star: String? = null

    @SerializedName("zone")
    @Expose
    val zone: Any? = null

    @SerializedName("hotelchain")
    @Expose
    val hotelchain: String? = null

    @SerializedName("coordinates")
    @Expose
    val coordinates: Coordinates? = null

    @SerializedName("contactinfo")
    @Expose
    val contactinfo: Contactinfo? = null

    @SerializedName("rooms")
    @Expose
    val rooms: Any? = null

    @SerializedName("hotelfacilities")
    @Expose
    val facilityData: FacilityData? = null

    @SerializedName("hotelamenities")
    @Expose
    val hotelamenities: Hotelamenities? = null

    @SerializedName("images")
    @Expose
    val images: Images? = null

    @SerializedName("postalcode")
    @Expose
    val postalcode: Any? = null

    @SerializedName("hotelStayInfo")
    @Expose
    val hotelStayInfo: String? = null

    @SerializedName("hotelStayInfoar")
    @Expose
    val hotelStayInfoar: String? = null
}