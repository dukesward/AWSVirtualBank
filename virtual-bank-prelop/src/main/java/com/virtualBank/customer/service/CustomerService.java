package com.virtualBank.customer.service;

import com.virtualBank.customer.domain.Customer;
import com.virtualBank.customer.vo.Response;

public interface CustomerService {
    public Response login(Customer customer) ;
}
