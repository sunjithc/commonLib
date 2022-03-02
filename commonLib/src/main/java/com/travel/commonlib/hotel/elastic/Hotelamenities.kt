package com.travel.commonlib.hotel.elastic

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.travel.jumbo.model.hotel.Category
import java.io.Serializable

class Hotelamenities : Serializable {

    @SerializedName("Category")
    @Expose
    private val category: List<Category>? = null

    @SerializedName("Categoryar")
    @Expose
    private val categoryar: List<Category>? = null
}