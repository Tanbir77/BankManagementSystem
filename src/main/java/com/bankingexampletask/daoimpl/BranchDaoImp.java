package com.bankingexampletask.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bankingexampletask.dao.BranchDao;

import DBUtil.DBBranchOperations;
import Model.Branch;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BranchDaoImp implements BranchDao {

	@Override
	public List<Branch> getAll() {
		try {
			List<Branch> allBranchList = new ArrayList<Branch>();
			ResultSet rs = DBBranchOperations.getAll();
			while (rs.next()) {

				Branch currentBranch = new Branch();
				currentBranch.setBranchName(rs.getString(1));
				currentBranch.setBranchCity(rs.getString(2));
				currentBranch.setAsset(rs.getLong(3));
				allBranchList.add(currentBranch);
			}
			return allBranchList;
		} catch (SQLException e) {
			log.error("Query execution error during finding allBranch:", e);
		}

		return null;
	}
	@Override
	public List<String> findBrannchNameInBetweenAsset(long val1,long val2) {
		try {
			List<String> branchNameList = new ArrayList<>();
			ResultSet rs = DBBranchOperations.findBrannchNameInBetweenAsset(val1,val2);
			while (rs.next()) {
				branchNameList.add(rs.getString(1));
				
			}
			return branchNameList;
		} catch (SQLException e) {
			log.error("Query execution error during finding branch in between "+val1+" and"+val2+" :", e);
		}

		return null;
	}
	@Override
	public void DisplayBranchNameAndAssetsInThousandsDollars() {
		try {

			ResultSet rs = DBBranchOperations.DisplayBranchNameAndAssetsInThousandsOfDollars();
			
		} catch (SQLException e) {
			log.error("Query execution error during Displaying BranchName And Assets", e);
		}
		
		
	}
	
	
}
