package com.travel.commonlib.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class InsuranceCountriesModel : Serializable {

    @SerializedName("NationalityCode")
    @Expose
    var nationalityCode: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("NationalityValue")
    @Expose
    var nationalityValue: Any? = null
}
