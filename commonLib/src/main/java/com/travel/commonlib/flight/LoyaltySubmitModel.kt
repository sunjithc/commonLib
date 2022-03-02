package com.travel.commonlib.flight

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by Rohith (Android) on 5/10/2021.
 */
class LoyaltySubmitModel : Serializable {
    @SerializedName("Culture")
    @Expose
    var culture: String? = null

    @SerializedName("UserId")
    @Expose
    var userId = 0

    @SerializedName("Points")
    @Expose
    var points = 0.0

    @SerializedName("TransactionType")
    @Expose
    var transactionType = 0
}