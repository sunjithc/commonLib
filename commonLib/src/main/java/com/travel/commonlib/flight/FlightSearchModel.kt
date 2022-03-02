package com.travel.commonlib.flight

import java.io.Serializable
import java.util.*

class FlightSearchModel : Serializable {
    var tripType = 2
    var tripCount = 2
    var departureAirport: String? = null
    var departureAllAirport: String? = null
    var departureCity: String? = null
    var departureCountry: String? = null
    var arrivalCity: String? = null
    var arrivalCountry: String? = null
    var departureAirportCode: String? = "DXB"
    var departureDateString: String? = null
    var departureDate: Date? = null
    var returnAirport: String? = null
    var returnAllAirport: String? = null
    var returnAirportCode: String? = "COK"
    var returnDateString: String? = null
    var departureClass: String? = null
    var returnDate: Date? = null
    var adultCount = 1
    var childCount = 0
    var infantCount = 0
    var isDirect = false

    var preferredAirline = ""
    var preferredAirlineCode = ""
    var departureAirportA: String? = null
    var departureAirportCodeA: String? = null
    var departureAirportB: String? = null
    var departureAirportCodeB: String? = null
    var departureAirportC: String? = null
    var departureAirportCodeC: String? = null
    var departureAirportD: String? = null
    var departureAirportCodeD: String? = null
    var departureAirportE: String? = null
    var departureAirportCodeE: String? = null
    var departureAirportF: String? = null
    var departureAirportCodeF: String? = null
    var departureAllAirportA: String? = null
    var departureAllAirportB: String? = null
    var departureAllAirportC: String? = null
    var departureAllAirportD: String? = null
    var departureAllAirportE: String? = null
    var departureAllAirportF: String? = null
    var arrivalAllAirportA: String? = null
    var arrivalAllAirportB: String? = null
    var arrivalAllAirportC: String? = null
    var arrivalAllAirportD: String? = null
    var arrivalAllAirportE: String? = null
    var arrivalAllAirportF: String? = null
    var departureDateStringA: String? = null
    var departureDateA: Date? = null
    var departureDateStringB: String? = null
    var departureDateB: Date? = null
    var departureDateStringC: String? = null
    var departureDateC: Date? = null
    var departureDateStringD: String? = null
    var departureDateD: Date? = null
    var departureDateStringE: String? = null
    var departureDateE: Date? = null
    var departureDateStringF: String? = null
    var departureDateF: Date? = null
    var arrivalAirportA: String? = null
    var arrivalAirportCodeA: String? = null
    var arrivalAirportB: String? = null
    var arrivalAirportCodeB: String? = null
    var arrivalAirportC: String? = null
    var arrivalAirportCodeC: String? = null
    var arrivalAirportD: String? = null
    var arrivalAirportCodeD: String? = null
    var arrivalAirportE: String? = null
    var arrivalAirportCodeE: String? = null
    var arrivalAirportF: String? = null
    var arrivalAirportCodeF: String? = null
    var multiDepartureClass: String? = null
    var multiAdultCount = 1
    var multiChildCount = 0
    var multiInfantCount = 0
    var roomCount = 0
    var isMultiDirect = false
    var multiPreferredAirline = ""
    var multiPreferredAirlineCode = ""
}