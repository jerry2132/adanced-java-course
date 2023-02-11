package hellogradleproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class A {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String dbUrl = "jdbc:mysql://localhost:3306/data?autoReconnect=true&useSSL=false";
		
			var conn = DriverManager.getConnection(dbUrl,"root","99999999");

		
		var stmt = conn.createStatement();
		conn.setAutoCommit(false);
		var sql = "select id,name,branch from table1";
		var rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String branch = rs.getString("branch");
			System.out.println(id+"***"+name+"***"+branch);
		}
	}

}
