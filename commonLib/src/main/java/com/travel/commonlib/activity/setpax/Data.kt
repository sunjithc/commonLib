package com.travel.commonlib.activity.setpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Data : Serializable {
    @SerializedName("PaxData")
    @Expose
    var paxData: PaxData? = null

    @SerializedName("TransactionData")
    @Expose
    var transactionData: TransactionData? = null

    @SerializedName("ActivityReference")
    @Expose
    var activityReference: String? = null

    @SerializedName("WorkingID")
    @Expose
    var workingID: String? = null

    @SerializedName("ModeCode")
    @Expose
    var modeCode: String? = null

    @SerializedName("Device")
    @Expose
    var device: Long = 0

    @SerializedName("HapId")
    @Expose
    var hapId: Long = 0

    @SerializedName("ApiId")
    @Expose
    var apiId: Long = 0

    @SerializedName("ClientReference")
    @Expose
    var clientReference: String? = null

    @SerializedName("vResponse")
    @Expose
    private var vResponse: VResponse? = null
    fun getvResponse(): VResponse? {
        return vResponse
    }

    fun setvResponse(vResponse: VResponse?) {
        this.vResponse = vResponse
    }

    companion object {
        private const val serialVersionUID = -7925273482771822870L
    }
}