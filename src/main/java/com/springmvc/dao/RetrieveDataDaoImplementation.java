package com.springmvc.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springmvc.model.Customer;

@Component
public class RetrieveDataDaoImplementation implements RetrieveDataDao {

	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
//	
//	Properties property = new Properties();{
//		
//		try {
//			
//			property.load(new FileInputStream("B:\\Github\\MVC\\src\\main\\java\\com\\spring\\util\\property1.properties"));
//			
//		}
//		catch(IOException ex)
//		{
//			System.out.println("Error thrown while reading the property file :"+ex);
//		}
//		}
	
	@Override
	public List<Customer> retrieveData() {
		// TODO Auto-generated method stub
		List<Customer> customerList = jdbcTemplate.query("SELECT * FROM customer", new RowMapper<Customer>() {
		    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		        Customer customer = new Customer();
		        customer.setFirstName(rs.getString("first_name"));
		        customer.setLastName(rs.getString("last_name"));
		        customer.setEmail(rs.getString("email"));
		        return customer;
		    }
		});
		return customerList;
	}



}
