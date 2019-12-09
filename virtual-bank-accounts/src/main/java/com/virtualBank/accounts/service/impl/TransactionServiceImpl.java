package com.virtualBank.accounts.service.impl;

import org.springframework.stereotype.Service;

import com.virtualBank.accounts.model.Transactions;
import com.virtualBank.accounts.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
	public Transactions getTransactions(String accountId) {
		Transactions transactions = new Transactions();
		return transactions;
	};
}
