package com.travel.commonlib.packages;


import com.travel.jumbo.model.hotel.GuestDetails;
import com.travel.jumbo.utilities.CommonFunctions;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class PackageSearchModel implements Serializable {


    private String depAirPortCode;
    private String depAirPortName;
    private String depAirPortNameAr;
    private String retAirPortCode;
    private String retAirPortName;
    private String retAirPortNameAr;

    private String nationality;
    private String nationalityCode;
    private String countryOfResidence;
    private String countryOfResidenceCode;
    private Date checkIn, checkOut, depDate, retDate;
    private Date minCheckIn, minCheckOut, maxCheckIn, maxCheckOut;
    private Date minDeparture, minReturn, maxDeparture, maxReturn;
    public int roomCount;
    public String depClass = "Economy";
    public String retClass = "Economy";
    public boolean isDirect = false;

    public HashMap<Integer, GuestDetails> guestDetailsList;
    private List<Integer> apiList;

    public PackageSearchModel() {
        nationality = "";
        roomCount = 1;
        guestDetailsList = new HashMap<>();
        guestDetailsList.put(0, new GuestDetails());

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 312);
        maxDeparture = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        maxReturn = cal.getTime();

        // to set next day
        cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 0);
        minDeparture = cal.getTime();
        depDate = cal.getTime();

        cal.add(Calendar.DAY_OF_YEAR, 1);
        minReturn = cal.getTime();
        retDate = cal.getTime();

        minCheckIn = minDeparture;
        maxCheckIn = minDeparture;
        checkIn = depDate;

        checkOut = retDate;
        setHotelMaxDates();
    }

    private void setHotelMaxDates() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(retDate);
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        maxCheckOut = calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR, -1);
        maxCheckIn = calendar.getTime();
    }

    public String getDepAirPortCode() {
        return depAirPortCode;
    }

    public void setDepAirPortCode(String depAirPortCode) {
        this.depAirPortCode = depAirPortCode;
    }

    public String getDepAirPortName() {
        return depAirPortName;
    }

    public void setDepAirPortName(String depAirPortName) {
        this.depAirPortName = depAirPortName;
    }

    public String getDepAirPortNameAr() {
        return depAirPortNameAr;
    }

    public void setDepAirPortNameAr(String depAirPortNameAr) {
        this.depAirPortNameAr = depAirPortNameAr;
    }

    public String getRetAirPortCode() {
        return retAirPortCode;
    }

    public void setRetAirPortCode(String retAirPortCode) {
        this.retAirPortCode = retAirPortCode;
    }

    public String getRetAirPortName() {
        return retAirPortName;
    }

    public void setRetAirPortName(String retAirPortName) {
        this.retAirPortName = retAirPortName;
    }

    public String getRetAirPortNameAr() {
        return retAirPortNameAr;
    }

    public void setRetAirPortNameAr(String retAirPortNameAr) {
        this.retAirPortNameAr = retAirPortNameAr;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getCountryOfResidenceCode() {
        return countryOfResidenceCode;
    }

    public void setCountryOfResidenceCode(String countryOfResidenceCode) {
        this.countryOfResidenceCode = countryOfResidenceCode;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;

        Calendar cal = Calendar.getInstance();
        cal.setTime(checkIn);
        cal.add(Calendar.DAY_OF_YEAR, 1);

        if (!cal.getTime().after(retDate)) {
            minCheckOut = cal.getTime();
            checkOut = cal.getTime();
//            cal.setTime(maxCheckOut);
//            cal.add(Calendar.DAY_OF_YEAR, -1);
            maxCheckIn = retDate;

            cal.setTime(retDate);
            cal.add(Calendar.DAY_OF_YEAR, 1);
            maxCheckOut = cal.getTime();
        }
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Date getMinCheckIn() {
        return minCheckIn;
    }

    public void setMinCheckIn(Date minCheckIn) {
        this.minCheckIn = minCheckIn;
    }

    public Date getMinCheckOut() {
        return minCheckOut;
    }

    public Date getMaxCheckIn() {
        return maxCheckIn;
    }

    public Date getMaxCheckOut() {
        return maxCheckOut;
    }

    public String getCheckInDate() {
        return CommonFunctions.gettimeformat(checkIn);
    }

    public String getCheckOutDate() {
        return CommonFunctions.gettimeformat(checkOut);
    }


    public Date getDepDate() {
        return depDate;
    }

    public void setDepDate(Date depDate) {
        this.depDate = depDate;

        Calendar cal = Calendar.getInstance();
        cal.setTime(depDate);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        retDate = cal.getTime();

        checkIn = depDate;
        minCheckIn = depDate;
        maxCheckIn = retDate;

        checkOut = retDate;
        minCheckOut = retDate;
        maxCheckOut = retDate;
    }

    public Date getRetDate() {
        return retDate;
    }

    public void setRetDate(Date retDate) {
        this.retDate = retDate;
        minCheckOut = retDate;

        checkOut = retDate;
        setHotelMaxDates();
    }

    public void setMinCheckOut(Date minCheckOut) {
        this.minCheckOut = minCheckOut;
    }

    public void setMaxCheckIn(Date maxCheckIn) {
        this.maxCheckIn = maxCheckIn;
    }

    public void setMaxCheckOut(Date maxCheckOut) {
        this.maxCheckOut = maxCheckOut;
    }

    public Date getMinDeparture() {
        return minDeparture;
    }

    public void setMinDeparture(Date minDeparture) {
        this.minDeparture = minDeparture;
    }

    public Date getMinReturn() {
        return minReturn;
    }

    public void setMinReturn(Date minReturn) {
        this.minReturn = minReturn;
    }

    public Date getMaxDeparture() {
        return maxDeparture;
    }

    public void setMaxDeparture(Date maxDeparture) {
        this.maxDeparture = maxDeparture;
    }

    public Date getMaxReturn() {
        return maxReturn;
    }

    public void setMaxReturn(Date maxReturn) {
        this.maxReturn = maxReturn;
    }

    public List<Integer> getApiList() {
        return apiList;
    }

    public void setApiList(List<Integer> apiList) {
        this.apiList = apiList;
    }

    public String getDepClass() {
        return depClass;
    }

    public void setDepClass(String depClass) {
        this.depClass = depClass;
    }

    public String getRetClass() {
        return retClass;
    }

    public void setRetClass(String retClass) {
        this.retClass = retClass;
    }

    public boolean isDirect() {
        return isDirect;
    }

    public void setDirect(boolean direct) {
        isDirect = direct;
    }

    public int getPassengerCount() {

        int count = 0;
        for (int cnt = 0; cnt < roomCount; ++cnt) {

            int adultCount = guestDetailsList.get(cnt).getAdultCount();
            int childCount = guestDetailsList.get(cnt).getChildCount();

            count = count + adultCount + childCount;
        }

        return count;
    }

    public int getAdultCount() {

        int count = 0;
        for (int cnt = 0; cnt < roomCount; ++cnt) {
            int adultCount = guestDetailsList.get(cnt).getAdultCount();
            count = count + adultCount;
        }
        return count;
    }

    public int getChildCount() {

        int count = 0;
        for (int cnt = 0; cnt < roomCount; ++cnt) {
            int childCount = guestDetailsList.get(cnt).getChildCount();
            count = count + childCount;
        }
        return count;
    }

    public int getInfantCount() {
        int count = 0;
        int infant = 0;
        for (int cnt = 0; cnt < roomCount; ++cnt) {
            int childCount = guestDetailsList.get(cnt).getChildCount();
            count = count + childCount;
            if (count != 0) {
                if (guestDetailsList.get(cnt).getAge1() < 2) {
                    infant += 1;
//                    count -= 1;
                }
                if (count > 0) {
                    if (guestDetailsList.get(cnt).getAge2() < 2) {
                        infant += 1;
//                        count -= 1;
                    }
                }
            }
        }
        return infant;
    }

    public String getItinerary() {
        return depAirPortCode + "-" + retAirPortCode + "-" + getReqFormatedDate(depDate) + "_" + retAirPortCode + "-" + depAirPortCode + "-" + getReqFormatedDate(retDate);
    }

    public String getReqFormatedDate(Date date) {
        SimpleDateFormat formatDate = new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
        return formatDate.format(date);
    }

    public String getHotelReqFormatedDate(Date date) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        return formatDate.format(date);
    }

    public String getIsDirect() {
        if (isDirect) {
            return "true";
        } else {
            return "false";
        }
    }

}
