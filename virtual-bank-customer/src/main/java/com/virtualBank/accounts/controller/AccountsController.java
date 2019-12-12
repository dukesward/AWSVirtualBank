package com.virtualBank.accounts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtualBank.accounts.model.Account;
import com.virtualBank.accounts.model.AccountGroupSummary;
import com.virtualBank.accounts.model.Transactions;
import com.virtualBank.accounts.service.AccountService;
import com.virtualBank.accounts.service.TransactionService;

@RestController
@RequestMapping("/private/v1/accounts")
public class AccountsController {
	
	@Autowired
	AccountService accountService;
	@Autowired
	TransactionService transactionService;
	
	@CrossOrigin
	@GetMapping("/")
    public ResponseEntity<AccountGroupSummary> getAccountsSummary(
    		@RequestHeader String clientId
    ) {
		AccountGroupSummary accountSummary = this.accountService.getAccountSummary(clientId);
		ResponseEntity<AccountGroupSummary> response = new ResponseEntity<>(accountSummary, HttpStatus.OK);
        return response;
    }
	
	@CrossOrigin
	@GetMapping("/{accountId}")
    public ResponseEntity<List<Account>> getAccountDetails(
    		@PathVariable("accountId") String accountId,
    		@RequestHeader String clientId
    ) {
		List<Account> accountList = this.accountService.getAccounts(accountId);
		ResponseEntity<List<Account>> response = new ResponseEntity<>(accountList, HttpStatus.OK);
        return response;
    }
	
	@CrossOrigin
	@GetMapping("/{accountId}/transactions")
    public ResponseEntity<Transactions> getAccountTransactions(
    		@PathVariable("accountId") String accountId,
    		@RequestHeader String clientId
    ) {
		Transactions transactions = this.transactionService.getTransactions(clientId);
		ResponseEntity<Transactions> response = new ResponseEntity<>(transactions, HttpStatus.OK);
        return response;
    }
}
