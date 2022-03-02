package com.travel.commonlib.activity.getpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class WorkingDays : Serializable {
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
    var cancellationPolicies: ArrayList<CancellationPolicy>? = null

    companion object {
        private const val serialVersionUID = 8128364374920849534L
    }
}