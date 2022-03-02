package com.travel.commonlib.activity.getpax

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CompanyQuote : Serializable {
    @SerializedName("BaseFare")
    @Expose
    var baseFare = 0.0

    @SerializedName("Markup")
    @Expose
    var markup = 0.0

    @SerializedName("Discount")
    @Expose
    var discount = 0.0

    @SerializedName("ResultCurrency")
    @Expose
    var resultCurrency: String? = null

    @SerializedName("DecimalPoints")
    @Expose
    var decimalPoints: Long = 0

    @SerializedName("Tax")
    @Expose
    var tax = 0.0

    @SerializedName("SupplierToatal")
    @Expose
    var supplierToatal = 0.0

    @SerializedName("TotalAmount")
    @Expose
    var totalAmount = 0.0

    @SerializedName("BaseCurrency")
    @Expose
    var baseCurrency: String? = null

    @SerializedName("PaxType")
    @Expose
    var paxType: Long = 0

    @SerializedName("Count")
    @Expose
    var count: Long = 0

    @SerializedName("SupplierCurrency")
    @Expose
    var supplierCurrency: String? = null

    @SerializedName("GstVatAmount")
    @Expose
    var gstVatAmount = 0.0

    @SerializedName("GstTaxId")
    @Expose
    var gstTaxId: Long = 0

    @SerializedName("ActualSupplierTotal")
    @Expose
    var actualSupplierTotal = 0.0

    companion object {
        private const val serialVersionUID = 3934520551692180992L
    }
}