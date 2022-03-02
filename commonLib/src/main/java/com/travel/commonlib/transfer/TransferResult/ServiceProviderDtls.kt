package com.travel.commonlib.transfer.TransferResult

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import java.io.Serializable

class ServiceProviderDtls : Serializable {
    @SerializedName("Contract")
    @Expose
    var contract: Contract? = null

    @SerializedName("TransferType")
    @Expose
    var transferType: String? = null

    @SerializedName("ServiceType")
    @Expose
    var serviceType: Any? = null

    @SerializedName("SupplierName")
    @Expose
    var supplierName: Any? = null

    @SerializedName("VatNumber")
    @Expose
    var vatNumber: Any? = null

    @SerializedName("TransferInfoType")
    @Expose
    var transferInfoType: String? = null

    @SerializedName("AvailToken")
    @Expose
    var availToken: String? = null

    @SerializedName("AgencyCode")
    @Expose
    var agencyCode: Int? = null

    @SerializedName("SPUI")
    @Expose
    var spui: Any? = null
}