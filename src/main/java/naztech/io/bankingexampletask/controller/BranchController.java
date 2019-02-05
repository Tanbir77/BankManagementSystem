package naztech.io.bankingexampletask.controller;

import java.util.ArrayList;
import java.util.List;

import naztech.io.bankingexampletask.dao.BranchDao;
import naztech.io.bankingexampletask.daoimpl.BranchDaoImp;
import naztech.io.bankingexampletask.model.Branch;

public class BranchController {
	
	BranchDao branchDao = new BranchDaoImp();
	public boolean getAllBranchController() {
		List<Branch> branchList = new ArrayList<Branch>();
		branchList = branchDao.getAll();
		if(branchList == null) {
			return false;
		}
		return true;
	}
	
	public boolean findBrannchNameInBetweenAssetController(long value1, long value2) {
		List<String> branchNameList = new ArrayList<String>();
		branchNameList = branchDao.findBrannchNameInBetweenAsset(value1, value2);
		if(branchNameList == null) {
			return false;
		}
		return true;
	}
	
	public boolean DisplayBranchNameAndAssetsInThousandsDollarsController() {
		
		return branchDao.DisplayBranchNameAndAssetsInThousandsDollars();
	}
	
	
}
