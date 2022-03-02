package com.travel.commonlib.InsuranceModel

import java.io.Serializable
import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class RelationModel:Serializable {
    @SerializedName("RelationCode")
    @Expose
    var relationCode: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null
}
