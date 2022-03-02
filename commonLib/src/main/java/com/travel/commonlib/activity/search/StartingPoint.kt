package com.travel.commonlib.activity.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class StartingPoint : Serializable {
    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("MeetingPoint")
    @Expose
    var meetingPoint: MeetingPoint? = null

    companion object {
        private const val serialVersionUID = -227613292473369931L
    }
}