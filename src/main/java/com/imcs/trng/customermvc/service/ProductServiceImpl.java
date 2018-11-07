/*package com.imcs.trng.customermvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.imcs.trng.customermvc.model.Product;
import com.imcs.trng.customermvc.repo.IProductDao;

public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductDao productDao;
	
	List<Product> listProd = new ArrayList<>();
	
	@Override
	public Product findProduct(Long id) {
		return productDao.getOne(id);
	}

	@Override
	public void addProdToCart(Product prod, Long id) {
		
		
	}

	
	

}
*/