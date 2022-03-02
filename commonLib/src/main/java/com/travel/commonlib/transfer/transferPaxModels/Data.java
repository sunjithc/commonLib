package com.travel.commonlib.transfer.transferPaxModels;//
//package com.travel.jumbo.Transfers.model.transferPaxModels;
//
//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//import com.travel.q_go.transfers.model.Address;
//import com.travel.q_go.transfers.model.Dropoffdetails;
//import com.travel.q_go.transfers.transferSupport.PassengerModel;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Data implements Serializable {
//
//    @SerializedName("pickupdetails")
//    @Expose
//    private Pickupdetails pickupdetails;
//    @SerializedName("dropoffdetails")
//    @Expose
//    private Dropoffdetails dropoffdetails;
//    @SerializedName("address")
//    @Expose
//    private Address address;
//    @SerializedName("contact")
//    @Expose
//    private contact contact;
//    @SerializedName("Isclicked")
//    @Expose
//    private Boolean isclicked;
//    @SerializedName("PassengerList")
//    @Expose
//    private ArrayList<PassengerModel> passengerList;
//    @SerializedName("TravelNum")
//    @Expose
//    private Object travelNum;
//    @SerializedName("TravelNum1")
//    @Expose
//    private Object travelNum1;
//    @SerializedName("PickupDateTime")
//    @Expose
//    private String pickupDateTime;
//    @SerializedName("ReturnDateTime")
//    @Expose
//    private String returnDateTime;
//    @SerializedName("HotelAddress")
//    @Expose
//    private String hotelAddress;
//    @SerializedName("TransferItemDetails")
//    @Expose
//    private TransferItemDetails selectedItemDetails;
//    @SerializedName("sessionkey")
//    @Expose
//    private String sessionkey;
//    @SerializedName("travellers")
//    @Expose
//    private ArrayList<Traveller> travellers = null;
//    @SerializedName("MobileCountryCodes")
//    @Expose
//    private ArrayList<MobileCountryCode> mobileCountryCodes = null;
//    @SerializedName("ohsFrom")
//    @Expose
//    private List<Object> ohsFrom = null;
//    @SerializedName("ohsto")
//    @Expose
//    private List<Object> ohsto = null;
//    @SerializedName("ohsupplement")
//    @Expose
//    private List<Object> ohsupplement = null;
//    @SerializedName("Isloggined")
//    @Expose
//    private Boolean isloggined;
//
//    public Object getPickupdetails() {
//        return pickupdetails;
//    }
//
//    public void setPickupdetails(Pickupdetails pickupdetails) {
//        this.pickupdetails = pickupdetails;
//    }
//
//    public Dropoffdetails getDropoffdetails() {
//        return dropoffdetails;
//    }
//
//    public void setDropoffdetails(Dropoffdetails dropoffdetails) {
//        this.dropoffdetails = dropoffdetails;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    public com.travel.q_go.transfers.transferSupport.transferPaxModels.contact getContact() {
//        return contact;
//    }
//
//    public void setContact(com.travel.q_go.transfers.transferSupport.transferPaxModels.contact contact) {
//        this.contact = contact;
//    }
//
//    public Boolean getIsclicked() {
//        return isclicked;
//    }
//
//    public void setIsclicked(Boolean isclicked) {
//        this.isclicked = isclicked;
//    }
//
//    public ArrayList<PassengerModel> getPassengerList() {
//        return passengerList;
//    }
//
//    public void setPassengerList(ArrayList<PassengerModel> passengerList) {
//        this.passengerList = passengerList;
//    }
//
//    public Object getTravelNum() {
//        return travelNum;
//    }
//
//    public void setTravelNum(Object travelNum) {
//        this.travelNum = travelNum;
//    }
//
//    public Object getTravelNum1() {
//        return travelNum1;
//    }
//
//    public void setTravelNum1(Object travelNum1) {
//        this.travelNum1 = travelNum1;
//    }
//
//    public String getPickupDateTime() {
//        return pickupDateTime;
//    }
//
//    public void setPickupDateTime(String pickupDateTime) {
//        this.pickupDateTime = pickupDateTime;
//    }
//
//    public String getReturnDateTime() {
//        return returnDateTime;
//    }
//
//    public void setReturnDateTime(String returnDateTime) {
//        this.returnDateTime = returnDateTime;
//    }
//
//    public String getHotelAddress() {
//        return hotelAddress;
//    }
//
//    public void setHotelAddress(String hotelAddress) {
//        this.hotelAddress = hotelAddress;
//    }
//
//    public TransferItemDetails getSelectedItemDetails() {
//        return selectedItemDetails;
//    }
//
//    public void setSelectedItemDetails(TransferItemDetails selectedItemDetails) {
//        this.selectedItemDetails = selectedItemDetails;
//    }
//
//    public String getSessionkey() {
//        return sessionkey;
//    }
//
//    public void setSessionkey(String sessionkey) {
//        this.sessionkey = sessionkey;
//    }
//
//    public ArrayList<Traveller> getTravellers() {
//        return travellers;
//    }
//
//    public void setTravellers(ArrayList<Traveller> travellers) {
//        this.travellers = travellers;
//    }
//
//    public ArrayList<MobileCountryCode> getMobileCountryCodes() {
//        return mobileCountryCodes;
//    }
//
//    public void setMobileCountryCodes(ArrayList<MobileCountryCode> mobileCountryCodes) {
//        this.mobileCountryCodes = mobileCountryCodes;
//    }
//
//    public List<Object> getOhsFrom() {
//        return ohsFrom;
//    }
//
//    public void setOhsFrom(List<Object> ohsFrom) {
//        this.ohsFrom = ohsFrom;
//    }
//
//    public List<Object> getOhsto() {
//        return ohsto;
//    }
//
//    public void setOhsto(List<Object> ohsto) {
//        this.ohsto = ohsto;
//    }
//
//    public List<Object> getOhsupplement() {
//        return ohsupplement;
//    }
//
//    public void setOhsupplement(List<Object> ohsupplement) {
//        this.ohsupplement = ohsupplement;
//    }
//
//    public Boolean getIsloggined() {
//        return isloggined;
//    }
//
//    public void setIsloggined(Boolean isloggined) {
//        this.isloggined = isloggined;
//    }
//}
