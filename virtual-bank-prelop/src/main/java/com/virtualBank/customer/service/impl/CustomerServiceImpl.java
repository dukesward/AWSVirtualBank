package com.virtualBank.customer.service.impl;

import com.virtualBank.customer.domain.Customer;
import com.virtualBank.customer.service.CustomerService;
import com.virtualBank.customer.vo.Response;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Response login(Customer customer) {
        Response response = new Response(-1, "failure", "99", "user not found");
        if ("abc".equals(customer.getUsername()) && "123".equals(customer.getPassword())) {
            response = new Response(0, "success");
        }
        return response;
    }
}
