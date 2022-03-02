package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PackPaymentData {
    @SerializedName("SelectedPaymentId")
    @Expose
    private int selectedPaymentId;
    @SerializedName("PaymentInfos")
    @Expose
    private List<PaymentInfo> paymentInfos = null;
    @SerializedName("CardToken")
    @Expose
    private Object cardToken;
    @SerializedName("CardID")
    @Expose
    private Object cardID;
    @SerializedName("CardCVV")
    @Expose
    private Object cardCVV;
    @SerializedName("BinNo")
    @Expose
    private Object binNo;
    @SerializedName("CardAutoSave")
    @Expose
    private boolean cardAutoSave;
    @SerializedName("EnquiryOnly")
    @Expose
    private boolean enquiryOnly;

    public int getSelectedPaymentId() {
        return selectedPaymentId;
    }

    public void setSelectedPaymentId(int selectedPaymentId) {
        this.selectedPaymentId = selectedPaymentId;
    }

    public List<PaymentInfo> getPaymentInfos() {
        return paymentInfos;
    }

    public void setPaymentInfos(List<PaymentInfo> paymentInfos) {
        this.paymentInfos = paymentInfos;
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

    public Object getBinNo() {
        return binNo;
    }

    public void setBinNo(Object binNo) {
        this.binNo = binNo;
    }

    public boolean isCardAutoSave() {
        return cardAutoSave;
    }

    public void setCardAutoSave(boolean cardAutoSave) {
        this.cardAutoSave = cardAutoSave;
    }

    public boolean isEnquiryOnly() {
        return enquiryOnly;
    }

    public void setEnquiryOnly(boolean enquiryOnly) {
        this.enquiryOnly = enquiryOnly;
    }
}
