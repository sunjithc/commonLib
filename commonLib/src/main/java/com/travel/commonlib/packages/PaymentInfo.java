
package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PaymentInfo {

    @SerializedName("PaymentId")
    @Expose
    private int paymentId;
    @SerializedName("PaymentName")
    @Expose
    private String paymentName;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("ServiceCharge")
    @Expose
    private double serviceCharge;
    @SerializedName("IsPercentage")
    @Expose
    private boolean isPercentage;
    @SerializedName("TimeOut")
    @Expose
    private long timeOut;
    @SerializedName("IsActive")
    @Expose
    private boolean isActive;
    @SerializedName("PaymentGateWayId")
    @Expose
    private long paymentGateWayId;
    @SerializedName("KfhUrl")
    @Expose
    private String kfhUrl;
    @SerializedName("ConvertionRatio")
    @Expose
    private long convertionRatio;
    @SerializedName("CheckoutPublicKey")
    @Expose
    private String checkoutPublicKey;
    @SerializedName("CardTypeBasedCharges")
    @Expose
    private List<Object> cardTypeBasedCharges = null;
    @SerializedName("IsThirdParty")
    @Expose
    private boolean isThirdParty;
    @SerializedName("IsDefault")
    @Expose
    private boolean isDefault;
    @SerializedName("CredimaxUrl")
    @Expose
    private String credimaxUrl;

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public boolean isIsPercentage() {
        return isPercentage;
    }

    public void setIsPercentage(boolean isPercentage) {
        this.isPercentage = isPercentage;
    }

    public long getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(long timeOut) {
        this.timeOut = timeOut;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public long getPaymentGateWayId() {
        return paymentGateWayId;
    }

    public void setPaymentGateWayId(long paymentGateWayId) {
        this.paymentGateWayId = paymentGateWayId;
    }

    public String getKfhUrl() {
        return kfhUrl;
    }

    public void setKfhUrl(String kfhUrl) {
        this.kfhUrl = kfhUrl;
    }

    public long getConvertionRatio() {
        return convertionRatio;
    }

    public void setConvertionRatio(long convertionRatio) {
        this.convertionRatio = convertionRatio;
    }

    public String getCheckoutPublicKey() {
        return checkoutPublicKey;
    }

    public void setCheckoutPublicKey(String checkoutPublicKey) {
        this.checkoutPublicKey = checkoutPublicKey;
    }

    public List<Object> getCardTypeBasedCharges() {
        return cardTypeBasedCharges;
    }

    public void setCardTypeBasedCharges(List<Object> cardTypeBasedCharges) {
        this.cardTypeBasedCharges = cardTypeBasedCharges;
    }

    public boolean isThirdParty() {
        return isThirdParty;
    }

    public void setThirdParty(boolean thirdParty) {
        isThirdParty = thirdParty;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public String getCredimaxUrl() {
        return credimaxUrl;
    }

    public void setCredimaxUrl(String credimaxUrl) {
        this.credimaxUrl = credimaxUrl;
    }
}
