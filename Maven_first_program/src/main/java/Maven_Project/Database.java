package Maven_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private static Database db = new Database();
	private static final String Url = "jdbc:mysql://localhost:3306/data?autoReconnect=true&useSSL=false";
	private Connection conn;
	 public static Database instance()
	 {
		 return db;
	 }

	 private Database()
	 {
		 
	 }
	   
	 public Connection getConnection()
	 {
		 return conn;
	 }
	 
	 public void connect() throws SQLException
	 {
		 conn = DriverManager.getConnection(Url,"root","99999999");

	 }
	 public void close() throws SQLException
	 {
		 conn.close();
	 }
}
