
package com.travel.commonlib.transfer.transferPaxModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AvailablePaymentGateway implements Serializable
{

    @SerializedName("ConvertionRate")
    @Expose
    private Double convertionRate;
    @SerializedName("ServiceCharge")
    @Expose
    private Double serviceCharge;
    @SerializedName("IsPercentage")
    @Expose
    private Boolean isPercentage;
    @SerializedName("IsFlightExcluded")
    @Expose
    private Boolean isFlightExcluded;
    @SerializedName("PaymentGateWayId")
    @Expose
    private Integer paymentGateWayId;
    @SerializedName("FlightServiceCharge")
    @Expose
    private Double flightServiceCharge;
    @SerializedName("HotelServiceCharge")
    @Expose
    private Double hotelServiceCharge;
    @SerializedName("SportsServiceCharge")
    @Expose
    private Double sportsServiceCharge;
    @SerializedName("TimeOut")
    @Expose
    private Double timeOut;
    @SerializedName("FlightIsPercentage")
    @Expose
    private Boolean flightIsPercentage;
    @SerializedName("HotelIsPercentage")
    @Expose
    private Boolean hotelIsPercentage;
    @SerializedName("IsThirdParty")
    @Expose
    private boolean isThirdParty;

    public Double getConvertionRate() {
        return convertionRate;
    }

    public void setConvertionRate(Double convertionRate) {
        this.convertionRate = convertionRate;
    }

    public Double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public Boolean getPercentage() {
        return isPercentage;
    }

    public void setPercentage(Boolean percentage) {
        isPercentage = percentage;
    }

    public Boolean getFlightExcluded() {
        return isFlightExcluded;
    }

    public void setFlightExcluded(Boolean flightExcluded) {
        isFlightExcluded = flightExcluded;
    }

    public Integer getPaymentGateWayId() {
        return paymentGateWayId;
    }

    public void setPaymentGateWayId(Integer paymentGateWayId) {
        this.paymentGateWayId = paymentGateWayId;
    }

    public Double getFlightServiceCharge() {
        return flightServiceCharge;
    }

    public void setFlightServiceCharge(Double flightServiceCharge) {
        this.flightServiceCharge = flightServiceCharge;
    }

    public Double getHotelServiceCharge() {
        return hotelServiceCharge;
    }

    public void setHotelServiceCharge(Double hotelServiceCharge) {
        this.hotelServiceCharge = hotelServiceCharge;
    }

    public Double getSportsServiceCharge() {
        return sportsServiceCharge;
    }

    public void setSportsServiceCharge(Double sportsServiceCharge) {
        this.sportsServiceCharge = sportsServiceCharge;
    }

    public Double getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Double timeOut) {
        this.timeOut = timeOut;
    }

    public Boolean getFlightIsPercentage() {
        return flightIsPercentage;
    }

    public void setFlightIsPercentage(Boolean flightIsPercentage) {
        this.flightIsPercentage = flightIsPercentage;
    }

    public Boolean getHotelIsPercentage() {
        return hotelIsPercentage;
    }

    public void setHotelIsPercentage(Boolean hotelIsPercentage) {
        this.hotelIsPercentage = hotelIsPercentage;
    }

    public boolean isThirdParty() {
        return isThirdParty;
    }

    public void setThirdParty(boolean thirdParty) {
        isThirdParty = thirdParty;
    }
}
