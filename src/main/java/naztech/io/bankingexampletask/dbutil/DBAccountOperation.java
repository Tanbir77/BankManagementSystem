package naztech.io.bankingexampletask.dbutil;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAccountOperation {
	
		
public static ResultSet accountGumberGreaterT700(long value1) throws SQLException {
String sql="[dbo].[asp_account_number_greaterT700] ?";

PreparedStatement statement=DBConnection.getConnectionObj().prepareStatement(sql);

statement.setLong(1,value1);

return statement.executeQuery();
}


public static ResultSet listOfaccountNumberAndBalance(long value1,String str) throws SQLException {
	
	String sql= "{call asp_account_number_and_balance(?,?) }";
	
	CallableStatement statement=DBConnection.getConnectionObj().prepareCall(sql);
	statement.setLong(1,value1);
	statement.setString(2, str);
	
	return statement.executeQuery();
	
}



}
