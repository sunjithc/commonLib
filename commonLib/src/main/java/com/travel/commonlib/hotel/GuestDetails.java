package com.travel.commonlib.hotel;

import java.io.Serializable;

public class GuestDetails implements Serializable {

    private int AdultCount;
    private int ChildCount;
    private int Age1;
    private int Age2;
    public GuestDetails() {
        AdultCount = 1;
        ChildCount = 0;
        Age1 = 1;
        Age2 = 1;
    }

    public int getAdultCount() {
        return AdultCount;
    }

    public void setAdultCount(int adultCount) {
        AdultCount = adultCount;
    }

    public int getChildCount() {
        return ChildCount;
    }

    public void setChildCount(int childCount) {
        ChildCount = childCount;
    }

    public int getAge1() {
        return Age1;
    }

    public void setAge1(int age1) {
        Age1 = age1;
    }

    public int getAge2() {
        return Age2;
    }

    public void setAge2(int age2) {
        Age2 = age2;
    }
}
