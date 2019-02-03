package com.bankingexampletask.daoimpl;

import java.sql.SQLException;
import java.util.List;

import com.bankingexampletask.dao.LoanDao;

import DBUtil.LoanOperations;
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
			return LoanOperations.getDistinctBranchName();
		} catch (SQLException e) {
			log.error("Query Execution failure",e);
			
		}
		return null;
	}

}
