package com.imcs.trng.customermvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.imcs.trng.customermvc.model.Customer;
import com.imcs.trng.customermvc.repo.ICustomerDao;
import com.imcs.trng.customermvc.service.CustomerServiceImpl;
import com.imcs.trng.customermvc.service.ICustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	ICustomerDao customerDao;
	
	@RequestMapping("/")
	public String getHomePage() {
		return "index";
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer customer)
	{
		customerDao.save(customer);
		return "order";
	}

}
