package com.springmvc.controller;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Customer;
import com.springmvc.service.RetrieveData;

@Controller
public class HomeController {

	
	@Autowired
	RetrieveData retrieve;
	
	@RequestMapping(path = "/home")
    public ModelAndView home(@ModelAttribute("addcustomer") String Addcustomer)
	{
		ModelAndView modelAndview = new ModelAndView();
		List<Customer>customerList = retrieve.retrieveData();
		modelAndview.addObject("CustomerList",customerList);
		System.out.println("The value of incoming attribute is" + Addcustomer);
	String addcustomer=	Addcustomer;
		
	System.out.println(retrieve.retrieveData());
		if(addcustomer.equals("addcustomer") )
		{
			//return "redirect:addCustomer";
		}
		//System.out.println("Inside home controller");
		return modelAndview;
	}
	
	@RequestMapping(path = "/addCustomer")
	public String addCustomer()
	{
		return "AddCustomer";
	}
	
	@RequestMapping(path = "/saveDetails", method=RequestMethod.POST)
	public String saveDetails(@ModelAttribute  Customer customer )
	{
		System.out.println(customer.toString());
		if(retrieve.saveCustomer(customer))
		{
		return "error";
		}
		{
		return "success";}
	}
	
	@RequestMapping(path = "/updateDetails/{email}")
	public String updateDetails(@PathVariable String email)
	{
		System.out.println("Inside UpdateDetails "+email);
		
		System.out.println(email.getClass().getSimpleName());
		
		return "updateDetails";
		
	}
	
	@RequestMapping(path = "/deleteDetails/{email}")
	public String deleteDetails(@PathVariable String email)
	{
		System.out.println("Inside UpdateDetails "+email);
		
		System.out.println(email.getClass().getSimpleName());
		
		return "updateDetails";
		
	}
}
