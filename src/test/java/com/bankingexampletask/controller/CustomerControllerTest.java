package com.bankingexampletask.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerControllerTest {
	
	CustomerController customerController = new CustomerController();

	@Test
	public void testGetAllCustomerNameController() {
		assertTrue(customerController.getAllCustomerNameController());
	}

	@Test
	public void testGetCustomerAndAccountInfo() {
		assertTrue(customerController.getCustomerAndAccountInfo());
	}

	@Test
	public void testGetCustomerAndAccountInfoLong() {
		assertTrue(customerController.getCustomerAndAccountInfo(400));
	}

}
