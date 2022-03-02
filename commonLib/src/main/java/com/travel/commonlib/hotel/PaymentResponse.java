package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.InsuranceModel.Policy_Insurance;

import java.io.Serializable;

public class PaymentResponse implements Serializable {
    @SerializedName("SessionKey")
    @Expose
    private String sessionKey;
    @SerializedName("RequestInfo")
    @Expose
    private RequestInfo requestInfo;
    @SerializedName("SelectedHotel")
    @Expose
    private Hotel selectedHotel;
    @SerializedName("BookingAction")
    @Expose
    private String bookingAction;
    @SerializedName("FinalTotal")
    @Expose
    private double finalTotal;
    @SerializedName("PassengerModel")
    @Expose
    private PassengerModel passengerModel;
    @SerializedName("PaymentModel")
    @Expose
    private PaymentModel paymentModel;

    private double WhatsappCharge;
    @SerializedName("InsuranceBookingModel")
    @Expose
    private Policy_Insurance insuranceBookingModel;

//    protected PaymentResponse(Parcel in) {
//        sessionKey = in.readString();
//        bookingAction = in.readString();
//        requestInfo = in.readParcelable(RequestInfo.class.getClassLoader());
//        selectedHotel = in.readParcelable(Hotel.class.getClassLoader());
//        finalTotal = in.readDouble();
//        passengerModel = in.readParcelable(PassengerModel.class.getClassLoader());
//        paymentModel = in.readParcelable(PaymentModel.class.getClassLoader());
//    }

//    public static final Creator<PaymentResponse> CREATOR = new Creator<PaymentResponse>() {
//        @Override
//        public PaymentResponse createFromParcel(Parcel in) {
//            return new PaymentResponse(in);
//        }
//
//        @Override
//        public PaymentResponse[] newArray(int size) {
//            return new PaymentResponse[size];
//        }
//    };

    public double getWhatsappCharge() {
        return WhatsappCharge;
    }

    public void setWhatsappCharge(double whatsappCharge) {
        WhatsappCharge = whatsappCharge;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public Hotel getSelectedHotel() {
        return selectedHotel;
    }

    public void setSelectedHotel(Hotel selectedHotel) {
        this.selectedHotel = selectedHotel;
    }

    public String getBookingAction() {
        return bookingAction;
    }

    public void setBookingAction(String bookingAction) {
        this.bookingAction = bookingAction;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    public void setFinalTotal(double finalTotal) {
        this.finalTotal = finalTotal;
    }

    public PassengerModel getPassengerModel() {
        return passengerModel;
    }

    public void setPassengerModel(PassengerModel passengerModel) {
        this.passengerModel = passengerModel;
    }

    public PaymentModel getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(PaymentModel paymentModel) {
        this.paymentModel = paymentModel;
    }

    public Policy_Insurance getInsuranceBookingModel() {
        return insuranceBookingModel;
    }

    public void setInsuranceBookingModel(Policy_Insurance insuranceBookingModel) {
        this.insuranceBookingModel = insuranceBookingModel;
    }
    //    @Override
//    public int describeContents() {
//        return 0;
//    }

//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(sessionKey);
//        dest.writeString(bookingAction);
//        dest.writeParcelable(requestInfo, flags);
//        dest.writeParcelable(selectedHotel, flags);
//        dest.writeDouble(finalTotal);
//        dest.writeParcelable(passengerModel, flags);
//        dest.writeParcelable(paymentModel, flags);
//    }
}
