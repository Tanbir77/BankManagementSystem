package naztech.io.bankingexampletask.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import naztech.io.bankingexampletask.dao.AccountDao;

import naztech.io.bankingexampletask.dbutil.DBAccountOperation;
            
import lombok.extern.slf4j.Slf4j;

@Slf4j

public class AccountDaoImp implements AccountDao{
	
	public List<String> listOfAccountNumberGreaterT700(long value1){
		try {
			List<String> accountNumberList = new ArrayList<>();
			ResultSet rs = DBAccountOperation.accountGumberGreaterT700(value1);
			while (rs.next()) {
				 accountNumberList.add(rs.getString(1));
			}
			return  accountNumberList;
		} catch (SQLException e) {
			log.error("error"+e.getMessage());
			return null;
		}

		
	}
	
	
	
	public List<String>  listOfaccount_number_and_balance(long value1,String str){
		try {
			
			
			List<String> accountNUmberAndBalanceList=new ArrayList<>();
			ResultSet rs=DBAccountOperation.listOfaccountNumberAndBalance(value1, str);
			while(rs.next()) {
				
				accountNUmberAndBalanceList.add(rs.getString(1));
			}
			
			
			return accountNUmberAndBalanceList;
			
		}catch(SQLException e) {
			log.error("error"+e.getMessage());
			return null;
		}
		
		
	}
	
	

}
