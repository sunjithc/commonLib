
package com.travel.commonlib.packages;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.HotelCancellationPolicy;
import com.travel.jumbo.model.packages.AvailabilityInfo;
import com.travel.jumbo.model.packages.FareChangeInfos;
import com.travel.jumbo.model.packages.ServiceChangeInfo;

import java.util.List;

public class RealTimeData {

    @SerializedName("AvailabilityInfos")
    @Expose
    private List<AvailabilityInfo> availabilityInfos = null;
    @SerializedName("FareChangeInfos")
    @Expose
    private List<FareChangeInfos> fareChangeInfos = null;
    @SerializedName("ServiceChangeInfos")
    @Expose
    private List<ServiceChangeInfo> serviceChangeInfos;
    @SerializedName("HotelCancellationPolicy")
    @Expose
    private List<HotelCancellationPolicy> hotelCancellationPolicies;

    public List<AvailabilityInfo> getAvailabilityInfos() {
        return availabilityInfos;
    }

    public void setAvailabilityInfos(List<AvailabilityInfo> availabilityInfos) {
        this.availabilityInfos = availabilityInfos;
    }

    public List<FareChangeInfos> getFareChangeInfos() {
        return fareChangeInfos;
    }

    public void setFareChangeInfos(List<FareChangeInfos> fareChangeInfos) {
        this.fareChangeInfos = fareChangeInfos;
    }

    public List<ServiceChangeInfo> getServiceChangeInfos() {
        return serviceChangeInfos;
    }

    public void setServiceChangeInfos(List<ServiceChangeInfo> serviceChangeInfos) {
        this.serviceChangeInfos = serviceChangeInfos;
    }

    public List<HotelCancellationPolicy> getHotelCancellationPolicies() {
        return hotelCancellationPolicies;
    }

    public void setHotelCancellationPolicies(List<HotelCancellationPolicy> hotelCancellationPolicies) {
        this.hotelCancellationPolicies = hotelCancellationPolicies;
    }
}
