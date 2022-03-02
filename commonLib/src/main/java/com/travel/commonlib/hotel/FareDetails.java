
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.List;

public class FareDetails implements Serializable {

    @SerializedName("BaseFare")
    @Nullable
    @Expose
    private double baseFare;
    @SerializedName("Currency")
    @Expose
    @Nullable
    private String currency;
    @SerializedName("Price")
    @Nullable
    @Expose
    private double price;
    @SerializedName("ServiceCharge")
    @Expose
    @Nullable
    private double serviceCharge;
    @SerializedName("Discount")
    @Expose
    private double discount;
    @SerializedName("DecimalPoints")
    @Expose
    private long decimalPoints;
    @SerializedName("ActualFare")
    @Expose
    private double actualFare;
    @SerializedName("ActualCurrency")
    @Expose
    private String actualCurrency;
    @SerializedName("ActualSupplierTotal")
    @Expose
    private double actualSupplierTotal;
    @SerializedName("ActualDecimal")
    @Expose
    private long actualDecimal;
    @SerializedName("ConvertionRate")
    @Expose
    private double convertionRate;
    @SerializedName("PerNightPrice")
    @Expose
    private double perNightPrice;
    @SerializedName("ProviderBasePrice")
    @Expose
    private double providerBasePrice;
    @SerializedName("ProviderTax")
    @Expose
    private double providerTax;
    @SerializedName("Fees")
    @Expose
    private List<Fee> fees = null;
    @SerializedName("Taxes")
    @Expose
    private List<Tax> taxes = null;
    @SerializedName("GstVatCharges")
    @Expose
    private double gstVatCharges;

    @SerializedName("RoomPriceList")
    @Expose
    public Object roomPriceList;
    @SerializedName("BookedCurrency")
    @Expose
    public Object bookedCurrency;
    @SerializedName("GstTaxId")
    @Expose
    public long gstTaxId;


    @Nullable
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(@Nullable String currency) {
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public long getDecimalPoints() {
        return decimalPoints;
    }

    public void setDecimalPoints(long decimalPoints) {
        this.decimalPoints = decimalPoints;
    }

    public double getActualFare() {
        return actualFare;
    }

    public void setActualFare(double actualFare) {
        this.actualFare = actualFare;
    }

    public String getActualCurrency() {
        return actualCurrency;
    }

    public void setActualCurrency(String actualCurrency) {
        this.actualCurrency = actualCurrency;
    }

    public double getActualSupplierTotal() {
        return actualSupplierTotal;
    }

    public void setActualSupplierTotal(double actualSupplierTotal) {
        this.actualSupplierTotal = actualSupplierTotal;
    }

    public long getActualDecimal() {
        return actualDecimal;
    }

    public void setActualDecimal(long actualDecimal) {
        this.actualDecimal = actualDecimal;
    }

    public double getConvertionRate() {
        return convertionRate;
    }

    public void setConvertionRate(double convertionRate) {
        this.convertionRate = convertionRate;
    }

    public double getPerNightPrice() {
        return perNightPrice;
    }

    public void setPerNightPrice(double perNightPrice) {
        this.perNightPrice = perNightPrice;
    }

    public double getProviderBasePrice() {
        return providerBasePrice;
    }

    public void setProviderBasePrice(double providerBasePrice) {
        this.providerBasePrice = providerBasePrice;
    }

    public double getProviderTax() {
        return providerTax;
    }

    public void setProviderTax(double providerTax) {
        this.providerTax = providerTax;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    public double getGstVatCharges() {
        return gstVatCharges;
    }

    public void setGstVatCharges(double gstVatCharges) {
        this.gstVatCharges = gstVatCharges;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        this.baseFare = baseFare;
    }

    public Object getRoomPriceList() {
        return roomPriceList;
    }

    public void setRoomPriceList(Object roomPriceList) {
        this.roomPriceList = roomPriceList;
    }

    public Object getBookedCurrency() {
        return bookedCurrency;
    }

    public void setBookedCurrency(Object bookedCurrency) {
        this.bookedCurrency = bookedCurrency;
    }

    public long getGstTaxId() {
        return gstTaxId;
    }

    public void setGstTaxId(long gstTaxId) {
        this.gstTaxId = gstTaxId;
    }
}
