package com.travel.commonlib.activity.getpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Summary : Serializable {
    @SerializedName("ActivityName")
    @Expose
    var activityName: String? = null

    @SerializedName("CategoryName")
    @Expose
    var categoryName: String? = null

    @SerializedName("Location")
    @Expose
    var location: String? = null

    @SerializedName("ImageUrl")
    @Expose
    var imageUrl: String? = null

    @SerializedName("CompanyQuote")
    @Expose
    var companyQuote: List<CompanyQuote>? = null

    @SerializedName("WorkingDays")
    @Expose
    var workingDays: WorkingDays? = null

    @SerializedName("Questions")
    @Expose
    var questions: List<Question>? = null

    companion object {
        private const val serialVersionUID = 7566808330034909455L
    }
}