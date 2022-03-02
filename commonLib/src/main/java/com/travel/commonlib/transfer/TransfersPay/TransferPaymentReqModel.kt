package com.travel.commonlib.transfer.TransfersPay

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.travel.jumbo.Flight.Model.PaymentSubmitModel.CouponModal
import com.travel.jumbo.Flight.Models.PaxSubmitModel.KangarooRewardPoint
import com.travel.jumbo.InsuranceModel.Policy_Insurance
import java.io.Serializable

class TransferPaymentReqModel : Serializable {
    @SerializedName("BinNo")
    @Expose
    var binNo: String? = null

    @SerializedName("CardAutoSave")
    @Expose
    var cardAutoSave: String? = null

    @SerializedName("CardCVV")
    @Expose
    var cardCVV: String? = null

    @SerializedName("CardID")
    @Expose
    var cardID: String? = null

    @SerializedName("CardToken")
    @Expose
    var cardToken: String? = null

    @SerializedName("IsCardPayment")
    @Expose
    var isCardPayment: String? = null

    @SerializedName("SelectedPaymentGatewayId")
    @Expose
    var selectedPaymentGatewayId: String? = null

    @SerializedName("kfhSessionId")
    @Expose
    var kfhSessionId: String? = null

    @SerializedName("sessionkey")
    @Expose
    var sessionkey: String? = null

    @SerializedName("IsThirdParty")
    @Expose
    var isThirdParty = false

    @SerializedName("CurrentCulture")
    @Expose
    var currentCulture: String? = null

    @SerializedName("CrediMaxSessionId")
    @Expose
    var crediMaxSessionId: Any? = null

    @SerializedName("TapPaymentToken")
    @Expose
    var tapPaymentToken: String? = null

    @SerializedName("InstantMarkup")
    @Expose
    var instantMarkup: Int? = null

    @SerializedName("InstantDiscount")
    @Expose
    var instantDiscount: Int? = null

    @SerializedName("InstantServiceCharge")
    @Expose
    var instantServiceCharge: Int? = null

    @SerializedName("IsB2BtroughPG")
    @Expose
    var isB2BtroughPG: Boolean? = null

    @SerializedName("KangarooRewardPointModel")
    @Expose
    var kangarooRewardPointModel: KangarooRewardPoint? = null

    @SerializedName("InsuranceBookingModel")
    @Expose
    var insuranceBookingModel: Policy_Insurance? = null

    @SerializedName("CouponModal")
    @Expose
    var couponModal: CouponModal? = null


    fun getIsThirdParty(): Boolean {
        return isThirdParty
    }

    fun setIsThirdParty(isThirdParty: Boolean) {
        this.isThirdParty = isThirdParty
    }
}