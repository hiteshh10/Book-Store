package com.bookstore.dao;

import java.util.*;

import com.bookstore.pojo.*;

public interface CustomerDao
{
	boolean addCustomer(Customer cust);
	boolean updateCustomer(Customer cust);
	boolean deleteCustomer(int customerid);
	Customer getCustomerBYId(int customerid);
	List<Customer> getAllCustomer();
	
}
