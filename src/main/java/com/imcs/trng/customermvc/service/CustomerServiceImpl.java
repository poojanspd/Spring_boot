package com.imcs.trng.customermvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.imcs.trng.customermvc.model.Customer;
import com.imcs.trng.customermvc.repo.ICustomerDao;


public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private ICustomerDao customerDao;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public boolean deleteCustomer(Long id) {
		customerDao.deleteById(id);
		return true;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	
		return customerDao.save(customer);
	}

	@Override
	public Customer getCustomer(Long id) {
		return customerDao.getOne(id);
	}
	
	

}
