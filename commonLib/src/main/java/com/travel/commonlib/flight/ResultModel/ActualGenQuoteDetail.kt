package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class ActualGenQuoteDetail : Serializable {
    @SerializedName("UniqueKey")
    @Expose
    var uniqueKey: Int? = null

    @SerializedName("originalFare")
    @Expose
    var originalFare = 0.0

    @SerializedName("originalFareOneWay")
    @Expose
    var originalFareOneWay = 0.0

    @SerializedName("BaseFareOneWay")
    @Expose
    var baseFareOneWay = 0.0

    @SerializedName("TotalFareOneWay")
    @Expose
    var totalFareOneWay = 0.0

    @SerializedName("originalFareReturn")
    @Expose
    var originalFareReturn = 0.0

    @SerializedName("BaseFareReturn")
    @Expose
    var baseFareReturn = 0.0

    @SerializedName("TotalFareReturn")
    @Expose
    var totalFareReturn = 0.0

    @SerializedName("OnurAirTotalAmount")
    @Expose
    var onurAirTotalAmount = 0.0

    @SerializedName("OnewayTaxSplitUp")
    @Expose
    var onewayTaxSplitUp: Any? = null

    @SerializedName("ReturnTaxSplitUp")
    @Expose
    var returnTaxSplitUp: Any? = null

    @SerializedName("ReferenceFare")
    @Expose
    var referenceFare = 0.0

    @SerializedName("Fareid")
    @Expose
    var fareid: Int? = null

    @SerializedName("PTCID")
    @Expose
    private var pTCID: Int? = null

    @SerializedName("ReturnFareId")
    @Expose
    var returnFareId: Int? = null

    @SerializedName("ReturnPTCID")
    @Expose
    var returnPTCID: Int? = null

    @SerializedName("FBCode")
    @Expose
    private var fBCode: Any? = null

    @SerializedName("FCCode")
    @Expose
    private var fCCode: Any? = null

    @SerializedName("SeatsAvailable")
    @Expose
    var seatsAvailable: Int? = null

    @SerializedName("SeatsAvailableInfant")
    @Expose
    var seatsAvailableInfant: Int? = null

    @SerializedName("ReturnFBCode")
    @Expose
    var returnFBCode: Any? = null

    @SerializedName("ReturnFCCode")
    @Expose
    var returnFCCode: Any? = null

    @SerializedName("ReturnSeatsAvailable")
    @Expose
    var returnSeatsAvailable: Int? = null

    @SerializedName("ReturnSeatsAvailableInfant")
    @Expose
    var returnSeatsAvailableInfant: Int? = null

    @SerializedName("ruleID")
    @Expose
    var ruleID: Any? = null

    @SerializedName("ID")
    @Expose
    private var iD: Int? = null

    @SerializedName("ReturnruleID")
    @Expose
    var returnruleID: Any? = null

    @SerializedName("ReturnID")
    @Expose
    var returnID: Int? = null

    @SerializedName("hashcode")
    @Expose
    var hashcode: Any? = null

    @SerializedName("Returnhashcode")
    @Expose
    var returnhashcode: Any? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("DecimalPoints")
    @Expose
    var decimalPoints: Int? = null

    @SerializedName("BaseFare")
    @Expose
    var baseFare = 0.0

    @SerializedName("AirlineTax")
    @Expose
    var airlineTax = 0.0

    @SerializedName("TotalFare")
    @Expose
    var totalFare = 0.0

    @SerializedName("Count")
    @Expose
    var count: Int? = null

    @SerializedName("AirlineTaxes")
    @Expose
    var airlineTaxes: ArrayList<AirlineTax>? = null

    @SerializedName("FareId")
    @Expose
    var fareId: ArrayList<String>? = null

    @SerializedName("PenaltiesInfo")
    @Expose
    var penaltiesInfo: PenaltiesInfo? = null

    @SerializedName("BrandId")
    @Expose
    var brandId: Any? = null

    @SerializedName("FareBasis")
    @Expose
    var fareBasis: Any? = null
    fun getpTCID(): Int? {
        return pTCID
    }

    fun setpTCID(pTCID: Int?) {
        this.pTCID = pTCID
    }

    fun getfBCode(): Any? {
        return fBCode
    }

    fun setfBCode(fBCode: Any?) {
        this.fBCode = fBCode
    }

    fun getfCCode(): Any? {
        return fCCode
    }

    fun setfCCode(fCCode: Any?) {
        this.fCCode = fCCode
    }

    fun getiD(): Int? {
        return iD
    }

    fun setiD(iD: Int?) {
        this.iD = iD
    }
}