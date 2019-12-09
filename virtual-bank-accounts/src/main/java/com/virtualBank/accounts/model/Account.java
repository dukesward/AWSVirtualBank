package com.virtualBank.accounts.model;

import java.util.Date;

public class Account {
	protected String productName;
	protected String productCode;
	protected String displayAccountNumber;
	protected String currencyCode;
	protected double outstandingBalance;
	protected double lastStatementBalance;
	protected Date lastStatementDate;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getDisplayAccountNumber() {
		return displayAccountNumber;
	}

	public void setDisplayAccountNumber(String displayAccountNumber) {
		this.displayAccountNumber = displayAccountNumber;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public double getOutstandingBalance() {
		return outstandingBalance;
	}

	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}

	public double getLastStatementBalance() {
		return lastStatementBalance;
	}

	public void setLastStatementBalance(double lastStatementBalance) {
		this.lastStatementBalance = lastStatementBalance;
	}

	public Date getLastStatementDate() {
		return lastStatementDate;
	}

	public void setLastStatementDate(Date lastStatementDate) {
		this.lastStatementDate = lastStatementDate;
	}
	
}
