package DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAccountOperation {
	
	
/////////////////////////////////////////////////////////////shaila/////////////////////////////	
public static ResultSet accountGumberGreaterT700(long value1) throws SQLException {
String sql="[dbo].[asp_account_number_greaterT700] ?";

PreparedStatement statement=DBConnection.getConnectionObj().prepareStatement(sql);

statement.setLong(1,value1);

return statement.executeQuery();
}




//public static void main(String arg[]) throws SQLException {
//	
//	
//	ResultSet rs=accountGumberGreaterT700(700);
//	while(rs.next()) {
//		
//		System.out.println(rs.getString(1));
//	}
//	
//}


}
