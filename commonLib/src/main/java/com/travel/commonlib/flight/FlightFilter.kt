package com.travel.commonlib.flight

import java.util.*

class FlightFilter {
    var isPrice = false
    var isStops = false
    var isRefundFilter = false
    var isLayoverTime = false
    var isLayoverTime_return = false
    var minPrice = 0.0
    var maxPrice = 0.0
    var minValue = 0.0
    var maxValue = 0.0
    var isNonStop = false
    var isOneStop = false
    var isMultiStop = false
    var isRefundable = false
    var isNonRefundable = false
    var isPartiallyfundable = false
    var minLayoverTimeRange = 0.0
    var maxLayoverTimeRange = 0.0
    var minLayoverTime = 0.0
    var maxLayoverTime = 0.0
    var minLayoverTimeRange_return = 0.0
    var maxLayoverTimeRange_return = 0.0
    var minLayoverTime_return = 0.0
    var maxLayoverTime_return = 0.0
    var isAirline = false
    var airlines = ArrayList<AirlineFilterModel>()
    var selectedAirlines = ArrayList<AirlineFilterModel>()
    var isLayoverAirport = false
    var layoverAirports = ArrayList<String>()
    var selectedLayoverAirports = ArrayList<String>()

    var isDepartureEarlyMorning = false
    var isDepartureMorning = false
    var isDepartureAfternoon = false
    var isDepartureLateNight = false

    var isArrivalEarlyMorning = false
    var isArrivalMorning = false
    var isArrivalAfternoon = false
    var isArrivalLateNight = false

    var isFilterByTime = false
    var isFilterByDeparture = false
    var isFilterByArrival = false

    var isRoundTripFilterByDeparture = false
    var isRoundTripFilterByArrival = false

    var isRoundTripDepartureEarlyMorning = false
    var isRoundTripDepartureMorning = false
    var isRoundTripDepartureAfternoon = false
    var isRoundTripDepartureLateNight = false

    var isRoundTripArrivalEarlyMorning = false
    var isRoundTripArrivalMorning = false
    var isRoundTripArrivalAfternoon = false
    var isRoundTripArrivalLateNight = false
}