package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class RequestInfo : Serializable {
    @SerializedName("SearchType")
    @Expose
    var searchType: String? = null

    @SerializedName("TransactionTypeId")
    @Expose
    var transactionTypeId: Int? = null

    @SerializedName("IataBranchId")
    @Expose
    var iataBranchId: Int? = null

    @SerializedName("AgencyId")
    @Expose
    var agencyId: Int? = null

    @SerializedName("UserId")
    @Expose
    var userId: Int? = null

    @SerializedName("UserName")
    @Expose
    var userName: String? = null

    @SerializedName("UniqueId")
    @Expose
    var uniqueId: String? = null

    @SerializedName("AdultCount")
    @Expose
    var adultCount: Int? = null

    @SerializedName("ChildCount")
    @Expose
    var childCount: Int? = null

    @SerializedName("InfantInLapCount")
    @Expose
    var infantInLapCount: Int? = null

    @SerializedName("IsDomestic")
    @Expose
    var domestic: Boolean? = null

    @SerializedName("IsMetaSearch")
    @Expose
    var metaSearch: Boolean? = null

    @SerializedName("MetaType")
    @Expose
    var metaType: Int? = null

    @SerializedName("AirSegmentInfos")
    @Expose
    var airSegmentInfos: ArrayList<AirSegmentInfo>? = null

    @SerializedName("DisplayCurrency")
    @Expose
    var displayCurrency: String? = null

    @SerializedName("ConversionRate")
    @Expose
    var conversionRate: Int? = null

    @SerializedName("ItineraryNameForLogging")
    @Expose
    var itineraryNameForLogging: String? = null

    @SerializedName("BranchEmail")
    @Expose
    var branchEmail: String? = null

    @SerializedName("UserIpAddress")
    @Expose
    var userIpAddress: String? = null

    @SerializedName("UserBrowserAgent")
    @Expose
    var userBrowserAgent: String? = null

    @SerializedName("CurrentCulture")
    @Expose
    var currentCulture: String? = null

    @SerializedName("EnableWegoCouponCode")
    @Expose
    var enableWegoCouponCode: Boolean? = null

    @SerializedName("utmparams")
    @Expose
    var utmparams: Any? = null

    @SerializedName("Itenary")
    @Expose
    var itenary: Any? = null

    @SerializedName("DeviceCategory")
    @Expose
    var deviceCategory: String? = null

    @SerializedName("loyaltyType")
    @Expose
    var loyaltyType: Int? = null

    @SerializedName("IsMobileApp")
    @Expose
    var mobileApp: Boolean? = null

    @SerializedName("SourceInfo")
    @Expose
    var sourceInfo: String? = null
}