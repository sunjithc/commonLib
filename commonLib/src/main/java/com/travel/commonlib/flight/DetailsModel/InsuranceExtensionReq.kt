package com.travel.commonlib.flight.DetailsModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class InsuranceExtensionReq : Serializable {

    @SerializedName("travelStartDate")
    @Expose
    var travelStartDate: String? = null

    @SerializedName("travelEndDate")
    @Expose
    var travelEndDate: String? = null

    @SerializedName("RequestType")
    @Expose
    var requestType: String? = null
}
