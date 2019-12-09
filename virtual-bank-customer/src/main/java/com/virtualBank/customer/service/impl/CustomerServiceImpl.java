package com.virtualBank.customer.service.impl;

import com.virtualBank.customer.domain.User;
import com.virtualBank.customer.model.Customer;
import com.virtualBank.customer.service.CustomerService;
import com.virtualBank.customer.service.exception.InvalidCredentialException;
import com.virtualBank.customer.service.exception.InvalidRequestException;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public String login(User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        if (!"abc".equals(username) || !"123".equals(password)) {
            throw new InvalidCredentialException();
        }
        String clientId = "3a576df2";
        return clientId;
    }
    
    @Override
    public Customer getCustomer(String customerId) {
    	if(!customerId.equals("3a576df2")) {
    		throw new InvalidRequestException("Customer not found");
    	}
    	Customer customer = new Customer();
    	customer.setCustomerId(customerId);
    	customer.setCustomerSegment("A01");
    	customer.setCustomerType("INDIVIDUAL");
    	customer.setEmail("customer@xyz.com");
    	customer.setFirstName("ABCD");
    	customer.setLastName("EFGH");
    	return customer;
    }
}
