package DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBLoanOperations {

	public static ResultSet getDistinctBranchName() throws SQLException {

		String sql = "[dbo].[asp_name_of_allbranch_from_loan]";

		PreparedStatement statement = DBConnection.getConnectionObj().prepareStatement(sql);

		return statement.executeQuery();
		
	}

}
