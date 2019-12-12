package com.virtualBank.accounts.model;

import java.util.Map;

public class AccountGroupSummary {
	
	private String accountGroup;
	private Map<String, Double> accounts;
	private CurrentBalanceSummary totalCurrentBalance;

	public String getAccountGroup() {
		return accountGroup;
	}

	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}

	public Map<String, Double> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, Double> accounts) {
		this.accounts = accounts;
	}

	public CurrentBalanceSummary getTotalCurrentBalance() {
		return totalCurrentBalance;
	}

	public void setTotalCurrentBalance(CurrentBalanceSummary totalCurrentBalance) {
		this.totalCurrentBalance = totalCurrentBalance;
	}

}
