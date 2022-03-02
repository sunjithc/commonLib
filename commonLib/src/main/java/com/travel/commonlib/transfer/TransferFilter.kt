package com.travel.commonlib.transfer

import java.util.*

class TransferFilter {
    var minPrice = 0.0
    var maxPrice = 0.0
    var selectedMinPrice = 0.0
    var selectedMaxPrice = 0.0
    var isPrice = false
    var isType = false
    var selectedTypes = ArrayList<String>()
}