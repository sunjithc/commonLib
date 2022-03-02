package com.travel.commonlib.activity.common

import java.util.ArrayList

class ActivityFilterModel {
    var isPrice = false
    var isName = false
    var minPrice = 0.0
    var maxPrice = 0.0
    var minValue = 0.0
    var maxValue = 0.0
    var isCategory = false
    var categories = ArrayList<ActivityCategoriesFilterModel>()
    var categoriesList = ArrayList<ActivityCategoriesFilterModel>()
    var selectedCategories = ArrayList<String>()

}