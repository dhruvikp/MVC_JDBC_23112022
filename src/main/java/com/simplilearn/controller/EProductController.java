package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.model.EProduct;
import com.simplilearn.service.EProductService;

@Controller
public class EProductController {

	@Autowired
	EProductService eProductService;

	// STEP 1: Handle Request
	@GetMapping("/products")
	public String getProducts(Model model) {
		// Step 2: Do business logic, by invoking service
		List<EProduct> products = eProductService.getProducts();
		
		// STEP 3: Populate model
		model.addAttribute("products", products);
		
		// STEP 4: return view
		return "product-list";
	}
}
