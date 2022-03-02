package com.travel.commonlib.flight.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.InsuranceModel.Cover
import com.travel.jumbo.InsuranceModel.ContactInfo
import java.io.Serializable
import kotlin.collections.ArrayList

class Policy_Insurance : Serializable {
    @SerializedName("ApiId")
    @Expose
    var apiId: Int? = null

    @SerializedName("PremiumWithMarkup")
    @Expose
    var premiumWithMarkup: Double? = null

    @SerializedName("InsuranceBookingId")
    @Expose
    var InsuranceBookingId: Int? = 0

    @SerializedName("TotalPremium")
    @Expose
    var totalPremium: Double? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: String? = null

    @SerializedName("DestinationCode")
    @Expose
    var destinationCode: Int? = null

    @SerializedName("ExternalLinkId")
    @Expose
    var externalLinkId: Any? = null

    @SerializedName("InceptionDate")
    @Expose
    var inceptionDate: String? = null

    @SerializedName("CurrencyCode")
    @Expose
    var currencyCode: String? = null

    @SerializedName("GenquoteDetails")
    @Expose
    var genquoteDetails: GenquoteDetails? = null

    @SerializedName("PolicyBenefits")
    @Expose
    var policyBenefits: ArrayList<PolicyBenefit>? = null

    @SerializedName("PlanCode")
    @Expose
    var planCode: String? = null

    @SerializedName("SSRCode")
    @Expose
    var sSRCode: String? = null

    @SerializedName("SupplierCurrrency")
    @Expose
    var supplierCurrrency: String? = null

    @SerializedName("RequestCategory")
    @Expose
    var requestCategory: String? = null

    @SerializedName("InsuranceFlightData")
    @Expose
    var insuranceFlightData: ArrayList<InsuranceFlightDatum>? = null

    @SerializedName("UniqueId")
    @Expose
    var uniqueId: String? = null

    @SerializedName("OptionalBenefits")
    @Expose
    var optionalBenefits: ArrayList<String>? = null

    @SerializedName("PlanDescription")
    @Expose
    var planDescription: String? = null

    @SerializedName("CoverageAreas")
    @Expose
    var coverageAreas: Any? = null

    @SerializedName("InsGstVatAmount")
    @Expose
    var insGstVatAmount: Double? = null

    @SerializedName("GstTaxId")
    @Expose
    var gstTaxId: Int? = null
    
    @SerializedName("PlanName")
    @Expose
    var planName: String? = null
    
    @SerializedName("quoteNo")
    @Expose
    var quoteNo: Long? = null

    @SerializedName("Covers")
    @Expose
    var covers: ArrayList<Cover>? = null
    @SerializedName("InsuranceContactInfo")
    @Expose
    var contactInfo: ArrayList<ContactInfo>? = null
    @SerializedName("ValidityDays")
    @Expose
    var validityDays: Int? = null
}