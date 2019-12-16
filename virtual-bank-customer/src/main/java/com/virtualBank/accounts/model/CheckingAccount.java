package com.virtualBank.accounts.model;

import java.util.Date;

public class CheckingAccount extends Account {
	
	private double currentBalance;
	private double availableBalance;
	private Date lastStatementDate;
	
	public CheckingAccount() {
		this.currentBalance = 3210.50;
		this.availableBalance = 2114.66;
		this.lastStatementDate = new Date();
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public Date getLastStatementDate() {
		return lastStatementDate;
	}

	public void setLastStatementDate(Date lastStatementDate) {
		this.lastStatementDate = lastStatementDate;
	}
	
}
