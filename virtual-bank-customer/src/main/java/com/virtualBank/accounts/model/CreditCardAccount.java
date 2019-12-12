package com.virtualBank.accounts.model;

import java.util.Date;

public class CreditCardAccount extends Account {
	private double creditUsed;
	private double creditLimit;
	private double availableCredit;
	private double lastPaymentAmount;
	private Date lastPaymentDate;

	public double getCreditUsed() {
		return creditUsed;
	}

	public void setCreditUsed(double creditUsed) {
		this.creditUsed = creditUsed;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double getAvailableCredit() {
		return availableCredit;
	}

	public void setAvailableCredit(double availableCredit) {
		this.availableCredit = availableCredit;
	}

	public double getLastPaymentAmount() {
		return lastPaymentAmount;
	}

	public void setLastPaymentAmount(double lastPaymentAmount) {
		this.lastPaymentAmount = lastPaymentAmount;
	}

	public Date getLastPaymentDate() {
		return lastPaymentDate;
	}

	public void setLastPaymentDate(Date lastPaymentDate) {
		this.lastPaymentDate = lastPaymentDate;
	}

}
