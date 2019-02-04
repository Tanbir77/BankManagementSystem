package com.bankingexampletask.controller;

import java.util.ArrayList;
import java.util.List;

import com.bankingexampletask.dao.LoanDao;
import com.bankingexampletask.daoimpl.LoanDaoImp;

public class LoanController {
	
	LoanDao loanDao = new LoanDaoImp();
	
	public boolean getDistinctBranchNameController() {
		
		List<String> listOfDistinctBranchName = new ArrayList<String>();
		listOfDistinctBranchName = loanDao.getDistinctBranchName();
		if(listOfDistinctBranchName == null) {
			return false;
		}
		return true;
	}

}
