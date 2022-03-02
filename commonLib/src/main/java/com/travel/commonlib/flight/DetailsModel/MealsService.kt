package com.travel.commonlib.flight.DetailsModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MealsService : Serializable {
    @SerializedName("Name")
    @Expose
    var name: String? = null

    @SerializedName("Id")
    @Expose
    var id: String? = null
}