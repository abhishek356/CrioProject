package com.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.dao.RetrieveDataDao;
import com.springmvc.model.Customer;

@Component
public class RetrieveDataImplementation implements RetrieveData{

	
	@Autowired
	RetrieveDataDao retrieve;
	
	@Override
	public List<Customer> retrieveData() {
		// TODO Auto-generated method stub
		return retrieve.retrieveData();
	}

	

	@Override
	public boolean saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		retrieve.saveCustomer(customer);
		return false;
	}

}
