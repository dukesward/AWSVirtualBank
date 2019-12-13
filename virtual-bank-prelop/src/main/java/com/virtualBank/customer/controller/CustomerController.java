package com.virtualBank.customer.controller;

import com.virtualBank.customer.domain.Customer;
import com.virtualBank.customer.service.CustomerService;
import com.virtualBank.customer.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private/v1")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/customer/login")
    public Response login(@RequestBody Customer customer) {
        Response response = customerService.login(customer);
        return response;
    }
}
