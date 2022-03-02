
package com.travel.commonlib.transfer.transferPaxModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MobileCountryCode implements Serializable {

    @SerializedName("CountryId")
    @Expose
    private Integer countryId;
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
    @SerializedName("Ranking")
    @Expose
    private Integer ranking;
    @SerializedName("MobileCodeArabic")
    @Expose
    private String mobileCodeArabic;
    @SerializedName("culture")
    @Expose
    private Integer culture;
    @SerializedName("CountryFormat")
    @Expose
    private Integer countryFormat;
    @SerializedName("CountryCodeFormat")
    @Expose
    private Integer countryCodeFormat;
    @SerializedName("CountrynameFormatted")
    @Expose
    private String countrynameFormatted;
    @SerializedName("CountryCodeFormatted")
    @Expose
    private String countryCodeFormatted;
    @SerializedName("CountryNumber")
    @Expose
    private Object countryNumber;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
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

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getMobileCodeArabic() {
        return mobileCodeArabic;
    }

    public void setMobileCodeArabic(String mobileCodeArabic) {
        this.mobileCodeArabic = mobileCodeArabic;
    }

    public Integer getCulture() {
        return culture;
    }

    public void setCulture(Integer culture) {
        this.culture = culture;
    }

    public Integer getCountryFormat() {
        return countryFormat;
    }

    public void setCountryFormat(Integer countryFormat) {
        this.countryFormat = countryFormat;
    }

    public Integer getCountryCodeFormat() {
        return countryCodeFormat;
    }

    public void setCountryCodeFormat(Integer countryCodeFormat) {
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
