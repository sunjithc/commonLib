package com.travel.commonlib.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class InsuranceTypesModel : Serializable {

    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("Value")
    @Expose
    var value: String? = null
}
