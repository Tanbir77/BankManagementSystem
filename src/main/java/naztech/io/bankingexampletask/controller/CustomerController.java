package naztech.io.bankingexampletask.controller;

import java.util.ArrayList;
import java.util.List;

import naztech.io.bankingexampletask.dao.CustomerDao;
import naztech.io.bankingexampletask.daoimpl.CustomerDaoImpl;

import naztech.io.bankingexampletask.model.Customer;

public class CustomerController {
	
	CustomerDao customerDao = new CustomerDaoImpl();
	
	public boolean getAllCustomerNameController() {
		List<Customer> customerList = new ArrayList<Customer>();
		customerList = customerDao.getAllCustomerName();
		if(customerList == null) {
			return false;
		}
		return true;
	}
	
	public boolean getCustomerAndAccountInfo() {
		
		return customerDao.getCustomerAndAccountInfo();
	}
	
	public boolean getCustomerAndAccountInfo(long value) {
		return customerDao.getCustomerAndAccountInfo(value);
		
	}

}
