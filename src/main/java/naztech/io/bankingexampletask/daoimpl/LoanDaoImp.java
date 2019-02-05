package com.bankingexampletask.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bankingexampletask.dao.LoanDao;

import DBUtil.DBLoanOperations;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tanbirul.hashan
 *
 */
@Slf4j
public class LoanDaoImp implements LoanDao {

	@Override
	public List<String> getDistinctBranchName() {
		try {
			List<String> distinctBranchNames=new ArrayList<>(); 
			ResultSet rs=DBLoanOperations.getDistinctBranchName();
			while(rs.next()) {
				distinctBranchNames.add(rs.getString(1));
			}
			return distinctBranchNames;
		} catch (SQLException e) {
			log.error("Query Execution failure",e);
			
		}
		return null;
	}

}
