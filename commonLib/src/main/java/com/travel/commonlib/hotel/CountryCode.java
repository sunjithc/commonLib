package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CountryCode implements Serializable {

    @SerializedName("CountryId")
    @Expose
    private long countryId;
    @SerializedName("CountryName")
    @Expose
    private String countryName;
    @SerializedName("CountryNameArabic")
    @Expose
    private String countryNameArabic;
    @SerializedName("CountryCode")
    @Expose
    private String countryCode;
    @SerializedName("MobileCode")
    @Expose
    private String mobileCode;
    @SerializedName("CurrencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("IsdCode")
    @Expose
    private String isdCode;
    @SerializedName("MobileCodeArabic")
    @Expose
    private String mobileCodeArabic;
    @SerializedName("culture")
    @Expose
    private long culture;
    @SerializedName("CountryFormat")
    @Expose
    private long countryFormat;
    @SerializedName("CountryCodeFormat")
    @Expose
    private long countryCodeFormat;
    @SerializedName("CountrynameFormatted")
    @Expose
    private String countrynameFormatted;
    @SerializedName("CountryCodeFormatted")
    @Expose
    private String countryCodeFormatted;
    @SerializedName("CountryNumber")
    @Expose
    private Object countryNumber;

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryNameArabic() {
        return countryNameArabic;
    }

    public void setCountryNameArabic(String countryNameArabic) {
        this.countryNameArabic = countryNameArabic;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMobileCode() {
        return mobileCode;
    }

    public void setMobileCode(String mobileCode) {
        this.mobileCode = mobileCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getIsdCode() {
        return isdCode;
    }

    public void setIsdCode(String isdCode) {
        this.isdCode = isdCode;
    }

    public String getMobileCodeArabic() {
        return mobileCodeArabic;
    }

    public void setMobileCodeArabic(String mobileCodeArabic) {
        this.mobileCodeArabic = mobileCodeArabic;
    }

    public long getCulture() {
        return culture;
    }

    public void setCulture(long culture) {
        this.culture = culture;
    }

    public long getCountryFormat() {
        return countryFormat;
    }

    public void setCountryFormat(long countryFormat) {
        this.countryFormat = countryFormat;
    }

    public long getCountryCodeFormat() {
        return countryCodeFormat;
    }

    public void setCountryCodeFormat(long countryCodeFormat) {
        this.countryCodeFormat = countryCodeFormat;
    }

    public String getCountrynameFormatted() {
        return countrynameFormatted;
    }

    public void setCountrynameFormatted(String countrynameFormatted) {
        this.countrynameFormatted = countrynameFormatted;
    }

    public String getCountryCodeFormatted() {
        return countryCodeFormatted;
    }

    public void setCountryCodeFormatted(String countryCodeFormatted) {
        this.countryCodeFormatted = countryCodeFormatted;
    }

    public Object getCountryNumber() {
        return countryNumber;
    }

    public void setCountryNumber(Object countryNumber) {
        this.countryNumber = countryNumber;
    }

}
