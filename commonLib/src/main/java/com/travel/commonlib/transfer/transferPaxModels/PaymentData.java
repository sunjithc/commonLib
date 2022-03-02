
package com.travel.commonlib.transfer.transferPaxModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.Transfers.model.transferPaxModels.AvailablePaymentGateway;

import java.io.Serializable;
import java.util.ArrayList;

public class PaymentData implements Serializable
{

    @SerializedName("TotalAmount")
    @Expose
    private Double totalAmount;
    @SerializedName("TotalBoardingFee")
    @Expose
    private Double totalBoardingFee;
    @SerializedName("TotalAmountInBaseCurrency")
    @Expose
    private Integer totalAmountInBaseCurrency;
    @SerializedName("BaseFare")
    @Expose
    private Double baseFare;
    @SerializedName("PaxCount")
    @Expose
    private Integer paxCount;
    @SerializedName("ServiceCharge")
    @Expose
    private Double serviceCharge;
    @SerializedName("RoomCount")
    @Expose
    private Integer roomCount;
    @SerializedName("Currency")
    @Expose
    private String currency;
    @SerializedName("DecimalPoint")
    @Expose
    private Integer decimalPoint;
    @SerializedName("PaymentGateway")
    @Expose
    private String paymentGateway;
    @SerializedName("PaymentGatewayType")
    @Expose
    private Object paymentGatewayType;
    @SerializedName("IsMigsPaymentGatewayActive")
    @Expose
    private Boolean isMigsPaymentGatewayActive;
    @SerializedName("IsPayTabsPaymentGatewayActive")
    @Expose
    private Boolean isPayTabsPaymentGatewayActive;
    @SerializedName("IsPaymentAtHomeActive")
    @Expose
    private Boolean isPaymentAtHomeActive;
    @SerializedName("IsPaymentAtStoreActive")
    @Expose
    private Boolean isPaymentAtStoreActive;
    @SerializedName("TnCChecked")
    @Expose
    private Boolean tnCChecked;
    @SerializedName("TapPaymentToken")
    @Expose
    private Object tapPaymentToken;
    @SerializedName("IsInsurance")
    @Expose
    private Boolean isInsurance;
    @SerializedName("faresummary")
    @Expose
    private Object faresummary;
    @SerializedName("trainfaresummary")
    @Expose
    private Object trainfaresummary;
    @SerializedName("AvailablePaymentGateways")
    @Expose
    private ArrayList<AvailablePaymentGateway> availablePaymentGateways = null;
    @SerializedName("IsCashOnDeliveryActive")
    @Expose
    private Boolean isCashOnDeliveryActive;
    @SerializedName("IsCashOnDelivery")
    @Expose
    private Boolean isCashOnDelivery;
    @SerializedName("IsInvoiceActive")
    @Expose
    private Boolean isInvoiceActive;
    @SerializedName("IsInvoice")
    @Expose
    private Boolean isInvoice;
    @SerializedName("CashOnDeliveryTimeTable")
    @Expose
    private Object cashOnDeliveryTimeTable;
    @SerializedName("CashOnDeliveryInfo")
    @Expose
    private Object cashOnDeliveryInfo;
    @SerializedName("CodServiceList")
    @Expose
    private Object codServiceList;
    @SerializedName("CodServiceListApps")
    @Expose
    private Object codServiceListApps;
    @SerializedName("CompanyGenQuoteDetailsModel")
    @Expose
    private Object companyGenQuoteDetailsModel;
    @SerializedName("CompanyGenQuoteForHotel")
    @Expose
    private Object companyGenQuoteForHotel;
    @SerializedName("CompanyGenQuoteForTrain")
    @Expose
    private Object companyGenQuoteForTrain;
    @SerializedName("KentCharge")
    @Expose
    private Integer kentCharge;
    @SerializedName("MigsCharge")
    @Expose
    private Integer migsCharge;
    @SerializedName("PayTabsCharge")
    @Expose
    private Integer payTabsCharge;
    @SerializedName("CashUCharge")
    @Expose
    private Integer cashUCharge;
    @SerializedName("IsFlightExcluded")
    @Expose
    private Boolean isFlightExcluded;
    @SerializedName("NeedInsurance")
    @Expose
    private Boolean needInsurance;
    @SerializedName("NeedVisa")
    @Expose
    private Boolean needVisa;
    @SerializedName("ApiId")
    @Expose
    private Integer apiId;
    @SerializedName("InsuranceAmount")
    @Expose
    private Integer insuranceAmount;
    @SerializedName("CardDetails")
    @Expose
    private Object cardDetails;
    @SerializedName("ConversionRate")
    @Expose
    private Integer conversionRate;
    @SerializedName("Address1")
    @Expose
    private Object address1;
    @SerializedName("Address2")
    @Expose
    private Object address2;
    @SerializedName("CreditCardDurationMessage")
    @Expose
    private Object creditCardDurationMessage;
    @SerializedName("RedeemPoint")
    @Expose
    private Integer redeemPoint;
    @SerializedName("IsRedeemPoint")
    @Expose
    private Boolean isRedeemPoint;
    @SerializedName("ReferralRedeemPoint")
    @Expose
    private Integer referralRedeemPoint;
    @SerializedName("IsReferralRedeemPoint")
    @Expose
    private Boolean isReferralRedeemPoint;
    @SerializedName("IsPaymentHasPaxInfo")
    @Expose
    private Boolean isPaymentHasPaxInfo;
    @SerializedName("Is3rdPartyBooking")
    @Expose
    private Boolean is3rdPartyBooking;
    @SerializedName("ModalityId")
    @Expose
    private Object modalityId;
    @SerializedName("instantServiceCharge")
    @Expose
    private Integer instantServiceCharge;
    @SerializedName("instantDiscount")
    @Expose
    private Integer instantDiscount;
    @SerializedName("Amountstatus")
    @Expose
    private Boolean amountstatus;
    @SerializedName("Amount")
    @Expose
    private Double amount;
    @SerializedName("ExtraAmount")
    @Expose
    private Integer extraAmount;
    @SerializedName("sessionkey")
    @Expose
    private String sessionkey;
    private final static long serialVersionUID = -1426133779591729495L;

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalAmountInBaseCurrency() {
        return totalAmountInBaseCurrency;
    }

    public void setTotalAmountInBaseCurrency(Integer totalAmountInBaseCurrency) {
        this.totalAmountInBaseCurrency = totalAmountInBaseCurrency;
    }

    public Double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(Double baseFare) {
        this.baseFare = baseFare;
    }

    public Integer getPaxCount() {
        return paxCount;
    }

    public void setPaxCount(Integer paxCount) {
        this.paxCount = paxCount;
    }

    public Double getTotalBoardingFee() {
        return totalBoardingFee;
    }

    public void setTotalBoardingFee(Double totalBoardingFee) {
        this.totalBoardingFee = totalBoardingFee;
    }

    public Double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Boolean getMigsPaymentGatewayActive() {
        return isMigsPaymentGatewayActive;
    }

    public void setMigsPaymentGatewayActive(Boolean migsPaymentGatewayActive) {
        isMigsPaymentGatewayActive = migsPaymentGatewayActive;
    }

    public Boolean getPayTabsPaymentGatewayActive() {
        return isPayTabsPaymentGatewayActive;
    }

    public void setPayTabsPaymentGatewayActive(Boolean payTabsPaymentGatewayActive) {
        isPayTabsPaymentGatewayActive = payTabsPaymentGatewayActive;
    }

    public Boolean getPaymentAtHomeActive() {
        return isPaymentAtHomeActive;
    }

    public void setPaymentAtHomeActive(Boolean paymentAtHomeActive) {
        isPaymentAtHomeActive = paymentAtHomeActive;
    }

    public Boolean getPaymentAtStoreActive() {
        return isPaymentAtStoreActive;
    }

    public void setPaymentAtStoreActive(Boolean paymentAtStoreActive) {
        isPaymentAtStoreActive = paymentAtStoreActive;
    }

    public Boolean getInsurance() {
        return isInsurance;
    }

    public void setInsurance(Boolean insurance) {
        isInsurance = insurance;
    }

    public Boolean getCashOnDeliveryActive() {
        return isCashOnDeliveryActive;
    }

    public void setCashOnDeliveryActive(Boolean cashOnDeliveryActive) {
        isCashOnDeliveryActive = cashOnDeliveryActive;
    }

    public Boolean getCashOnDelivery() {
        return isCashOnDelivery;
    }

    public void setCashOnDelivery(Boolean cashOnDelivery) {
        isCashOnDelivery = cashOnDelivery;
    }

    public Boolean getInvoiceActive() {
        return isInvoiceActive;
    }

    public void setInvoiceActive(Boolean invoiceActive) {
        isInvoiceActive = invoiceActive;
    }

    public Boolean getInvoice() {
        return isInvoice;
    }

    public void setInvoice(Boolean invoice) {
        isInvoice = invoice;
    }

    public Boolean getFlightExcluded() {
        return isFlightExcluded;
    }

    public void setFlightExcluded(Boolean flightExcluded) {
        isFlightExcluded = flightExcluded;
    }

    public void setRedeemPoint(Boolean redeemPoint) {
        isRedeemPoint = redeemPoint;
    }

    public void setReferralRedeemPoint(Boolean referralRedeemPoint) {
        isReferralRedeemPoint = referralRedeemPoint;
    }

    public Boolean getPaymentHasPaxInfo() {
        return isPaymentHasPaxInfo;
    }

    public void setPaymentHasPaxInfo(Boolean paymentHasPaxInfo) {
        isPaymentHasPaxInfo = paymentHasPaxInfo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getDecimalPoint() {
        return decimalPoint;
    }

    public void setDecimalPoint(Integer decimalPoint) {
        this.decimalPoint = decimalPoint;
    }

    public String getPaymentGateway() {
        return paymentGateway;
    }

    public void setPaymentGateway(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public Object getPaymentGatewayType() {
        return paymentGatewayType;
    }

    public void setPaymentGatewayType(Object paymentGatewayType) {
        this.paymentGatewayType = paymentGatewayType;
    }

    public Boolean getIsMigsPaymentGatewayActive() {
        return isMigsPaymentGatewayActive;
    }

    public void setIsMigsPaymentGatewayActive(Boolean isMigsPaymentGatewayActive) {
        this.isMigsPaymentGatewayActive = isMigsPaymentGatewayActive;
    }

    public Boolean getIsPayTabsPaymentGatewayActive() {
        return isPayTabsPaymentGatewayActive;
    }

    public void setIsPayTabsPaymentGatewayActive(Boolean isPayTabsPaymentGatewayActive) {
        this.isPayTabsPaymentGatewayActive = isPayTabsPaymentGatewayActive;
    }

    public Boolean getIsPaymentAtHomeActive() {
        return isPaymentAtHomeActive;
    }

    public void setIsPaymentAtHomeActive(Boolean isPaymentAtHomeActive) {
        this.isPaymentAtHomeActive = isPaymentAtHomeActive;
    }

    public Boolean getIsPaymentAtStoreActive() {
        return isPaymentAtStoreActive;
    }

    public void setIsPaymentAtStoreActive(Boolean isPaymentAtStoreActive) {
        this.isPaymentAtStoreActive = isPaymentAtStoreActive;
    }

    public Boolean getTnCChecked() {
        return tnCChecked;
    }

    public void setTnCChecked(Boolean tnCChecked) {
        this.tnCChecked = tnCChecked;
    }

    public Object getTapPaymentToken() {
        return tapPaymentToken;
    }

    public void setTapPaymentToken(Object tapPaymentToken) {
        this.tapPaymentToken = tapPaymentToken;
    }

    public Boolean getIsInsurance() {
        return isInsurance;
    }

    public void setIsInsurance(Boolean isInsurance) {
        this.isInsurance = isInsurance;
    }

    public Object getFaresummary() {
        return faresummary;
    }

    public void setFaresummary(Object faresummary) {
        this.faresummary = faresummary;
    }

    public Object getTrainfaresummary() {
        return trainfaresummary;
    }

    public void setTrainfaresummary(Object trainfaresummary) {
        this.trainfaresummary = trainfaresummary;
    }

    public ArrayList<AvailablePaymentGateway> getAvailablePaymentGateways() {
        return availablePaymentGateways;
    }

    public void setAvailablePaymentGateways(ArrayList<AvailablePaymentGateway> availablePaymentGateways) {
        this.availablePaymentGateways = availablePaymentGateways;
    }

    public Boolean getIsCashOnDeliveryActive() {
        return isCashOnDeliveryActive;
    }

    public void setIsCashOnDeliveryActive(Boolean isCashOnDeliveryActive) {
        this.isCashOnDeliveryActive = isCashOnDeliveryActive;
    }

    public Boolean getIsCashOnDelivery() {
        return isCashOnDelivery;
    }

    public void setIsCashOnDelivery(Boolean isCashOnDelivery) {
        this.isCashOnDelivery = isCashOnDelivery;
    }

    public Boolean getIsInvoiceActive() {
        return isInvoiceActive;
    }

    public void setIsInvoiceActive(Boolean isInvoiceActive) {
        this.isInvoiceActive = isInvoiceActive;
    }

    public Boolean getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
    }

    public Object getCashOnDeliveryTimeTable() {
        return cashOnDeliveryTimeTable;
    }

    public void setCashOnDeliveryTimeTable(Object cashOnDeliveryTimeTable) {
        this.cashOnDeliveryTimeTable = cashOnDeliveryTimeTable;
    }

    public Object getCashOnDeliveryInfo() {
        return cashOnDeliveryInfo;
    }

    public void setCashOnDeliveryInfo(Object cashOnDeliveryInfo) {
        this.cashOnDeliveryInfo = cashOnDeliveryInfo;
    }

    public Object getCodServiceList() {
        return codServiceList;
    }

    public void setCodServiceList(Object codServiceList) {
        this.codServiceList = codServiceList;
    }

    public Object getCodServiceListApps() {
        return codServiceListApps;
    }

    public void setCodServiceListApps(Object codServiceListApps) {
        this.codServiceListApps = codServiceListApps;
    }

    public Object getCompanyGenQuoteDetailsModel() {
        return companyGenQuoteDetailsModel;
    }

    public void setCompanyGenQuoteDetailsModel(Object companyGenQuoteDetailsModel) {
        this.companyGenQuoteDetailsModel = companyGenQuoteDetailsModel;
    }

    public Object getCompanyGenQuoteForHotel() {
        return companyGenQuoteForHotel;
    }

    public void setCompanyGenQuoteForHotel(Object companyGenQuoteForHotel) {
        this.companyGenQuoteForHotel = companyGenQuoteForHotel;
    }

    public Object getCompanyGenQuoteForTrain() {
        return companyGenQuoteForTrain;
    }

    public void setCompanyGenQuoteForTrain(Object companyGenQuoteForTrain) {
        this.companyGenQuoteForTrain = companyGenQuoteForTrain;
    }

    public Integer getKentCharge() {
        return kentCharge;
    }

    public void setKentCharge(Integer kentCharge) {
        this.kentCharge = kentCharge;
    }

    public Integer getMigsCharge() {
        return migsCharge;
    }

    public void setMigsCharge(Integer migsCharge) {
        this.migsCharge = migsCharge;
    }

    public Integer getPayTabsCharge() {
        return payTabsCharge;
    }

    public void setPayTabsCharge(Integer payTabsCharge) {
        this.payTabsCharge = payTabsCharge;
    }

    public Integer getCashUCharge() {
        return cashUCharge;
    }

    public void setCashUCharge(Integer cashUCharge) {
        this.cashUCharge = cashUCharge;
    }

    public Boolean getIsFlightExcluded() {
        return isFlightExcluded;
    }

    public void setIsFlightExcluded(Boolean isFlightExcluded) {
        this.isFlightExcluded = isFlightExcluded;
    }

    public Boolean getNeedInsurance() {
        return needInsurance;
    }

    public void setNeedInsurance(Boolean needInsurance) {
        this.needInsurance = needInsurance;
    }

    public Boolean getNeedVisa() {
        return needVisa;
    }

    public void setNeedVisa(Boolean needVisa) {
        this.needVisa = needVisa;
    }

    public Integer getApiId() {
        return apiId;
    }

    public void setApiId(Integer apiId) {
        this.apiId = apiId;
    }

    public Integer getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(Integer insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Object getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(Object cardDetails) {
        this.cardDetails = cardDetails;
    }

    public Integer getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Integer conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Object getAddress1() {
        return address1;
    }

    public void setAddress1(Object address1) {
        this.address1 = address1;
    }

    public Object getAddress2() {
        return address2;
    }

    public void setAddress2(Object address2) {
        this.address2 = address2;
    }

    public Object getCreditCardDurationMessage() {
        return creditCardDurationMessage;
    }

    public void setCreditCardDurationMessage(Object creditCardDurationMessage) {
        this.creditCardDurationMessage = creditCardDurationMessage;
    }

    public Integer getRedeemPoint() {
        return redeemPoint;
    }

    public void setRedeemPoint(Integer redeemPoint) {
        this.redeemPoint = redeemPoint;
    }

    public Boolean getIsRedeemPoint() {
        return isRedeemPoint;
    }

    public void setIsRedeemPoint(Boolean isRedeemPoint) {
        this.isRedeemPoint = isRedeemPoint;
    }

    public Integer getReferralRedeemPoint() {
        return referralRedeemPoint;
    }

    public void setReferralRedeemPoint(Integer referralRedeemPoint) {
        this.referralRedeemPoint = referralRedeemPoint;
    }

    public Boolean getIsReferralRedeemPoint() {
        return isReferralRedeemPoint;
    }

    public void setIsReferralRedeemPoint(Boolean isReferralRedeemPoint) {
        this.isReferralRedeemPoint = isReferralRedeemPoint;
    }

    public Boolean getIsPaymentHasPaxInfo() {
        return isPaymentHasPaxInfo;
    }

    public void setIsPaymentHasPaxInfo(Boolean isPaymentHasPaxInfo) {
        this.isPaymentHasPaxInfo = isPaymentHasPaxInfo;
    }

    public Boolean getIs3rdPartyBooking() {
        return is3rdPartyBooking;
    }

    public void setIs3rdPartyBooking(Boolean is3rdPartyBooking) {
        this.is3rdPartyBooking = is3rdPartyBooking;
    }

    public Object getModalityId() {
        return modalityId;
    }

    public void setModalityId(Object modalityId) {
        this.modalityId = modalityId;
    }

    public Integer getInstantServiceCharge() {
        return instantServiceCharge;
    }

    public void setInstantServiceCharge(Integer instantServiceCharge) {
        this.instantServiceCharge = instantServiceCharge;
    }

    public Integer getInstantDiscount() {
        return instantDiscount;
    }

    public void setInstantDiscount(Integer instantDiscount) {
        this.instantDiscount = instantDiscount;
    }

    public Boolean getAmountstatus() {
        return amountstatus;
    }

    public void setAmountstatus(Boolean amountstatus) {
        this.amountstatus = amountstatus;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getExtraAmount() {
        return extraAmount;
    }

    public void setExtraAmount(Integer extraAmount) {
        this.extraAmount = extraAmount;
    }

    public String getSessionkey() {
        return sessionkey;
    }

    public void setSessionkey(String sessionkey) {
        this.sessionkey = sessionkey;
    }

}
