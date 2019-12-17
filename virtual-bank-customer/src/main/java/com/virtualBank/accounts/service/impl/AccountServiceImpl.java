package com.virtualBank.accounts.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.virtualBank.accounts.model.Account;
import com.virtualBank.accounts.model.AccountGroupSummary;
import com.virtualBank.accounts.model.CheckingAccount;
import com.virtualBank.accounts.model.CreditCardAccount;
import com.virtualBank.accounts.model.SavingsAccount;
import com.virtualBank.accounts.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Override
	public AccountGroupSummary getAccountSummary(String clientId) {
		AccountGroupSummary accountSummary = new AccountGroupSummary();
		accountSummary.setAccountGroup("SAVINGS");
		Map<String, Double> accounts = new HashMap<String, Double>();
		accounts.put("checkingAccountSummary", 1000.00);
		accounts.put("savingsAccountSummary", 1000.00);
		accounts.put("creditCardAccountSummary", 1000.00);
		accounts.put("readyCreditAccountSummary", 1000.00);
		accounts.put("loanAccountSummary", 1000.00);
		accounts.put("mutualFundAccountSummary", 1000.00);
		accounts.put("securitiesBrokerageAccountSummary", 1000.00);
		accounts.put("callDepositAccountSummary", 1000.00);
		accounts.put("premiumDepositAccountSummary", 1000.00);
		accounts.put("timeDepositAccountSummary", 1000.00);
		return accountSummary;
	};
	
	public Map<String, Account> getAccounts(String accountId) {
		Map<String, Account> accounts = new HashMap<>();
		accounts.put("creditCardAccount", new CreditCardAccount());
		accounts.put("checkingAccount", new CheckingAccount());
		accounts.put("savingsAccount", new SavingsAccount());
		return accounts;
	};
}
