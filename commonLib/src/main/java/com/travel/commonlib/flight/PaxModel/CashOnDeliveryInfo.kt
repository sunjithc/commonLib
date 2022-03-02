package com.travel.commonlib.flight.PaxModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

class CashOnDeliveryInfo : Serializable {
    @SerializedName("TimeId")
    @Expose
    var timeId: Int? = null

    @SerializedName("Category")
    @Expose
    var category: String? = null

    @SerializedName("FirstName")
    @Expose
    var firstName: String? = null

    @SerializedName("LastName")
    @Expose
    var lastName: String? = null

    @SerializedName("Block")
    @Expose
    var block: String? = null

    @SerializedName("Judda")
    @Expose
    var judda: String? = null

    @SerializedName("Street")
    @Expose
    var street: String? = null

    @SerializedName("BuildingName")
    @Expose
    var buildingName: String? = null

    @SerializedName("FloorNumber")
    @Expose
    var floorNumber: String? = null

    @SerializedName("ApartmentName")
    @Expose
    var apartmentName: String? = null

    @SerializedName("MobileNumber")
    @Expose
    var mobileNumber: String? = null

    @SerializedName("PhoneNumber")
    @Expose
    var phoneNumber: String? = null

    @SerializedName("Remarks")
    @Expose
    var remarks: String? = null

    @SerializedName("CityID")
    @Expose
    var cityID: Int? = null

    @SerializedName("AreaID")
    @Expose
    var areaID: Int? = null

    @SerializedName("CODServiceCharge")
    @Expose
    private var cODServiceCharge: Int? = null

    @SerializedName("CodServiceList")
    @Expose
    var codServiceList: Any? = null

    @SerializedName("cashOnDeliveryTimeTableModel")
    @Expose
    var cashOnDeliveryTimeTableModel: Any? = null
    fun getcODServiceCharge(): Int? {
        return cODServiceCharge
    }

    fun setcODServiceCharge(cODServiceCharge: Int?) {
        this.cODServiceCharge = cODServiceCharge
    }
}