package com.virtualBank.accounts.service;

import java.util.Map;

import com.virtualBank.accounts.model.Account;
import com.virtualBank.accounts.model.AccountGroupSummary;

public interface AccountService {
	public AccountGroupSummary getAccountSummary(String clientId);
	public Map<String, Account> getAccounts(String accountId);
}
