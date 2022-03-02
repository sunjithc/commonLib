package com.travel.commonlib.activity.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CommonInfo : Serializable {
    @SerializedName("LogName")
    @Expose
    var logName: String? = null

    @SerializedName("SearchID")
    @Expose
    var searchID: String? = null

    @SerializedName("ApiId")
    @Expose
    var apiId: Int = 0

    @SerializedName("HapId")
    @Expose
    var hapId: Int = 0

    @SerializedName("FromDate")
    @Expose
    var fromDate: String? = null

    @SerializedName("ToDate")
    @Expose
    var toDate: String? = null

    @SerializedName("AdultCount")
    @Expose
    var adultCount: Int = 0

    @SerializedName("ChildCount")
    @Expose
    var childCount: Int = 0

    @SerializedName("ChildAge")
    @Expose
    var childAge: String? = null

    companion object {
        private const val serialVersionUID = 2667755639496394589L
    }
}