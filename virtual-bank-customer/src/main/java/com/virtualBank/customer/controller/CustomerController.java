package com.virtualBank.customer.controller;

import com.virtualBank.customer.domain.User;
import com.virtualBank.customer.model.Customer;
import com.virtualBank.customer.service.CustomerService;
import com.virtualBank.customer.service.exception.ApplicationException;
import com.virtualBank.customer.service.exception.CustomerAuthorizationError;
import com.virtualBank.customer.vo.Response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private/v1")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/customer/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody User customer) {
    	Map<String, Object> map = new HashMap<>();
    	try {
    		String clientId = this.customerService.login(customer);
    		map.put("clientId", clientId);
        	ResponseEntity<Map<String, Object>> response = new ResponseEntity<>(map, HttpStatus.OK);
        	return response;
    	}catch (CustomerAuthorizationError cae) {
    		ResponseEntity<Map<String, Object>> response = new ResponseEntity<>(cae.buildResponseMap(), HttpStatus.UNAUTHORIZED);
    		return response;
    	}
    }
    
    @PostMapping("/customer/profiles")
    public ResponseEntity<Map<String, Object>> getCustomerProfiles(@RequestHeader String customerId) {
    	Map<String, Object> map = new HashMap<>();
    	try {
    		Customer customer = this.customerService.getCustomer(customerId);
    		map.put("customerType", customer.getCustomerType());
    		map.put("firstName", customer.getFirstName());
    		map.put("lastName", customer.getLastName());
    		map.put("email", customer.getEmail());
    		map.put("customerSegment", customer.getCustomerSegment());
        	ResponseEntity<Map<String, Object>> response = new ResponseEntity<>(map, HttpStatus.OK);
        	return response;
    	}catch (ApplicationException ae) {
    		ResponseEntity<Map<String, Object>> response = new ResponseEntity<>(ae.buildResponseMap(), HttpStatus.BAD_REQUEST);
    		return response;
    	}
    }
}
