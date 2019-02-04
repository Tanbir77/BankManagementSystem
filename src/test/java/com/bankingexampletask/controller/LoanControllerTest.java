package com.bankingexampletask.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoanControllerTest {
	
	LoanController loanController = new LoanController();

	@Test
	public void testGetDistinctBranchNameController() {
		assertTrue(loanController.getDistinctBranchNameController());
		
	}

}
