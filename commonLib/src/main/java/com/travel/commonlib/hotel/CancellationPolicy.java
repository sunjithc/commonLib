
package com.travel.commonlib.hotel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.hotel.CancellationPolicy_;

import java.io.Serializable;
import java.util.List;

public class CancellationPolicy implements Serializable {

    @SerializedName("LastPossibleCancellationDate")
    @Expose
    private String lastPossibleCancellationDate;
    @SerializedName("CancellationPolicy")
    @Expose
    private List<CancellationPolicy_> cancellationPolicy = null;
    @SerializedName("IsPolicyRefundable")
    @Expose
    private boolean isPolicyRefundable = false;
    @SerializedName("PolicyRefundableStatusUnknown")
    @Expose
    private boolean policyRefundableStatusUnknown = false;

    public String getLastPossibleCancellationDate() {
        return lastPossibleCancellationDate;
    }

    public void setLastPossibleCancellationDate(String lastPossibleCancellationDate) {
        this.lastPossibleCancellationDate = lastPossibleCancellationDate;
    }

    public List<CancellationPolicy_> getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(List<CancellationPolicy_> cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

}
