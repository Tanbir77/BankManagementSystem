package naztech.io.bankingexampletask.dao;

import java.util.List;

import naztech.io.bankingexampletask.model.Customer;

public interface CustomerDao {
	
	List<Customer> getAllCustomerName();
	boolean getCustomerAndAccountInfo();
	boolean getCustomerAndAccountInfo(long amount);

}
