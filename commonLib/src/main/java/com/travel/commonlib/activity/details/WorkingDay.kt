package com.travel.commonlib.activity.details

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class WorkingDay : Serializable {
    @SerializedName("WorkingID")
    @Expose
    var workingID: String? = null

    @SerializedName("FromDate")
    @Expose
    var fromDate: String? = null

    @SerializedName("ToDate")
    @Expose
    var toDate: String? = null

    @SerializedName("CancellationPolicies")
    @Expose
    var cancellationPolicies: List<CancellationPolicy>? = null

    companion object {
        private const val serialVersionUID = 2381697634762007605L
    }
}