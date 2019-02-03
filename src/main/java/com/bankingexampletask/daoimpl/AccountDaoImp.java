package com.bankingexampletask.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bankingexampletask.dao.AccountDao;

import DBUtil.DBAccountOperation;
import DBUtil.DBBranchOperations;
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class AccountDaoImp implements AccountDao{
	
	public List<String> listOfAccountNumberGreaterT700(long value1){
		try {
			List<String> accountNumberList = new ArrayList<>();
			ResultSet rs = DBAccountOperation.accountGumberGreaterT700(value1);
			while (rs.next()) {
				 accountNumberList.add(rs.getString(1));
				
			}
			return  accountNumberList;
		} catch (SQLException e) {
			log.error("error"+e.getMessage());
		}

		return null;
	}
}
