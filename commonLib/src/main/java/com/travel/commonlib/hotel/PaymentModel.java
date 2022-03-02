package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.Flight.Model.PaxSubmitModel.LoyaltyRedeemPoint;
import com.travel.jumbo.model.hotel.AvailablePaymentGateway;
import com.travel.jumbo.model.hotel.SelectedPaymentGateway;

import java.io.Serializable;
import java.util.List;

public class PaymentModel implements Serializable {

    @SerializedName("AvailablePaymentGateways")
    @Expose
    private List<AvailablePaymentGateway> availablePaymentGateways = null;
    @SerializedName("kfhSessionId")
    @Expose
    private String kfhSessionId;
    @SerializedName("IsDisableCouponCode")
    @Expose
    private boolean isDisableCouponCode;
    @SerializedName("IsDisableRedeemPoint")
    @Expose
    private boolean isDisableRedeemPoint;
    @SerializedName("TapPaymentToken")
    @Expose
    private String tapPaymentToken;
    @SerializedName("SelectedPaymentGateway")
    @Expose
    private SelectedPaymentGateway selectedPaymentGateway;
    @SerializedName("CouponModal")
    @Expose
    private CouponModal couponModal;
    @SerializedName("LoyaltyRedeemPoint")
    @Expose
    private LoyaltyRedeemPoint loyaltyRedeemPoint;

    @SerializedName("AppDownloadCouponModal")
    @Expose
    public Object appDownloadCouponModal;

    @SerializedName("olpIdAlias")
    @Expose
    public Object olpIdAlias;

    @SerializedName("CrediMaxSessionId")
    @Expose
    public Object crediMaxSessionId;

    @SerializedName("IsCommonMultiPayment")
    @Expose
    public boolean isCommonMultiPayment;

    @SerializedName("MultiPaymentItemCount")
    @Expose
    public long multiPaymentItemCount;
    @SerializedName("SavedCards")
    @Expose
    public List<Object> savedCards = null;
    @SerializedName("BinNo")
    @Expose
    public Object binNo;
    @SerializedName("InstantServiceCharge")
    @Expose
    public double instantServiceCharge;
    @SerializedName("InstantMarkup")
    @Expose
    public double instantMarkup;
    @SerializedName("InstantDiscount")
    @Expose
    public double instantDiscount;
    @SerializedName("IsInvoiceOnly")
    @Expose
    public boolean isInvoiceOnly;
    @SerializedName("IsInvoiced")
    @Expose
    public boolean isInvoiced;
    @SerializedName("IsB2BtroughPG")
    @Expose
    public boolean isB2BtroughPG;
    @SerializedName("WhatsAppNotificationRequested")
    @Expose
    public boolean whatsAppNotificationRequested;
    @SerializedName("kangarooReward")
    @Expose
    public Object kangarooReward;
    @SerializedName("IsPaylater")
    @Expose
    public boolean isPaylater;

    @SerializedName("IsInsuranceApplicable")
    @Expose
    public boolean IsInsuranceApplicable;

    private boolean IsCancellationPolicyTermsAccepted;

    public List<AvailablePaymentGateway> getAvailablePaymentGateways() {
        return availablePaymentGateways;
    }

    public void setAvailablePaymentGateways(List<AvailablePaymentGateway> availablePaymentGateways) {
        this.availablePaymentGateways = availablePaymentGateways;
    }

    public String getKfhSessionId() {
        return kfhSessionId;
    }

    public void setKfhSessionId(String kfhSessionId) {
        this.kfhSessionId = kfhSessionId;
    }

    public boolean isIsDisableCouponCode() {
        return isDisableCouponCode;
    }

    public void setIsDisableCouponCode(boolean isDisableCouponCode) {
        this.isDisableCouponCode = isDisableCouponCode;
    }

    public boolean isIsDisableRedeemPoint() {
        return isDisableRedeemPoint;
    }

    public void setIsDisableRedeemPoint(boolean isDisableRedeemPoint) {
        this.isDisableRedeemPoint = isDisableRedeemPoint;
    }

    public String getTapPaymentToken() {
        return tapPaymentToken;
    }

    public void setTapPaymentToken(String tapPaymentToken) {
        this.tapPaymentToken = tapPaymentToken;
    }

    public SelectedPaymentGateway getSelectedPaymentGateway() {
        return selectedPaymentGateway;
    }

    public void setSelectedPaymentGateway(SelectedPaymentGateway selectedPaymentGateway) {
        this.selectedPaymentGateway = selectedPaymentGateway;
    }

    public boolean isCancellationPolicyTermsAccepted() {
        return IsCancellationPolicyTermsAccepted;
    }

    public void setCancellationPolicyTermsAccepted(boolean cancellationPolicyTermsAccepted) {
        IsCancellationPolicyTermsAccepted = cancellationPolicyTermsAccepted;
    }

    public CouponModal getCouponModal() {
        return couponModal;
    }

    public void setCouponModal(CouponModal couponModal) {
        this.couponModal = couponModal;
    }

    public LoyaltyRedeemPoint getLoyaltyRedeemPoint() {
        return loyaltyRedeemPoint;
    }

    public void setLoyaltyRedeemPoint(LoyaltyRedeemPoint loyaltyRedeemPoint) {
        this.loyaltyRedeemPoint = loyaltyRedeemPoint;
    }

    public boolean isDisableCouponCode() {
        return isDisableCouponCode;
    }

    public void setDisableCouponCode(boolean disableCouponCode) {
        isDisableCouponCode = disableCouponCode;
    }

    public boolean isDisableRedeemPoint() {
        return isDisableRedeemPoint;
    }

    public void setDisableRedeemPoint(boolean disableRedeemPoint) {
        isDisableRedeemPoint = disableRedeemPoint;
    }

    public Object getAppDownloadCouponModal() {
        return appDownloadCouponModal;
    }

    public void setAppDownloadCouponModal(Object appDownloadCouponModal) {
        this.appDownloadCouponModal = appDownloadCouponModal;
    }

    public Object getOlpIdAlias() {
        return olpIdAlias;
    }

    public void setOlpIdAlias(Object olpIdAlias) {
        this.olpIdAlias = olpIdAlias;
    }

    public Object getCrediMaxSessionId() {
        return crediMaxSessionId;
    }

    public void setCrediMaxSessionId(Object crediMaxSessionId) {
        this.crediMaxSessionId = crediMaxSessionId;
    }

    public boolean isCommonMultiPayment() {
        return isCommonMultiPayment;
    }

    public void setCommonMultiPayment(boolean commonMultiPayment) {
        isCommonMultiPayment = commonMultiPayment;
    }

    public long getMultiPaymentItemCount() {
        return multiPaymentItemCount;
    }

    public void setMultiPaymentItemCount(long multiPaymentItemCount) {
        this.multiPaymentItemCount = multiPaymentItemCount;
    }

    public List<Object> getSavedCards() {
        return savedCards;
    }

    public void setSavedCards(List<Object> savedCards) {
        this.savedCards = savedCards;
    }

    public Object getBinNo() {
        return binNo;
    }

    public void setBinNo(Object binNo) {
        this.binNo = binNo;
    }

    public double getInstantServiceCharge() {
        return instantServiceCharge;
    }

    public void setInstantServiceCharge(double instantServiceCharge) {
        this.instantServiceCharge = instantServiceCharge;
    }

    public double getInstantMarkup() {
        return instantMarkup;
    }

    public void setInstantMarkup(double instantMarkup) {
        this.instantMarkup = instantMarkup;
    }

    public double getInstantDiscount() {
        return instantDiscount;
    }

    public void setInstantDiscount(double instantDiscount) {
        this.instantDiscount = instantDiscount;
    }

    public boolean isInvoiceOnly() {
        return isInvoiceOnly;
    }

    public void setInvoiceOnly(boolean invoiceOnly) {
        isInvoiceOnly = invoiceOnly;
    }

    public boolean isInvoiced() {
        return isInvoiced;
    }

    public void setInvoiced(boolean invoiced) {
        isInvoiced = invoiced;
    }

    public boolean isB2BtroughPG() {
        return isB2BtroughPG;
    }

    public void setB2BtroughPG(boolean b2BtroughPG) {
        isB2BtroughPG = b2BtroughPG;
    }

    public boolean isWhatsAppNotificationRequested() {
        return whatsAppNotificationRequested;
    }

    public void setWhatsAppNotificationRequested(boolean whatsAppNotificationRequested) {
        this.whatsAppNotificationRequested = whatsAppNotificationRequested;
    }

    public Object getKangarooReward() {
        return kangarooReward;
    }

    public void setKangarooReward(Object kangarooReward) {
        this.kangarooReward = kangarooReward;
    }

    public boolean isPaylater() {
        return isPaylater;
    }

    public void setPaylater(boolean paylater) {
        isPaylater = paylater;
    }

}
