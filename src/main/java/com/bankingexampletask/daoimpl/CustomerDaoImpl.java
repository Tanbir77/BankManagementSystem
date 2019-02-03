package com.bankingexampletask.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bankingexampletask.dao.CustomerDao;

import DBUtil.DBCustomerOperations;
import Model.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public List<Customer> getAllCustomerName() {
		// TODO Auto-generated method stub
		
		DBCustomerOperations dbCustomerOperations = new DBCustomerOperations();
		ResultSet resultSet = dbCustomerOperations.getAllCustomerName();
		if(resultSet == null) {
			System.out.println("Query not executed");
			return null;
		}
		List<Customer> customerNameList = new ArrayList<Customer>();
		try {
			while(resultSet.next()) {
				
				Customer customer = new Customer();
				customer.setCustomerName(resultSet.getString(1));
				customerNameList.add(customer);
			}
			return customerNameList;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public void getCustomerAndAccountInfo() {
		
		DBCustomerOperations dbCustomerOperations = new DBCustomerOperations();
		ResultSet resultSet = dbCustomerOperations.getCustomerAndAccountInfo();
		if(resultSet == null) {
			System.out.println("Query not executed");
		}
		
	}
	
	@Override
	public void getCustomerAndAccountInfo(Long amount) {
		DBCustomerOperations dbCustomerOperations = new DBCustomerOperations();
		ResultSet resultSet = dbCustomerOperations.getCustomerAndAccountInfo(amount);
		if(resultSet == null) {
			System.out.println("Query not executed");
		}
		
	}
	
	

}
