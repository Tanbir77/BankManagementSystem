package naztech.io.bankingexampletask.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import naztech.io.bankingexampletask.dao.CustomerDao;
import naztech.io.bankingexampletask.dbutil.DBCustomerOperations;
import naztech.io.bankingexampletask.model.Customer;

@Slf4j
public class CustomerDaoImpl implements CustomerDao {

	@Override
	public List<Customer> getAllCustomerName() {
		
		
		DBCustomerOperations dbCustomerOperations = new DBCustomerOperations();
		ResultSet resultSet = dbCustomerOperations.getAllCustomerName();
		if(resultSet == null) {
			log.debug("Result set is null");
			return null;
		}
		
		List<Customer> customerNameList = new ArrayList<Customer>();
		try {
			while(resultSet.next()) {
				
				Customer customer = new Customer();
				customer.setCustomerName(resultSet.getString(1));
				customerNameList.add(customer);
			}
			return customerNameList;
		} catch (SQLException e) {
			log.error("error: ",e);
			return null;
		}
	}
	
	@Override
	public boolean getCustomerAndAccountInfo() {
		
		DBCustomerOperations dbCustomerOperations = new DBCustomerOperations();
		ResultSet resultSet = dbCustomerOperations.getCustomerAndAccountInfo();
		if(resultSet == null) {
			log.debug("Result set is null");
			return false;
		}
		return true;
		
	}
	
	@Override
	public boolean getCustomerAndAccountInfo(long amount) {
		DBCustomerOperations dbCustomerOperations = new DBCustomerOperations();
		ResultSet resultSet = dbCustomerOperations.getCustomerAndAccountInfo(amount);
		if(resultSet == null) {
			log.debug("Result set is null");
			return false;
		}
		return true;
		
	}
	
	

}
