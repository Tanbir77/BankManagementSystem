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

}
