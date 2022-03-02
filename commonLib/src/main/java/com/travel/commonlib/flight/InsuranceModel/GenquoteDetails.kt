package com.travel.commonlib.flight.InsuranceModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class GenquoteDetails : Serializable {
    @SerializedName("BaseFare")
    @Expose
    var baseFare: Double? = null

    @SerializedName("ServiceCharge")
    @Expose
    var serviceCharge: Double? = null

    @SerializedName("Discount")
    @Expose
    var discount: Double? = null

    @SerializedName("ResultCurrency")
    @Expose
    var resultCurrency: String? = null

    @SerializedName("DecimalPoints")
    @Expose
    var decimalPoints: Int? = null

    @SerializedName("Tax")
    @Expose
    var tax: Double? = null

    @SerializedName("SupplierToatal")
    @Expose
    var supplierToatal: Double? = null

    @SerializedName("TotalAmount")
    @Expose
    var totalAmount: Double? = null

    @SerializedName("ActualCurrency")
    @Expose
    var actualCurrency: String? = null

    @SerializedName("ActualDecimal")
    @Expose
    var actualDecimal: Int? = null

    @SerializedName("ActualSupplierTotal")
    @Expose
    var actualSupplierTotal: Double? = null

    @SerializedName("GstVatAmount")
    @Expose
    var gstVatAmount: Double? = null

    @SerializedName("GstTaxId")
    @Expose
    var gstTaxId: Int? = null
}