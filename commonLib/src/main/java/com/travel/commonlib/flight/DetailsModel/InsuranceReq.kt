package com.travel.commonlib.flight.DetailsModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.InsuranceModel.ContactInfo
import com.travel.jumbo.InsuranceModel.PassengerInfo_Insurance
import com.travel.jumbo.InsuranceModel.PolicyData
import com.travel.commonlib.flight.ResultModel.FlightJourney
import java.io.Serializable
import java.util.ArrayList

class InsuranceReq :Serializable{

    @SerializedName("PassengerInfos")
    @Expose
    var passengerInfos: ArrayList<PassengerInfo_Insurance>? = null

    @SerializedName("FlightJourneys")
    @Expose
    var flightJourneys: ArrayList<FlightJourney>? = null

    @SerializedName("travelStartDate")
    @Expose
    var travelStartDate: String? = null

    @SerializedName("travelEndDate")
    @Expose
    var travelEndDate: String? = null

    @SerializedName("EndPoint")
    @Expose
    var endPoint: String? = null

    @SerializedName("AdultCount")
    @Expose
    var adultCount: Int? = null

    @SerializedName("ValidityDays")
    @Expose
    var validityDays: String? = null

    @SerializedName("ChildCount")
    @Expose
    var childCount: Int? = null

    @SerializedName("InfantCount")
    @Expose
    var infantCount: Int? = null

    @SerializedName("RequestType")
    @Expose
    var requestType: String? = null

    @SerializedName("IsMultiPlan")
    @Expose
    var isMultiPlan: Boolean? = null

    @SerializedName("PolicyData")
    @Expose
    var policyData: PolicyData? = null

    @SerializedName("ContactInfo")
    @Expose
    var contactInfo: ArrayList<ContactInfo>? = null

    @SerializedName("InsuranceType")
    @Expose
    var insuranceType: String? = null

    @SerializedName("IsPremium")
    @Expose
    var isPremium: Boolean? = null

    @SerializedName("StartPoint")
    @Expose
    var startPoint: String? = null

    @SerializedName("DropOffType")
    @Expose
    var dropOffType: String? = null
}
