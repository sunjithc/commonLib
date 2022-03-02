package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class FlightInfo : Serializable {
    @SerializedName("FlightCode")
    @Expose
    var flightCode: String? = ""

    @SerializedName("FlightNumber")
    @Expose
    var flightNumber: String? = ""

    @SerializedName("DepartureCityCode")
    @Expose
    var departureCityCode: String? = ""

    @SerializedName("DepartureCityDisplayCode")
    @Expose
    var departureCityDisplayCode: String? = ""

    @SerializedName("ArrivalCityCode")
    @Expose
    var arrivalCityCode: String? = ""

    @SerializedName("ArrivalCityDisplayCode")
    @Expose
    var arrivalCityDisplayCode: String? = ""

    @SerializedName("DepartureTerminal")
    @Expose
    var departureTerminal: String? = ""

    @SerializedName("ArrivalTerminal")
    @Expose
    var arrivalTerminal: String? = ""

    @SerializedName("DepartureTime")
    @Expose
    var departureTime: String? = ""

    @SerializedName("ArrivalTime")
    @Expose
    var arrivalTime: String? = ""

    @SerializedName("BookingCode")
    @Expose
    var bookingCode: String? = ""

    @SerializedName("MealCode")
    @Expose
    var mealCode: String? = ""

    @SerializedName("JourneyTime")
    @Expose
    var journeyTime: String? = ""

    @SerializedName("AircraftName")
    @Expose
    var aircraftName: String? = ""

    @SerializedName("EquipmentNumber")
    @Expose
    var equipmentNumber: String? = ""

    @SerializedName("DayChange")
    @Expose
    var dayChange: Any? = null

    @SerializedName("IsConnection")
    @Expose
    var connection: Boolean? = false

    @SerializedName("IsAirportChange")
    @Expose
    var airportChange: Boolean? = false

    @SerializedName("NumberOfStops")
    @Expose
    var numberOfStops = 0

    @SerializedName("MarketingCarrier")
    @Expose
    var marketingCarrier: String? = ""

    @SerializedName("FlightId")
    @Expose
    var flightId = 0

    @SerializedName("AvailSource")
    @Expose
    var availSource: Any? = null

    @SerializedName("CabinClass")
    @Expose
    var cabinClass: String? = ""

    @SerializedName("MarriageGroup")
    @Expose
    var marriageGroup: String? = ""

    @SerializedName("SegmentRefKey")
    @Expose
    var segmentRefKey = ""

    @SerializedName("SegmentKey")
    @Expose
    var segmentKey = ""

    @SerializedName("FareTypeID")
    @Expose
    var fareTypeID: Int? = 0

    @SerializedName("FareTypeName")
    @Expose
    var fareTypeName: Any? = null

    @SerializedName("PhysicalFlightId")
    @Expose
    var physicalFlightId= 0

    @SerializedName("DepartureDateTime")
    @Expose
    var departureDateTime = "0001-01-01T00:00:00"

    @SerializedName("ArrivalDateTime")
    @Expose
    var arrivalDateTime = "0001-01-01T00:00:00"

    @SerializedName("FareType")
    @Expose
    var fareType: Any? = null

    @SerializedName("MarketingCarrierFlightNumber")
    @Expose
    var marketingCarrierFlightNumber: String? = null

    @SerializedName("DurationTime")
    @Expose
    var durationTime: Any? = null
    fun getIsConnection(): Boolean? {
        return connection
    }

    fun setIsConnection(isConnection: Boolean?) {
        connection = isConnection
    }

    fun getIsAirportChange(): Boolean? {
        return airportChange
    }

    fun setIsAirportChange(isAirportChange: Boolean?) {
        airportChange = isAirportChange
    }
}