package com.travel.commonlib.flight.ResultModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.util.*

class CompanyGenQuoteDetail : Serializable {
    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("DecimalPoints")
    @Expose
    var decimalPoints: Int? = null

    @SerializedName("BaseFare")
    @Expose
    var baseFare = 0.0

    @SerializedName("AdditionalCharges")
    @Expose
    var additionalCharges = 0.0

    @SerializedName("ServiceCharge")
    @Expose
    var serviceCharge = 0.0

    @SerializedName("SeatServiceCharge")
    @Expose
    var seatServiceCharge = 0.0

    @SerializedName("MealsServiceCharge")
    @Expose
    var mealsServiceCharge = 0.0

    @SerializedName("AirlineTax")
    @Expose
    var airlineTax = 0.0

    @SerializedName("Discount")
    @Expose
    var discount = 0.0

    @SerializedName("TotalAmount")
    @Expose
    var totalAmount = 0.0

    @SerializedName("Count")
    @Expose
    var count: Int? = null

    @SerializedName("TotalAmountForCount")
    @Expose
    var totalAmountForCount = 0.0

    @SerializedName("PassengerType")
    @Expose
    var passengerType: String? = null

    @SerializedName("AirlineTaxes")
    @Expose
    var airlineTaxes: ArrayList<AirlineTax>? = null

    @SerializedName("IsApplyCoupon")
    @Expose
    var applyCoupon: Boolean? = null

    @SerializedName("CouponDiscount")
    @Expose
    var couponDiscount = 0.0

    @SerializedName("ActualCurrency")
    @Expose
    var actualCurrency: String? = null

    @SerializedName("ActualDecimal")
    @Expose
    var actualDecimal: Int? = null

    @SerializedName("ActualSupplierTotal")
    @Expose
    var actualSupplierTotal = 0.0

    @SerializedName("PenaltiesInfo")
    @Expose
    var penaltiesInfo: PenaltiesInfo? = null

    @SerializedName("GstVatAmount")
    @Expose
    var gstVatAmount = 0.0

    @SerializedName("BrandId")
    @Expose
    var brandId: Any? = null

    @SerializedName("FareBasis")
    @Expose
    var fareBasis: Any? = null
}