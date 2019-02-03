package DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCustomerOperations {
	
	public ResultSet getAllCustomerName() {
		String sql = "[dbo].[asp_names_of_all_customer]";
		PreparedStatement statement;
		try {
			statement = DBConnection.getConnectionObj().prepareStatement(sql);
			return statement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public ResultSet getCustomerAndAccountInfo() {
		
		String sql = "[dbo].[asp_inner_join8]";
		PreparedStatement statement;
		try {
			statement = DBConnection.getConnectionObj().prepareStatement(sql);
			return statement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public ResultSet getCustomerAndAccountInfo(Long amount) {
		
		String sql = "[dbo].[asp_inner_join9] , ?";
		PreparedStatement statement;
		try {
			statement = DBConnection.getConnectionObj().prepareStatement(sql);
			statement.setLong(1 , amount);
			return statement.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
