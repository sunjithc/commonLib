package com.travel.commonlib.transfer.TransfersGetPax

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Traveller : Serializable {
    @SerializedName("_SeatDetail")
    @Expose
    var seatDetail: Any? = null

    @SerializedName("ModifiedBy")
    @Expose
    var modifiedBy: Any? = null

    @SerializedName("ProfileImg")
    @Expose
    var profileImg: Any? = null

    @SerializedName("TransactionTypeDetailId")
    @Expose
    var transactionTypeDetailId: Any? = null

    @SerializedName("TicketNo")
    @Expose
    var ticketNo: Any? = null

    @SerializedName("Nationality")
    @Expose
    var nationality: String? = null

    @SerializedName("RegistrationDate")
    @Expose
    var registrationDate: String? = null

    @SerializedName("RegistrationIP")
    @Expose
    var registrationIP: Any? = null

    @SerializedName("PassengerId")
    @Expose
    var passengerId: Int? = null

    @SerializedName("PassengerIdForTrip")
    @Expose
    var passengerIdForTrip: Int? = null

    @SerializedName("Email")
    @Expose
    var email: String? = null

    @SerializedName("PassengerCategory")
    @Expose
    var passengerCategory: Any? = null

    @SerializedName("IsFirstPassenger")
    @Expose
    var isFirstPassenger: Boolean? = null

    @SerializedName("AirlineCode")
    @Expose
    var airlineCode: Any? = null

    @SerializedName("Title")
    @Expose
    var title: String? = null
        get() = if (field == null || field == "null" || field == "") "Mr" else "title"

    @SerializedName("FullName")
    @Expose
    var fullName: String? = null

    @SerializedName("FirstName")
    @Expose
    var firstName: String? = null

    @SerializedName("LastName")
    @Expose
    var lastName: String? = null

    @SerializedName("MiddleName")
    @Expose
    var middleName: Any? = null

    @SerializedName("Age")
    @Expose
    var age: Any? = null

    @SerializedName("Gender")
    @Expose
    var gender: Any? = null

    @SerializedName("UserId")
    @Expose
    var userId: Int? = null

    @SerializedName("GenderDisplay")
    @Expose
    var genderDisplay: String? = null

    @SerializedName("PhoneNumber")
    @Expose
    var phoneNumber: String? = null

    @SerializedName("PhoneCode")
    @Expose
    var phoneCode: String? = null

    @SerializedName("MobileNumber")
    @Expose
    var mobileNumber: String? = null

    @SerializedName("FrequentFlyerNumber")
    @Expose
    var frequentFlyerNumber: Any? = null

    @SerializedName("PassengerType")
    @Expose
    var passengerType: Int? = null

    @SerializedName("PassportNumber")
    @Expose
    var passportNumber: Any? = null

    @SerializedName("IsCivilId")
    @Expose
    var isCivilId: Boolean? = null

    @SerializedName("DateOfBirth")
    @Expose
    var dateOfBirth: Any? = null

    @SerializedName("PassportExpiryDate")
    @Expose
    var passportExpiryDate: Any? = null

    @SerializedName("PassportPlaceOfIssue")
    @Expose
    var passportPlaceOfIssue: Any? = null

    @SerializedName("Citizenship")
    @Expose
    var citizenship: Any? = null

    @SerializedName("CountryName")
    @Expose
    var countryName: Any? = null

    @SerializedName("CountryCode")
    @Expose
    var countryCode: Any? = null

    @SerializedName("Civilidnumber")
    @Expose
    var civilidnumber: Any? = null

    @SerializedName("CivilidExpiryDate")
    @Expose
    var civilidExpiryDate: Any? = null

    @SerializedName("CivilidPlaceOfIssue")
    @Expose
    var civilidPlaceOfIssue: Any? = null

    @SerializedName("ContactDetails")
    @Expose
    var contactDetails: Any? = null

    @SerializedName("PreferenceDetails")
    @Expose
    var preferenceDetails: Any? = null

    @SerializedName("ImagePassport")
    @Expose
    var imagePassport: Any? = null

    @SerializedName("ImageStudentId")
    @Expose
    var imageStudentId: Any? = null

    @SerializedName("UserCode")
    @Expose
    var userCode: Any? = null

    @SerializedName("SSRCsv")
    @Expose
    var sSRCsv: String? = null

    @SerializedName("IsLeadPassenger")
    @Expose
    var isLeadPassenger: Boolean? = null

    @SerializedName("IsPassenger")
    @Expose
    var isPassenger: Boolean? = null

    @SerializedName("IsEncrypt")
    @Expose
    var isEncrypt: Boolean? = null

    @SerializedName("HasVisa")
    @Expose
    var hasVisa: Boolean? = null

    @SerializedName("VisaNumber")
    @Expose
    var visaNumber: Any? = null

    @SerializedName("MobileCode")
    @Expose
    var mobileCode: String? = null

    @SerializedName("SpecialFareDetails")
    @Expose
    var specialFareDetails: Any? = null

    @SerializedName("ServiceType")
    @Expose
    var serviceType: Any? = null

    @SerializedName("Details")
    @Expose
    var details: Any? = null

    @SerializedName("AgencyCountryCode")
    @Expose
    var agencyCountryCode: Any? = null

    @SerializedName("AffiliateBranchId")
    @Expose
    var affiliateBranchId: Any? = null

    @SerializedName("BoardingDetails")
    @Expose
    var boardingDetails: Any? = null

    @SerializedName("FrequestFlyerAirline")
    @Expose
    var frequestFlyerAirline: Any? = null

    @SerializedName("PassengerSeatDetails")
    @Expose
    var passengerSeatDetails: Any? = null

    @SerializedName("FrequestFlyerList")
    @Expose
    var frequestFlyerList: Any? = null

    @SerializedName("Corporate")
    @Expose
    var corporate: Any? = null

    @SerializedName("FrequentFlyerDetails")
    @Expose
    var frequentFlyerDetails: Any? = null

    @SerializedName("HotelBookingId")
    @Expose
    var hotelBookingId: Int? = null

    @SerializedName("HotelRoomId")
    @Expose
    var hotelRoomId: Int? = null

    @SerializedName("NoofAdultList")
    @Expose
    var noofAdultList: Any? = null

    @SerializedName("NoofChildList")
    @Expose
    var noofChildList: Any? = null

    @SerializedName("NoofAdult")
    @Expose
    var noofAdult: Any? = null

    @SerializedName("NoofChild")
    @Expose
    var noofChild: Any? = null

    @SerializedName("DeviceId")
    @Expose
    var deviceId: Any? = null

    @SerializedName("ReferralCode")
    @Expose
    var referralCode: Any? = null

    @SerializedName("PassengerName")
    @Expose
    var passengerName: Any? = null
}