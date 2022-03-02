package com.travel.commonlib.transfer.TransferResult

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class Services : Serializable {
    @SerializedName("CommisionAmount")
    @Expose
    var commisionAmount: Double? = null

    @SerializedName("netPrice")
    @Expose
    var netPrice: Double? = null

    @SerializedName("Commission")
    @Expose
    var commission: Double? = null

    @SerializedName("CommissionPercentage")
    @Expose
    var commissionPercentage: Double? = null

    @SerializedName("CommissionVat")
    @Expose
    var commissionVat: Double? = null

    @SerializedName("GeneralInfo")
    @Expose
    var generalInfo: String? = null

    @SerializedName("WebInfo")
    @Expose
    var webInfo: String? = null

    @SerializedName("PurchaseToken")
    @Expose
    var purchaseToken: Any? = null

    @SerializedName("ExpirationTime")
    @Expose
    var expirationTime: Int? = null

    @SerializedName("ResponseStatus")
    @Expose
    var responseStatus: Any? = null

    @SerializedName("PricePerPerson")
    @Expose
    var pricePerPerson: Double? = null

    @SerializedName("ImageUrl")
    @Expose
    var imageUrl: String? = null

    @SerializedName("ServiceProviderDtls")
    @Expose
    var serviceProviderDtls: ServiceProviderDtls? = null

    @SerializedName("GeneralInfoList")
    @Expose
    var generalInfoList: List<GeneralInfo>? = null

}