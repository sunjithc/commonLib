package com.travel.commonlib.InsuranceModel

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName
import java.io.Serializable


class Benifit :Serializable{
    @SerializedName("CoverCode")
    @Expose
    var coverCode: String? = null

    @SerializedName("Benifits")
    @Expose
    var benifits: String? = null

    @SerializedName("SchemeCode")
    @Expose
    var schemeCode: String? = null

    @SerializedName("Description")
    @Expose
    var description: String? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("Language")
    @Expose
    var language: String? = null

    @SerializedName("BenifitsDescription")
    @Expose
    var benifitsDescription: String? = null
}
