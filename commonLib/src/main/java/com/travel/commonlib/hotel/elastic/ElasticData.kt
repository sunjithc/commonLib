package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.travel.jumbo.model.hotel.elastic.Hotelinfo
import java.io.Serializable

class ElasticData : Serializable {
    @SerializedName("CaxHotelId")
    @Expose
    var caxHotelId = 0

    @SerializedName("FK_MasterHotelCityId")
    @Expose
    var fKMasterHotelCityId = 0

    @SerializedName("HotelCodes")
    @Expose
    var hotelCodes: List<String>? = null

    @SerializedName("destination")
    @Expose
    var destination: Destination? = null

    @SerializedName("hotelinfo")
    @Expose
    var hotelinfo: Hotelinfo? = null

    @SerializedName("countrycode")
    @Expose
    var countrycode: Any? = null
}