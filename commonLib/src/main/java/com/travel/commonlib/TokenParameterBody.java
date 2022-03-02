package com.travel.commonlib;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TokenParameterBody {
    @SerializedName("Device")
    @Expose
    private String Device;
    @SerializedName("IPAddress")
    @Expose
    private String IPAddress;
    @SerializedName("AffiliateID")
    @Expose
    private String AffiliateID;
    @SerializedName("Securitykey")
    @Expose
    private String Securitykey;

    public String getDevice() {
        return Device;
    }

    public void setDevice(String device) {
        Device = device;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getAffiliateID() {
        return AffiliateID;
    }

    public void setAffiliateID(String affiliateID) {
        AffiliateID = affiliateID;
    }

    public String getSecuritykey() {
        return Securitykey;
    }

    public void setSecuritykey(String securitykey) {
        Securitykey = securitykey;
    }


}
