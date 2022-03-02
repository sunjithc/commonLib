package com.travel.commonlib.flight.PaymentSubmitModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 9/28/2020.
 */
class Htmlelemnt : Serializable {
    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("value")
    @Expose
    var value: String? = null

    @SerializedName("element")
    @Expose
    var element: String? = null
}