package com.bankingexampletask.dao;

import java.util.List;

import Model.Customer;

public interface CustomerDao {
	
	List<Customer> getAllCustomerName();
	boolean getCustomerAndAccountInfo();
	boolean getCustomerAndAccountInfo(long amount);

}
