package Maven_Project;
import java.sql.Connection;
import java.sql.SQLException;
public class Demo_Class {

	public static void main(String[] args) {
		
		System.out.println("hello ,, this is my first maven project");
	
	 var db = Database.instance();
	 
	 try {
		db.connect();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		System.out.println("cannot connect to database");
	}
	 
	 System.out.println("connected successfully");
	 
	  UserDao userdao = new UserDaoImpl();
	//  userdao.save(new User("Mars"));
	  //userdao.save(new User("Jupiter"));
	  //userdao.save(new User("junior"));
	  //userdao.save(new User("ankita"));
	 
	  var users = userdao.getAll();
	  users.forEach(System.out::println);
	  var user = userdao.findById(4);
	  
	  if(user.isPresent())
	  {
	User v = user.get();
		  System.out.println("Retrieved :  "+ v);
		  v.setName("jerry");
		  userdao.update(v);
	  }
	  
	  else {
		  System.out.println("no user present");
	  }
	  userdao.delete(new User(5,null));
	  
	 try {
		db.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("cannot close");
	}
	
	
	}
	
}
