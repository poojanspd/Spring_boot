/*	package com.imcs.trng.customermvc.controller;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;
	
	import com.imcs.trng.customermvc.model.Customer;
	import com.imcs.trng.customermvc.model.Product;
	import com.imcs.trng.customermvc.repo.ICustomerDao;
	import com.imcs.trng.customermvc.repo.IProductDao;
	import com.imcs.trng.customermvc.service.ProductServiceImpl;
	
	@Controller
	public class ProductController {
		
		@Autowired
		IProductDao productDao;
		
		
		
		@RequestMapping("findProduct")
		public ModelAndView searchProduct(Long id)
		{
			Product product = productDao.getOne(id);
			ModelAndView mv= new ModelAndView();
			mv.addObject("product", product);
			mv.setViewName("productDetail");
			return mv;
			
		}
		@RequestMapping("addToCart")
		public ModelAndView addToCart(Long id)
		{
	
			Product product = productDao.getOne(id);
			productServiceImpl.addProdToCart(id);
			
		}
	
	}
*/