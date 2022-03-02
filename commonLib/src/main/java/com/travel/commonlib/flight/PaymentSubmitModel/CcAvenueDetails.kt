package com.travel.commonlib.flight.PaymentSubmitModel
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 9/28/2020.
 */
class CcAvenueDetails : Serializable {
    @SerializedName("FormAction")
    @Expose
    var formAction: String? = null

    @SerializedName("FormName")
    @Expose
    var formName: String? = null

    @SerializedName("htmlelemnts")
    @Expose
    var htmlelemnts: List<Htmlelemnt>? = null
}