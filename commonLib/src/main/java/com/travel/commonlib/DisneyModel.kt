package com.travel.commonlib

import java.io.Serializable
import java.util.*

class DisneyModel :Serializable {
    var type = 1
    var searchPlace: String? = null
    var promoCode: String? = null
    var fromDate: Date? = null
    var fromDateString: String? = null
    var toDate: Date? = null
    var toDateString: String? = null
    var adultCount = 1
    var adult_18 = 0
    var child_7_12 = 0
    var child_3_6 = 0
    var infant_count = 0
}