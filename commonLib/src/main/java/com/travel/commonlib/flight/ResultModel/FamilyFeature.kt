package com.travel.commonlib.flight.ResultModel

import java.io.Serializable
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class FamilyFeature :Serializable{

    @SerializedName("serviceCode")
    @Expose
    var serviceCode: String? = null

    @SerializedName("chargable")
    @Expose
    var chargable: Boolean? = null

    @SerializedName("included")
    @Expose
    var included: Boolean? = null

    @SerializedName("serviceText")
    @Expose
    var serviceText: String? = null

    @SerializedName("ssrType")
    @Expose
    var ssrType: String? = null

    @SerializedName("fareFamilyName")
    @Expose
    var fareFamilyName: String? = null
}
