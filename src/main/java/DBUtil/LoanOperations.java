package DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoanOperations {

	public static List<String> getDistinctBranchName() throws SQLException {

		String sql = "[dbo].[asp_name_of_allbranch_from_loan]";

		PreparedStatement statement = DBConnection.getConnectionObj().prepareStatement(sql);

		ResultSet rs = statement.executeQuery();
		List<String> DistinctBranchNames=new ArrayList<>();
		while (rs.next()) {
			DistinctBranchNames.add(rs.getString(1));
		}
		return null;

	}

}
