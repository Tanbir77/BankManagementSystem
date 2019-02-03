package DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBBranchOperations {
	public static ResultSet getAll() throws SQLException {

		String sql = "[dbo].[asp_entire_branch_table]";

		PreparedStatement statement = DBConnection.getConnectionObj().prepareStatement(sql);

		return statement.executeQuery();
	}

	public static ResultSet findBrannchNameInBetweenAsset(long val1, long val2) throws SQLException {
		String sql = "[dbo].[asp_branch_name_assets_between] ?,?";

		PreparedStatement statement = DBConnection.getConnectionObj().prepareStatement(sql);

		statement.setLong(1, val1);
		statement.setLong(2, val2);

		return statement.executeQuery();

	}	

}
