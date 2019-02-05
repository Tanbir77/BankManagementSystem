package com.bankingexampletask.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class BranchControllerTest {
	
	BranchController branchController = new BranchController();

	@Test
	public void testGetAllBranchController() {
		assertTrue(branchController.getAllBranchController());
	}

	@Test
	public void testFindBrannchNameInBetweenAssetController() {
		assertTrue(branchController.findBrannchNameInBetweenAssetController(1000000, 4000000));
	}

	@Test
	public void testDisplayBranchNameAndAssetsInThousandsDollarsController() {
		assertTrue(branchController.DisplayBranchNameAndAssetsInThousandsDollarsController());
	}

}
