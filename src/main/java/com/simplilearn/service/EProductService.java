package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.dao.EProductDAO;
import com.simplilearn.model.EProduct;

@Service
public class EProductService {

	@Autowired
	EProductDAO eProductDAO;
	
	public List<EProduct> getProducts() {
		return eProductDAO.getProducts();
	}
}
