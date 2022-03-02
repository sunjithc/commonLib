package com.travel.commonlib.activity.common

import java.io.Serializable
import java.util.*

/**
 * Created by Anupriya (Android) on 14/07/2021.
 */
class SearchModel : Serializable {

    var destination: String=""
    var destinationCode: String? = null
    var fromDate: String=""
    var toDate: String=""
    var adultCount: Int = 1
    var childCount: Int = 0
    var cityName: String? = null
    var childAge: String=""
    var headerFromDate: String? = null
    var headerToDate: String? = null
    var from: Date? = null
    var to: Date? = null
    var age1: Int = 1
    var age2: Int = 1
    var age3: Int = 1
    var age4: Int = 1
    var age5: Int = 1

    fun SearchModel() {
        var cityName: String
        destination = ""
        fromDate = ""
        toDate = ""
        adultCount = 1
        childCount = 0
        childAge = ""
        age1 = 1
        age2 = 1
        age3 = 1
        age4 = 1
        age5 = 1
    }
}