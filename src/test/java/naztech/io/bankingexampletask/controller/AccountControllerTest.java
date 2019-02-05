package naztech.io.bankingexampletask.controller;

import static org.junit.Assert.*;

import org.junit.Test;

import naztech.io.bankingexampletask.controller.AccountController;

public class AccountControllerTest {
	
	AccountController accountController = new AccountController();

	@Test
	public void testListOfAccountNumberController() {
		long value = 4000;
		assertTrue(accountController.listOfAccountNumberController(value));
	}

	@Test
	public void testListOfAccountNumberAndBalanceController() {
		long value = 4000;
		String branchName = "Brighton";
		assertTrue(accountController.listOfAccountNumberAndBalanceController(value, branchName));
	}

}
