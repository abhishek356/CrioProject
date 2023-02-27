package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.model.Customer;
import com.springmvc.dao.saveData;



@Component
public class saveDataServiceImplementation implements saveDataService{

	
	@Autowired
	saveData saveData;
	
	
	
	
	
	
	@Override
	public boolean saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		return saveData.saveCustomer(customer);
		
	}
	
}
