package com.travel.commonlib.InsuranceModel

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import com.travel.commonlib.InsuranceModel.Benifit
import java.io.Serializable

class Cover:Serializable {
    @SerializedName("PlanName")
    @Expose
    var planName: String? = null

    @SerializedName("PlanCode")
    @Expose
    var planCode: Int? = null

    @SerializedName("CoverName")
    @Expose
    var coverName: String? = null

    @SerializedName("CoverCode")
    @Expose
    var coverCode: String? = null

    @SerializedName("SchemeCode")
    @Expose
    var schemeCode: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("PremiumAmount")
    @Expose
    var premiumAmount: String? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("Benifits")
    @Expose
    var benifits: ArrayList<Benifit>? = null
}
