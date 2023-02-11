package Qr_code;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class database_connection {        
	public Connection getConnection(){          
		Connection connection=null;                      
		System.out.println("Connection called");                  
		try {                                                                  
			Class.forName("com.mysql.cj.jdbc.Driver");              
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database?autoReconnect=true&useSSL=false","root", "99999999");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}