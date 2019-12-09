package com.virtualBank.customer.service;

import com.virtualBank.customer.domain.User;
import com.virtualBank.customer.model.Customer;

public interface CustomerService {

    public String login(User user);
    
    public Customer getCustomer(String customerId);
}
