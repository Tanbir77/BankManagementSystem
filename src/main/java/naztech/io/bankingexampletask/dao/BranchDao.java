package naztech.io.bankingexampletask.dao;

import java.util.List;

import naztech.io.bankingexampletask.model.Branch;

public interface BranchDao {
	
	public List<Branch> getAll();
	List<String> findBrannchNameInBetweenAsset(long val1, long val2);
	boolean DisplayBranchNameAndAssetsInThousandsDollars();

}
