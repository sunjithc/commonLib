package com.travel.jumbo.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class InsuranceRelationsModel : Serializable {

    @SerializedName("Family")
    @Expose
    var family: ArrayList<RelationModel>? = null

    @SerializedName("Individual")
    @Expose
    var individual: ArrayList<RelationModel>? = null
}
