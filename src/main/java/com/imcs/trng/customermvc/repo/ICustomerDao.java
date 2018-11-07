package com.imcs.trng.customermvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.imcs.trng.customermvc.model.Customer;
@Repository
@Transactional
public interface ICustomerDao extends JpaRepository<Customer, Long> {
	
	
}

