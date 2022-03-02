package com.travel.commonlib.hotel;

import java.util.Objects;

public class CancellationPolicyDuplicate {
    private double amount;
    private String value;
    private String tag;
    private boolean isManuelText;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isManuelText() {
        return isManuelText;
    }

    public void setManuelText(boolean manuelText) {
        isManuelText = manuelText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CancellationPolicyDuplicate that = (CancellationPolicyDuplicate) o;
        return Double.compare(that.amount, amount) == 0 &&
                Objects.equals(value, that.value) &&
                Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, value, tag);
    }
}
