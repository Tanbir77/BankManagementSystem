 package DBUtil;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tanbirul.hashan
 *
 */
@Slf4j
public class DBConnection {

	private static DBConnection uniqueInstance;
	private static Connection connObj;

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static final String DB_URL = "jdbc:sqlserver://vNTDACLSCRAPR01;";

	static final String DB_NAME = "BankAccountMNG;";
	// Database credentials

	static final String USER = "bankaccountmng_dbo;";
	static final String PASS = "bankaccountmng_dbo123;";

	private static final String JDBC_URL = DB_URL + "databaseName=" + DB_NAME + "user=" + USER + "password=" + PASS;

	private DBConnection() {

		try {

			Class.forName(JDBC_DRIVER);

			connObj = DriverManager.getConnection(JDBC_URL);

			if (connObj != null) {

				DatabaseMetaData metaObj = (DatabaseMetaData) connObj.getMetaData();
				log.debug("DataBase connection Established ");
				log.info("Driver Name = " + metaObj.getDriverName() + ", Driver Version = " + metaObj.getDriverVersion()
						+ ", Product Name = " + metaObj.getDatabaseProductName() + ", Product Version = "
						+ metaObj.getDatabaseProductVersion());

			}

		} catch (Exception sqlException) {

			log.error("DB connection Error: ", sqlException);

		}
	}

	public static DBConnection getDBConnectionnstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new DBConnection();
		}
		return uniqueInstance;
	}

	public static Connection getConnectionObj() {
		getDBConnectionnstance();
		return connObj;
	}

	public static DBConnection EstablishDBConnection() {

		return getDBConnectionnstance();
	}

	public static boolean closeDBConnection() {

		try {
			if (!getConnectionObj().isClosed())
				getConnectionObj().close();
		} catch (SQLException e) {
			log.error("Error during BD Close Operation", e);
		}
		return true;
	}

}
