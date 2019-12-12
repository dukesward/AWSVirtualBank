package com.virtualBank.accounts.service;

import java.util.List;

import com.virtualBank.accounts.model.Account;
import com.virtualBank.accounts.model.AccountGroupSummary;

public interface AccountService {
	public AccountGroupSummary getAccountSummary(String clientId);
	public List<Account> getAccounts(String accountId);
}
