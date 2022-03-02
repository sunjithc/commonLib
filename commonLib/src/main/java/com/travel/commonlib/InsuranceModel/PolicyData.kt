package com.travel.commonlib.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class PolicyData : Serializable {

    @SerializedName("quoteNo")
    @Expose
    var quoteNo: Long? = null;

    @SerializedName("SchemeCode")
    @Expose
    var schemeCode: String? = null

    @SerializedName("SSRCode")
    @Expose
    var sSRCode: String? = null

    @SerializedName("OptionalCode")
    @Expose
    var optionalCode: String? = null
}
