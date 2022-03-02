package com.travel.commonlib;

import com.google.gson.annotations.SerializedName;
import com.travel.jumbo.model.CurrencyResponseData;

import java.util.List;

public class CurrencyResponseBase {

	@SerializedName("result")
	private List<CurrencyResponseData> result;

	@SerializedName("CurrencyCode")
	private String currencyCode;

	@SerializedName("errorInfo")
	private String errorInfo;

	@SerializedName("BaseCurrency")
	private String baseCurrency;

	@SerializedName("status")
	private boolean status;

	public List<CurrencyResponseData> getResult(){
		return result;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public String getErrorInfo(){
		return errorInfo;
	}

	public String getBaseCurrency(){
		return baseCurrency;
	}

	public boolean isStatus(){
		return status;
	}
}