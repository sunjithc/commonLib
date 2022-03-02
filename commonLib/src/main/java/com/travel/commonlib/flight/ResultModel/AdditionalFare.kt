package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList

class AdditionalFare : Serializable {
    @SerializedName("AdditionalFareId")
    @Expose
    var additionalFareId = 0

    @SerializedName("CompanyGenQuoteDetails")
    @Expose
    var companyGenQuoteDetails: ArrayList<CompanyGenQuoteDetail>? = null

    @SerializedName("ActualGenQuoteDetails")
    @Expose
    var actualGenQuoteDetails: ArrayList<ActualGenQuoteDetail>? = null

    @SerializedName("SegmentDetails")
    @Expose
    var segmentDetails: ArrayList<SegmentDetail>? = null

    @SerializedName("SSRadditionalFare")
    @Expose
    var sSRadditionalFare: SSRadditionalFare? = null

    @SerializedName("FinalTotalFare")
    @Expose
    var finalTotalFare: Double? = 0.0

    @SerializedName("FareTypeName")
    @Expose
    var fareTypeName: String? = ""

    @SerializedName("RefundInfo")
    @Expose
    var refundInfo: RefundInfo? = null

    @SerializedName("FareTypeNameReturn")
    @Expose
    var fareTypeNameReturn: String? = null

    @SerializedName("BrandName")
    @Expose
    var brandName: String? = null

    @SerializedName("BrandNameReturn")
    @Expose
    var brandNameReturn: String? = null

    @SerializedName("IsRefundable")
    @Expose
    var isRefundable: Boolean? = null

    @SerializedName("RefundType")
    @Expose
    var refundType: Int? = null

    @SerializedName("BrandedFeatures")
    @Expose
    var brandedFeatures: List<String>? = null

    @SerializedName("JourneyList")
    @Expose
    var journeyList: Any? = null

    @SerializedName("BrandTier")
    @Expose
    var brandTier: Any? = null

    @SerializedName("FamilyFeatures")
    @Expose
    var familyFeatures: ArrayList<FamilyFeature>? = null

    @SerializedName("FamilyFeaturesReturn")
    @Expose
    var familyFeaturesReturn: ArrayList<FamilyFeature>? = null
}