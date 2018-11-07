package com.imcs.trng.customermvc.service;

import org.springframework.stereotype.Service;

import com.imcs.trng.customermvc.model.Customer;

@Service
public interface ICustomerService {
	
	Customer addCustomer(Customer customer);
	boolean deleteCustomer(Long id);
	Customer updateCustomer(Customer customer);
	Customer getCustomer(Long id);

}
