package com.travel.commonlib.transfer.TransfersDetails

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Pricedetails : Serializable {
    @SerializedName("ActualFare")
    @Expose
    var actualFare: Double? = null

    @SerializedName("Discount")
    @Expose
    var discount: Double? = null

    @SerializedName("ServiceCharge")
    @Expose
    var serviceCharge: Double? = null

    @SerializedName("TotalAmount")
    @Expose
    var totalAmount: Double? = null

    @SerializedName("Currency")
    @Expose
    var currency: String? = null

    @SerializedName("ActualCurrency")
    @Expose
    var actualCurrency: String? = null

    @SerializedName("DecimalPoints")
    @Expose
    var decimalPoints: Int? = null

    @SerializedName("ActualsupplierTotal")
    @Expose
    var actualsupplierTotal: Double? = null

    @SerializedName("FinalPrice")
    @Expose
    var finalPrice: Double? = null

    @SerializedName("ConversionRate")
    @Expose
    var conversionRate: Double? = null

    @SerializedName("CouponCode")
    @Expose
    var couponCode: Any? = null

    @SerializedName("GstVatAmount")
    @Expose
    var gstVatAmount: Double? = null

    @SerializedName("GstTaxId")
    @Expose
    var gstTaxId: Int? = null

    @SerializedName("BaseConversionRate")
    @Expose
    var baseConversionRate: Double? = null
}