package com.travel.commonlib.activity.common

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.util.ArrayList

class ActivityCategoriesFilterModel {
    @SerializedName("TitleCode")
    @Expose
    var titleCode: String? = null
    @SerializedName("ActivityTitle")
    @Expose
    var activityTitle: String? = null

    @SerializedName("subCategories")
    @Expose
    var subCategories: ArrayList<SubcategoriesItem>? = null


}