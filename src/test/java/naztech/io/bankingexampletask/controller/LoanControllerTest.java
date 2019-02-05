package naztech.io.bankingexampletask.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import naztech.io.bankingexampletask.controller.LoanController;

public class LoanControllerTest {
	
	LoanController loanController = new LoanController();

	@Test
	public void testGetDistinctBranchNameController() {
		assertTrue(loanController.getDistinctBranchNameController());
		
	}

}
