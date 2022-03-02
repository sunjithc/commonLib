package com.travel.commonlib.flight.PaxSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class MealInfos : Serializable {
    @SerializedName("OnwardMealItm")
    @Expose
    var onwardMealItm: ArrayList<MealItm>? = null

    @SerializedName("ReturnMealItem")
    @Expose
    var returnMealItem: ArrayList<MealItm>? = null
}