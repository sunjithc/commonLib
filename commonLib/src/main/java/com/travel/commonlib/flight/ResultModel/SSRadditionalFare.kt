package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class SSRadditionalFare : Serializable {
    @SerializedName("Meals")
    @Expose
    var meals: ArrayList<Meal>? = null

    @SerializedName("ResbookingCodes")
    @Expose
    var resbookingCodes: ArrayList<ResbookingCode>? = null

    @SerializedName("CabinFares")
    @Expose
    var cabinFares: ArrayList<CabinFare>? = null
}