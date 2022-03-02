package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.commonlib.flight.DetailsModel.CodeShareInfoAirline
import java.io.Serializable
import java.util.*

class FlightItem : Serializable {
    @SerializedName("FlightLogo")
    @Expose
    var flightLogo: String? = ""

    @SerializedName("FlightName")
    @Expose
    var flightName: String? = ""

    @SerializedName("DepartureCityName")
    @Expose
    var departureCityName: String? = ""

    @SerializedName("DepartureAirportName")
    @Expose
    var departureAirportName: String? = ""

    @SerializedName("DepartureAirportDisplayName")
    @Expose
    var departureAirportDisplayName: String? = ""

    @SerializedName("ArrivalCityName")
    @Expose
    var arrivalCityName: String? = ""

    @SerializedName("ArrivalAirportName")
    @Expose
    var arrivalAirportName: String? = ""

    @SerializedName("ArrivalAirportDisplayName")
    @Expose
    var arrivalAirportDisplayName: String? = ""

    @SerializedName("DepartureDateTime")
    @Expose
    var departureDateTime = ""

    @SerializedName("ArrivalDateTime")
    @Expose
    var arrivalDateTime = ""

    @SerializedName("DepartureDateString")
    @Expose
    var departureDateString: String? = ""

    @SerializedName("DepartureTimeFormat")
    @Expose
    var departureTimeFormat: DepartureTimeFormat? = null

    @SerializedName("ArrivalDateString")
    @Expose
    var arrivalDateString: String? = ""

    @SerializedName("ArrivalTimeFormat")
    @Expose
    var arrivalTimeFormat: ArrivalTimeFormat? = null

    @SerializedName("DepartureDay")
    @Expose
    var departureDay: String? = ""

    @SerializedName("ArrivalDay")
    @Expose
    var arrivalDay: String? = ""

    @SerializedName("DurationPerLeg")
    @Expose
    var durationPerLeg: DurationPerLeg? = null

    @SerializedName("TransitTime")
    @Expose
    var transitTime: TransitTime? = null

    @SerializedName("FlightInfo")
    @Expose
    var flightInfo: FlightInfo? = null

    @SerializedName("BaggageInfos")
    @Expose
    var baggageInfos: ArrayList<BaggageInfo>? = null

    @SerializedName("FareBasisCode")
    @Expose
    var fareBasisCode: ArrayList<String>? = null

    @SerializedName("SegmentNumber")
    @Expose
    var segmentNumber = 0

    @SerializedName("CodeShareInfoAirline")
    @Expose
    var codeShareInfoAirline: CodeShareInfoAirline? = null

    @SerializedName("SegmentRelatedDetails")
    @Expose
    var segmentRelatedDetails: Any? = null

    @SerializedName("PriceClassRef")
    @Expose
    var priceClassRef: Any? = null

    @SerializedName("FareBasisCodeRef")
    @Expose
    var fareBasisCodeRef: Any? = null

    @SerializedName("SelectedSeat")
    @Expose
    var selectedSeat: Any? = null

    @SerializedName("BookingCodes")
    @Expose
    var bookingCodes: List<BookingCode>? = null

    @SerializedName("fareInfoDisplay")
    @Expose
    var fareInfoDisplay: Any? = null

    @SerializedName("Sector")
    @Expose
    var sector: Any? = null

    @SerializedName("SecureFlightInd")
    @Expose
    var secureFlightInd = false

    @SerializedName("SegmentTypeCode")
    @Expose
    var segmentTypeCode: Any? = null

    @SerializedName("CarrierAircraftTypeCode")
    @Expose
    var carrierAircraftTypeCode: Any? = null
}