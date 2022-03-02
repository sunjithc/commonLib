package com.travel.commonlib;

import com.google.gson.annotations.SerializedName;

public class CurrencyResponseData {

	@SerializedName("UserName")
	private String userName;

	@SerializedName("IsActive")
	private int isActive;

	@SerializedName("IATABranchName")
	private String iATABranchName;

	@SerializedName("Currency_MainId")
	private int currencyMainId;

	@SerializedName("DecimalPoints")
	private String decimalPoints;

	@SerializedName("Time")
	private String time;

	@SerializedName("IsDispaly")
	private boolean isDispaly;

	@SerializedName("IATABranchId")
	private int iATABranchId;

	@SerializedName("CurrencyCode")
	private String currencyCode;

	@SerializedName("IsOnlineRate")
	private int isOnlineRate;

	@SerializedName("Currency")
	private String currency;

	@SerializedName("ConvertedRatio")
	private double convertedRatio;

	@SerializedName("IATABranchCurrency")
	private String iATABranchCurrency;

	@SerializedName("CountryCode")
	private String countryCode;

	@SerializedName("Currency_Code")
	private String currency_Code;

	@SerializedName("Currency_ar")
	private String currencyAr;

	@SerializedName("CurrentDate")
	private String currentDate;

	@SerializedName("DeviationLimit")
	private double deviationLimit;

	public String getUserName(){
		return userName;
	}

	public int getIsActive(){
		return isActive;
	}

	public String getIATABranchName(){
		return iATABranchName;
	}

	public int getCurrencyMainId(){
		return currencyMainId;
	}

	public String getDecimalPoints(){
		return decimalPoints;
	}

	public String getTime(){
		return time;
	}

	public boolean isIsDispaly(){
		return isDispaly;
	}

	public int getIATABranchId(){
		return iATABranchId;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public int getIsOnlineRate(){
		return isOnlineRate;
	}

	public String getCurrency(){
		return currency;
	}

	public double getConvertedRatio(){
		return convertedRatio;
	}

	public String getIATABranchCurrency(){
		return iATABranchCurrency;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public String getCurrency_Code(){
		return currency_Code;
	}

	public String getCurrencyAr(){
		return currencyAr;
	}

	public String getCurrentDate(){
		return currentDate;
	}

	public double getDeviationLimit(){
		return deviationLimit;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public void setiATABranchName(String iATABranchName) {
		this.iATABranchName = iATABranchName;
	}

	public void setCurrencyMainId(int currencyMainId) {
		this.currencyMainId = currencyMainId;
	}

	public void setDecimalPoints(String decimalPoints) {
		this.decimalPoints = decimalPoints;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setDispaly(boolean dispaly) {
		isDispaly = dispaly;
	}

	public void setiATABranchId(int iATABranchId) {
		this.iATABranchId = iATABranchId;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public void setIsOnlineRate(int isOnlineRate) {
		this.isOnlineRate = isOnlineRate;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setConvertedRatio(double convertedRatio) {
		this.convertedRatio = convertedRatio;
	}

	public void setiATABranchCurrency(String iATABranchCurrency) {
		this.iATABranchCurrency = iATABranchCurrency;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setCurrency_Code(String currency_Code) {
		this.currency_Code = currency_Code;
	}

	public void setCurrencyAr(String currencyAr) {
		this.currencyAr = currencyAr;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	public void setDeviationLimit(double deviationLimit) {
		this.deviationLimit = deviationLimit;
	}
}