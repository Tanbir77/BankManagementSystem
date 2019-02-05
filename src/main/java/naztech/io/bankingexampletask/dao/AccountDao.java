package naztech.io.bankingexampletask.dao;

import java.util.List;

public interface AccountDao {

	
	public List<String> listOfAccountNumberGreaterT700(long value1);
	public List<String> listOfaccount_number_and_balance(long value1,String str);
	
}
