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
	
}
