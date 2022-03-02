package com.travel.commonlib.hotel;


import android.text.TextUtils;


import com.travel.jumbo.utilities.CommonFunctions;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class HotelSearchModel implements Serializable {

    private String city;
    private String cityAr;
    private String cityCode;
    private String Country;
    private String Nationality;
    private String NationalityCode;
    private String countryOfResidence;
    private String countryOfResidenceCode;
    private String displayname;
    private String displaynameAr;
    private Date CheckIn, CheckOut;
    private Date minCheckIn, minCheckOut, maxCheckIn, maxCheckOut;
    public int roomCount;
    ArrayList<Integer> starCategory;
    public HashMap<Integer, GuestDetails> guestDetailsList;
    private String source;
    private List<Integer> apiList;
    private boolean isHotel;
    private String hotelName;
    private String hotelnameAr;
    boolean isStarAll = true;
    boolean isStar0 = false;
    boolean isStar1 = false;
    boolean isStar2 = false;
    boolean isStar3 = false;
    boolean isStar4 = false;
    boolean isStar5 = false;
    private boolean isStar;
    private String hotelid;
    private int cityid;

    public HotelSearchModel() {
        city = "";
        Nationality = "";
        roomCount = 1;
        guestDetailsList = new HashMap<>();
        guestDetailsList.put(0, new GuestDetails());

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 312);
        maxCheckIn = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        maxCheckOut = cal.getTime();

        // to set next day
        cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 0);
        minCheckIn = cal.getTime();
        CheckIn = cal.getTime();

        cal.add(Calendar.DAY_OF_YEAR, 1);
        minCheckOut = cal.getTime();
        CheckOut = cal.getTime();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityAr() {
        return cityAr;
    }

    public void setCityAr(String cityAr) {
        this.cityAr = cityAr;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getNationalityCode() {
        return NationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        NationalityCode = nationalityCode;
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
        return CheckIn;
    }

    public void setCheckIn(Date checkIn) {
        CheckIn = checkIn;

        Calendar cal = Calendar.getInstance();
        cal.setTime(checkIn);
        cal.add(Calendar.DAY_OF_YEAR, 1);
        minCheckOut = cal.getTime();
        CheckOut = cal.getTime();
    }

    public Date getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(Date checkOut) {
        CheckOut = checkOut;
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
        return CommonFunctions.gettimeformat(CheckIn);
    }

    public String getCheckOutDate() {
        return CommonFunctions.gettimeformat(CheckOut);
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public List<Integer> getApiList() {
        return apiList;
    }

    public void setApiList(List<Integer> apiList) {
        this.apiList = apiList;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public String getDisplaynameAr() {
        return displaynameAr;
    }

    public void setDisplaynameAr(String displaynameAr) {
        this.displaynameAr = displaynameAr;
    }

    public boolean isHotel() {
        return isHotel;
    }

    public void setHotel(boolean hotel) {
        isHotel = hotel;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelnameAr() {
        return hotelnameAr;
    }

    public void setHotelnameAr(String hotelnameAr) {
        this.hotelnameAr = hotelnameAr;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
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

    public int getAdulltCount() {

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


    public String getCityRequest() {
        String city = "";

        if (isHotel) {
            city = hotelName;
        } else city = this.city + "," + Country;

        /*city = city.replace(" / ", "%20")
                .replace("/", "%20")
                .replace(" ", "%20");*/
        return city;
    }

    public String getCheckInRequest() {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        return formatDate.format(CheckIn);
    }

    public String getCheckOutRequest() {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        return formatDate.format(CheckOut);
    }

    public ArrayList<Integer> getStarCategory() {
        return starCategory;
    }

    public void setStarCategory(ArrayList<Integer> starCategory) {
        this.starCategory = starCategory;
        setIsStar(starCategory);

    }

    public boolean[] getBooleanAr() {
        return new boolean[]{isStar0, isStar1, isStar2, isStar3, isStar4, isStar5, isStarAll};
    }

    private void setIsStar(ArrayList<Integer> starCategory) {
        isStarAll = false;
        isStar0 = false;
        isStar0 = false;
        isStar1 = false;
        isStar2 = false;
        isStar3 = false;
        isStar4 = false;
        isStar5 = false;

        for (int star : starCategory) {
            switch (star) {
                case 0:
                    isStar0 = true;
                    break;
                case 1:
                    isStar1 = true;
                    break;
                case 2:
                    isStar2 = true;
                    break;
                case 3:
                    isStar3 = true;
                    break;
                case 4:
                    isStar4 = true;
                    break;
                case 5:
                    isStar5 = true;
                    break;
                case 6:
                    isStarAll = true;
                    break;
            }
        }

    }

    public boolean isStar0() {
        return isStar0;
    }

    public void setStar0(boolean star0) {
        isStar0 = star0;
    }

    public boolean isStar1() {
        return isStar1;
    }

    public void setStar1(boolean star1) {
        isStar1 = star1;
    }

    public boolean isStar2() {
        return isStar2;
    }

    public void setStar2(boolean star2) {
        isStar2 = star2;
    }

    public boolean isStar3() {
        return isStar3;
    }

    public void setStar3(boolean star3) {
        isStar3 = star3;
    }

    public boolean isStar4() {
        return isStar4;
    }

    public void setStar4(boolean star4) {
        isStar4 = star4;
    }

    public boolean isStar5() {
        return isStar5;
    }

    public void setStar5(boolean star5) {
        isStar5 = star5;
    }

    public boolean isStarAll() {
        return isStarAll;
    }

    public void setStarAll(boolean starAll) {
        isStarAll = starAll;
    }

    public String getStarRating() {
        String starRating = "";
        if (isStar0) {
            starRating = TextUtils.isEmpty(starRating) ? "0" : starRating + ",0";
        }
        if (isStar1) {
            starRating = TextUtils.isEmpty(starRating) ? "1" : starRating + ",1";
        }
        if (isStar2) {
            starRating = TextUtils.isEmpty(starRating) ? "2" : starRating + ",2";
        }
        if (isStar3) {
            starRating = TextUtils.isEmpty(starRating) ? "3" : starRating + ",3";
        }
        if (isStar4) {
            starRating = TextUtils.isEmpty(starRating) ? "4" : starRating + ",4";
        }
        if (isStar5) {
            starRating = TextUtils.isEmpty(starRating) ? "5" : starRating + ",5";
        }
        if (isStarAll) {
            starRating = "";
        }

        return starRating;
    }

    public boolean isStar() {
        return isStar = isStar0 || isStar1 || isStar2 || isStar3 || isStar4 || isStar5 || isStarAll;
    }

    public void setStar(boolean star) {
        isStar = star;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getNotificationPassenger() {
        String passengerCount = "";
        for (int i = 0; i < roomCount; i++) {
            if (TextUtils.isEmpty(passengerCount)) {
                passengerCount = "A-" + guestDetailsList.get(i).getAdultCount();
            } else passengerCount += "/A" + guestDetailsList.get(i).getAdultCount();

            passengerCount += ",C-" + guestDetailsList.get(i).getChildCount()
                    + "-" + guestDetailsList.get(i).getAge1()
                    + "-" + guestDetailsList.get(i).getAge2();
        }

        return passengerCount;
    }
}
