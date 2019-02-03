package com.bankingexampletask.dao;

import java.util.List;

import Model.Branch;

public interface BranchDao {
	
	public List<Branch> getAll();
	List<String> findBrannchNameInBetweenAsset(long val1, long val2);

}
