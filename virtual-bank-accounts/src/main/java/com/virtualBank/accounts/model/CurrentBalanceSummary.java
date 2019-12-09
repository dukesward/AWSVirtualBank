package com.virtualBank.accounts.model;

public class CurrentBalanceSummary {
	
	private String localCurrencyCode;
	private float localCurrencyBalanceAmount;
	private String foreignCurrencyCode;
	private float foreignCurrencyBalanceAmount;

	public String getLocalCurrencyCode() {
		return localCurrencyCode;
	}

	public void setLocalCurrencyCode(String localCurrencyCode) {
		this.localCurrencyCode = localCurrencyCode;
	}

	public float getLocalCurrencyBalanceAmount() {
		return localCurrencyBalanceAmount;
	}

	public void setLocalCurrencyBalanceAmount(float localCurrencyBalanceAmount) {
		this.localCurrencyBalanceAmount = localCurrencyBalanceAmount;
	}

	public String getForeignCurrencyCode() {
		return foreignCurrencyCode;
	}

	public void setForeignCurrencyCode(String foreignCurrencyCode) {
		this.foreignCurrencyCode = foreignCurrencyCode;
	}

	public float getForeignCurrencyBalanceAmount() {
		return foreignCurrencyBalanceAmount;
	}

	public void setForeignCurrencyBalanceAmount(float foreignCurrencyBalanceAmount) {
		this.foreignCurrencyBalanceAmount = foreignCurrencyBalanceAmount;
	}

}
