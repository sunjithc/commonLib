package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.PaxSubmitModel.MealInfos
import com.travel.commonlib.flight.SeatModel.FlightSeatInfoSelected
import java.io.Serializable
import java.util.*


class PassengerInfo : Serializable {
    @SerializedName("UserName")
    @Expose
    var userName: String? = null

    @SerializedName("PassengerId")
    @Expose
    var passengerId: Int? = null

    @SerializedName("Title")
    @Expose
    var title: String? = null

    @SerializedName("FirstName")
    @Expose
    var firstName: String? = null

    @SerializedName("MiddleName")
    @Expose
    var middleName: String? = null

    @SerializedName("LastName")
    @Expose
    var lastName: String? = null

    @SerializedName("PassengerType")
    @Expose
    var passengerType: String? = null

    @SerializedName("Gender")
    @Expose
    var gender: String? = null

    @SerializedName("Email")
    @Expose
    var email: String? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: String? = null

    @SerializedName("CoutryOfResidence")
    @Expose
    var coutryOfResidence: String? = null

    @SerializedName("CountryName")
    @Expose
    var countryName: String? = null

    @SerializedName("MobileCode")
    @Expose
    var mobileCode: String? = null

    @SerializedName("MobileNumber")
    @Expose
    var mobileNumber: String? = null

    @SerializedName("DateOfBirth")
    @Expose
    var dateOfBirth: String? = null

    @SerializedName("IsPassportRequired")
    @Expose
    var passportRequired: Boolean? = null

    @SerializedName("PassportNumber")
    @Expose
    var passportNumber: String? = null

    @SerializedName("PassportIssuePlace")
    @Expose
    var passportIssuePlace: String? = null

    @SerializedName("PassportExpiryDate")
    @Expose
    var passportExpiryDate: String? = null

    @SerializedName("FrequentFlyerNo")
    @Expose
    var frequentFlyerNo: String? = null

    @SerializedName("IsCivilId")
    @Expose
    var civilId: Boolean? = null

    @SerializedName("IsLeadPassenger")
    @Expose
    var leadPassenger: Boolean? = null

    @SerializedName("PaxTotalNameLength")
    @Expose
    var paxTotalNameLength = 0

    @SerializedName("MyProperty")
    @Expose
    var myProperty: Int? = null

    @SerializedName("PreferenceInfos")
    @Expose
    var preferenceInfos: ArrayList<PreferenceInfo>? = null

    @SerializedName("BoardingInfos")
    @Expose
    var boardingInfos: ArrayList<BoardingInfos>? = null

    @SerializedName("FrequentFlyerInfos")
    @Expose
    var frequentFlyerInfos: ArrayList<FrequentFlyerInfo>? = null

    @SerializedName("addtraveller")
    @Expose
    var addtraveller: Boolean? = null

    @SerializedName("TravellerId")
    @Expose
    var travellerId: Int? = null

    @SerializedName("Citizenship")
    @Expose
    var citizenship: String? = null

    @SerializedName("ProfileImg")
    @Expose
    var profileImg: String? = null

    @SerializedName("Visa")
    @Expose
    var visa: Any? = null

    @SerializedName("MealInfo")
    @Expose
    var mealInfo: String? = null

    @SerializedName("SpecialRequests")
    @Expose
    var specialRequests: String? = null

    @SerializedName("FileName")
    @Expose
    var fileName: String? = null

    @SerializedName("SecondaryMobileCode")
    @Expose
    var secondaryMobileCode: String? = null

    @SerializedName("SecondaryMobileNumber")
    @Expose
    var secondaryMobileNumber: String? = null

    @SerializedName("MembershipReffNo")
    @Expose
    var membershipReffNo: String? = null

    @SerializedName("AgencyReffNo")
    @Expose
    var agencyReffNo: String? = null

    @SerializedName("SelectedSeat")
    @Expose
    var selectedSeat: ArrayList<FlightSeatInfoSelected>? = null

    @SerializedName("SelectedMeals")
    @Expose
    var selectedMeals: String? = null

    @SerializedName("SeatInfo")
    @Expose
    var seatInfo: Any? = null

    @SerializedName("MealInfos")
    @Expose
    var mealInfos: MealInfos? = null

    @SerializedName("SpecialServiceInfo")
    @Expose
    var specialServiceInfo: Any? = null

    @SerializedName("RepublicIdNumber")
    @Expose
    var republicIdNumber: Any? = null

    @SerializedName("DestinationAddress")
    @Expose
    var destinationAddress: Any? = null

    @SerializedName("HesCode")
    @Expose
    var hesCode: Any? = null

    @SerializedName("VerificationIDTypes")
    @Expose
    var verificationIDTypes: ArrayList<String>? = null

    @SerializedName("VerificationID")
    @Expose
    var verificationID: String? = null

    @SerializedName("VerificationIDType")
    @Expose
    var verificationIDType: String? = null

    @SerializedName("IsDomestic")
    @Expose
    var domestic: Boolean? = null

    @SerializedName("IsGstInfoGiven")
    @Expose
    var gstInfoGiven: Boolean? = null

    @SerializedName("GSTNumber")
    @Expose
    var gSTNumber: String? = null

    @SerializedName("GSTEmail")
    @Expose
    var gSTEmail: String? = null

    @SerializedName("GSTAddress")
    @Expose
    var gSTAddress: String? = null

    @SerializedName("GSTPhone")
    @Expose
    var gSTPhone: String? = null

    @SerializedName("GSTCity")
    @Expose
    var gSTCity: String? = null

    @SerializedName("GSTState")
    @Expose
    var gSTState: String? = null

    @SerializedName("GSTPincode")
    @Expose
    var gSTPincode: String? = null

    @SerializedName("GSTCompany")
    @Expose
    var gSTCompany: String? = null

    @SerializedName("CityName")
    @Expose
    var cityName: String? = null

    @SerializedName("Address")
    @Expose
    var address: String? = null

    @SerializedName("IsPostCodeMandatory")
    @Expose
    var isPostCodeMandatory: Boolean? = null

    @SerializedName("PostCode")
    @Expose
    var postCode: Any? = null

    @SerializedName("AgencyLogo")
    @Expose
    var agencyLogo: Any? = null
}