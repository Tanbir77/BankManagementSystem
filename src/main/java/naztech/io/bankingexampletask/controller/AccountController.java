package naztech.io.bankingexampletask.controller;

import java.util.ArrayList;
import java.util.List;

import naztech.io.bankingexampletask.dao.AccountDao;
import naztech.io.bankingexampletask.daoimpl.AccountDaoImp;

public class AccountController {
	AccountDao accountDao = new AccountDaoImp();
	
	public boolean listOfAccountNumberController(long value) {
		List<String> accountNumberList = new ArrayList<String>();
		accountNumberList = accountDao.listOfAccountNumberGreaterT700(value);
		if(accountNumberList == null) {
			return false;
		}
		return true;
	}
	
	public boolean listOfAccountNumberAndBalanceController(long value , String string) {
		List<String> accountNumberList = new ArrayList<String>();
		accountNumberList = accountDao.listOfaccount_number_and_balance(value, string);
		if(accountNumberList == null) {
			return false;
		}
		return true;
	}
}
