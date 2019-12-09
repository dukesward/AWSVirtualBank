package com.virtualBank.accounts.service;

import com.virtualBank.accounts.model.Transactions;

public interface TransactionService {
	public Transactions getTransactions(String accountId);
}
