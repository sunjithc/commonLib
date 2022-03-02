package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SelectedPaymentGateway implements Serializable {

    @SerializedName("IsTermsAndConditionAccepted")
    @Expose
    public boolean isTermsAndConditionAccepted;
    @SerializedName("SelectedPaymentGatewayId")
    @Expose
    public int selectedPaymentGatewayId;
    @SerializedName("PaymentGatewayCharge")
    @Expose
    public double paymentGatewayCharge;
    @SerializedName("Currency")
    @Expose
    public String currency;
    @SerializedName("IsCardPayment")
    @Expose
    public boolean isCardPayment;
    @SerializedName("CardToken")
    @Expose
    public Object cardToken;
    @SerializedName("CardID")
    @Expose
    public Object cardID;
    @SerializedName("CardCVV")
    @Expose
    public Object cardCVV;
    @SerializedName("CardAutoSave")
    @Expose
    public boolean cardAutoSave;
    @SerializedName("IsThirdParty")
    @Expose
    public boolean isThirdParty;


    public SelectedPaymentGateway() {

    }

    public boolean isTermsAndConditionAccepted() {
        return isTermsAndConditionAccepted;
    }

    public void setTermsAndConditionAccepted(boolean termsAndConditionAccepted) {
        isTermsAndConditionAccepted = termsAndConditionAccepted;
    }

    public int getSelectedPaymentGatewayId() {
        return selectedPaymentGatewayId;
    }

    public void setSelectedPaymentGatewayId(int selectedPaymentGatewayId) {
        this.selectedPaymentGatewayId = selectedPaymentGatewayId;
    }

    public double getPaymentGatewayCharge() {
        return paymentGatewayCharge;
    }

    public void setPaymentGatewayCharge(double paymentGatewayCharge) {
        this.paymentGatewayCharge = paymentGatewayCharge;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isCardPayment() {
        return isCardPayment;
    }

    public void setCardPayment(boolean cardPayment) {
        isCardPayment = cardPayment;
    }

    public Object getCardToken() {
        return cardToken;
    }

    public void setCardToken(Object cardToken) {
        this.cardToken = cardToken;
    }

    public Object getCardID() {
        return cardID;
    }

    public void setCardID(Object cardID) {
        this.cardID = cardID;
    }

    public Object getCardCVV() {
        return cardCVV;
    }

    public void setCardCVV(Object cardCVV) {
        this.cardCVV = cardCVV;
    }

    public boolean isCardAutoSave() {
        return cardAutoSave;
    }

    public void setCardAutoSave(boolean cardAutoSave) {
        this.cardAutoSave = cardAutoSave;
    }

    public boolean isThirdParty() {
        return isThirdParty;
    }

    public void setThirdParty(boolean thirdParty) {
        isThirdParty = thirdParty;
    }
}
