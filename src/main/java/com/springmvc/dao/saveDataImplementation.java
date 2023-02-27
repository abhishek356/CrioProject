package com.springmvc.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springmvc.model.Customer;


@Component
public class saveDataImplementation implements saveData{

	
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Properties property = new Properties();{
		
		try {
			
			property.load(new FileInputStream("C:\\Users\\aks21\\eclipse-workspace\\CrioProject\\src\\main\\java\\com\\springmvc\\util\\property.properties"));
			
		}
		catch(IOException ex)
		{
			System.out.println("Error thrown while reading the property file :"+ex);
		}
		}
	
	@Override
	public boolean saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		//String query = "Insert into customer values (?,?,?)";
		String query = property.getProperty("Insert_query");
		System.out.println(query);
	    int n = jdbcTemplate.update(query,customer.getFirstName(),customer.getLastName(),customer.getEmail());
	    property.getProperty("Insert_query");
		System.out.println(n);
		if(n>0)
		return true;
		
		return false;
	}
}
